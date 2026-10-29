.class public final Ld7;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Li03;

.field public final b:Lhb1;

.field public final c:Lxu0;


# direct methods
.method public constructor <init>(Li03;Lhb1;Lxu0;I)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    packed-switch p4, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Ld7;->a:Li03;

    .line 17
    .line 18
    iput-object p2, p0, Ld7;->b:Lhb1;

    .line 19
    .line 20
    iput-object p3, p0, Ld7;->c:Lxu0;

    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Ld7;->a:Li03;

    .line 27
    .line 28
    iput-object p2, p0, Ld7;->b:Lhb1;

    .line 29
    .line 30
    iput-object p3, p0, Ld7;->c:Lxu0;

    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/util/Map;Ld10;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p3, Lj52;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lj52;

    .line 7
    .line 8
    iget v1, v0, Lj52;->e:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lj52;->e:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lj52;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lj52;-><init>(Ld7;Ld10;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lj52;->c:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lz10;->a:Lz10;

    .line 28
    .line 29
    iget v2, v0, Lj52;->e:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x0

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v3, :cond_1

    .line 36
    .line 37
    iget-object p1, v0, Lj52;->b:Ljava/lang/String;

    .line 38
    .line 39
    iget-object p0, v0, Lj52;->a:Ld7;

    .line 40
    .line 41
    :try_start_0
    invoke-static {p3}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :catch_0
    move-exception p2

    .line 46
    goto :goto_2

    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object v4

    .line 53
    :cond_2
    invoke-static {p3}, Lpg3;->A(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    :try_start_1
    iget-object p3, p0, Ld7;->b:Lhb1;

    .line 57
    .line 58
    invoke-virtual {p3}, Lhb1;->a()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p3

    .line 62
    new-instance v2, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string p3, "/ruleSet/"

    .line 71
    .line 72
    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const-string p3, ".json"

    .line 79
    .line 80
    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p3

    .line 87
    iget-object v2, p0, Ld7;->c:Lxu0;

    .line 88
    .line 89
    iput-object p0, v0, Lj52;->a:Ld7;

    .line 90
    .line 91
    iput-object p1, v0, Lj52;->b:Ljava/lang/String;

    .line 92
    .line 93
    iput v3, v0, Lj52;->e:I

    .line 94
    .line 95
    invoke-virtual {v2, p3, p2, v0}, Lxu0;->c(Ljava/lang/String;Ljava/util/Map;Ld10;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p3

    .line 99
    if-ne p3, v1, :cond_3

    .line 100
    .line 101
    return-object v1

    .line 102
    :cond_3
    :goto_1
    move-object p2, p3

    .line 103
    check-cast p2, Lzu0;

    .line 104
    .line 105
    iget p2, p2, Lzu0;->c:I

    .line 106
    .line 107
    const/16 v0, 0x193

    .line 108
    .line 109
    if-eq p2, v0, :cond_4

    .line 110
    .line 111
    const/16 v0, 0x194

    .line 112
    .line 113
    if-eq p2, v0, :cond_4

    .line 114
    .line 115
    return-object p3

    .line 116
    :cond_4
    new-instance p2, Lvz2;

    .line 117
    .line 118
    const-string p3, "Unable to initialise due to wrong configuration, please make sure your settingsID/ruleSetID is correct."

    .line 119
    .line 120
    invoke-direct {p2, p3}, Lvz2;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    throw p2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 124
    :goto_2
    iget-object p0, p0, Ld7;->a:Li03;

    .line 125
    .line 126
    new-instance p3, Ljava/lang/StringBuilder;

    .line 127
    .line 128
    const-string v0, "Failed while fetching ruleSet using id: "

    .line 129
    .line 130
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    invoke-interface {p0, p1, p2}, Li03;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 141
    .line 142
    .line 143
    instance-of p0, p2, Lvz2;

    .line 144
    .line 145
    if-eqz p0, :cond_5

    .line 146
    .line 147
    move-object v4, p2

    .line 148
    check-cast v4, Lvz2;

    .line 149
    .line 150
    :cond_5
    if-eqz v4, :cond_6

    .line 151
    .line 152
    goto :goto_3

    .line 153
    :cond_6
    new-instance v4, Lvz2;

    .line 154
    .line 155
    const-string p0, "Unable to initialise due to poor or no network connection while fetching the rule Set."

    .line 156
    .line 157
    invoke-direct {v4, p0, p2}, Lvz2;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 158
    .line 159
    .line 160
    :goto_3
    throw v4
.end method

.method public b(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ld10;)Ljava/lang/Object;
    .locals 11

    .line 1
    instance-of v0, p4, Lc7;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lc7;

    .line 7
    .line 8
    iget v1, v0, Lc7;->d:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lc7;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lc7;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, Lc7;-><init>(Ld7;Ld10;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Lc7;->b:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lz10;->a:Lz10;

    .line 28
    .line 29
    iget v2, v0, Lc7;->d:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    iget-object p0, v0, Lc7;->a:Ld7;

    .line 38
    .line 39
    :try_start_0
    invoke-static {p4}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    .line 42
    return-object p4

    .line 43
    :catch_0
    move-exception v0

    .line 44
    move-object p1, v0

    .line 45
    goto :goto_2

    .line 46
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-object v3

    .line 52
    :cond_2
    invoke-static {p4}, Lpg3;->A(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    sget-object v9, Lb7;->b:Lb7;

    .line 56
    .line 57
    const/16 v10, 0x1e

    .line 58
    .line 59
    const-string v6, ","

    .line 60
    .line 61
    const/4 v7, 0x0

    .line 62
    const/4 v8, 0x0

    .line 63
    move-object v5, p2

    .line 64
    invoke-static/range {v5 .. v10}, Lkotlin/collections/CollectionsKt;->x(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    iget-object p4, p0, Ld7;->b:Lhb1;

    .line 69
    .line 70
    iget-object v2, p4, Lhb1;->b:Lcom/usercentrics/sdk/UsercentricsDomains;

    .line 71
    .line 72
    invoke-virtual {v2}, Lcom/usercentrics/sdk/UsercentricsDomains;->a()Z

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    if-eqz v5, :cond_3

    .line 77
    .line 78
    iget-object p4, v2, Lcom/usercentrics/sdk/UsercentricsDomains;->a:Ljava/lang/String;

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_3
    iget-object p4, p4, Lhb1;->a:Lbn1;

    .line 82
    .line 83
    invoke-virtual {p4}, Ljava/lang/Enum;->ordinal()I

    .line 84
    .line 85
    .line 86
    move-result p4

    .line 87
    if-eqz p4, :cond_5

    .line 88
    .line 89
    if-ne p4, v4, :cond_4

    .line 90
    .line 91
    const-string p4, "https://aggregator.eu.usercentrics.eu"

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_4
    invoke-static {}, Lds0;->b()V

    .line 95
    .line 96
    .line 97
    return-object v3

    .line 98
    :cond_5
    const-string p4, "https://aggregator.service.usercentrics.eu"

    .line 99
    .line 100
    :goto_1
    new-instance v2, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    const-string p4, "/aggregate/"

    .line 109
    .line 110
    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    const-string p1, "?templates="

    .line 117
    .line 118
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    :try_start_1
    iget-object p2, p0, Ld7;->c:Lxu0;

    .line 129
    .line 130
    iput-object p0, v0, Lc7;->a:Ld7;

    .line 131
    .line 132
    iput v4, v0, Lc7;->d:I

    .line 133
    .line 134
    invoke-virtual {p2, p1, p3, v0}, Lxu0;->c(Ljava/lang/String;Ljava/util/Map;Ld10;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 138
    if-ne p0, v1, :cond_6

    .line 139
    .line 140
    return-object v1

    .line 141
    :cond_6
    return-object p0

    .line 142
    :goto_2
    iget-object p0, p0, Ld7;->a:Li03;

    .line 143
    .line 144
    const-string p2, "Failed while fetching services"

    .line 145
    .line 146
    invoke-interface {p0, p2, p1}, Li03;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 147
    .line 148
    .line 149
    new-instance p0, Lvz2;

    .line 150
    .line 151
    const-string p2, "Unable to initialise due to poor or no network connection while fetching the processing services."

    .line 152
    .line 153
    invoke-direct {p0, p2, p1}, Lvz2;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 154
    .line 155
    .line 156
    throw p0
.end method
