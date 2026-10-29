.class public final Lyr;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Lg80;

.field public final b:Li03;

.field public c:Ljava/lang/Boolean;

.field public final d:Lcom/usercentrics/ccpa/a;


# direct methods
.method public constructor <init>(Lg80;Li03;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lyr;->a:Lg80;

    .line 11
    .line 12
    iput-object p2, p0, Lyr;->b:Li03;

    .line 13
    .line 14
    new-instance p2, Lcom/usercentrics/ccpa/a;

    .line 15
    .line 16
    check-cast p1, Lpz2;

    .line 17
    .line 18
    iget-object p1, p1, Lpz2;->d:Lod2;

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    new-instance v0, Lqc3;

    .line 24
    .line 25
    invoke-direct {v0, p1}, Lqc3;-><init>(Lod2;)V

    .line 26
    .line 27
    .line 28
    new-instance p1, Lo;

    .line 29
    .line 30
    const/4 v1, 0x4

    .line 31
    invoke-direct {p1, p0, v1}, Lo;-><init>(Ljava/lang/Object;I)V

    .line 32
    .line 33
    .line 34
    invoke-direct {p2, v0, p1}, Lcom/usercentrics/ccpa/a;-><init>(Lqc3;Lo;)V

    .line 35
    .line 36
    .line 37
    iput-object p2, p0, Lyr;->d:Lcom/usercentrics/ccpa/a;

    .line 38
    .line 39
    return-void
.end method


# virtual methods
.method public final a()Lcom/usercentrics/ccpa/CCPAData;
    .locals 6

    .line 1
    iget-object p0, p0, Lyr;->d:Lcom/usercentrics/ccpa/a;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/usercentrics/ccpa/a;->a:Lqc3;

    .line 7
    .line 8
    iget-object v0, v0, Lqc3;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lod2;

    .line 11
    .line 12
    iget-object v1, v0, Lod2;->a:Landroid/content/SharedPreferences;

    .line 13
    .line 14
    const-string v2, "IABUSPrivacy_String"

    .line 15
    .line 16
    const-string v3, ""

    .line 17
    .line 18
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const/4 v3, 0x1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    invoke-static {v1}, Lkotlin/text/StringsKt;->D(Ljava/lang/CharSequence;)Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    xor-int/2addr v4, v3

    .line 30
    if-ne v4, v3, :cond_1

    .line 31
    .line 32
    sget-object v4, Lem;->a:Lkotlin/text/Regex;

    .line 33
    .line 34
    invoke-virtual {v4, v1}, Lkotlin/text/Regex;->b(Ljava/lang/String;)Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-eqz v4, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    iget-object p0, p0, Lcom/usercentrics/ccpa/a;->b:Lo;

    .line 42
    .line 43
    const-string v4, "Stored CCPA String is invalid: "

    .line 44
    .line 45
    invoke-virtual {v4, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {p0, v1}, Lo;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v2}, Lod2;->a(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    const-string v1, "1---"

    .line 56
    .line 57
    :goto_0
    sget-object p0, Lcom/usercentrics/ccpa/CCPAData;->Companion:Lcom/usercentrics/ccpa/CCPAData$Companion;

    .line 58
    .line 59
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    const/4 v0, 0x4

    .line 67
    const-string v2, "Cannot parse the CCPA String: "

    .line 68
    .line 69
    if-ne p0, v0, :cond_2

    .line 70
    .line 71
    :try_start_0
    new-instance p0, Lcom/usercentrics/ccpa/CCPAData;

    .line 72
    .line 73
    const/4 v0, 0x0

    .line 74
    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    invoke-static {v0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    invoke-static {v3}, Lhu0;->H(C)Ljava/lang/Boolean;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    const/4 v4, 0x2

    .line 95
    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    invoke-static {v4}, Lhu0;->H(C)Ljava/lang/Boolean;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    const/4 v5, 0x3

    .line 104
    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    .line 105
    .line 106
    .line 107
    move-result v5

    .line 108
    invoke-static {v5}, Lhu0;->H(C)Ljava/lang/Boolean;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    invoke-direct {p0, v0, v3, v4, v5}, Lcom/usercentrics/ccpa/CCPAData;-><init>(ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 113
    .line 114
    .line 115
    return-object p0

    .line 116
    :catch_0
    move-exception p0

    .line 117
    sget-object v0, Lyl;->Companion:Lxl;

    .line 118
    .line 119
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    new-instance v0, Lyl;

    .line 123
    .line 124
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-direct {v0, v1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 129
    .line 130
    .line 131
    throw v0

    .line 132
    :cond_2
    sget-object p0, Lyl;->Companion:Lxl;

    .line 133
    .line 134
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    new-instance p0, Lyl;

    .line 138
    .line 139
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    const/4 v1, 0x0

    .line 144
    invoke-direct {p0, v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 145
    .line 146
    .line 147
    throw p0
.end method
