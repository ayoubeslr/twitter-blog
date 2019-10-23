<template>
  <div class="div-group">
    <div>
      <h4>Groupe</h4>
    </div>

    <div>
      <b-list-group v-for="group in info" :key="group.id">
        <b-list-group-item>
          <div class="post-text">{{group.nom}}</div>
        </b-list-group-item>
      </b-list-group>
    </div>
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
    axios.get("http://127.0.0.1:8000/api/group/").then(res => {
      for (let elt of res.data) {
        this.info.push({
          id: this.id++,
          nom: elt.nom
        });
      }
    });
  }
};
</script>

<style scoped>
.div-group {
  float: left;
  overflow-wrap: break-word;
  width: 20%;
  height: 100vh;
  overflow: auto;
  position: fixed;
}

h4 {
  margin: 15px;
}
</style>