.class public final Lf92;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# direct methods
.method public static a(Lql2;)Lql2;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lql2;->b:Lwp0;

    .line 5
    .line 6
    iget-boolean v1, v0, Lwp0;->k:Z

    .line 7
    .line 8
    const/4 v2, 0x3

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    iget-object v1, v0, Lwp0;->m:Ljava/lang/String;

    .line 12
    .line 13
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 14
    .line 15
    invoke-virtual {v1, v3}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iput-object v1, p0, Lql2;->j:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v1, v0, Lwp0;->d:Ljava/lang/Integer;

    .line 25
    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    new-instance v3, Luh2;

    .line 33
    .line 34
    invoke-direct {v3, v1}, Luh2;-><init>(I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v3}, Lql2;->h(Luh2;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    iget v1, p0, Lql2;->g:I

    .line 41
    .line 42
    add-int/lit8 v1, v1, -0x1

    .line 43
    .line 44
    :try_start_0
    sget-object v3, Lg92;->a:Ljava/util/List;

    .line 45
    .line 46
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    check-cast v1, Lkotlin/jvm/functions/Function2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    .line 52
    invoke-interface {v1, p0, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    check-cast p0, Lql2;

    .line 57
    .line 58
    return-object p0

    .line 59
    :catchall_0
    new-instance v0, Lf0;

    .line 60
    .line 61
    iget p0, p0, Lql2;->g:I

    .line 62
    .line 63
    const-string v1, "Invalid version "

    .line 64
    .line 65
    invoke-static {p0, v1}, Lfm0;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-direct {v0, p0, v2}, Lf0;-><init>(Ljava/lang/String;I)V

    .line 70
    .line 71
    .line 72
    throw v0

    .line 73
    :cond_1
    new-instance p0, Lf0;

    .line 74
    .line 75
    const-string v0, "Unable to encode TCModel tcModel.gvl.readyPromise is not resolved"

    .line 76
    .line 77
    invoke-direct {p0, v0, v2}, Lf0;-><init>(Ljava/lang/String;I)V

    .line 78
    .line 79
    .line 80
    throw p0
.end method
