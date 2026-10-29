.class public abstract Lb80;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Lo4;

    .line 2
    .line 3
    const-class v1, La80;

    .line 4
    .line 5
    const/4 v2, 0x6

    .line 6
    invoke-direct {v0, v2, v1}, Lo4;-><init>(ILjava/lang/Class;)V

    .line 7
    .line 8
    .line 9
    filled-new-array {v0}, [Lo4;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    new-instance v1, Ljava/util/HashMap;

    .line 14
    .line 15
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 16
    .line 17
    .line 18
    array-length v2, v0

    .line 19
    const/4 v3, 0x0

    .line 20
    move v4, v3

    .line 21
    :goto_0
    if-ge v4, v2, :cond_1

    .line 22
    .line 23
    aget-object v5, v0, v4

    .line 24
    .line 25
    iget-object v6, v5, Lo4;->a:Ljava/lang/Class;

    .line 26
    .line 27
    invoke-virtual {v1, v6}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    iget-object v7, v5, Lo4;->a:Ljava/lang/Class;

    .line 32
    .line 33
    if-nez v6, :cond_0

    .line 34
    .line 35
    invoke-virtual {v1, v7, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    add-int/lit8 v4, v4, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    const-string v0, "KeyTypeManager constructed with duplicate factories for primitive "

    .line 42
    .line 43
    invoke-virtual {v7}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-static {v1, v0}, Ln4;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_1
    array-length v2, v0

    .line 52
    if-lez v2, :cond_2

    .line 53
    .line 54
    aget-object v0, v0, v3

    .line 55
    .line 56
    iget-object v0, v0, Lo4;->a:Ljava/lang/Class;

    .line 57
    .line 58
    :cond_2
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 59
    .line 60
    .line 61
    sget v0, Ls22;->CONFIG_NAME_FIELD_NUMBER:I

    .line 62
    .line 63
    :try_start_0
    invoke-static {}, Lb80;->a()V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :catch_0
    move-exception v0

    .line 68
    new-instance v1, Ljava/lang/ExceptionInInitializerError;

    .line 69
    .line 70
    invoke-direct {v1, v0}, Ljava/lang/ExceptionInInitializerError;-><init>(Ljava/lang/Throwable;)V

    .line 71
    .line 72
    .line 73
    throw v1
.end method

.method public static a()V
    .locals 4

    .line 1
    sget-object v0, Ld80;->b:Ld80;

    .line 2
    .line 3
    invoke-static {v0}, Lr22;->h(Lnx1;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lto2;->a()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    new-instance v0, Lq4;

    .line 14
    .line 15
    new-instance v1, Lo4;

    .line 16
    .line 17
    const-class v2, La80;

    .line 18
    .line 19
    const/4 v3, 0x6

    .line 20
    invoke-direct {v1, v3, v2}, Lo4;-><init>(ILjava/lang/Class;)V

    .line 21
    .line 22
    .line 23
    filled-new-array {v1}, [Lo4;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const-class v2, Lq6;

    .line 28
    .line 29
    invoke-direct {v0, v2, v1, v3}, Lq4;-><init>(Ljava/lang/Class;[Lo4;I)V

    .line 30
    .line 31
    .line 32
    const/4 v1, 0x1

    .line 33
    invoke-static {v0, v1}, Lr22;->f(Lkx0;Z)V

    .line 34
    .line 35
    .line 36
    sget-object v0, Lw6;->a:Ljr1;

    .line 37
    .line 38
    sget-object v0, Lal1;->b:Lal1;

    .line 39
    .line 40
    sget-object v1, Lw6;->a:Ljr1;

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Lal1;->e(Ljr1;)V

    .line 43
    .line 44
    .line 45
    sget-object v1, Lw6;->b:Lir1;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Lal1;->d(Lir1;)V

    .line 48
    .line 49
    .line 50
    sget-object v1, Lw6;->c:Lt31;

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Lal1;->c(Lt31;)V

    .line 53
    .line 54
    .line 55
    sget-object v1, Lw6;->d:Lp31;

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Lal1;->b(Lp31;)V

    .line 58
    .line 59
    .line 60
    return-void
.end method
