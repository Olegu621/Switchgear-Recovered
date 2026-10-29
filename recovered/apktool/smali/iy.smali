.class public final Liy;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lcy;


# static fields
.field public static final v:Lgy;


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public i:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lgy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lgy;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Liy;->v:Lgy;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 23
    iput-object v0, p0, Liy;->a:Ljava/lang/Object;

    .line 24
    iput-object v0, p0, Liy;->b:Ljava/lang/Object;

    .line 25
    iput-object v0, p0, Liy;->c:Ljava/lang/Object;

    .line 26
    iput-object v0, p0, Liy;->d:Ljava/lang/Object;

    .line 27
    iput-object v0, p0, Liy;->e:Ljava/lang/Object;

    .line 28
    iput-object v0, p0, Liy;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosureObject;Ljava/lang/Boolean;Ljava/lang/Boolean;Lhu1;)V
    .locals 0

    .line 1
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Liy;->a:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Liy;->b:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Liy;->c:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, Liy;->d:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p5, p0, Liy;->e:Ljava/lang/Object;

    .line 16
    .line 17
    iput-object p6, p0, Liy;->f:Ljava/lang/Object;

    .line 18
    .line 19
    iput-object p7, p0, Liy;->i:Ljava/lang/Object;

    .line 20
    .line 21
    return-void
.end method

