.class public final Lxy1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Luu1;Luu1;Luu1;Luu1;Luu1;Lgl;I)V
    .locals 2

    .line 1
    and-int/lit8 v0, p7, 0x1

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move-object p1, v1

    .line 7
    :cond_0
    and-int/lit8 v0, p7, 0x2

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    move-object p2, v1

    .line 12
    :cond_1
    and-int/lit8 v0, p7, 0x4

    .line 13
    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    move-object p3, v1

    .line 17
    :cond_2
    and-int/lit8 v0, p7, 0x8

    .line 18
    .line 19
    if-eqz v0, :cond_3

    .line 20
    .line 21
    move-object p4, v1

    .line 22
    :cond_3
    and-int/lit8 p7, p7, 0x10

    .line 23
    .line 24
    if-eqz p7, :cond_4

    .line 25
    .line 26
    move-object p5, v1

    .line 27
    :cond_4
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, Lxy1;->a:Ljava/lang/Object;

    .line 34
    .line 35
    iput-object p2, p0, Lxy1;->c:Ljava/lang/Object;

    .line 36
    .line 37
    iput-object p3, p0, Lxy1;->d:Ljava/lang/Object;

    .line 38
    .line 39
    iput-object p4, p0, Lxy1;->e:Ljava/lang/Object;

    .line 40
    .line 41
    iput-object p5, p0, Lxy1;->f:Ljava/lang/Object;

    .line 42
    .line 43
    iput-object p6, p0, Lxy1;->b:Ljava/lang/Object;

    .line 44
    .line 45
    return-void
.end method

.method public static a(Lxy1;Lorg/json/JSONArray;Z)I
    .locals 8

    .line 1
    iget-object v0, p0, Lxy1;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ler0;

    .line 4
    .line 5
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/16 v2, 0xc8

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    return v2

    .line 14
    :cond_0
    const-string v1, "analyticsMngr"

    .line 15
    .line 16
    if-eqz p2, :cond_1

    .line 17
    .line 18
    :try_start_0
    const-string v3, "Syncing failed analytics events"

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catch_0
    move-exception v0

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    const-string v3, "Syncing analytics events"

    .line 24
    .line 25
    :goto_0
    const/4 v4, 0x0

    .line 26
    invoke-static {v1, v3, v4}, Lxe2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lxy1;->e()Ljava/util/HashMap;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    const-string v4, "e"

    .line 34
    .line 35
    invoke-virtual {p1}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    new-instance v4, Lwc0;

    .line 43
    .line 44
    iget-object v5, p0, Lxy1;->a:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v5, Lcb;

    .line 47
    .line 48
    invoke-virtual {v0}, Ler0;->q()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    iget-object v0, v0, Ler0;->b:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v0, Ler0;

    .line 55
    .line 56
    invoke-static {v5, v6}, Ljb1;->j(Lcb;Ljava/lang/String;)Ljava/util/HashMap;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    const/16 v6, 0xd

    .line 61
    .line 62
    invoke-direct {v4, v6, v5, v3}, Lwc0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    new-instance v3, Llp0;

    .line 66
    .line 67
    iget-object v5, p0, Lxy1;->f:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v5, Lec0;

    .line 70
    .line 71
    new-instance v6, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    const-string v7, "https://api."

    .line 74
    .line 75
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    const-string v7, "host"

    .line 79
    .line 80
    invoke-virtual {v0, v7}, Ler0;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v7

    .line 84
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    const-string v7, "/events/v1/"

    .line 88
    .line 89
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string v7, "domain"

    .line 93
    .line 94
    invoke-virtual {v0, v7}, Ler0;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    const-string v0, "/websdk/"

    .line 102
    .line 103
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    const/4 v6, 0x1

    .line 111
    invoke-direct {v3, v5, v0, v6}, Llp0;-><init>(Lec0;Ljava/lang/String;I)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v3, v4}, Lta;->l(Lwc0;)Ljj;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    iget v0, v0, Ljj;->a:I

    .line 119
    .line 120
    if-lt v0, v2, :cond_2

    .line 121
    .line 122
    const/16 v2, 0x12c

    .line 123
    .line 124
    if-lt v0, v2, :cond_3

    .line 125
    .line 126
    :cond_2
    if-nez p2, :cond_3

    .line 127
    .line 128
    invoke-virtual {p0, p1}, Lxy1;->k(Lorg/json/JSONArray;)V
    :try_end_0
    .catch Lgt0; {:try_start_0 .. :try_end_0} :catch_0

    .line 129
    .line 130
    .line 131
    :cond_3
    return v0

    .line 132
    :goto_1
    const-string v2, "Failed to send the events"

    .line 133
    .line 134
    invoke-static {v1, v2, v0}, Lxe2;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 135
    .line 136
    .line 137
    if-nez p2, :cond_4

    .line 138
    .line 139
    invoke-virtual {p0, p1}, Lxy1;->k(Lorg/json/JSONArray;)V

    .line 140
    .line 141
    .line 142
    :cond_4
    throw v0
