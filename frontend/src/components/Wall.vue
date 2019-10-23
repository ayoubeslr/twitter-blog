<template>
  <div>
    <div class="div-wall">
      <div>
        <b-card class="div-user">
          <img src="./../assets/user.png" alt="image utilisateur" class="user-logo" />

          <b-form-input placeholder="Poster un message..." v-model="message"></b-form-input>
          <b-button variant="outline-primary" @click="onclickBtn">Valider</b-button>
        </b-card>
      </div>
      <div class="div-post">
        <b-list-group v-for="post in refreshList" :key="post.id">
          <b-list-group-item>
            <div>
              <img src="./../assets/user.png" alt="image utilisateur" class="user-logo-post" />
            </div>
            <div class="post-text">{{post.post}}</div>
          </b-list-group-item>
          <div>Like : {{post.nb_like == null ? "0" : post.nb_like}}</div>
        </b-list-group>
      </div>
    </div>
  </div>
</template>

<script>
// import ListItem from "./MylisteItem";
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
  computed: {
    refreshList: function() {
      return this.info.slice().reverse();
    }
  },
  created: function() {
    axios.get("http://127.0.0.1:8000/api/post/").then(res => {
      for (let elt of res.data) {
        this.info.push({
          id: this.id++,
          post: elt.post,
          nb_like: elt.nb_like
        });
      }
    });
  },
  methods: {
    onclickBtn: function() {
      axios({
        method: "post",
        url: "http://127.0.0.1:8000/api/post/",
        data: {
          post: this.message,
          nb_like: null
        }
      }).then(
        this.info.push({
          id: this.id++,
          post: this.message
        })
      );
    }
  }
};
</script>
<style scoped>
.div-wall {
  position: absolute;
  width: 60%;
  left: 20%;
  right: 20%;
  padding: 20px;
}

.div-user {
  display: flex;
  flex-direction: row;
  text-align: center;
  margin-bottom: 20px;
  justify-content: center;
  align-items: center;
}

.div-post {
  /* height: 60vh; */
  overflow: auto;
}
.user-logo {
  width: 50px;
  margin: 0 10px 0 0;
}

.user-logo-post {
  width: 30px;
  /* background-color: bisque; */
  margin: 0 10px 0 0;
}

.form-control {
  width: 90%;
  display: inline-block;
}

.btn {
  margin: 0 5px 0 5px;
  float: right;
}
.list-group-item {
  margin-top: 15px;
  display: flex;
}

.post-text {
  display: inline-block;
  /* background-color: aqua; */
}
</style>