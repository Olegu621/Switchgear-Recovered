.class public final Lee3;
.super Lz30;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Le61;


# virtual methods
.method public final M0()J
    .locals 2

    .line 1
    const-string v0, "player_rank"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lz30;->u(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    const-wide/16 v0, -0x1

    .line 10
    .line 11
    return-wide v0

    .line 12
    :cond_0
    invoke-virtual {p0, v0}, Lz30;->e(Ljava/lang/String;)J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    return-wide v0
.end method

.method public final T0()I
    .locals 1

    .line 1
    const-string v0, "timespan"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lz30;->d(Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final c1()J
    .locals 2

    .line 1
    const-string v0, "player_raw_score"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lz30;->u(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    const-wide/16 v0, -0x1

    .line 10
    .line 11
    return-wide v0

    .line 12
    :cond_0
    invoke-virtual {p0, v0}, Lz30;->e(Ljava/lang/String;)J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    return-wide v0
.end method

.method public final e1()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "player_display_rank"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lz30;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lf61;->d(Le61;Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final synthetic freeze()Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance v0, Lf61;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lf61;-><init>(Lee3;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    invoke-static {p0}, Lf61;->a(Le61;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final j0()J
    .locals 2

    .line 1
    const-string v0, "total_scores"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lz30;->u(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    const-wide/16 v0, -0x1

    .line 10
    .line 11
    return-wide v0

    .line 12
    :cond_0
    invoke-virtual {p0, v0}, Lz30;->e(Ljava/lang/String;)J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    return-wide v0
.end method

.method public final k()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "player_display_score"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lz30;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final n()Z
    .locals 1

    .line 1
    const-string v0, "player_raw_score"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lz30;->u(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public final r1()I
    .locals 1

    .line 1
    const-string v0, "collection"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lz30;->d(Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Lf61;->b(Le61;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final zza()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "top_page_token_next"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lz30;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final zzb()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "window_page_token_next"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lz30;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final zzc()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "window_page_token_prev"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lz30;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
