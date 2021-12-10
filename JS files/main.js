class MovieCovers extends HTMLElement {
  connectedCallback() {
    this.innerHTML = 
    '<body>
    <a href="movieSize1">
    <img alt="Alt text" src="https://upload.wikimedia.org/wikipedia/en/1/15/Dunkirk_Film_poster.jpg">
  </a>
  <p id = "movieTitle1">Dunkirk</p>
  <p id = "movieYear1">2017</p>
 </body>
  }
  customElements.define('movieCoverTemplate', MovieCovers)
}