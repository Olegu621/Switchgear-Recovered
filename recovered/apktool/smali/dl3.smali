.class public final Ldl3;
.super Lzn3;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    invoke-super {p0}, Lzn3;->a()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lzn3;->b:Leo3;

    .line 5
    .line 6
    move-object v0, p0

    .line 7
    check-cast v0, Lbo3;

    .line 8
    .line 9
    iget-object v0, v0, Lbo3;->zza:Lun3;

    .line 10
    .line 11
    sget-object v1, Lun3;->c:Lun3;

    .line 12
    .line 13
    if-eq v0, v1, :cond_0

    .line 14
    .line 15
    check-cast p0, Lbo3;

    .line 16
    .line 17
    iget-object v0, p0, Lbo3;->zza:Lun3;

    .line 18
    .line 19
    invoke-virtual {v0}, Lun3;->b()Lun3;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, Lbo3;->zza:Lun3;

    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method public final b()Leo3;
    .locals 2

    .line 1
    iget-object v0, p0, Lzn3;->b:Leo3;

    .line 2
    .line 3
    check-cast v0, Lbo3;

    .line 4
    .line 5
    invoke-virtual {v0}, Leo3;->m()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object v1, p0, Lzn3;->b:Leo3;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    check-cast v1, Lbo3;

    .line 14
    .line 15
    return-object v1

    .line 16
    :cond_0
    check-cast v1, Lbo3;

    .line 17
    .line 18
    iget-object v0, v1, Lbo3;->zza:Lun3;

    .line 19
    .line 20
    invoke-virtual {v0}, Lun3;->a()V

    .line 21
    .line 22
    .line 23
    invoke-super {p0}, Lzn3;->b()Leo3;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lbo3;

    .line 28
    .line 29
    return-object p0
.end method

.method public final c()Ltm3;
    .locals 2

    .line 1
    iget-object v0, p0, Lzn3;->b:Leo3;

    .line 2
    .line 3
    check-cast v0, Lbo3;

    .line 4
    .line 5
    invoke-virtual {v0}, Leo3;->m()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object v1, p0, Lzn3;->b:Leo3;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    check-cast v1, Lbo3;

    .line 14
    .line 15
    return-object v1

    .line 16
    :cond_0
    check-cast v1, Lbo3;

    .line 17
    .line 18
    iget-object v0, v1, Lbo3;->zza:Lun3;

    .line 19
    .line 20
    invoke-virtual {v0}, Lun3;->a()V

    .line 21
    .line 22
    .line 23
    invoke-super {p0}, Lzn3;->b()Leo3;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lbo3;

    .line 28
    .line 29
    return-object p0
.end method
