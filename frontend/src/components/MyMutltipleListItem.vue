<template>
  <div class="div-item">
    <b-list-group v-for="post in info" :key="post.id">
      <b-list-group-item>
        <div class="post-text">{{post.post}}</div>
        <div>Like : {{post.nb_like == null ? "0" : post.nb_like}}</div>
      </b-list-group-item>
    </b-list-group>
  </div>
</template>

<script>
import axios from "axios";
export default {
  components: {
    // ListItem
  },
  data() {
    return {
      info: [],
      id: 1,
      message: ""
    };
  },
  created: function() {
    axios.get("http://127.0.0.1:8000/api/post/").then(res => {
      for (let elt of res.data) {
        if (elt.nb_like > 100) {
          this.info.push({
            id: this.id++,
            post: elt.post,
            nb_like: elt.nb_like
          });
        }
      }
    });
  }
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.div-item {
  overflow-wrap: break-word;
  width: 20%;
  height: 90vh;
  float: right;
  position: fixed;
  right: 0;
  overflow: auto;
}
.list-group-item {
  margin: 15px 0 15px 0;
}
</style>
