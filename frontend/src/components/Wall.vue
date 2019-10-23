<template>
  <div>
    <div class="div-wall">
      <div>
        <b-card class="div-user">
          <img src="./../assets/user.png" alt="image utilisateur" class="user-logo" />

          <b-form-input placeholder="Poster un message..."></b-form-input>
          <b-button variant="outline-primary">Valider</b-button>
        </b-card>
      </div>
      <div class="div-post">
        <b-list-group v-for=" i in 10 " :key="i">
          <b-list-group-item>
            <div>
              <img src="./../assets/user.png" alt="image utilisateur" class="user-logo-post" />
            </div>
            <div
              class="post-text"
            >Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam.</div>
          </b-list-group-item>
        </b-list-group>
      </div>
    </div>
  </div>
</template>

<script>
// import ListItem from "./MylisteItem";

export default {
  components: {
    // ListItem
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