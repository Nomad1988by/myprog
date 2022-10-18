const url2 = 'http://localhost:8098/invoices/?page=0&size=30';

function sendRequest1(method2, url2) {
  return fetch(url2, {
    method: "GET",
    headers: { 'Content-Type': 'application/json;charset=utf-8' }
  })
    .then(response => { return response.json() })
    .then(data => { return data['_embedded']['invoices'] })
    .then(json => { return data(json) });
}
const data = json => {
  json = json.map(x => {
    delete x["f_guid"];
    delete x["f_tm"];
    delete x["f_del"];
    delete x["_links"];
    return x;
  });
  getZttn(Object.keys(json[0]));
  getZttnData(json);
}
const getZttn = fields => {
  const table = document.querySelector(".table");
  const thead = document.createElement("thead");
  const tr = document.createElement("tr");
  const fragment = document.createDocumentFragment();
  fields.forEach(x => {
    const th = document.createElement("th");
    th.innerText = x;
    th.scope = "col";
    fragment.appendChild(th);
  });
  tr.appendChild(fragment);
  thead.appendChild(tr);
  table.appendChild(thead);
};
const getZttnData = data => {
  console.log(data);
  // Table 1 data
  data.forEach(x => {
    const table = document.querySelector(".table");
    const tbody = document.createElement("tbody");
    const tr = document.createElement("tr");
    const fragment = document.createDocumentFragment();
    const keys = Object.keys(data[0]);
    keys.forEach(y => {
      const td = document.createElement("td");
      td.innerText = x[y];
      fragment.appendChild(td);
    });
    tr.appendChild(fragment);
    tbody.appendChild(tr);
    table.appendChild(tbody);
  });
  // Клик в таблице
  let t1 = document.getElementById('t1');
  let td11 = t1.getElementsByTagName('td');
  for (let i = 0; i < td11.length; i++) {
    td11[i].onclick = function (e) {
      e.textContent = td11[i];
      const url = 'http://localhost:8098/products/?page=0&size=816';
      function sendRequest2(method, url) {
        return fetch(url, {
          method: "GET",
          headers: { 'Content-Type': 'application/json;charset=utf-8' }
        })
          .then(response1 => { return response1.json() })
          .then(data1 => { return data1['_embedded']['products'] })
          .then(json1 => { return data1(json1) });
      }
      const data1 = json1 => {
        json1 = json1.map(x1 => {
          delete x1["f_guid"];
          delete x1["f_tm"];
          delete x1["f_del"];
          delete x1["_links"];
          return x1;
        });
        getSttn(Object.keys(json1[0]));
        getSttnData(json1);
      }
      // Table 2 heders
      const getSttn = fields1 => {

        const table1 = document.querySelector(".table1");
        table1.innerHTML = "";
        const thead1 = document.createElement("thead");
        const tr1 = document.createElement("tr");
        const fragment1 = document.createDocumentFragment();
        fields1.forEach(x1 => {
          const th1 = document.createElement("th");
          th1.innerText = x1;
          th1.scope = "col1";
          fragment1.appendChild(th1);
        });
        tr1.appendChild(fragment1);
        thead1.appendChild(tr1);
        table1.appendChild(thead1);
      };
      const getSttnData = data1 => {
        data1.forEach(function (x1) {
          const table1 = document.querySelector(".table1");
          const tbody1 = document.createElement("tbody");
          const tr1 = document.createElement("tr");
          const fragment1 = document.createDocumentFragment();
          const keys1 = Object.keys(data1[0]);
          keys1.forEach((y1, index) => {
            const td1 = document.createElement("td");
            td1.innerText = x1[y1];
            fragment1.appendChild(td1);
          });
          tr1.appendChild(fragment1);
          if (e.textContent.innerText === tr1.firstChild.innerText) {
            tbody1.appendChild(tr1);
            table1.appendChild(tbody1);
          }
        });
      };
      sendRequest2('GET', url)
        .then(data1 => console.log(data1))
        .then(err => console.log(err))
    }
  }
};
sendRequest1('GET', url2)
  .then(data => console.log(data))
  .then(err => console.log(err))