.end method

.method public static g(Ljava/lang/String;Lvl;Lh31;Lwq1;Ljava/lang/Integer;)Lxy1;
    .locals 2

    .line 1
    sget-object v0, Lwq1;->e:Lwq1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-ne p3, v0, :cond_1

    .line 5
    .line 6
    if-nez p4, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const-string p0, "Keys with output prefix type raw should not have an id requirement."

    .line 10
    .line 11
    invoke-static {p0}, Lds0;->t(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-object v1

    .line 15
    :cond_1
    if-eqz p4, :cond_2

    .line 16
    .line 17
    :goto_0
    new-instance v0, Lxy1;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p0, v0, Lxy1;->a:Ljava/lang/Object;

    .line 23
    .line 24
    invoke-static {p0}, Lp13;->b(Ljava/lang/String;)Lwl;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    iput-object p0, v0, Lxy1;->c:Ljava/lang/Object;

    .line 29
    .line 30
    iput-object p1, v0, Lxy1;->d:Ljava/lang/Object;

    .line 31
    .line 32
    iput-object p2, v0, Lxy1;->e:Ljava/lang/Object;

    .line 33
    .line 34
    iput-object p3, v0, Lxy1;->f:Ljava/lang/Object;

    .line 35
    .line 36
    iput-object p4, v0, Lxy1;->b:Ljava/lang/Object;

    .line 37
    .line 38
    return-object v0

    .line 39
    :cond_2
    const-string p0, "Keys with output prefix type different from raw should have an id requirement."

    .line 40
    .line 41
    invoke-static {p0}, Lds0;->t(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-object v1
.end method

.method public static varargs j([Luu1;)Ljava/util/ArrayList;
    .locals 5

    .line 1
    invoke-static {p0}, Lqd;->h([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    const/16 v1, 0xa

    .line 8
    .line 9
    invoke-static {p0, v1}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Luu1;

    .line 31
    .line 32
    iget-object v2, v1, Lr4;->b:Ljava/lang/String;

    .line 33
    .line 34
    iget-object v3, v1, Luu1;->v:Lbx0;

    .line 35
    .line 36
    iget-object v1, v1, Luu1;->u:Lbu1;

    .line 37
    .line 38
    new-instance v4, Luu1;

    .line 39
    .line 40
    invoke-direct {v4, v2, v1, v3}, Luu1;-><init>(Ljava/lang/String;Lbu1;Lbx0;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    if-nez p0, :cond_1

    .line 52
    .line 53
    return-object v0

    .line 54
    :cond_1
    const/4 p0, 0x0

    .line 55
    return-object p0
.end method


# virtual methods
.method public b(J)V
    .locals 4

    .line 1
    iget-object v0, p0, Lxy1;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ler0;

    .line 4
    .line 5
    invoke-virtual {p0}, Lxy1;->f()Lorg/json/JSONArray;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/16 v2, 0x3e8

    .line 14
    .line 15
    const-string v3, "app_launch_events"

    .line 16
    .line 17
    if-lt v1, v2, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {v0, v3, p0}, Ler0;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    .line 28
    .line 29
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 30
    .line 31
    .line 32
    const-string v2, "ts"

    .line 33
    .line 34
    invoke-virtual {v1, v2, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 35
    .line 36
    .line 37
    const-string p1, "t"

    .line 38
    .line 39
    const-string p2, "a"

    .line 40
    .line 41
    invoke-virtual {v1, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :catch_0
    move-exception p1

    .line 49
    const-string p2, "analyticsMngr"

    .line 50
    .line 51
    const-string v1, "Error in adding app launch event to existing array"

    .line 52
    .line 53
    invoke-static {p2, v1, p1}, Lxe2;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 54
    .line 55
    .line 56
    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-virtual {v0, v3, p0}, Ler0;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lxy1;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/util/HashMap;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    const-string p0, "Property \"autoMetadata\" has not been set"

    .line 12
    .line 13
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public d()Lrf;
    .locals 11

    .line 1
    iget-object v0, p0, Lxy1;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/String;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, " transportName"

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const-string v0, ""

    .line 11
    .line 12
    :goto_0
    iget-object v1, p0, Lxy1;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Lsd0;

    .line 15
    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    const-string v1, " encodedPayload"

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :cond_1
    iget-object v1, p0, Lxy1;->d:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Ljava/lang/Long;

    .line 27
    .line 28
    if-nez v1, :cond_2

    .line 29
    .line 30
    const-string v1, " eventMillis"

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    :cond_2
    iget-object v1, p0, Lxy1;->e:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v1, Ljava/lang/Long;

    .line 39
    .line 40
    if-nez v1, :cond_3

    .line 41
    .line 42
    const-string v1, " uptimeMillis"

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    :cond_3
    iget-object v1, p0, Lxy1;->f:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v1, Ljava/util/HashMap;

    .line 51
    .line 52
    if-nez v1, :cond_4

    .line 53
    .line 54
    const-string v1, " autoMetadata"

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    :cond_4
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-eqz v1, :cond_5

    .line 65
    .line 66
    new-instance v2, Lrf;

    .line 67
    .line 68
    iget-object v0, p0, Lxy1;->a:Ljava/lang/Object;

    .line 69
    .line 70
    move-object v3, v0

    .line 71
    check-cast v3, Ljava/lang/String;

    .line 72
    .line 73
    iget-object v0, p0, Lxy1;->b:Ljava/lang/Object;

    .line 74
    .line 75
    move-object v4, v0

    .line 76
    check-cast v4, Ljava/lang/Integer;

    .line 77
    .line 78
    iget-object v0, p0, Lxy1;->c:Ljava/lang/Object;

    .line 79
    .line 80
    move-object v5, v0

    .line 81
    check-cast v5, Lsd0;

    .line 82
    .line 83
    iget-object v0, p0, Lxy1;->d:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v0, Ljava/lang/Long;

    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 88
    .line 89
    .line 90
    move-result-wide v6

    .line 91
    iget-object v0, p0, Lxy1;->e:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v0, Ljava/lang/Long;

    .line 94
    .line 95
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 96
    .line 97
    .line 98
    move-result-wide v8

    .line 99
    iget-object p0, p0, Lxy1;->f:Ljava/lang/Object;

    .line 100
    .line 101
    move-object v10, p0

    .line 102
    check-cast v10, Ljava/util/HashMap;

    .line 103
    .line 104
    invoke-direct/range {v2 .. v10}, Lrf;-><init>(Ljava/lang/String;Ljava/lang/Integer;Lsd0;JJLjava/util/HashMap;)V

    .line 105
    .line 106
    .line 107
    return-object v2

    .line 108
    :cond_5
    const-string p0, "Missing required properties:"

    .line 109
    .line 110
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    const/4 p0, 0x0

    .line 118
    return-object p0
.end method

.method public e()Ljava/util/HashMap;
    .locals 8

    .line 1
    iget-object v0, p0, Lxy1;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ler0;

    .line 4
    .line 5
    new-instance v1, Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 8
    .line 9
    .line 10
    iget-object v2, p0, Lxy1;->a:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v2, Lcb;

    .line 13
    .line 14
    invoke-virtual {v2}, Lcb;->v()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    iget-object v3, p0, Lxy1;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v3, Lnm;

    .line 21
    .line 22
    const-string v4, "userId"

    .line 23
    .line 24
    invoke-virtual {v3, v4}, Lnm;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    invoke-static {v5}, Lb40;->p(Ljava/lang/String;)Z

    .line 29
    .line 30
    .line 31
    move-result v6

    .line 32
    if-eqz v6, :cond_0

    .line 33
    .line 34
    invoke-virtual {v3}, Lnm;->f()Ljava/util/HashMap;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    invoke-static {v6}, Lb40;->q(Ljava/util/Map;)Z

    .line 39
    .line 40
    .line 41
    move-result v7

    .line 42
    if-nez v7, :cond_0

    .line 43
    .line 44
    invoke-virtual {v6, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    move-object v5, v4

    .line 49
    check-cast v5, Ljava/lang/String;

    .line 50
    .line 51
    :cond_0
    iget-object v4, v0, Ler0;->b:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v4, Ler0;

    .line 54
    .line 55
    const-string v6, "legacy_event_ids"

    .line 56
    .line 57
    invoke-virtual {v4, v6}, Ler0;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    invoke-static {v4}, Lb40;->p(Ljava/lang/String;)Z

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    if-nez v6, :cond_1

    .line 66
    .line 67
    invoke-static {v4}, Lb40;->t(Ljava/lang/String;)Z

    .line 68
    .line 69
    .line 70
    move-result v6

    .line 71
    if-eqz v6, :cond_1

    .line 72
    .line 73
    new-instance v6, Lorg/json/JSONObject;

    .line 74
    .line 75
    invoke-direct {v6, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v6, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    goto :goto_0

    .line 83
    :cond_1
    const-string v4, ""

    .line 84
    .line 85
    :goto_0
    const-string v6, "did"

    .line 86
    .line 87
    invoke-virtual {v1, v6, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    invoke-static {v4}, Lb40;->p(Ljava/lang/String;)Z

    .line 91
    .line 92
    .line 93
    move-result v6

    .line 94
    if-eqz v6, :cond_2

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_2
    move-object v2, v4

    .line 98
    :goto_1
    const-string v4, "id"

    .line 99
    .line 100
    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 104
    .line 105
    .line 106
    move-result-wide v6

    .line 107
    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    const-string v4, "timestamp"

    .line 112
    .line 113
    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    invoke-static {v5}, Lb40;->r(Ljava/lang/String;)Z

    .line 117
    .line 118
    .line 119
    move-result v2

    .line 120
    if-eqz v2, :cond_3

    .line 121
    .line 122
    const-string v2, "uid"

    .line 123
    .line 124
    invoke-virtual {v1, v2, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    :cond_3
    const-string v2, "userEmail"

    .line 128
    .line 129
    invoke-virtual {v3, v2}, Lnm;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    invoke-static {v2}, Lb40;->r(Ljava/lang/String;)Z

    .line 134
    .line 135
    .line 136
    move-result v3

    .line 137
    if-eqz v3, :cond_4

    .line 138
    .line 139
    const-string v3, "email"

    .line 140
    .line 141
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    :cond_4
    iget-object p0, p0, Lxy1;->d:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast p0, Lra2;

    .line 147
    .line 148
    iget-object p0, p0, Lra2;->d:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast p0, Ljava/util/HashMap;

    .line 151
    .line 152
    invoke-virtual {v1, p0}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 153
    .line 154
    .line 155
    const-string p0, "platform-id"

    .line 156
    .line 157
    invoke-virtual {v0}, Ler0;->q()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-virtual {v1, p0, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    return-object v1
.end method

.method public declared-synchronized f()Lorg/json/JSONArray;
    .locals 4

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
    iget-object v1, p0, Lxy1;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Ler0;

    .line 10
    .line 11
    const-string v2, "app_launch_events"

    .line 12
    .line 13
    iget-object v1, v1, Ler0;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Ler0;

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ler0;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {v1}, Lb40;->p(Ljava/lang/String;)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-nez v2, :cond_0

    .line 26
    .line 27
    new-instance v2, Lorg/json/JSONArray;

    .line 28
    .line 29
    invoke-direct {v2, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    .line 31
    .line 32
    :try_start_2
    iget-object v0, p0, Lxy1;->c:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Ler0;

    .line 35
    .line 36
    iget-object v0, v0, Ler0;->b:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, Ler0;

    .line 39
    .line 40
    const-string v1, "app_launch_events"

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ler0;->z(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :catch_0
    move-exception v0

    .line 47
    goto :goto_0

    .line 48
    :catchall_0
    move-exception v0

    .line 49
    goto :goto_2

    .line 50
    :catch_1
    move-exception v1

    .line 51
    move-object v2, v0

    .line 52
    move-object v0, v1

    .line 53
    :goto_0
    :try_start_3
    const-string v1, "analyticsMngr"

    .line 54
    .line 55
    const-string v3, "Error in getting stored app launch events"

    .line 56
    .line 57
    invoke-static {v1, v3, v0}, Lxe2;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 58
    .line 59
    .line 60
    :goto_1
    move-object v0, v2

    .line 61
    :cond_0
    monitor-exit p0

    .line 62
    return-object v0

    .line 63
    :goto_2
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 64
    throw v0
.end method

.method public h()Ljava/util/ArrayList;
    .locals 10

    .line 1
    iget-object v0, p0, Lxy1;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Luu1;

    .line 4
    .line 5
    iget-object v1, p0, Lxy1;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Luu1;

    .line 8
    .line 9
    iget-object v2, p0, Lxy1;->e:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Luu1;

    .line 12
    .line 13
    iget-object v3, p0, Lxy1;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v3, Luu1;

    .line 16
    .line 17
    iget-object v4, p0, Lxy1;->a:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v4, Luu1;

    .line 20
    .line 21
    iget-object p0, p0, Lxy1;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p0, Lgl;

    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    const/4 v5, 0x4

    .line 30
    const/4 v6, 0x3

    .line 31
    const/4 v7, 0x0

    .line 32
    const/4 v8, 0x2

    .line 33
    const/4 v9, 0x1

    .line 34
    if-eqz p0, :cond_2

    .line 35
    .line 36
    if-eq p0, v9, :cond_1

    .line 37
    .line 38
    if-ne p0, v8, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-static {}, Lds0;->b()V

    .line 42
    .line 43
    .line 44
    const/4 p0, 0x0

    .line 45
    return-object p0

    .line 46
    :cond_1
    filled-new-array {v4}, [Luu1;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-static {p0}, Lxy1;->j([Luu1;)Ljava/util/ArrayList;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    filled-new-array {v3}, [Luu1;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-static {v3}, Lxy1;->j([Luu1;)Ljava/util/ArrayList;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    filled-new-array {v2}, [Luu1;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-static {v2}, Lxy1;->j([Luu1;)Ljava/util/ArrayList;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    filled-new-array {v1}, [Luu1;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-static {v1}, Lxy1;->j([Luu1;)Ljava/util/ArrayList;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    filled-new-array {v0}, [Luu1;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-static {v0}, Lxy1;->j([Luu1;)Ljava/util/ArrayList;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    const/4 v4, 0x5

    .line 87
    new-array v4, v4, [Ljava/util/List;

    .line 88
    .line 89
    aput-object p0, v4, v7

    .line 90
    .line 91
    aput-object v3, v4, v9

    .line 92
    .line 93
    aput-object v2, v4, v8

    .line 94
    .line 95
    aput-object v1, v4, v6

    .line 96
    .line 97
    aput-object v0, v4, v5

    .line 98
    .line 99
    invoke-static {v4}, Lqd;->h([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    return-object p0

    .line 104
    :cond_2
    :goto_0
    filled-new-array {v4, v3}, [Luu1;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-static {p0}, Lxy1;->j([Luu1;)Ljava/util/ArrayList;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    filled-new-array {v2}, [Luu1;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    invoke-static {v2}, Lxy1;->j([Luu1;)Ljava/util/ArrayList;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    filled-new-array {v1}, [Luu1;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-static {v1}, Lxy1;->j([Luu1;)Ljava/util/ArrayList;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    filled-new-array {v0}, [Luu1;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-static {v0}, Lxy1;->j([Luu1;)Ljava/util/ArrayList;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    new-array v3, v5, [Ljava/util/List;

    .line 137
    .line 138
    aput-object p0, v3, v7

    .line 139
    .line 140
    aput-object v2, v3, v9

    .line 141
    .line 142
    aput-object v1, v3, v8

    .line 143
    .line 144
    aput-object v0, v3, v6

    .line 145
    .line 146
    invoke-static {v3}, Lqd;->h([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    return-object p0
.end method

.method public i()Ljava/util/List;
    .locals 4

    .line 1
    iget-object v0, p0, Lxy1;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Luu1;

    .line 4
    .line 5
    iget-object v1, p0, Lxy1;->e:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Luu1;

    .line 8
    .line 9
    iget-object v2, p0, Lxy1;->d:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Luu1;

    .line 12
    .line 13
    iget-object v3, p0, Lxy1;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v3, Luu1;

    .line 16
    .line 17
    iget-object p0, p0, Lxy1;->a:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, Luu1;

    .line 20
    .line 21
    filled-new-array {v0, v1, v2, v3, p0}, [Luu1;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-static {p0}, Lxy1;->j([Luu1;)Ljava/util/ArrayList;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    if-eqz p0, :cond_0

    .line 30
    .line 31
    invoke-static {p0}, Lkotlin/collections/a;->b(Ljava/lang/Object;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :cond_0
    sget-object p0, Lnd0;->a:Lnd0;

    .line 37
    .line 38
    return-object p0
.end method

.method public k(Lorg/json/JSONArray;)V
    .locals 5

    .line 1
    iget-object p0, p0, Lxy1;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ler0;

    .line 4
    .line 5
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-virtual {p0}, Ler0;->n()Lorg/json/JSONArray;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/16 v2, 0x3e8

    .line 21
    .line 22
    if-le v1, v2, :cond_2

    .line 23
    .line 24
    new-instance v1, Lorg/json/JSONArray;

    .line 25
    .line 26
    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    :goto_0
    if-ge v3, v2, :cond_1

    .line 34
    .line 35
    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    invoke-virtual {v1, v4}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 40
    .line 41
    .line 42
    add-int/lit8 v3, v3, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    move-object v0, v1

    .line 46
    :cond_2
    const/4 v1, 0x0

    .line 47
    :goto_1
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-ge v1, v2, :cond_3

    .line 52
    .line 53
    invoke-virtual {p1, v1}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 58
    .line 59
    .line 60
    add-int/lit8 v1, v1, 0x1

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_3
    invoke-virtual {p0, v0}, Ler0;->A(Lorg/json/JSONArray;)V

    .line 64
    .line 65
    .line 66
    return-void
.end method
