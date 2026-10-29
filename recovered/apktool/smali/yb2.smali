.class public final Lyb2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Lpc2;

.field public final b:Lsr2;

.field public final c:Lac1;

.field public final d:Lim;


# direct methods
.method public constructor <init>(Lpc2;Lsr2;Lac1;Lim;)V
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
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lyb2;->a:Lpc2;

    .line 14
    .line 15
    iput-object p2, p0, Lyb2;->b:Lsr2;

    .line 16
    .line 17
    iput-object p3, p0, Lyb2;->c:Lac1;

    .line 18
    .line 19
    iput-object p4, p0, Lyb2;->d:Lim;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final a(Lcom/usercentrics/sdk/core/settings/SettingsInitializationParameters;Ld10;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p2, Lxb2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lxb2;

    .line 7
    .line 8
    iget v1, v0, Lxb2;->e:I

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
    iput v1, v0, Lxb2;->e:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lxb2;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lxb2;-><init>(Lyb2;Ld10;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lxb2;->c:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lz10;->a:Lz10;

    .line 28
    .line 29
    iget v2, v0, Lxb2;->e:I

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_3

    .line 34
    .line 35
    if-eq v2, v4, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    iget-object p0, v0, Lxb2;->b:Lcom/usercentrics/sdk/core/settings/SettingsInitializationParameters;

    .line 40
    .line 41
    iget-object p1, v0, Lxb2;->a:Lyb2;

    .line 42
    .line 43
    :try_start_0
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    .line 45
    .line 46
    goto :goto_3

    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const/4 p0, 0x0

    .line 53
    return-object p0

    .line 54
    :cond_2
    iget-object p1, v0, Lxb2;->b:Lcom/usercentrics/sdk/core/settings/SettingsInitializationParameters;

    .line 55
    .line 56
    iget-object p0, v0, Lxb2;->a:Lyb2;

    .line 57
    .line 58
    :try_start_1
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_3
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    :try_start_2
    iget-object p2, p0, Lyb2;->a:Lpc2;

    .line 66
    .line 67
    iput-object p0, v0, Lxb2;->a:Lyb2;

    .line 68
    .line 69
    iput-object p1, v0, Lxb2;->b:Lcom/usercentrics/sdk/core/settings/SettingsInitializationParameters;

    .line 70
    .line 71
    iput v4, v0, Lxb2;->e:I

    .line 72
    .line 73
    invoke-virtual {p2, p1, v0}, Lpc2;->c(Lcom/usercentrics/sdk/core/settings/SettingsInitializationParameters;Ld10;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    if-ne p2, v1, :cond_4

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_4
    :goto_1
    iget-object p2, p0, Lyb2;->b:Lsr2;

    .line 81
    .line 82
    iget-object v2, p1, Lcom/usercentrics/sdk/core/settings/SettingsInitializationParameters;->c:Ljava/lang/String;

    .line 83
    .line 84
    iget-object v4, p0, Lyb2;->d:Lim;

    .line 85
    .line 86
    iget-boolean v4, v4, Lim;->a:Z

    .line 87
    .line 88
    iput-object p0, v0, Lxb2;->a:Lyb2;

    .line 89
    .line 90
    iput-object p1, v0, Lxb2;->b:Lcom/usercentrics/sdk/core/settings/SettingsInitializationParameters;

    .line 91
    .line 92
    iput v3, v0, Lxb2;->e:I

    .line 93
    .line 94
    invoke-virtual {p2, v2, v4, v0}, Lsr2;->a(Ljava/lang/String;ZLd10;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    if-ne p2, v1, :cond_5

    .line 99
    .line 100
    :goto_2
    return-object v1

    .line 101
    :cond_5
    move-object v5, p1

    .line 102
    move-object p1, p0

    .line 103
    move-object p0, v5

    .line 104
    :goto_3
    iget-object p2, p1, Lyb2;->a:Lpc2;

    .line 105
    .line 106
    iget-object p2, p2, Lpc2;->d:Lkn1;

    .line 107
    .line 108
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    iget-object v0, p1, Lyb2;->b:Lsr2;

    .line 112
    .line 113
    iget-object v0, v0, Lsr2;->b:Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;

    .line 114
    .line 115
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    iget-object p1, p1, Lyb2;->c:Lac1;

    .line 119
    .line 120
    iget-object v1, p2, Lkn1;->a:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;

    .line 121
    .line 122
    iget-object p2, p2, Lkn1;->b:Ljava/util/List;

    .line 123
    .line 124
    iget-object p0, p0, Lcom/usercentrics/sdk/core/settings/SettingsInitializationParameters;->d:Ljava/lang/String;

    .line 125
    .line 126
    invoke-virtual {p1, v1, p2, v0, p0}, Lac1;->C(Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;Ljava/util/List;Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;Ljava/lang/String;)Lk61;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    sget-object p1, Lo42;->b:Lm42;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 131
    .line 132
    return-object p0

    .line 133
    :catch_0
    move-exception p0

    .line 134
    sget-object p1, Lo42;->b:Lm42;

    .line 135
    .line 136
    new-instance p1, Lvz2;

    .line 137
    .line 138
    const-string p2, "Unable to initialise due to poor or no network connection while fetching the settings."

    .line 139
    .line 140
    invoke-direct {p1, p2, p0}, Lvz2;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 141
    .line 142
    .line 143
    new-instance p0, Ln42;

    .line 144
    .line 145
    invoke-direct {p0, p1}, Ln42;-><init>(Ljava/lang/Throwable;)V

    .line 146
    .line 147
    .line 148
    return-object p0
.end method