.method public static r([B)Lfs0;
    .locals 2

    .line 1
    new-instance v0, Ljava/io/ByteArrayInputStream;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-static {}, Ldg0;->a()Ldg0;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-static {v0, p0}, Li41;->D(Ljava/io/ByteArrayInputStream;Ldg0;)Li41;

    .line 11
    .line 12
    .line 13
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 15
    .line 16
    .line 17
    invoke-static {p0}, Lec;->s(Li41;)Lec;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    new-instance v0, Lfs0;

    .line 22
    .line 23
    iget-object p0, p0, Lec;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p0, Li41;

    .line 26
    .line 27
    invoke-virtual {p0}, Lsq0;->v()Loq0;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, Lf41;

    .line 32
    .line 33
    const/4 v1, 0x3

    .line 34
    invoke-direct {v0, p0, v1}, Lfs0;-><init>(Ljava/lang/Object;I)V

    .line 35
    .line 36
    .line 37
    return-object v0

    .line 38
    :catchall_0
    move-exception p0

    .line 39
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 40
    .line 41
    .line 42
    throw p0
.end method


# virtual methods
.method public declared-synchronized c(Lf02;)Liz1;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Liy;->c:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Ls51;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    monitor-exit p0

    .line 15
    return-object p1

    .line 16
    :cond_0
    :try_start_1
    sget-object p1, Liy;->v:Lgy;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 17
    .line 18
    monitor-exit p0

    .line 19
    return-object p1

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 22
    throw p1
.end method

.method public declared-synchronized d(Lf02;)Liz1;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "Null interface requested."

    .line 3
    .line 4
    invoke-static {p1, v0}, Lxe2;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Liy;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Liz1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    monitor-exit p0

    .line 18
    return-object p1

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    throw p1
.end method

.method public declared-synchronized f()Ld52;
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Liy;->b:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Ljava/lang/String;

    .line 5
    .line 6
    if-eqz v0, :cond_6

    .line 7
    .line 8
    sget-object v0, Ld52;->d:Ljava/lang/Object;

    .line 9
    .line 10
    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 11
    :try_start_1
    iget-object v1, p0, Liy;->a:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Landroid/content/Context;

    .line 14
    .line 15
    iget-object v2, p0, Liy;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v2, Ljava/lang/String;

    .line 18
    .line 19
    iget-object v3, p0, Liy;->c:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v3, Ljava/lang/String;

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    if-eqz v2, :cond_2

    .line 25
    .line 26
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    if-nez v3, :cond_0

    .line 31
    .line 32
    invoke-static {v1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/4 v5, 0x0

    .line 38
    invoke-virtual {v1, v3, v5}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 39
    .line 40
    .line 41
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    :goto_0
    :try_start_2
    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    if-nez v1, :cond_1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    invoke-static {v1}, Lqj3;->p(Ljava/lang/String;)[B

    .line 50
    .line 51
    .line 52
    move-result-object v4
    :try_end_2
    .catch Ljava/lang/ClassCastException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 53
    goto :goto_1

    .line 54
    :catch_0
    :try_start_3
    new-instance v1, Ljava/io/CharConversionException;

    .line 55
    .line 56
    const-string v3, "can\'t read keyset; the pref value "

    .line 57
    .line 58
    const-string v4, " is not a valid hex string"

    .line 59
    .line 60
    invoke-static {v3, v2, v4}, Lfm0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-direct {v1, v2}, Ljava/io/CharConversionException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw v1

    .line 68
    :cond_2
    const-string v1, "keysetName cannot be null"

    .line 69
    .line 70
    invoke-static {v1}, Ln4;->j(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 71
    .line 72
    .line 73
    :goto_1
    iget-object v1, p0, Liy;->d:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v1, Ljava/lang/String;

    .line 76
    .line 77
    if-nez v4, :cond_4

    .line 78
    .line 79
    if-eqz v1, :cond_3

    .line 80
    .line 81
    :try_start_4
    invoke-virtual {p0}, Liy;->t()Ly5;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    iput-object v1, p0, Liy;->e:Ljava/lang/Object;

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :catchall_0
    move-exception v1

    .line 89
    goto :goto_4

    .line 90
    :cond_3
    :goto_2
    invoke-virtual {p0}, Liy;->j()Lfs0;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    iput-object v1, p0, Liy;->i:Ljava/lang/Object;

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_4
    if-eqz v1, :cond_5

    .line 98
    .line 99
    invoke-virtual {p0, v4}, Liy;->s([B)Lfs0;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    iput-object v1, p0, Liy;->i:Ljava/lang/Object;

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_5
    invoke-static {v4}, Liy;->r([B)Lfs0;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    iput-object v1, p0, Liy;->i:Ljava/lang/Object;

    .line 111
    .line 112
    :goto_3
    new-instance v1, Ld52;

    .line 113
    .line 114
    invoke-direct {v1, p0}, Ld52;-><init>(Liy;)V

    .line 115
    .line 116
    .line 117
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 118
    monitor-exit p0

    .line 119
    return-object v1

    .line 120
    :goto_4
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 121
    :try_start_6
    throw v1

    .line 122
    :catchall_1
    move-exception v0

    .line 123
    goto :goto_5

    .line 124
    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 125
    .line 126
    const-string v1, "keysetName cannot be null"

    .line 127
    .line 128
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    throw v0

    .line 132
    :goto_5
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 133
    throw v0
.end method

.method public g(Ljava/util/HashMap;Z)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Ljava/util/Map$Entry;

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Lsx;

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Liz1;

    .line 32
    .line 33
    iget v1, v1, Lsx;->d:I

    .line 34
    .line 35
    const/4 v2, 0x1

    .line 36
    if-ne v1, v2, :cond_1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    const/4 v2, 0x2

    .line 40
    if-ne v1, v2, :cond_0

    .line 41
    .line 42
    if-eqz p2, :cond_0

    .line 43
    .line 44
    :goto_1
    invoke-interface {v0}, Liz1;->get()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    iget-object p0, p0, Liy;->e:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p0, Lxe0;

    .line 51
    .line 52
    monitor-enter p0

    .line 53
    :try_start_0
    iget-object p1, p0, Lxe0;->b:Ljava/util/ArrayDeque;

    .line 54
    .line 55
    const/4 p2, 0x0

    .line 56
    if-eqz p1, :cond_3

    .line 57
    .line 58
    iput-object p2, p0, Lxe0;->b:Ljava/util/ArrayDeque;

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :catchall_0
    move-exception p1

    .line 62
    goto :goto_4

    .line 63
    :cond_3
    move-object p1, p2

    .line 64
    :goto_2
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    if-eqz p1, :cond_5

    .line 66
    .line 67
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    if-nez p1, :cond_4

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_4
    invoke-static {p0}, Lfm0;->f(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    throw p0

    .line 83
    :cond_5
    :goto_3
    return-void

    .line 84
    :goto_4
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 85
    throw p1
.end method

.method public h()I
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Liy;->i:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lwc0;

    .line 6
    .line 7
    sget-object v2, Lym1;->i:Lym1;

    .line 8
    .line 9
    sget-object v3, Lym1;->v:Lym1;

    .line 10
    .line 11
    const-string v4, "invalid user auth token"

    .line 12
    .line 13
    const-string v5, "missing user auth token"

    .line 14
    .line 15
    const-string v6, "ftchNotif"

    .line 16
    .line 17
    const-string v7, "Fetching notification count from network."

    .line 18
    .line 19
    const/4 v8, 0x0

    .line 20
    invoke-static {v6, v7, v8}, Lxe2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 21
    .line 22
    .line 23
    iget-object v7, v0, Liy;->c:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v7, Lts0;

    .line 26
    .line 27
    iget-object v9, v7, Lts0;->a:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v9, Ler0;

    .line 30
    .line 31
    iget-object v9, v9, Ler0;->b:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v9, Ler0;

    .line 34
    .line 35
    const-string v10, "network_headers"

    .line 36
    .line 37
    invoke-virtual {v9, v10}, Ler0;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v9

    .line 41
    invoke-static {v9}, Lb40;->w(Ljava/lang/String;)Ljava/util/HashMap;

    .line 42
    .line 43
    .line 44
    move-result-object v9

    .line 45
    iget-object v10, v7, Lts0;->a:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v10, Ler0;

    .line 48
    .line 49
    iget-object v10, v10, Ler0;->b:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v10, Ler0;

    .line 52
    .line 53
    const-string v11, "polling_route"

    .line 54
    .line 55
    invoke-virtual {v10, v11}, Ler0;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v10

    .line 59
    iget-object v11, v0, Liy;->d:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v11, Lnm;

    .line 62
    .line 63
    invoke-virtual {v11}, Lnm;->e()Ljava/util/HashMap;

    .line 64
    .line 65
    .line 66
    move-result-object v12

    .line 67
    invoke-static {v12}, Lb40;->q(Ljava/util/Map;)Z

    .line 68
    .line 69
    .line 70
    move-result v13

    .line 71
    if-nez v13, :cond_0

    .line 72
    .line 73
    invoke-static {v9}, Lb40;->q(Ljava/util/Map;)Z

    .line 74
    .line 75
    .line 76
    move-result v13

    .line 77
    if-nez v13, :cond_0

    .line 78
    .line 79
    invoke-static {v10}, Lb40;->p(Ljava/lang/String;)Z

    .line 80
    .line 81
    .line 82
    move-result v13

    .line 83
    if-eqz v13, :cond_1

    .line 84
    .line 85
    :cond_0
    const/16 v16, -0x1

    .line 86
    .line 87
    goto/16 :goto_9

    .line 88
    .line 89
    :cond_1
    new-instance v13, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 92
    .line 93
    .line 94
    const/4 v15, 0x0

    .line 95
    const/16 v16, -0x1

    .line 96
    .line 97
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 98
    .line 99
    .line 100
    move-result-object v14

    .line 101
    const-string v8, "cursor"

    .line 102
    .line 103
    invoke-virtual {v11, v14, v8}, Lnm;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v14

    .line 107
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    const-string v14, ""

    .line 111
    .line 112
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v13

    .line 119
    invoke-static {v13}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    .line 120
    .line 121
    .line 122
    move-result-object v13

    .line 123
    invoke-virtual {v13}, Ljava/lang/Long;->longValue()J

    .line 124
    .line 125
    .line 126
    move-result-wide v13

    .line 127
    move-wide/from16 v17, v13

    .line 128
    .line 129
    const-wide/16 v13, 0x0

    .line 130
    .line 131
    cmp-long v19, v17, v13

    .line 132
    .line 133
    if-eqz v19, :cond_2

    .line 134
    .line 135
    invoke-static/range {v17 .. v18}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v13

    .line 139
    invoke-virtual {v12, v8, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    :cond_2
    iget-object v13, v0, Liy;->a:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v13, Lcb;

    .line 145
    .line 146
    invoke-virtual {v13}, Lcb;->v()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v13

    .line 150
    const-string v14, "did"

    .line 151
    .line 152
    invoke-virtual {v12, v14, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    iget-object v13, v0, Liy;->b:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v13, Ler0;

    .line 158
    .line 159
    invoke-virtual {v13}, Ler0;->q()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v13

    .line 163
    const-string v14, "platform-id"

    .line 164
    .line 165
    invoke-virtual {v12, v14, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    new-instance v13, Llp0;

    .line 169
    .line 170
    iget-object v14, v0, Liy;->f:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v14, Lec0;

    .line 173
    .line 174
    invoke-direct {v13, v14, v10, v15}, Llp0;-><init>(Lec0;Ljava/lang/String;I)V

    .line 175
    .line 176
    .line 177
    new-instance v10, Lwc0;

    .line 178
    .line 179
    const/16 v14, 0xd

    .line 180
    .line 181
    invoke-direct {v10, v14, v9, v12}, Lwc0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    :try_start_0
    invoke-virtual {v13, v10}, Lta;->l(Lwc0;)Ljj;

    .line 185
    .line 186
    .line 187
    move-result-object v9

    .line 188
    iget v10, v9, Ljj;->a:I

    .line 189
    .line 190
    iget-object v9, v9, Ljj;->b:Ljava/lang/String;

    .line 191
    .line 192
    const/16 v12, 0x191

    .line 193
    .line 194
    if-ne v10, v12, :cond_5

    .line 195
    .line 196
    invoke-static {v9}, Lb40;->p(Ljava/lang/String;)Z

    .line 197
    .line 198
    .line 199
    move-result v12

    .line 200
    if-nez v12, :cond_5

    .line 201
    .line 202
    invoke-virtual {v5, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 203
    .line 204
    .line 205
    move-result v12

    .line 206
    if-nez v12, :cond_4

    .line 207
    .line 208
    invoke-virtual {v4, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 209
    .line 210
    .line 211
    move-result v12

    .line 212
    if-nez v12, :cond_3

    .line 213
    .line 214
    goto :goto_0

    .line 215
    :cond_3
    const/4 v12, 0x0

    .line 216
    invoke-static {v12, v3, v12}, Lgt0;->a(Ljava/lang/Exception;Lym1;Ljava/lang/String;)Lgt0;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    throw v0

    .line 221
    :cond_4
    const/4 v12, 0x0

    .line 222
    invoke-static {v12, v2, v12}, Lgt0;->a(Ljava/lang/Exception;Lym1;Ljava/lang/String;)Lgt0;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    throw v0

    .line 227
    :cond_5
    :goto_0
    new-instance v12, Lorg/json/JSONObject;

    .line 228
    .line 229
    invoke-direct {v12, v9}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    const-string v9, "uc"

    .line 233
    .line 234
    invoke-virtual {v12, v9, v15}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 235
    .line 236
    .line 237
    move-result v9

    .line 238
    const-string v13, "bpi"

    .line 239
    .line 240
    const/16 v14, 0x1388

    .line 241
    .line 242
    invoke-virtual {v12, v13, v14}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 243
    .line 244
    .line 245
    move-result v13

    .line 246
    const-string v14, "mpi"

    .line 247
    .line 248
    const v15, 0xea60

    .line 249
    .line 250
    .line 251
    invoke-virtual {v12, v14, v15}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 252
    .line 253
    .line 254
    move-result v14

    .line 255
    const-string v15, "cp"

    .line 256
    .line 257
    move/from16 v17, v9

    .line 258
    .line 259
    const/4 v9, 0x0

    .line 260
    invoke-virtual {v12, v15, v9}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 261
    .line 262
    .line 263
    move-result v15

    .line 264
    const-string v9, "c"

    .line 265
    .line 266
    move/from16 v18, v13

    .line 267
    .line 268
    move/from16 v20, v14

    .line 269
    .line 270
    const-wide/16 v13, 0x0

    .line 271
    .line 272
    invoke-virtual {v12, v9, v13, v14}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 273
    .line 274
    .line 275
    move-result-wide v12

    .line 276
    const-string v9, "base_polling_interval"

    .line 277
    .line 278
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 279
    .line 280
    .line 281
    move-result-object v14

    .line 282
    invoke-virtual {v11, v14, v9}, Lnm;->n(Ljava/lang/Object;Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    const-string v9, "max_polling_interval"

    .line 286
    .line 287
    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 288
    .line 289
    .line 290
    move-result-object v14

    .line 291
    invoke-virtual {v11, v14, v9}, Lnm;->n(Ljava/lang/Object;Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    const-string v9, "should_poll"

    .line 295
    .line 296
    invoke-static {v15}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 297
    .line 298
    .line 299
    move-result-object v14

    .line 300
    invoke-virtual {v11, v14, v9}, Lnm;->n(Ljava/lang/Object;Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    if-lez v17, :cond_7

    .line 304
    .line 305
    invoke-virtual {v11}, Lnm;->i()I

    .line 306
    .line 307
    .line 308
    move-result v9

    .line 309
    add-int v9, v9, v17

    .line 310
    .line 311
    invoke-virtual {v11}, Lnm;->i()I

    .line 312
    .line 313
    .line 314
    move-result v14

    .line 315
    const-string v15, "unread_count"

    .line 316
    .line 317
    add-int v14, v14, v17

    .line 318
    .line 319
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 320
    .line 321
    .line 322
    move-result-object v14

    .line 323
    invoke-virtual {v11, v14, v15}, Lnm;->n(Ljava/lang/Object;Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    invoke-virtual {v11}, Lnm;->m()Z

    .line 327
    .line 328
    .line 329
    move-result v14

    .line 330
    if-nez v14, :cond_7

    .line 331
    .line 332
    iget-object v0, v0, Liy;->e:Ljava/lang/Object;

    .line 333
    .line 334
    check-cast v0, Lb5;

    .line 335
    .line 336
    const/4 v14, 0x1

    .line 337
    if-le v9, v14, :cond_6

    .line 338
    .line 339
    const-string v14, "plural_message"

    .line 340
    .line 341
    invoke-virtual {v7, v9, v14}, Lts0;->t(ILjava/lang/String;)Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v7

    .line 345
    :goto_1
    const/4 v9, 0x0

    .line 346
    goto :goto_2

    .line 347
    :cond_6
    const-string v14, "single_message"

    .line 348
    .line 349
    invoke-virtual {v7, v9, v14}, Lts0;->t(ILjava/lang/String;)Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v7

    .line 353
    goto :goto_1

    .line 354
    :goto_2
    invoke-virtual {v0, v7, v9}, Lb5;->H(Ljava/lang/String;Z)V

    .line 355
    .line 356
    .line 357
    goto :goto_3

    .line 358
    :catch_0
    move-exception v0

    .line 359
    goto :goto_4

    .line 360
    :catch_1
    move-exception v0

    .line 361
    goto :goto_5

    .line 362
    :catch_2
    move-exception v0

    .line 363
    goto :goto_7

    .line 364
    :cond_7
    :goto_3
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    invoke-virtual {v11, v0, v8}, Lnm;->n(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lgt0; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 369
    .line 370
    .line 371
    return v10

    .line 372
    :goto_4
    const-string v1, "Error in poller request"

    .line 373
    .line 374
    invoke-static {v6, v1, v0}, Lxe2;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 375
    .line 376
    .line 377
    goto :goto_8

    .line 378
    :goto_5
    iget-object v7, v0, Lgt0;->c:Lym1;

    .line 379
    .line 380
    if-ne v7, v3, :cond_8

    .line 381
    .line 382
    invoke-virtual {v1, v4}, Lwc0;->C(Ljava/lang/String;)V

    .line 383
    .line 384
    .line 385
    goto :goto_6

    .line 386
    :cond_8
    if-ne v7, v2, :cond_9

    .line 387
    .line 388
    invoke-virtual {v1, v5}, Lwc0;->C(Ljava/lang/String;)V

    .line 389
    .line 390
    .line 391
    :cond_9
    :goto_6
    const-string v1, "HSRootApiException in poller request"

    .line 392
    .line 393
    invoke-static {v6, v1, v0}, Lxe2;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 394
    .line 395
    .line 396
    goto :goto_8

    .line 397
    :goto_7
    const-string v1, "Error parsing poller response"

    .line 398
    .line 399
    invoke-static {v6, v1, v0}, Lxe2;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 400
    .line 401
    .line 402
    :goto_8
    return v16

    .line 403
    :goto_9
    const-string v0, "Skipping notification count fetch. Invalid params for network call."

    .line 404
    .line 405
    const/4 v12, 0x0

    .line 406
    invoke-static {v6, v0, v12}, Lxe2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 407
    .line 408
    .line 409
    return v16
.end method

.method public i()Lorg/json/JSONObject;
    .locals 8

    .line 1
    const-string v0, "phone"

    .line 2
    .line 3
    iget-object p0, p0, Liy;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Lcb;

    .line 6
    .line 7
    new-instance v1, Lorg/json/JSONObject;

    .line 8
    .line 9
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 10
    .line 11
    .line 12
    :try_start_0
    const-string v2, "appVersion"

    .line 13
    .line 14
    invoke-virtual {p0}, Lcb;->p()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    iget-object v4, p0, Lcb;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v4, Landroid/content/Context;

    .line 21
    .line 22
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 23
    .line 24
    .line 25
    const-string v2, "appName"

    .line 26
    .line 27
    invoke-virtual {p0}, Lcb;->o()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 32
    .line 33
    .line 34
    const-string v2, "appIdentifier"

    .line 35
    .line 36
    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 41
    .line 42
    .line 43
    const-string v2, "batteryLevel"

    .line 44
    .line 45
    invoke-virtual {p0}, Lcb;->q()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {v1, v2, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 50
    .line 51
    .line 52
    const-string p0, "batteryStatus"

    .line 53
    .line 54
    const-string v2, "Not charging"

    .line 55
    .line 56
    new-instance v3, Landroid/content/IntentFilter;

    .line 57
    .line 58
    const-string v5, "android.intent.action.BATTERY_CHANGED"

    .line 59
    .line 60
    invoke-direct {v3, v5}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const/4 v5, 0x0

    .line 64
    invoke-virtual {v4, v5, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    if-nez v3, :cond_0

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_0
    const-string v6, "status"

    .line 72
    .line 73
    const/4 v7, -0x1

    .line 74
    invoke-virtual {v3, v6, v7}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    const/4 v6, 0x2

    .line 79
    if-eq v3, v6, :cond_1

    .line 80
    .line 81
    const/4 v6, 0x5

    .line 82
    if-ne v3, v6, :cond_2

    .line 83
    .line 84
    :cond_1
    const-string v2, "Charging"

    .line 85
    .line 86
    :cond_2
    :goto_0
    invoke-virtual {v1, p0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 87
    .line 88
    .line 89
    const-string p0, "carrierName"

    .line 90
    .line 91
    invoke-virtual {v4, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    check-cast v2, Landroid/telephony/TelephonyManager;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    .line 96
    .line 97
    const-string v3, ""

    .line 98
    .line 99
    if-nez v2, :cond_3

    .line 100
    .line 101
    move-object v2, v3

    .line 102
    goto :goto_1

    .line 103
    :cond_3
    :try_start_1
    invoke-virtual {v2}, Landroid/telephony/TelephonyManager;->getNetworkOperatorName()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    :goto_1
    invoke-virtual {v1, p0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 108
    .line 109
    .line 110
    const-string p0, "countryCode"

    .line 111
    .line 112
    invoke-virtual {v4, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    check-cast v0, Landroid/telephony/TelephonyManager;

    .line 117
    .line 118
    if-nez v0, :cond_4

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_4
    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getSimCountryIso()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    :goto_2
    invoke-virtual {v1, p0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 126
    .line 127
    .line 128
    const-string p0, "networkType"
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 129
    .line 130
    :try_start_2
    const-string v0, "connectivity"

    .line 131
    .line 132
    invoke-virtual {v4, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    check-cast v0, Landroid/net/ConnectivityManager;

    .line 137
    .line 138
    if-eqz v0, :cond_5

    .line 139
    .line 140
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    if-eqz v0, :cond_5

    .line 145
    .line 146
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getTypeName()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v5
    :try_end_2
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1

    .line 150
    :catch_0
    :cond_5
    if-nez v5, :cond_6

    .line 151
    .line 152
    :try_start_3
    const-string v5, "Unknown"

    .line 153
    .line 154
    :cond_6
    invoke-virtual {v1, p0, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 155
    .line 156
    .line 157
    invoke-static {}, Lcb;->w()Lwe2;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    const-string v0, "diskSpace"

    .line 162
    .line 163
    iget-object v2, p0, Lwe2;->c:Ljava/lang/Object;

    .line 164
    .line 165
    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 166
    .line 167
    .line 168
    const-string v0, "freeSpace"

    .line 169
    .line 170
    iget-object p0, p0, Lwe2;->b:Ljava/lang/Object;

    .line 171
    .line 172
    invoke-virtual {v1, v0, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 173
    .line 174
    .line 175
    const-string p0, "osVersion"

    .line 176
    .line 177
    sget-object v0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 178
    .line 179
    invoke-virtual {v1, p0, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 180
    .line 181
    .line 182
    const-string p0, "deviceModel"

    .line 183
    .line 184
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 185
    .line 186
    invoke-virtual {v1, p0, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 187
    .line 188
    .line 189
    const-string p0, "liteSdkVersion"

    .line 190
    .line 191
    const-string v0, "10.2.0"

    .line 192
    .line 193
    invoke-virtual {v1, p0, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_1

    .line 194
    .line 195
    .line 196
    goto :goto_3

    .line 197
    :catch_1
    move-exception p0

    .line 198
    const-string v0, "ConfigMangr"

    .line 199
    .line 200
    const-string v2, "error in generating device metadata"

    .line 201
    .line 202
    invoke-static {v0, v2, p0}, Lxe2;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 203
    .line 204
    .line 205
    :goto_3
    return-object v1
.end method

.method public j()Lfs0;
    .locals 8

    .line 1
    iget-object v0, p0, Liy;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lx31;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_9

    .line 7
    .line 8
    new-instance v0, Lfs0;

    .line 9
    .line 10
    invoke-static {}, Li41;->C()Lf41;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const/4 v3, 0x3

    .line 15
    invoke-direct {v0, v2, v3}, Lfs0;-><init>(Ljava/lang/Object;I)V

    .line 16
    .line 17
    .line 18
    iget-object v2, p0, Liy;->f:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v2, Lx31;

    .line 21
    .line 22
    monitor-enter v0

    .line 23
    :try_start_0
    iget-object v2, v2, Lx31;->a:Lw31;

    .line 24
    .line 25
    invoke-virtual {v0, v2}, Lfs0;->i(Lw31;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 26
    .line 27
    .line 28
    monitor-exit v0

    .line 29
    invoke-virtual {v0}, Lfs0;->q()Lec;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    iget-object v2, v2, Lec;->b:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v2, Li41;

    .line 36
    .line 37
    invoke-static {v2}, Lq13;->a(Li41;)Ln41;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {v2}, Ln41;->y()Lm41;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-virtual {v2}, Lm41;->A()I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    monitor-enter v0

    .line 50
    const/4 v3, 0x0

    .line 51
    move v4, v3

    .line 52
    :goto_0
    :try_start_1
    iget-object v5, v0, Lfs0;->b:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v5, Lf41;

    .line 55
    .line 56
    iget-object v5, v5, Loq0;->b:Lsq0;

    .line 57
    .line 58
    check-cast v5, Li41;

    .line 59
    .line 60
    invoke-virtual {v5}, Li41;->z()I

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    if-ge v4, v5, :cond_8

    .line 65
    .line 66
    iget-object v5, v0, Lfs0;->b:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v5, Lf41;

    .line 69
    .line 70
    iget-object v5, v5, Loq0;->b:Lsq0;

    .line 71
    .line 72
    check-cast v5, Li41;

    .line 73
    .line 74
    invoke-virtual {v5, v4}, Li41;->y(I)Lh41;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    invoke-virtual {v5}, Lh41;->B()I

    .line 79
    .line 80
    .line 81
    move-result v6

    .line 82
    if-ne v6, v2, :cond_7

    .line 83
    .line 84
    invoke-virtual {v5}, Lh41;->D()Lu31;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    sget-object v5, Lu31;->c:Lu31;

    .line 89
    .line 90
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    if-eqz v4, :cond_6

    .line 95
    .line 96
    iget-object v4, v0, Lfs0;->b:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v4, Lf41;

    .line 99
    .line 100
    invoke-virtual {v4}, Loq0;->e()V

    .line 101
    .line 102
    .line 103
    iget-object v4, v4, Loq0;->b:Lsq0;

    .line 104
    .line 105
    check-cast v4, Li41;

    .line 106
    .line 107
    invoke-static {v4, v2}, Li41;->w(Li41;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 108
    .line 109
    .line 110
    monitor-exit v0

    .line 111
    iget-object v2, p0, Liy;->a:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v2, Landroid/content/Context;

    .line 114
    .line 115
    iget-object v4, p0, Liy;->b:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v4, Ljava/lang/String;

    .line 118
    .line 119
    iget-object v5, p0, Liy;->c:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v5, Ljava/lang/String;

    .line 122
    .line 123
    if-eqz v4, :cond_5

    .line 124
    .line 125
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    if-nez v5, :cond_0

    .line 130
    .line 131
    invoke-static {v2}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    goto :goto_1

    .line 140
    :cond_0
    invoke-virtual {v2, v5, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    :goto_1
    iget-object v5, p0, Liy;->e:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v5, Ly5;

    .line 151
    .line 152
    if-eqz v5, :cond_3

    .line 153
    .line 154
    invoke-virtual {v0}, Lfs0;->q()Lec;

    .line 155
    .line 156
    .line 157
    move-result-object v5

    .line 158
    iget-object p0, p0, Liy;->e:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast p0, Ly5;

    .line 161
    .line 162
    new-array v6, v3, [B

    .line 163
    .line 164
    iget-object v5, v5, Lec;->b:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v5, Li41;

    .line 167
    .line 168
    invoke-virtual {v5}, Lw;->e()[B

    .line 169
    .line 170
    .line 171
    move-result-object v7

    .line 172
    invoke-virtual {p0, v7, v6}, Ly5;->a([B[B)[B

    .line 173
    .line 174
    .line 175
    move-result-object v7

    .line 176
    :try_start_2
    invoke-virtual {p0, v7, v6}, Ly5;->b([B[B)[B

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    invoke-static {}, Ldg0;->a()Ldg0;

    .line 181
    .line 182
    .line 183
    move-result-object v6

    .line 184
    invoke-static {p0, v6}, Li41;->E([BLdg0;)Li41;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    invoke-virtual {p0, v5}, Lsq0;->equals(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result p0
    :try_end_2
    .catch Lpz0; {:try_start_2 .. :try_end_2} :catch_0

    .line 192
    if-eqz p0, :cond_2

    .line 193
    .line 194
    invoke-static {}, Lzd0;->z()Lyd0;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    array-length v6, v7

    .line 199
    invoke-static {v7, v3, v6}, Lvl;->c([BII)Ltl;

    .line 200
    .line 201
    .line 202
    move-result-object v3

    .line 203
    invoke-virtual {p0}, Loq0;->e()V

    .line 204
    .line 205
    .line 206
    iget-object v6, p0, Loq0;->b:Lsq0;

    .line 207
    .line 208
    check-cast v6, Lzd0;

    .line 209
    .line 210
    invoke-static {v6, v3}, Lzd0;->w(Lzd0;Ltl;)V

    .line 211
    .line 212
    .line 213
    invoke-static {v5}, Lq13;->a(Li41;)Ln41;

    .line 214
    .line 215
    .line 216
    move-result-object v3

    .line 217
    invoke-virtual {p0}, Loq0;->e()V

    .line 218
    .line 219
    .line 220
    iget-object v5, p0, Loq0;->b:Lsq0;

    .line 221
    .line 222
    check-cast v5, Lzd0;

    .line 223
    .line 224
    invoke-static {v5, v3}, Lzd0;->x(Lzd0;Ln41;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {p0}, Loq0;->b()Lsq0;

    .line 228
    .line 229
    .line 230
    move-result-object p0

    .line 231
    check-cast p0, Lzd0;

    .line 232
    .line 233
    invoke-virtual {p0}, Lw;->e()[B

    .line 234
    .line 235
    .line 236
    move-result-object p0

    .line 237
    invoke-static {p0}, Lqj3;->r([B)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object p0

    .line 241
    invoke-interface {v2, v4, p0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 242
    .line 243
    .line 244
    move-result-object p0

    .line 245
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 246
    .line 247
    .line 248
    move-result p0

    .line 249
    if-eqz p0, :cond_1

    .line 250
    .line 251
    goto :goto_2

    .line 252
    :cond_1
    const-string p0, "Failed to write to SharedPreferences"

    .line 253
    .line 254
    invoke-static {p0}, Lds0;->l(Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    return-object v1

    .line 258
    :cond_2
    :try_start_3
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 259
    .line 260
    const-string v0, "cannot encrypt keyset"

    .line 261
    .line 262
    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    throw p0
    :try_end_3
    .catch Lpz0; {:try_start_3 .. :try_end_3} :catch_0

    .line 266
    :catch_0
    const-string p0, "invalid keyset, corrupted key material"

    .line 267
    .line 268
    invoke-static {p0}, Lds0;->t(Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    return-object v1

    .line 272
    :cond_3
    invoke-virtual {v0}, Lfs0;->q()Lec;

    .line 273
    .line 274
    .line 275
    move-result-object p0

    .line 276
    iget-object p0, p0, Lec;->b:Ljava/lang/Object;

    .line 277
    .line 278
    check-cast p0, Li41;

    .line 279
    .line 280
    invoke-virtual {p0}, Lw;->e()[B

    .line 281
    .line 282
    .line 283
    move-result-object p0

    .line 284
    invoke-static {p0}, Lqj3;->r([B)Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object p0

    .line 288
    invoke-interface {v2, v4, p0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 289
    .line 290
    .line 291
    move-result-object p0

    .line 292
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 293
    .line 294
    .line 295
    move-result p0

    .line 296
    if-eqz p0, :cond_4

    .line 297
    .line 298
    :goto_2
    return-object v0

    .line 299
    :cond_4
    const-string p0, "Failed to write to SharedPreferences"

    .line 300
    .line 301
    invoke-static {p0}, Lds0;->l(Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    return-object v1

    .line 305
    :cond_5
    const-string p0, "keysetName cannot be null"

    .line 306
    .line 307
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    return-object v1

    .line 311
    :cond_6
    :try_start_4
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 312
    .line 313
    new-instance v1, Ljava/lang/StringBuilder;

    .line 314
    .line 315
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 316
    .line 317
    .line 318
    const-string v3, "cannot set key as primary because it\'s not enabled: "

    .line 319
    .line 320
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 321
    .line 322
    .line 323
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v1

    .line 330
    invoke-direct {p0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
    throw p0

    .line 334
    :catchall_0
    move-exception p0

    .line 335
    goto :goto_3

    .line 336
    :cond_7
    add-int/lit8 v4, v4, 0x1

    .line 337
    .line 338
    goto/16 :goto_0

    .line 339
    .line 340
    :cond_8
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 341
    .line 342
    new-instance v1, Ljava/lang/StringBuilder;

    .line 343
    .line 344
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 345
    .line 346
    .line 347
    const-string v3, "key not found: "

    .line 348
    .line 349
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 350
    .line 351
    .line 352
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 353
    .line 354
    .line 355
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v1

    .line 359
    invoke-direct {p0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 360
    .line 361
    .line 362
    throw p0

    .line 363
    :goto_3
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 364
    throw p0

    .line 365
    :catchall_1
    move-exception p0

    .line 366
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 367
    throw p0

    .line 368
    :cond_9
    const-string p0, "cannot read or generate keyset"

    .line 369
    .line 370
    invoke-static {p0}, Lds0;->t(Ljava/lang/String;)V

    .line 371
    .line 372
    .line 373
    return-object v1
.end method

.method public declared-synchronized k(I)Lorg/json/JSONArray;
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    new-instance v0, Lorg/json/JSONArray;

    .line 3
    .line 4
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    .line 7
    :try_start_1
    iget-object v1, p0, Liy;->e:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-static {v1, p1}, Ljava/lang/Math;->min(II)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    const/4 v1, 0x0

    .line 20
    :goto_0
    if-ge v1, p1, :cond_0

    .line 21
    .line 22
    iget-object v2, p0, Liy;->e:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v2, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 31
    .line 32
    .line 33
    add-int/lit8 v1, v1, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception p1

    .line 37
    goto :goto_1

    .line 38
    :catch_0
    move-exception p1

    .line 39
    :try_start_2
    const-string v1, "ConfigMangr"

    .line 40
    .line 41
    const-string v2, "Error getting DebugLogs."

    .line 42
    .line 43
    invoke-static {v1, v2, p1}, Lxe2;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 44
    .line 45
    .line 46
    :cond_0
    monitor-exit p0

    .line 47
    return-object v0

    .line 48
    :goto_1
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 49
    throw p1
.end method

.method public l(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Liy;->m(Z)Lorg/json/JSONObject;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    new-instance v2, Lorg/json/JSONObject;

    .line 7
    .line 8
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 9
    .line 10
    .line 11
    :try_start_0
    invoke-static {p1}, Lb40;->r(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    const-string v3, "faqId"

    .line 18
    .line 19
    invoke-virtual {v2, v3, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catch_0
    move-exception p0

    .line 24
    goto :goto_2

    .line 25
    :cond_0
    :goto_0
    invoke-static {p2}, Lb40;->r(Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    const-string p1, "sectionId"

    .line 32
    .line 33
    invoke-virtual {v2, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    .line 35
    .line 36
    :cond_1
    const-string p1, "showChatIcon"

    .line 37
    .line 38
    if-eqz p3, :cond_2

    .line 39
    .line 40
    :try_start_1
    invoke-virtual {v2, p1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    iget-object p2, p0, Liy;->d:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p2, Lnm;

    .line 47
    .line 48
    const-string p3, "show_chat_icon_in_helpcenter"

    .line 49
    .line 50
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 51
    .line 52
    invoke-virtual {p2, v0, p3}, Lnm;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    check-cast p2, Ljava/lang/Boolean;

    .line 57
    .line 58
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    if-eqz p2, :cond_3

    .line 63
    .line 64
    const/4 p2, 0x1

    .line 65
    invoke-virtual {v2, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 66
    .line 67
    .line 68
    :cond_3
    :goto_1
    iget-object p0, p0, Liy;->a:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast p0, Ler0;

    .line 71
    .line 72
    const-string p1, "additional_hc_data"

    .line 73
    .line 74
    iget-object p0, p0, Ler0;->b:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast p0, Ler0;

    .line 77
    .line 78
    invoke-virtual {p0, p1}, Ler0;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-static {p0}, Lb40;->r(Ljava/lang/String;)Z

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    if-eqz p1, :cond_4

    .line 87
    .line 88
    invoke-static {p0}, Lb40;->t(Ljava/lang/String;)Z

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    if-eqz p1, :cond_4

    .line 93
    .line 94
    new-instance p1, Lorg/json/JSONObject;

    .line 95
    .line 96
    invoke-direct {p1, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    const-string p0, "additionalInfo"

    .line 100
    .line 101
    invoke-virtual {v2, p0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 102
    .line 103
    .line 104
    :cond_4
    const-string p0, "helpcenterConfig"

    .line 105
    .line 106
    invoke-virtual {v1, p0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 113
    return-object p0

    .line 114
    :goto_2
    const-string p1, "ConfigMangr"

    .line 115
    .line 116
    const-string p2, "Error in generating the helpcenter config"

    .line 117
    .line 118
    invoke-static {p1, p2, p0}, Lxe2;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    return-object p0
.end method

.method public m(Z)Lorg/json/JSONObject;
    .locals 14

    .line 1
    const-string v0, "anon_user_id_map"

    .line 2
    .line 3
    const-string v1, "language"

    .line 4
    .line 5
    iget-object v2, p0, Liy;->i:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Ljava/util/ArrayList;

    .line 8
    .line 9
    const-string v3, "ConfigMangr"

    .line 10
    .line 11
    iget-object v4, p0, Liy;->a:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v4, Ler0;

    .line 14
    .line 15
    invoke-virtual {v4}, Ler0;->q()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    iget-object v6, v4, Ler0;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v6, Ler0;

    .line 22
    .line 23
    const-string v7, "domain"

    .line 24
    .line 25
    invoke-virtual {v6, v7}, Ler0;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v8

    .line 29
    const-string v9, "config"

    .line 30
    .line 31
    invoke-virtual {v6, v9}, Ler0;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v9

    .line 35
    iget-object v10, p0, Liy;->c:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v10, Lcb;

    .line 38
    .line 39
    new-instance v11, Lorg/json/JSONObject;

    .line 40
    .line 41
    invoke-direct {v11}, Lorg/json/JSONObject;-><init>()V

    .line 42
    .line 43
    .line 44
    :try_start_0
    const-string v12, "local_storage_data"

    .line 45
    .line 46
    invoke-virtual {v6, v12}, Ler0;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v12

    .line 50
    invoke-static {v12}, Lb40;->r(Ljava/lang/String;)Z

    .line 51
    .line 52
    .line 53
    move-result v13

    .line 54
    if-eqz v13, :cond_0

    .line 55
    .line 56
    new-instance v13, Lorg/json/JSONObject;

    .line 57
    .line 58
    invoke-direct {v13, v12}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    const-string v12, "localStorageData"

    .line 62
    .line 63
    invoke-virtual {v11, v12, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :catch_0
    move-exception p1

    .line 68
    goto :goto_1

    .line 69
    :cond_0
    :goto_0
    invoke-virtual {p0}, Liy;->i()Lorg/json/JSONObject;

    .line 70
    .line 71
    .line 72
    move-result-object v12

    .line 73
    const-string v13, "metaData"

    .line 74
    .line 75
    invoke-virtual {v11, v13, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 76
    .line 77
    .line 78
    const-string v12, "os"

    .line 79
    .line 80
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    const-string v13, "android"

    .line 84
    .line 85
    invoke-virtual {v11, v12, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v4}, Ler0;->m()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    invoke-static {v4}, Lb40;->r(Ljava/lang/String;)Z

    .line 93
    .line 94
    .line 95
    move-result v12

    .line 96
    if-eqz v12, :cond_1

    .line 97
    .line 98
    iget-object v12, p0, Liy;->d:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v12, Lnm;

    .line 101
    .line 102
    invoke-virtual {v12}, Lnm;->m()Z

    .line 103
    .line 104
    .line 105
    move-result v12

    .line 106
    if-nez v12, :cond_1

    .line 107
    .line 108
    const-string v12, "pushToken"

    .line 109
    .line 110
    invoke-virtual {v11, v12, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 111
    .line 112
    .line 113
    :cond_1
    iget-object v4, p0, Liy;->b:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v4, Lra2;

    .line 116
    .line 117
    iget-object v4, v4, Lra2;->c:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v4, Ljava/util/HashMap;

    .line 120
    .line 121
    const-string v12, "analyticsData"

    .line 122
    .line 123
    new-instance v13, Lorg/json/JSONObject;

    .line 124
    .line 125
    invoke-direct {v13, v4}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v11, v12, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 129
    .line 130
    .line 131
    const-string v4, "deviceId"

    .line 132
    .line 133
    invoke-virtual {v10}, Lcb;->v()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v12

    .line 137
    invoke-virtual {v11, v4, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 138
    .line 139
    .line 140
    const-string v4, "launchedFromHelpcenter"

    .line 141
    .line 142
    invoke-virtual {v11, v4, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 143
    .line 144
    .line 145
    goto :goto_2

    .line 146
    :goto_1
    const-string v4, "error in generating liteSdkConfig"

    .line 147
    .line 148
    invoke-static {v3, v4, p1}, Lxe2;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 149
    .line 150
    .line 151
    :goto_2
    invoke-static {v9}, Lb40;->p(Ljava/lang/String;)Z

    .line 152
    .line 153
    .line 154
    move-result p1

    .line 155
    const-string v4, "{}"

    .line 156
    .line 157
    if-eqz p1, :cond_2

    .line 158
    .line 159
    move-object v9, v4

    .line 160
    :cond_2
    :try_start_1
    new-instance p1, Lorg/json/JSONObject;

    .line 161
    .line 162
    invoke-direct {p1, v9}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    const-string v9, "platformId"

    .line 166
    .line 167
    invoke-virtual {p1, v9, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 168
    .line 169
    .line 170
    invoke-virtual {p1, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 171
    .line 172
    .line 173
    const-string v5, "widgetOptions"

    .line 174
    .line 175
    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 176
    .line 177
    .line 178
    move-result v7

    .line 179
    const/4 v8, 0x0

    .line 180
    if-eqz v7, :cond_3

    .line 181
    .line 182
    goto :goto_3

    .line 183
    :cond_3
    new-instance v7, Lorg/json/JSONObject;

    .line 184
    .line 185
    invoke-direct {v7}, Lorg/json/JSONObject;-><init>()V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_6

    .line 186
    .line 187
    .line 188
    :try_start_2
    const-string v9, "showLauncher"

    .line 189
    .line 190
    invoke-virtual {v7, v9, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 191
    .line 192
    .line 193
    const-string v9, "fullScreen"

    .line 194
    .line 195
    const/4 v12, 0x1

    .line 196
    invoke-virtual {v7, v9, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 197
    .line 198
    .line 199
    invoke-virtual {p1, v5, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1

    .line 200
    .line 201
    .line 202
    goto :goto_3

    .line 203
    :catch_1
    move-exception v5

    .line 204
    :try_start_3
    const-string v7, "Error in setting the widget option config"

    .line 205
    .line 206
    invoke-static {v3, v7, v5}, Lxe2;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 207
    .line 208
    .line 209
    :goto_3
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 210
    .line 211
    .line 212
    move-result v5
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_6

    .line 213
    if-eqz v5, :cond_4

    .line 214
    .line 215
    goto :goto_6

    .line 216
    :cond_4
    :try_start_4
    invoke-virtual {v6, v1}, Ler0;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v5

    .line 220
    invoke-static {v5}, Lb40;->p(Ljava/lang/String;)Z

    .line 221
    .line 222
    .line 223
    move-result v7

    .line 224
    if-eqz v7, :cond_5

    .line 225
    .line 226
    invoke-virtual {v10}, Lcb;->y()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v5

    .line 230
    goto :goto_4

    .line 231
    :catch_2
    move-exception v1

    .line 232
    goto :goto_5

    .line 233
    :cond_5
    :goto_4
    invoke-virtual {p1, v1, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    .line 234
    .line 235
    .line 236
    goto :goto_6

    .line 237
    :goto_5
    :try_start_5
    const-string v5, "Error in setting the language"

    .line 238
    .line 239
    invoke-static {v3, v5, v1}, Lxe2;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 240
    .line 241
    .line 242
    :goto_6
    const-string v1, "active_user"

    .line 243
    .line 244
    invoke-virtual {v6, v1}, Ler0;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    invoke-static {v1}, Lb40;->r(Ljava/lang/String;)Z

    .line 249
    .line 250
    .line 251
    move-result v5
    :try_end_5
    .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_5} :catch_6

    .line 252
    if-eqz v5, :cond_6

    .line 253
    .line 254
    :try_start_6
    new-instance v5, Lorg/json/JSONObject;

    .line 255
    .line 256
    invoke-direct {v5, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v5}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 264
    .line 265
    .line 266
    move-result v7

    .line 267
    if-eqz v7, :cond_6

    .line 268
    .line 269
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v7

    .line 273
    check-cast v7, Ljava/lang/String;

    .line 274
    .line 275
    invoke-virtual {v5, v7}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v9

    .line 279
    invoke-virtual {p1, v7, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_6
    .catch Lorg/json/JSONException; {:try_start_6 .. :try_end_6} :catch_3

    .line 280
    .line 281
    .line 282
    goto :goto_7

    .line 283
    :catch_3
    move-exception v1

    .line 284
    :try_start_7
    const-string v5, "Error in setting the user config"

    .line 285
    .line 286
    invoke-static {v3, v5, v1}, Lxe2;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 287
    .line 288
    .line 289
    :cond_6
    const-string v1, "clear_anonymous_user"

    .line 290
    .line 291
    iget-object v5, v6, Ler0;->b:Ljava/lang/Object;

    .line 292
    .line 293
    check-cast v5, Landroid/content/SharedPreferences;

    .line 294
    .line 295
    invoke-interface {v5, v1, v8}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 296
    .line 297
    .line 298
    move-result v1
    :try_end_7
    .catch Lorg/json/JSONException; {:try_start_7 .. :try_end_7} :catch_6

    .line 299
    :try_start_8
    const-string v5, "clearAnonymousUserOnLogin"

    .line 300
    .line 301
    invoke-virtual {p1, v5, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    :try_end_8
    .catch Lorg/json/JSONException; {:try_start_8 .. :try_end_8} :catch_4

    .line 302
    .line 303
    .line 304
    goto :goto_8

    .line 305
    :catch_4
    move-exception v1

    .line 306
    :try_start_9
    const-string v5, "error in setting clear anonymous user flag "

    .line 307
    .line 308
    invoke-static {v3, v5, v1}, Lxe2;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 309
    .line 310
    .line 311
    :goto_8
    new-instance v1, Ljava/lang/StringBuilder;

    .line 312
    .line 313
    const-string v5, "Adding sdk open source value to config : "

    .line 314
    .line 315
    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    iget-object v5, p0, Liy;->f:Ljava/lang/Object;

    .line 319
    .line 320
    check-cast v5, Ljava/lang/String;

    .line 321
    .line 322
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v1

    .line 329
    const/4 v5, 0x0

    .line 330
    invoke-static {v3, v1, v5}, Lxe2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 331
    .line 332
    .line 333
    iget-object v1, p0, Liy;->f:Ljava/lang/Object;

    .line 334
    .line 335
    check-cast v1, Ljava/lang/String;

    .line 336
    .line 337
    invoke-static {v1}, Lb40;->p(Ljava/lang/String;)Z

    .line 338
    .line 339
    .line 340
    move-result v1

    .line 341
    if-nez v1, :cond_7

    .line 342
    .line 343
    const-string v1, "source"

    .line 344
    .line 345
    iget-object v5, p0, Liy;->f:Ljava/lang/Object;

    .line 346
    .line 347
    check-cast v5, Ljava/lang/String;

    .line 348
    .line 349
    invoke-virtual {p1, v1, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 350
    .line 351
    .line 352
    :cond_7
    const-string v1, "proactive"

    .line 353
    .line 354
    iget-object p0, p0, Liy;->f:Ljava/lang/Object;

    .line 355
    .line 356
    check-cast p0, Ljava/lang/String;

    .line 357
    .line 358
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 359
    .line 360
    .line 361
    move-result p0

    .line 362
    if-eqz p0, :cond_9

    .line 363
    .line 364
    const-string p0, "localProactiveConfig"

    .line 365
    .line 366
    invoke-virtual {v6, p0}, Ler0;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object p0

    .line 370
    invoke-static {p0}, Lb40;->p(Ljava/lang/String;)Z

    .line 371
    .line 372
    .line 373
    move-result v1
    :try_end_9
    .catch Lorg/json/JSONException; {:try_start_9 .. :try_end_9} :catch_6

    .line 374
    if-eqz v1, :cond_8

    .line 375
    .line 376
    goto :goto_9

    .line 377
    :cond_8
    move-object v4, p0

    .line 378
    :goto_9
    :try_start_a
    new-instance p0, Lorg/json/JSONObject;

    .line 379
    .line 380
    invoke-direct {p0, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 381
    .line 382
    .line 383
    const-string v1, "configForSubsequentProactiveIssues"

    .line 384
    .line 385
    invoke-virtual {p1, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_a
    .catch Lorg/json/JSONException; {:try_start_a .. :try_end_a} :catch_5

    .line 386
    .line 387
    .line 388
    goto :goto_a

    .line 389
    :catch_5
    move-exception p0

    .line 390
    :try_start_b
    const-string v1, "Error in setting local proactive config "

    .line 391
    .line 392
    invoke-static {v3, v1, p0}, Lxe2;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 393
    .line 394
    .line 395
    :cond_9
    :goto_a
    invoke-virtual {v6, v0}, Ler0;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object p0

    .line 399
    invoke-static {p0}, Lb40;->r(Ljava/lang/String;)Z

    .line 400
    .line 401
    .line 402
    move-result p0

    .line 403
    if-eqz p0, :cond_a

    .line 404
    .line 405
    invoke-virtual {v6, v0}, Ler0;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object p0

    .line 409
    invoke-static {p0}, Lb40;->v(Ljava/lang/String;)Ljava/util/HashMap;

    .line 410
    .line 411
    .line 412
    move-result-object p0

    .line 413
    const-string v0, "userId"

    .line 414
    .line 415
    invoke-virtual {p0, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object p0

    .line 419
    check-cast p0, Ljava/lang/String;

    .line 420
    .line 421
    invoke-static {p0}, Lb40;->r(Ljava/lang/String;)Z

    .line 422
    .line 423
    .line 424
    move-result v0

    .line 425
    if-eqz v0, :cond_a

    .line 426
    .line 427
    const-string v0, "anonUserId"

    .line 428
    .line 429
    invoke-virtual {v11, v0, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 430
    .line 431
    .line 432
    :cond_a
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 433
    .line 434
    .line 435
    move-result p0

    .line 436
    if-nez p0, :cond_b

    .line 437
    .line 438
    const-string p0, "userTrail"

    .line 439
    .line 440
    new-instance v0, Lorg/json/JSONArray;

    .line 441
    .line 442
    invoke-direct {v0, v2}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 443
    .line 444
    .line 445
    invoke-virtual {p1, p0, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 446
    .line 447
    .line 448
    goto :goto_b

    .line 449
    :catch_6
    move-exception p0

    .line 450
    goto :goto_c

    .line 451
    :cond_b
    :goto_b
    const-string p0, "liteSdkConfig"

    .line 452
    .line 453
    invoke-virtual {p1, p0, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_b
    .catch Lorg/json/JSONException; {:try_start_b .. :try_end_b} :catch_6

    .line 454
    .line 455
    .line 456
    return-object p1

    .line 457
    :goto_c
    const-string p1, "Error in creating the config object"

    .line 458
    .line 459
    invoke-static {v3, p1, p0}, Lxe2;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 460
    .line 461
    .line 462
    new-instance p0, Lorg/json/JSONObject;

    .line 463
    .line 464
    invoke-direct {p0}, Lorg/json/JSONObject;-><init>()V

    .line 465
    .line 466
    .line 467
    return-object p0
.end method

.method public n(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object p0, p0, Liy;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ler0;

    .line 4
    .line 5
    const-string v0, "webchat"

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object p0, p0, Ler0;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Ler0;

    .line 16
    .line 17
    const-string p1, "ui_config_data"

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Ler0;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :cond_0
    const-string v0, "helpcenter"

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    iget-object p0, p0, Ler0;->b:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p0, Ler0;

    .line 35
    .line 36
    const-string p1, "helpcenter_ui_config_data"

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Ler0;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :cond_1
    const-string p0, ""

    .line 44
    .line 45
    return-object p0
.end method

.method public o()V
    .locals 8

    .line 1
    iget-object v0, p0, Liy;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_5

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lsx;

    .line 24
    .line 25
    iget-object v2, v1, Lsx;->c:Ljava/util/Set;

    .line 26
    .line 27
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_0

    .line 36
    .line 37
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    check-cast v3, Lr70;

    .line 42
    .line 43
    iget v4, v3, Lr70;->b:I

    .line 44
    .line 45
    const/4 v5, 0x2

    .line 46
    if-ne v4, v5, :cond_2

    .line 47
    .line 48
    iget-object v4, p0, Liy;->c:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v4, Ljava/util/HashMap;

    .line 51
    .line 52
    iget-object v6, v3, Lr70;->a:Lf02;

    .line 53
    .line 54
    invoke-virtual {v4, v6}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    if-nez v4, :cond_2

    .line 59
    .line 60
    iget-object v4, p0, Liy;->c:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v4, Ljava/util/HashMap;

    .line 63
    .line 64
    iget-object v3, v3, Lr70;->a:Lf02;

    .line 65
    .line 66
    sget-object v5, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 67
    .line 68
    new-instance v6, Ls51;

    .line 69
    .line 70
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 71
    .line 72
    .line 73
    const/4 v7, 0x0

    .line 74
    iput-object v7, v6, Ls51;->b:Ljava/util/Set;

    .line 75
    .line 76
    new-instance v7, Ljava/util/concurrent/ConcurrentHashMap;

    .line 77
    .line 78
    invoke-direct {v7}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 79
    .line 80
    .line 81
    invoke-static {v7}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    iput-object v7, v6, Ls51;->a:Ljava/util/Set;

    .line 86
    .line 87
    iget-object v7, v6, Ls51;->a:Ljava/util/Set;

    .line 88
    .line 89
    invoke-interface {v7, v5}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 90
    .line 91
    .line 92
    invoke-virtual {v4, v3, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_2
    iget-object v4, p0, Liy;->b:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v4, Ljava/util/HashMap;

    .line 99
    .line 100
    iget-object v6, v3, Lr70;->a:Lf02;

    .line 101
    .line 102
    invoke-virtual {v4, v6}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v4

    .line 106
    if-nez v4, :cond_1

    .line 107
    .line 108
    iget v4, v3, Lr70;->b:I

    .line 109
    .line 110
    const/4 v6, 0x1

    .line 111
    if-eq v4, v6, :cond_4

    .line 112
    .line 113
    if-ne v4, v5, :cond_3

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_3
    iget-object v4, p0, Liy;->b:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v4, Ljava/util/HashMap;

    .line 119
    .line 120
    iget-object v3, v3, Lr70;->a:Lf02;

    .line 121
    .line 122
    new-instance v5, Lmq1;

    .line 123
    .line 124
    sget-object v6, Lmq1;->c:Lds0;

    .line 125
    .line 126
    sget-object v7, Lmq1;->d:Lgy;

    .line 127
    .line 128
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 129
    .line 130
    .line 131
    iput-object v6, v5, Lmq1;->a:Lds0;

    .line 132
    .line 133
    iput-object v7, v5, Lmq1;->b:Liz1;

    .line 134
    .line 135
    invoke-virtual {v4, v3, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_4
    new-instance p0, Lt70;

    .line 140
    .line 141
    iget-object v0, v3, Lr70;->a:Lf02;

    .line 142
    .line 143
    new-instance v2, Ljava/lang/StringBuilder;

    .line 144
    .line 145
    const-string v3, "Unsatisfied dependency for component "

    .line 146
    .line 147
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    const-string v1, ": "

    .line 154
    .line 155
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    throw p0

    .line 169
    :cond_5
    return-void
.end method

.method public p(Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 7

    .line 1
    iget-object v0, p0, Liy;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashMap;

    .line 4
    .line 5
    new-instance v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_2

    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Lsx;

    .line 25
    .line 26
    iget v3, v2, Lsx;->e:I

    .line 27
    .line 28
    if-nez v3, :cond_0

    .line 29
    .line 30
    iget-object v3, p0, Liy;->a:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v3, Ljava/util/HashMap;

    .line 33
    .line 34
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, Liz1;

    .line 39
    .line 40
    iget-object v2, v2, Lsx;->b:Ljava/util/Set;

    .line 41
    .line 42
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-eqz v4, :cond_0

    .line 51
    .line 52
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    check-cast v4, Lf02;

    .line 57
    .line 58
    invoke-virtual {v0, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    if-nez v5, :cond_1

    .line 63
    .line 64
    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    check-cast v4, Liz1;

    .line 73
    .line 74
    check-cast v4, Lmq1;

    .line 75
    .line 76
    new-instance v5, Lj8;

    .line 77
    .line 78
    const/16 v6, 0xa

    .line 79
    .line 80
    invoke-direct {v5, v6, v4, v3}, Lj8;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_2
    return-object v1
.end method

.method public q()Ljava/util/ArrayList;
    .locals 7

    .line 1
    iget-object v0, p0, Liy;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashMap;

    .line 4
    .line 5
    new-instance v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v2, Ljava/util/HashMap;

    .line 11
    .line 12
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, Liy;->a:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, Ljava/util/HashMap;

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_3

    .line 32
    .line 33
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    check-cast v3, Ljava/util/Map$Entry;

    .line 38
    .line 39
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    check-cast v4, Lsx;

    .line 44
    .line 45
    iget v5, v4, Lsx;->e:I

    .line 46
    .line 47
    if-nez v5, :cond_1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    check-cast v3, Liz1;

    .line 55
    .line 56
    iget-object v4, v4, Lsx;->b:Ljava/util/Set;

    .line 57
    .line 58
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    if-eqz v5, :cond_0

    .line 67
    .line 68
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    check-cast v5, Lf02;

    .line 73
    .line 74
    invoke-virtual {v2, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    if-nez v6, :cond_2

    .line 79
    .line 80
    new-instance v6, Ljava/util/HashSet;

    .line 81
    .line 82
    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    :cond_2
    invoke-virtual {v2, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    check-cast v5, Ljava/util/Set;

    .line 93
    .line 94
    invoke-interface {v5, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_3
    invoke-virtual {v2}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    :cond_4
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    if-eqz v2, :cond_6

    .line 111
    .line 112
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    check-cast v2, Ljava/util/Map$Entry;

    .line 117
    .line 118
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    invoke-virtual {v0, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    if-nez v3, :cond_5

    .line 127
    .line 128
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    check-cast v3, Lf02;

    .line 133
    .line 134
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    check-cast v2, Ljava/util/Collection;

    .line 139
    .line 140
    check-cast v2, Ljava/util/Set;

    .line 141
    .line 142
    new-instance v4, Ls51;

    .line 143
    .line 144
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 145
    .line 146
    .line 147
    const/4 v5, 0x0

    .line 148
    iput-object v5, v4, Ls51;->b:Ljava/util/Set;

    .line 149
    .line 150
    new-instance v5, Ljava/util/concurrent/ConcurrentHashMap;

    .line 151
    .line 152
    invoke-direct {v5}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 153
    .line 154
    .line 155
    invoke-static {v5}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 156
    .line 157
    .line 158
    move-result-object v5

    .line 159
    iput-object v5, v4, Ls51;->a:Ljava/util/Set;

    .line 160
    .line 161
    iget-object v5, v4, Ls51;->a:Ljava/util/Set;

    .line 162
    .line 163
    invoke-interface {v5, v2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 164
    .line 165
    .line 166
    invoke-virtual {v0, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    goto :goto_2

    .line 170
    :cond_5
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    check-cast v3, Ls51;

    .line 179
    .line 180
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    check-cast v2, Ljava/util/Set;

    .line 185
    .line 186
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 191
    .line 192
    .line 193
    move-result v4

    .line 194
    if-eqz v4, :cond_4

    .line 195
    .line 196
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v4

    .line 200
    check-cast v4, Liz1;

    .line 201
    .line 202
    new-instance v5, Lj8;

    .line 203
    .line 204
    const/16 v6, 0xb

    .line 205
    .line 206
    invoke-direct {v5, v6, v3, v4}, Lj8;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    goto :goto_3

    .line 213
    :cond_6
    return-object v1
.end method

.method public s([B)Lfs0;
    .locals 3

    .line 1
    :try_start_0
    new-instance v0, Ll8;

    .line 2
    .line 3
    invoke-direct {v0}, Ll8;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Liy;->d:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ll8;->c(Ljava/lang/String;)Ly5;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Liy;->e:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/security/ProviderException; {:try_start_0 .. :try_end_0} :catch_3

    .line 15
    .line 16
    :try_start_1
    new-instance v0, Lqc3;

    .line 17
    .line 18
    new-instance v1, Ljava/io/ByteArrayInputStream;

    .line 19
    .line 20
    invoke-direct {v1, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 21
    .line 22
    .line 23
    const/16 v2, 0xb

    .line 24
    .line 25
    invoke-direct {v0, v1, v2}, Lqc3;-><init>(Ljava/lang/Object;I)V

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, Liy;->e:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p0, Ly5;

    .line 31
    .line 32
    invoke-static {v0, p0}, Lec;->J(Lqc3;Ly5;)Lec;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    new-instance v0, Lfs0;

    .line 37
    .line 38
    iget-object p0, p0, Lec;->b:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p0, Li41;

    .line 41
    .line 42
    invoke-virtual {p0}, Lsq0;->v()Loq0;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    check-cast p0, Lf41;

    .line 47
    .line 48
    const/4 v1, 0x3

    .line 49
    invoke-direct {v0, p0, v1}, Lfs0;-><init>(Ljava/lang/Object;I)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_0

    .line 50
    .line 51
    .line 52
    return-object v0

    .line 53
    :catch_0
    move-exception p0

    .line 54
    goto :goto_0

    .line 55
    :catch_1
    move-exception p0

    .line 56
    :goto_0
    :try_start_2
    invoke-static {p1}, Liy;->r([B)Lfs0;

    .line 57
    .line 58
    .line 59
    move-result-object p0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    .line 60
    return-object p0

    .line 61
    :catch_2
    throw p0

    .line 62
    :catch_3
    move-exception p0

    .line 63
    goto :goto_1

    .line 64
    :catch_4
    move-exception p0

    .line 65
    :goto_1
    :try_start_3
    invoke-static {p1}, Liy;->r([B)Lfs0;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    sget-object v0, Ld52;->d:Ljava/lang/Object;

    .line 70
    .line 71
    const-string v0, "d52"

    .line 72
    .line 73
    const-string v1, "cannot use Android Keystore, it\'ll be disabled"

    .line 74
    .line 75
    invoke-static {v0, v1, p0}, Lio/sentry/android/core/n0;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_5

    .line 76
    .line 77
    .line 78
    return-object p1

    .line 79
    :catch_5
    throw p0
.end method

.method public t()Ly5;
    .locals 6

    .line 1
    const-string v0, "cannot use Android Keystore, it\'ll be disabled"

    .line 2
    .line 3
    const-string v1, "d52"

    .line 4
    .line 5
    sget-object v2, Ld52;->d:Ljava/lang/Object;

    .line 6
    .line 7
    new-instance v2, Ll8;

    .line 8
    .line 9
    invoke-direct {v2}, Ll8;-><init>()V

    .line 10
    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    :try_start_0
    iget-object v4, p0, Liy;->d:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v4, Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v4}, Ll8;->a(Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result v4
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/security/ProviderException; {:try_start_0 .. :try_end_0} :catch_2

    .line 21
    :try_start_1
    iget-object v5, p0, Liy;->d:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v5, Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v2, v5}, Ll8;->c(Ljava/lang/String;)Ly5;

    .line 26
    .line 27
    .line 28
    move-result-object p0
    :try_end_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/security/ProviderException; {:try_start_1 .. :try_end_1} :catch_0

    .line 29
    return-object p0

    .line 30
    :catch_0
    move-exception v2

    .line 31
    goto :goto_0

    .line 32
    :catch_1
    move-exception v2

    .line 33
    :goto_0
    if-eqz v4, :cond_0

    .line 34
    .line 35
    sget-object p0, Ld52;->d:Ljava/lang/Object;

    .line 36
    .line 37
    invoke-static {v1, v0, v2}, Lio/sentry/android/core/n0;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    return-object v3

    .line 41
    :cond_0
    new-instance v0, Ljava/security/KeyStoreException;

    .line 42
    .line 43
    iget-object p0, p0, Liy;->d:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p0, Ljava/lang/String;

    .line 46
    .line 47
    const-string v1, "the master key "

    .line 48
    .line 49
    const-string v3, " exists but is unusable"

    .line 50
    .line 51
    invoke-static {v1, p0, v3}, Lfm0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-direct {v0, p0, v2}, Ljava/security/KeyStoreException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 56
    .line 57
    .line 58
    throw v0

    .line 59
    :catch_2
    move-exception p0

    .line 60
    goto :goto_1

    .line 61
    :catch_3
    move-exception p0

    .line 62
    :goto_1
    sget-object v2, Ld52;->d:Ljava/lang/Object;

    .line 63
    .line 64
    invoke-static {v1, v0, p0}, Lio/sentry/android/core/n0;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 65
    .line 66
    .line 67
    return-object v3
.end method

.method public u(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object p0, p0, Liy;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ler0;

    .line 4
    .line 5
    invoke-static {p2}, Lb40;->p(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_2

    .line 10
    .line 11
    invoke-static {p2}, Lb40;->t(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 19
    .line 20
    invoke-direct {v0, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const-string p2, "webchat"

    .line 24
    .line 25
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    if-eqz p2, :cond_1

    .line 30
    .line 31
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    const-string v0, "ui_config_data"

    .line 36
    .line 37
    invoke-virtual {p0, v0, p2}, Ler0;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :catch_0
    move-exception p0

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    const-string p2, "helpcenter"

    .line 44
    .line 45
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    if-eqz p2, :cond_2

    .line 50
    .line 51
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    const-string v0, "helpcenter_ui_config_data"

    .line 56
    .line 57
    invoke-virtual {p0, v0, p2}, Ler0;->y(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :goto_0
    const-string p2, "error in saving the ui config data for "

    .line 62
    .line 63
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    const-string p2, "ConfigMangr"

    .line 68
    .line 69
    invoke-static {p2, p1, p0}, Lxe2;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 70
    .line 71
    .line 72
    :cond_2
    :goto_1
    return-void
.end method
