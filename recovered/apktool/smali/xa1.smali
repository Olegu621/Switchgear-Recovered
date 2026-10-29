.class public abstract Lxa1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lo4;

    .line 2
    .line 3
    const-class v1, Lwa1;

    .line 4
    .line 5
    const/16 v2, 0x8

    .line 6
    .line 7
    invoke-direct {v0, v2, v1}, Lo4;-><init>(ILjava/lang/Class;)V

    .line 8
    .line 9
    .line 10
    filled-new-array {v0}, [Lo4;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, Ljava/util/HashMap;

    .line 15
    .line 16
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 17
    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    aget-object v3, v0, v2

    .line 21
    .line 22
    iget-object v4, v3, Lo4;->a:Ljava/lang/Class;

    .line 23
    .line 24
    invoke-virtual {v1, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    iget-object v5, v3, Lo4;->a:Ljava/lang/Class;

    .line 29
    .line 30
    if-nez v4, :cond_0

    .line 31
    .line 32
    invoke-virtual {v1, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    aget-object v0, v0, v2

    .line 36
    .line 37
    iget-object v0, v0, Lo4;->a:Ljava/lang/Class;

    .line 38
    .line 39
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 40
    .line 41
    .line 42
    sget v0, Ls22;->CONFIG_NAME_FIELD_NUMBER:I

    .line 43
    .line 44
    :try_start_0
    invoke-static {}, Lxa1;->a()V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :catch_0
    move-exception v0

    .line 49
    new-instance v1, Ljava/lang/ExceptionInInitializerError;

    .line 50
    .line 51
    invoke-direct {v1, v0}, Ljava/lang/ExceptionInInitializerError;-><init>(Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    throw v1

    .line 55
    :cond_0
    const-string v0, "KeyTypeManager constructed with duplicate factories for primitive "

    .line 56
    .line 57
    invoke-virtual {v5}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-static {v1, v0}, Ln4;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public static a()V
    .locals 7

    .line 1
    sget-object v0, Lab1;->c:Lab1;

    .line 2
    .line 3
    invoke-static {v0}, Lr22;->h(Lnx1;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lmu;->a:Lmu;

    .line 7
    .line 8
    invoke-static {v0}, Lr22;->h(Lnx1;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lq4;

    .line 12
    .line 13
    invoke-direct {v0}, Lq4;-><init>()V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-static {v0, v1}, Lr22;->f(Lkx0;Z)V

    .line 18
    .line 19
    .line 20
    sget-object v0, Ltu0;->a:Ljr1;

    .line 21
    .line 22
    sget-object v0, Lal1;->b:Lal1;

    .line 23
    .line 24
    sget-object v2, Ltu0;->a:Ljr1;

    .line 25
    .line 26
    invoke-virtual {v0, v2}, Lal1;->e(Ljr1;)V

    .line 27
    .line 28
    .line 29
    sget-object v2, Ltu0;->b:Lir1;

    .line 30
    .line 31
    invoke-virtual {v0, v2}, Lal1;->d(Lir1;)V

    .line 32
    .line 33
    .line 34
    sget-object v2, Ltu0;->c:Lt31;

    .line 35
    .line 36
    invoke-virtual {v0, v2}, Lal1;->c(Lt31;)V

    .line 37
    .line 38
    .line 39
    sget-object v2, Ltu0;->d:Lp31;

    .line 40
    .line 41
    invoke-virtual {v0, v2}, Lal1;->b(Lp31;)V

    .line 42
    .line 43
    .line 44
    sget-object v2, Lwk1;->b:Lwk1;

    .line 45
    .line 46
    sget-object v3, Lq4;->f:Lex1;

    .line 47
    .line 48
    invoke-virtual {v2, v3}, Lwk1;->a(Lex1;)V

    .line 49
    .line 50
    .line 51
    invoke-static {}, Lto2;->a()Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-eqz v3, :cond_0

    .line 56
    .line 57
    return-void

    .line 58
    :cond_0
    new-instance v3, Lq4;

    .line 59
    .line 60
    new-instance v4, Lo4;

    .line 61
    .line 62
    const-class v5, Lwa1;

    .line 63
    .line 64
    const/4 v6, 0x0

    .line 65
    invoke-direct {v4, v6, v5}, Lo4;-><init>(ILjava/lang/Class;)V

    .line 66
    .line 67
    .line 68
    filled-new-array {v4}, [Lo4;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    const-class v5, Lj4;

    .line 73
    .line 74
    invoke-direct {v3, v5, v4, v6}, Lq4;-><init>(Ljava/lang/Class;[Lo4;I)V

    .line 75
    .line 76
    .line 77
    invoke-static {v3, v1}, Lr22;->f(Lkx0;Z)V

    .line 78
    .line 79
    .line 80
    sget-object v1, Lv4;->a:Ljr1;

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Lal1;->e(Ljr1;)V

    .line 83
    .line 84
    .line 85
    sget-object v1, Lv4;->b:Lir1;

    .line 86
    .line 87
    invoke-virtual {v0, v1}, Lal1;->d(Lir1;)V

    .line 88
    .line 89
    .line 90
    sget-object v1, Lv4;->c:Lt31;

    .line 91
    .line 92
    invoke-virtual {v0, v1}, Lal1;->c(Lt31;)V

    .line 93
    .line 94
    .line 95
    sget-object v1, Lv4;->d:Lp31;

    .line 96
    .line 97
    invoke-virtual {v0, v1}, Lal1;->b(Lp31;)V

    .line 98
    .line 99
    .line 100
    sget-object v0, Lq4;->e:Lex1;

    .line 101
    .line 102
    invoke-virtual {v2, v0}, Lwk1;->a(Lex1;)V

    .line 103
    .line 104
    .line 105
    return-void
.end method
