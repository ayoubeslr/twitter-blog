<template>
  <div class="div-wall">
    <b-card class="div-user">
      <img src="./../assets/user.png" alt="image utilisateur" class="user-logo" />

      <b-form-input placeholder="Poster un message..."></b-form-input>
      <b-button variant="outline-primary">Valider</b-button>
    </b-card>
  </div>
</template>

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
}

.user-logo {
  width: 50px;
  margin: 0 10px 0 0;
}

.form-control {
  width: 80%;
  display: inline-block;
}

.btn {
  margin: 0 0 0 5px;
}
</style>