.class public final Lac2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Lyb2;

.field public final b:Lvq0;

.field public c:Lk61;


# direct methods
.method public constructor <init>(Lyb2;Lvq0;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    move-object/from16 v1, p1

    .line 13
    .line 14
    iput-object v1, v0, Lac2;->a:Lyb2;

    .line 15
    .line 16
    move-object/from16 v1, p2

    .line 17
    .line 18
    iput-object v1, v0, Lac2;->b:Lvq0;

    .line 19
    .line 20
    new-instance v1, Lk61;

    .line 21
    .line 22
    const/4 v14, 0x0

    .line 23
    const/16 v15, 0x3fff

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    const/4 v3, 0x0

    .line 27
    const/4 v4, 0x0

    .line 28
    const/4 v5, 0x0

    .line 29
    const/4 v6, 0x0

    .line 30
    const/4 v7, 0x0

    .line 31
    const/4 v8, 0x0

    .line 32
    const/4 v9, 0x0

    .line 33
    const/4 v10, 0x0

    .line 34
    const/4 v11, 0x0

    .line 35
    const/4 v12, 0x0

    .line 36
    const/4 v13, 0x0

    .line 37
    invoke-direct/range {v1 .. v15}, Lk61;-><init>(Ljava/util/List;Ljava/util/List;Lgp0;Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;Ljava/lang/String;Ljava/lang/String;ZLjava/util/ArrayList;Lij;Lec;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;I)V

    .line 38
    .line 39
    .line 40
    iput-object v1, v0, Lac2;->c:Lk61;

    .line 41
    .line 42
    return-void
.end method


# virtual methods
.method public final a(Lcom/usercentrics/sdk/core/settings/SettingsInitializationParameters;Ld10;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, Lzb2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lzb2;

    .line 7
    .line 8
    iget v1, v0, Lzb2;->d:I

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
    iput v1, v0, Lzb2;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lzb2;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lzb2;-><init>(Lac2;Ld10;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lzb2;->b:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lz10;->a:Lz10;

    .line 28
    .line 29
    iget v2, v0, Lzb2;->d:I

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
    iget-object p0, v0, Lzb2;->a:Lac2;

    .line 38
    .line 39
    :try_start_0
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    check-cast p2, Lo42;

    .line 43
    .line 44
    iget-object p1, p2, Lo42;->a:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object v3

    .line 53
    :cond_2
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    :try_start_1
    iget-object p2, p0, Lac2;->a:Lyb2;

    .line 57
    .line 58
    iput-object p0, v0, Lzb2;->a:Lac2;

    .line 59
    .line 60
    iput v4, v0, Lzb2;->d:I

    .line 61
    .line 62
    invoke-virtual {p2, p1, v0}, Lyb2;->a(Lcom/usercentrics/sdk/core/settings/SettingsInitializationParameters;Ld10;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    if-ne p1, v1, :cond_3

    .line 67
    .line 68
    return-object v1

    .line 69
    :cond_3
    :goto_1
    invoke-static {p1}, Lo42;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    if-nez p2, :cond_4

    .line 74
    .line 75
    check-cast p1, Lk61;

    .line 76
    .line 77
    const/16 p2, 0x3fff

    .line 78
    .line 79
    invoke-static {p1, v3, v3, p2}, Lk61;->a(Lk61;Ljava/util/List;Ljava/lang/String;I)Lk61;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    iput-object p1, p0, Lac2;->c:Lk61;

    .line 87
    .line 88
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 89
    .line 90
    return-object p0

    .line 91
    :cond_4
    new-instance p0, Lkm;

    .line 92
    .line 93
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-direct {p0, p1, p2}, Lkm;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 102
    .line 103
    .line 104
    new-instance p1, Ln42;

    .line 105
    .line 106
    invoke-direct {p1, p0}, Ln42;-><init>(Ljava/lang/Throwable;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 107
    .line 108
    .line 109
    return-object p1

    .line 110
    :catch_0
    move-exception p0

    .line 111
    sget-object p1, Lo42;->b:Lm42;

    .line 112
    .line 113
    new-instance p1, Lkm;

    .line 114
    .line 115
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p2

    .line 119
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    invoke-direct {p1, p2, p0}, Lkm;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 124
    .line 125
    .line 126
    new-instance p0, Ln42;

    .line 127
    .line 128
    invoke-direct {p0, p1}, Ln42;-><init>(Ljava/lang/Throwable;)V

    .line 129
    .line 130
    .line 131
    return-object p0

    .line 132
    :catch_1
    move-exception p0

    .line 133
    throw p0
.end method

.method public final b()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lac2;->c:Lk61;

    .line 2
    .line 3
    iget-object p0, p0, Lk61;->i:Lij;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    iget-boolean p0, p0, Lij;->a:Z

    .line 8
    .line 9
    return p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0
.end method
