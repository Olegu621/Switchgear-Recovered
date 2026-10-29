.class public final Lcom/appsflyer/internal/AFd1nSDK;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field private static $10:I = 0x0

.field private static $11:I = 0x1

.field private static areAllFieldsValid:C = '\u0000'

.field private static component3:C = '\u0000'

.field private static copy:C = '\u0000'

.field private static copydefault:I = 0x0

.field private static equals:C = '\u0000'

.field public static getMonetizationNetwork:Ljava/lang/String; = null

.field private static getRevenue:Ljava/lang/String; = null

.field private static hashCode:I = 0x1


# instance fields
.field private final AFAdRevenueData:Lcom/appsflyer/AppsFlyerProperties;

.field private final component1:Lcom/appsflyer/internal/AFj1cSDK;

.field private final component2:Lcom/appsflyer/internal/AFf1eSDK;

.field private final component4:Lcom/appsflyer/internal/AFe1vSDK;

.field private final getCurrencyIso4217Code:Lcom/appsflyer/internal/AFd1mSDK;

.field private final getMediationNetwork:Lcom/appsflyer/internal/AFc1oSDK;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/appsflyer/internal/AFd1nSDK;->getMediationNetwork()V

    .line 2
    .line 3
    .line 4
    const-string v0, "https://%sgcdsdk.%s/install_data/v5.0/"

    .line 5
    .line 6
    sput-object v0, Lcom/appsflyer/internal/AFd1nSDK;->getMonetizationNetwork:Ljava/lang/String;

    .line 7
    .line 8
    const-string v0, "https://%sonelink.%s/shortlink-sdk/v2"

    .line 9
    .line 10
    sput-object v0, Lcom/appsflyer/internal/AFd1nSDK;->getRevenue:Ljava/lang/String;

    .line 11
    .line 12
    sget v0, Lcom/appsflyer/internal/AFd1nSDK;->copydefault:I

    .line 13
    .line 14
    add-int/lit8 v0, v0, 0x1f

    .line 15
    .line 16
    rem-int/lit16 v1, v0, 0x80

    .line 17
    .line 18
    sput v1, Lcom/appsflyer/internal/AFd1nSDK;->hashCode:I

    .line 19
    .line 20
    rem-int/lit8 v0, v0, 0x2

    .line 21
    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    const/16 v0, 0x2e

    .line 25
    .line 26
    div-int/lit8 v0, v0, 0x0

    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method public constructor <init>(Lcom/appsflyer/internal/AFd1mSDK;Lcom/appsflyer/internal/AFc1oSDK;Lcom/appsflyer/AppsFlyerProperties;Lcom/appsflyer/internal/AFe1vSDK;Lcom/appsflyer/internal/AFj1cSDK;Lcom/appsflyer/internal/AFf1eSDK;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/appsflyer/internal/AFd1nSDK;->getCurrencyIso4217Code:Lcom/appsflyer/internal/AFd1mSDK;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/appsflyer/internal/AFd1nSDK;->getMediationNetwork:Lcom/appsflyer/internal/AFc1oSDK;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/appsflyer/internal/AFd1nSDK;->AFAdRevenueData:Lcom/appsflyer/AppsFlyerProperties;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/appsflyer/internal/AFd1nSDK;->component4:Lcom/appsflyer/internal/AFe1vSDK;

    .line 11
    .line 12
    iput-object p5, p0, Lcom/appsflyer/internal/AFd1nSDK;->component1:Lcom/appsflyer/internal/AFj1cSDK;

    .line 13
    .line 14
    iput-object p6, p0, Lcom/appsflyer/internal/AFd1nSDK;->component2:Lcom/appsflyer/internal/AFf1eSDK;

    .line 15
    .line 16
    return-void
.end method

.method private static synthetic AFAdRevenueData([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    const/4 v0, 0x0

    aget-object v1, p0, v0

    check-cast v1, Lcom/appsflyer/internal/AFd1nSDK;

    const/4 v2, 0x1

    aget-object p0, p0, v2

    move-object v3, p0

    check-cast v3, Ljava/lang/String;

    .line 205
    new-instance v2, Lcom/appsflyer/internal/AFd1bSDK;

    .line 206
    sget-object v6, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    const/4 v7, 0x0

    const/4 v4, 0x0

    const-string v5, "GET"

    invoke-direct/range {v2 .. v7}, Lcom/appsflyer/internal/AFd1bSDK;-><init>(Ljava/lang/String;[BLjava/lang/String;Ljava/util/Map;Z)V

    const/16 p0, 0x2710

    .line 207
    iput p0, v2, Lcom/appsflyer/internal/AFd1bSDK;->component4:I

    .line 208
    iput-boolean v0, v2, Lcom/appsflyer/internal/AFd1bSDK;->getRevenue:Z

    .line 209
    new-instance p0, Lcom/appsflyer/internal/AFd1dSDK;

    invoke-direct {p0}, Lcom/appsflyer/internal/AFd1dSDK;-><init>()V

    invoke-direct {v1, v2, p0}, Lcom/appsflyer/internal/AFd1nSDK;->getRevenue(Lcom/appsflyer/internal/AFd1bSDK;Lcom/appsflyer/internal/AFe1zSDK;)Lcom/appsflyer/internal/AFd1hSDK;

    move-result-object p0

    sget v0, Lcom/appsflyer/internal/AFd1nSDK;->hashCode:I

    add-int/lit8 v0, v0, 0x29

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFd1nSDK;->copydefault:I

    rem-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    throw p0
.end method

.method private AFAdRevenueData()Z
    .locals 3

    .line 210
    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p0

    const v1, -0xd345299

    const v2, 0xd34529a

    invoke-static {v0, v1, v2, p0}, Lcom/appsflyer/internal/AFd1nSDK;->getMediationNetwork([Ljava/lang/Object;III)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static a(Ljava/lang/String;I[Ljava/lang/Object;)V
    .locals 17

    .line 1
    const/4 v0, 0x2

    .line 2
    if-eqz p0, :cond_1

    .line 3
    .line 4
    sget v1, Lcom/appsflyer/internal/AFd1nSDK;->$11:I

    .line 5
    .line 6
    add-int/lit8 v1, v1, 0x57

    .line 7
    .line 8
    rem-int/lit16 v2, v1, 0x80

    .line 9
    .line 10
    sput v2, Lcom/appsflyer/internal/AFd1nSDK;->$10:I

    .line 11
    .line 12
    rem-int/2addr v1, v0

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->toCharArray()[C

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->toCharArray()[C

    .line 21
    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    throw v0

    .line 25
    :cond_1
    move-object/from16 v1, p0

    .line 26
    .line 27
    :goto_0
    check-cast v1, [C

    .line 28
    .line 29
    new-instance v2, Lcom/appsflyer/internal/AFk1qSDK;

    .line 30
    .line 31
    invoke-direct {v2}, Lcom/appsflyer/internal/AFk1qSDK;-><init>()V

    .line 32
    .line 33
    .line 34
    array-length v3, v1

    .line 35
    new-array v3, v3, [C

    .line 36
    .line 37
    const/4 v4, 0x0

    .line 38
    iput v4, v2, Lcom/appsflyer/internal/AFk1qSDK;->getRevenue:I

    .line 39
    .line 40
    new-array v5, v0, [C

    .line 41
    .line 42
    :goto_1
    iget v6, v2, Lcom/appsflyer/internal/AFk1qSDK;->getRevenue:I

    .line 43
    .line 44
    array-length v7, v1

    .line 45
    if-ge v6, v7, :cond_4

    .line 46
    .line 47
    sget v7, Lcom/appsflyer/internal/AFd1nSDK;->$10:I

    .line 48
    .line 49
    add-int/lit8 v7, v7, 0x61

    .line 50
    .line 51
    rem-int/lit16 v8, v7, 0x80

    .line 52
    .line 53
    sput v8, Lcom/appsflyer/internal/AFd1nSDK;->$11:I

    .line 54
    .line 55
    rem-int/2addr v7, v0

    .line 56
    const/4 v8, 0x1

    .line 57
    if-nez v7, :cond_2

    .line 58
    .line 59
    aget-char v7, v1, v6

    .line 60
    .line 61
    aput-char v7, v5, v8

    .line 62
    .line 63
    aget-char v6, v1, v6

    .line 64
    .line 65
    aput-char v6, v5, v8

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_2
    aget-char v7, v1, v6

    .line 69
    .line 70
    aput-char v7, v5, v4

    .line 71
    .line 72
    add-int/lit8 v6, v6, 0x1

    .line 73
    .line 74
    aget-char v6, v1, v6

    .line 75
    .line 76
    aput-char v6, v5, v8

    .line 77
    .line 78
    :goto_2
    const v6, 0xe370

    .line 79
    .line 80
    .line 81
    move v7, v4

    .line 82
    :goto_3
    const/16 v9, 0x10

    .line 83
    .line 84
    if-ge v7, v9, :cond_3

    .line 85
    .line 86
    sget v9, Lcom/appsflyer/internal/AFd1nSDK;->$10:I

    .line 87
    .line 88
    add-int/lit8 v9, v9, 0x4b

    .line 89
    .line 90
    rem-int/lit16 v9, v9, 0x80

    .line 91
    .line 92
    sput v9, Lcom/appsflyer/internal/AFd1nSDK;->$11:I

    .line 93
    .line 94
    aget-char v9, v5, v8

    .line 95
    .line 96
    aget-char v10, v5, v4

    .line 97
    .line 98
    add-int v11, v10, v6

    .line 99
    .line 100
    shl-int/lit8 v12, v10, 0x4

    .line 101
    .line 102
    sget-char v13, Lcom/appsflyer/internal/AFd1nSDK;->equals:C

    .line 103
    .line 104
    int-to-long v13, v13

    .line 105
    const-wide v15, -0x10a3f40b27dab58cL    # -2.65765482159287E228

    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    xor-long/2addr v13, v15

    .line 111
    long-to-int v13, v13

    .line 112
    int-to-char v13, v13

    .line 113
    add-int/2addr v12, v13

    .line 114
    xor-int/2addr v11, v12

    .line 115
    ushr-int/lit8 v12, v10, 0x5

    .line 116
    .line 117
    sget-char v13, Lcom/appsflyer/internal/AFd1nSDK;->copy:C

    .line 118
    .line 119
    int-to-long v13, v13

    .line 120
    xor-long/2addr v13, v15

    .line 121
    long-to-int v13, v13

    .line 122
    int-to-char v13, v13

    .line 123
    add-int/2addr v12, v13

    .line 124
    xor-int/2addr v11, v12

    .line 125
    sub-int/2addr v9, v11

    .line 126
    int-to-char v9, v9

    .line 127
    aput-char v9, v5, v8

    .line 128
    .line 129
    add-int v11, v9, v6

    .line 130
    .line 131
    shl-int/lit8 v12, v9, 0x4

    .line 132
    .line 133
    sget-char v13, Lcom/appsflyer/internal/AFd1nSDK;->component3:C

    .line 134
    .line 135
    int-to-long v13, v13

    .line 136
    xor-long/2addr v13, v15

    .line 137
    long-to-int v13, v13

    .line 138
    int-to-char v13, v13

    .line 139
    add-int/2addr v12, v13

    .line 140
    xor-int/2addr v11, v12

    .line 141
    ushr-int/lit8 v9, v9, 0x5

    .line 142
    .line 143
    sget-char v12, Lcom/appsflyer/internal/AFd1nSDK;->areAllFieldsValid:C

    .line 144
    .line 145
    int-to-long v12, v12

    .line 146
    xor-long/2addr v12, v15

    .line 147
    long-to-int v12, v12

    .line 148
    int-to-char v12, v12

    .line 149
    add-int/2addr v9, v12

    .line 150
    xor-int/2addr v9, v11

    .line 151
    sub-int/2addr v10, v9

    .line 152
    int-to-char v9, v10

    .line 153
    aput-char v9, v5, v4

    .line 154
    .line 155
    const v9, 0x9e37

    .line 156
    .line 157
    .line 158
    sub-int/2addr v6, v9

    .line 159
    add-int/lit8 v7, v7, 0x1

    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_3
    iget v6, v2, Lcom/appsflyer/internal/AFk1qSDK;->getRevenue:I

    .line 163
    .line 164
    aget-char v7, v5, v4

    .line 165
    .line 166
    aput-char v7, v3, v6

    .line 167
    .line 168
    add-int/lit8 v7, v6, 0x1

    .line 169
    .line 170
    aget-char v8, v5, v8

    .line 171
    .line 172
    aput-char v8, v3, v7

    .line 173
    .line 174
    add-int/2addr v6, v0

    .line 175
    iput v6, v2, Lcom/appsflyer/internal/AFk1qSDK;->getRevenue:I

    .line 176
    .line 177
    goto/16 :goto_1

    .line 178
    .line 179
    :cond_4
    new-instance v0, Ljava/lang/String;

    .line 180
    .line 181
    move/from16 v1, p1

    .line 182
    .line 183
    invoke-direct {v0, v3, v4, v1}, Ljava/lang/String;-><init>([CII)V

    .line 184
    .line 185
    .line 186
    aput-object v0, p2, v4

    .line 187
    .line 188
    return-void
.end method

.method private static synthetic getCurrencyIso4217Code([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    const v0, 0x4eb9ad1d

    .line 335
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x0

    .line 336
    aget-object v2, p0, v1

    check-cast v2, Lcom/appsflyer/internal/AFd1nSDK;

    const/4 v3, 0x1

    aget-object v4, p0, v3

    check-cast v4, Ljava/util/Map;

    const/4 v5, 0x2

    aget-object v6, p0, v5

    check-cast v6, Ljava/lang/String;

    const/4 v7, 0x3

    aget-object p0, p0, v7

    check-cast p0, Ljava/lang/String;

    .line 337
    sget v7, Lcom/appsflyer/internal/AFd1nSDK;->copydefault:I

    add-int/2addr v7, v3

    rem-int/lit16 v7, v7, 0x80

    sput v7, Lcom/appsflyer/internal/AFd1nSDK;->hashCode:I

    const/4 v7, 0x0

    .line 338
    :try_start_0
    new-array v8, v5, [Ljava/lang/Object;

    aput-object v6, v8, v3

    aput-object v4, v8, v1

    sget-object v1, Lcom/appsflyer/internal/AFa1hSDK;->d:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    move-result v3

    int-to-byte v3, v3

    add-int/lit16 v3, v3, 0xc7

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    move-result v4

    shr-int/lit8 v4, v4, 0x10

    int-to-char v4, v4

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollDefaultDelay()I

    move-result v6

    shr-int/lit8 v6, v6, 0x10

    rsub-int/lit8 v6, v6, 0x25

    invoke-static {v3, v4, v6}, Lcom/appsflyer/internal/AFa1hSDK;->getRevenue(ICI)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Class;

    const-string v4, "getRevenue"

    const-class v6, Ljava/util/Map;

    const-class v9, Ljava/lang/String;

    filled-new-array {v6, v9}, [Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v3, v4, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    invoke-interface {v1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    check-cast v3, Ljava/lang/reflect/Method;

    invoke-virtual {v3, v7, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, [B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 339
    iget-object v0, v2, Lcom/appsflyer/internal/AFd1nSDK;->component1:Lcom/appsflyer/internal/AFj1cSDK;

    if-eqz p0, :cond_3

    .line 340
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    new-instance v1, Lkotlin/text/Regex;

    const-string v3, "4.?(\\d+)?.?(\\d+)"

    invoke-direct {v1, v3}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 341
    invoke-virtual {v1, p0}, Lkotlin/text/Regex;->b(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_3

    new-instance v1, Lkotlin/text/Regex;

    const-string v3, "3.?(\\d+)?.?(\\d+)"

    invoke-direct {v1, v3}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Lkotlin/text/Regex;->b(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_2

    goto :goto_1

    .line 342
    :cond_2
    sget p0, Lcom/appsflyer/internal/AFd1nSDK;->copydefault:I

    add-int/lit8 p0, p0, 0xb

    rem-int/lit16 p0, p0, 0x80

    sput p0, Lcom/appsflyer/internal/AFd1nSDK;->hashCode:I

    .line 343
    iget-object p0, v0, Lcom/appsflyer/internal/AFj1cSDK;->getRevenue:Lcom/appsflyer/internal/AFk1zSDK;

    .line 344
    const-string v1, "https://%sviap.%s/api/v1/android/validate_purchase_v2?app_id="

    .line 345
    invoke-interface {p0, v1}, Lcom/appsflyer/internal/AFk1zSDK;->getMediationNetwork(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_2

    .line 346
    :cond_3
    :goto_1
    sget p0, Lcom/appsflyer/internal/AFd1nSDK;->copydefault:I

    add-int/lit8 p0, p0, 0x39

    rem-int/lit16 v1, p0, 0x80

    sput v1, Lcom/appsflyer/internal/AFd1nSDK;->hashCode:I

    rem-int/2addr p0, v5

    const-string v1, "https://%sviap.%s/api/v1/android/validate_purchase?app_id="

    if-eqz p0, :cond_4

    .line 347
    iget-object p0, v0, Lcom/appsflyer/internal/AFj1cSDK;->getRevenue:Lcom/appsflyer/internal/AFk1zSDK;

    invoke-interface {p0, v1}, Lcom/appsflyer/internal/AFk1zSDK;->getMediationNetwork(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 348
    :goto_2
    invoke-virtual {v0, p0}, Lcom/appsflyer/internal/AFj1cSDK;->getMediationNetwork(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Lcom/appsflyer/internal/AFj1cSDK;->getMediationNetwork(Lcom/appsflyer/internal/AFj1cSDK;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 349
    new-instance v8, Lcom/appsflyer/internal/AFd1bSDK;

    .line 350
    sget-object v12, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    const/4 v13, 0x1

    const-string v11, "POST"

    invoke-direct/range {v8 .. v13}, Lcom/appsflyer/internal/AFd1bSDK;-><init>(Ljava/lang/String;[BLjava/lang/String;Ljava/util/Map;Z)V

    .line 351
    new-instance p0, Lcom/appsflyer/internal/AFd1dSDK;

    invoke-direct {p0}, Lcom/appsflyer/internal/AFd1dSDK;-><init>()V

    invoke-direct {v2, v8, p0}, Lcom/appsflyer/internal/AFd1nSDK;->getRevenue(Lcom/appsflyer/internal/AFd1bSDK;Lcom/appsflyer/internal/AFe1zSDK;)Lcom/appsflyer/internal/AFd1hSDK;

    move-result-object p0

    return-object p0

    .line 352
    :cond_4
    iget-object p0, v0, Lcom/appsflyer/internal/AFj1cSDK;->getRevenue:Lcom/appsflyer/internal/AFk1zSDK;

    invoke-interface {p0, v1}, Lcom/appsflyer/internal/AFk1zSDK;->getMediationNetwork(Ljava/lang/String;)Ljava/lang/String;

    .line 353
    throw v7

    :catchall_0
    move-exception v0

    move-object p0, v0

    .line 354
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_5

    throw v0

    :catchall_1
    move-exception v0

    move-object p0, v0

    move-object v3, p0

    goto :goto_3

    :cond_5
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 355
    :goto_3
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/internal/AFg1cSDK;->AFLogger:Lcom/appsflyer/internal/AFg1cSDK;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-string v2, "AFFinalizer: reflection init failed."

    invoke-virtual/range {v0 .. v5}, Lcom/appsflyer/internal/AFh1ySDK;->e(Lcom/appsflyer/internal/AFg1cSDK;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    return-object v7
.end method

.method private getCurrencyIso4217Code(Lcom/appsflyer/internal/AFh1mSDK;[B)V
    .locals 3

    .line 356
    sget v0, Lcom/appsflyer/internal/AFd1nSDK;->copydefault:I

    add-int/lit8 v0, v0, 0x4f

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFd1nSDK;->hashCode:I

    rem-int/lit8 v0, v0, 0x2

    .line 357
    iget-object v1, p0, Lcom/appsflyer/internal/AFd1nSDK;->getMediationNetwork:Lcom/appsflyer/internal/AFc1oSDK;

    .line 358
    const-string v2, "com.appsflyer.security.enable"

    if-eqz v0, :cond_2

    .line 359
    invoke-virtual {v1, v2}, Lcom/appsflyer/internal/AFc1oSDK;->getMediationNetwork(Ljava/lang/String;)Z

    move-result v0

    .line 360
    invoke-virtual {p1}, Lcom/appsflyer/internal/AFh1mSDK;->getMediationNetwork()Z

    move-result v1

    if-eqz v1, :cond_1

    if-eqz v0, :cond_1

    .line 361
    sget v0, Lcom/appsflyer/internal/AFd1nSDK;->copydefault:I

    add-int/lit8 v0, v0, 0x49

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1nSDK;->hashCode:I

    .line 362
    iget-object p0, p0, Lcom/appsflyer/internal/AFd1nSDK;->getMediationNetwork:Lcom/appsflyer/internal/AFc1oSDK;

    invoke-static {p1, p0}, Lcom/appsflyer/internal/AFf1eSDK;->getRevenue(Lcom/appsflyer/internal/AFh1mSDK;Lcom/appsflyer/internal/AFc1oSDK;)Z

    move-result p0

    if-eqz p0, :cond_1

    .line 363
    sget p0, Lcom/appsflyer/internal/AFd1nSDK;->hashCode:I

    add-int/lit8 p0, p0, 0x67

    rem-int/lit16 v0, p0, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1nSDK;->copydefault:I

    rem-int/lit8 p0, p0, 0x2

    if-eqz p0, :cond_0

    .line 364
    invoke-static {p1, p2}, Lcom/appsflyer/internal/AFf1eSDK;->getMonetizationNetwork(Lcom/appsflyer/internal/AFh1mSDK;[B)V

    const/16 p0, 0x58

    .line 365
    div-int/lit8 p0, p0, 0x0

    goto :goto_0

    .line 366
    :cond_0
    invoke-static {p1, p2}, Lcom/appsflyer/internal/AFf1eSDK;->getMonetizationNetwork(Lcom/appsflyer/internal/AFh1mSDK;[B)V

    .line 367
    :goto_0
    sget p0, Lcom/appsflyer/internal/AFd1nSDK;->hashCode:I

    add-int/lit8 p0, p0, 0x59

    rem-int/lit16 p0, p0, 0x80

    sput p0, Lcom/appsflyer/internal/AFd1nSDK;->copydefault:I

    :cond_1
    return-void

    .line 368
    :cond_2
    invoke-virtual {v1, v2}, Lcom/appsflyer/internal/AFc1oSDK;->getMediationNetwork(Ljava/lang/String;)Z

    .line 369
    invoke-virtual {p1}, Lcom/appsflyer/internal/AFh1mSDK;->getMediationNetwork()Z

    const/4 p0, 0x0

    throw p0
.end method

.method public static synthetic getMediationNetwork([Ljava/lang/Object;III)Ljava/lang/Object;
    .locals 6

    mul-int/lit16 v0, p1, 0x267

    mul-int/lit16 v1, p2, -0x265

    add-int/2addr v1, v0

    not-int v0, p1

    or-int v2, v0, p2

    not-int v2, v2

    or-int v3, p3, v2

    not-int v4, p2

    or-int v5, v4, p1

    not-int v5, v5

    or-int/2addr v3, v5

    mul-int/lit16 v3, v3, 0x266

    add-int/2addr v3, v1

    not-int p3, p3

    or-int v1, v0, p3

    not-int v1, v1

    or-int/2addr v1, v2

    or-int v2, p3, p2

    not-int v2, v2

    or-int/2addr v1, v2

    mul-int/lit16 v1, v1, -0x4cc

    add-int/2addr v1, v3

    or-int/2addr v0, v4

    or-int/2addr v0, p3

    not-int v0, v0

    or-int/2addr p1, p3

    or-int/2addr p1, p2

    not-int p1, p1

    or-int/2addr p1, v0

    mul-int/lit16 p1, p1, 0x266

    add-int/2addr p1, v1

    const/4 p2, 0x2

    const/4 p3, 0x1

    if-eq p1, p3, :cond_1

    if-eq p1, p2, :cond_0

    .line 217
    invoke-static {p0}, Lcom/appsflyer/internal/AFd1nSDK;->AFAdRevenueData([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p0}, Lcom/appsflyer/internal/AFd1nSDK;->getCurrencyIso4217Code([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 p1, 0x0

    aget-object p0, p0, p1

    check-cast p0, Lcom/appsflyer/internal/AFd1nSDK;

    .line 218
    sget p1, Lcom/appsflyer/internal/AFd1nSDK;->hashCode:I

    add-int/lit8 p1, p1, 0x71

    rem-int/lit16 p1, p1, 0x80

    sput p1, Lcom/appsflyer/internal/AFd1nSDK;->copydefault:I

    iget-object p0, p0, Lcom/appsflyer/internal/AFd1nSDK;->AFAdRevenueData:Lcom/appsflyer/AppsFlyerProperties;

    const-string p1, "http_cache"

    invoke-virtual {p0, p1, p3}, Lcom/appsflyer/AppsFlyerProperties;->getBoolean(Ljava/lang/String;Z)Z

    move-result p0

    if-nez p0, :cond_3

    sget p0, Lcom/appsflyer/internal/AFd1nSDK;->copydefault:I

    add-int/lit8 p0, p0, 0x45

    rem-int/lit16 p1, p0, 0x80

    sput p1, Lcom/appsflyer/internal/AFd1nSDK;->hashCode:I

    rem-int/2addr p0, p2

    if-nez p0, :cond_2

    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p0

    :cond_2
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p0

    :cond_3
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p0
.end method

.method public static getMediationNetwork()V
    .locals 1

    const v0, 0x9615

    .line 226
    sput-char v0, Lcom/appsflyer/internal/AFd1nSDK;->component3:C

    const/16 v0, 0x3c71

    sput-char v0, Lcom/appsflyer/internal/AFd1nSDK;->areAllFieldsValid:C

    const v0, 0xc09a

    sput-char v0, Lcom/appsflyer/internal/AFd1nSDK;->equals:C

    const/16 v0, 0x3181

    sput-char v0, Lcom/appsflyer/internal/AFd1nSDK;->copy:C

    return-void
.end method

.method private static varargs getMonetizationNetwork(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 259
    new-instance v0, Ljava/util/ArrayList;

    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-direct {v0, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const/4 p2, 0x1

    .line 260
    const-string v1, "v2"

    invoke-virtual {v0, p2, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    const/4 p2, 0x0

    .line 261
    new-array v2, p2, [Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    .line 262
    const-string v2, "\u2063"

    invoke-static {v2, v0}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 263
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    .line 264
    invoke-static {v0, p0}, Lcom/appsflyer/internal/AFj1dSDK;->getMonetizationNetwork(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    sget p1, Lcom/appsflyer/internal/AFd1nSDK;->hashCode:I

    add-int/lit8 p1, p1, 0x9

    rem-int/lit16 v0, p1, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1nSDK;->copydefault:I

    rem-int/lit8 p1, p1, 0x2

    if-eqz p1, :cond_0

    const/16 p1, 0x3c

    div-int/2addr p1, p2

    :cond_0
    return-object p0
.end method

.method private getRevenue(Lcom/appsflyer/internal/AFd1bSDK;Lcom/appsflyer/internal/AFe1zSDK;)Lcom/appsflyer/internal/AFd1hSDK;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/appsflyer/internal/AFd1bSDK;",
            "Lcom/appsflyer/internal/AFe1zSDK<",
            "TT;>;)",
            "Lcom/appsflyer/internal/AFd1hSDK<",
            "TT;>;"
        }
    .end annotation

    .line 137
    sget v0, Lcom/appsflyer/internal/AFd1nSDK;->hashCode:I

    add-int/lit8 v0, v0, 0x25

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1nSDK;->copydefault:I

    .line 138
    invoke-direct {p0}, Lcom/appsflyer/internal/AFd1nSDK;->AFAdRevenueData()Z

    move-result v0

    .line 139
    invoke-direct {p0, p1, p2, v0}, Lcom/appsflyer/internal/AFd1nSDK;->getRevenue(Lcom/appsflyer/internal/AFd1bSDK;Lcom/appsflyer/internal/AFe1zSDK;Z)Lcom/appsflyer/internal/AFd1hSDK;

    move-result-object p0

    sget p1, Lcom/appsflyer/internal/AFd1nSDK;->hashCode:I

    add-int/lit8 p1, p1, 0x33

    rem-int/lit16 p2, p1, 0x80

    sput p2, Lcom/appsflyer/internal/AFd1nSDK;->copydefault:I

    rem-int/lit8 p1, p1, 0x2

    if-eqz p1, :cond_0

    const/16 p1, 0xa

    div-int/lit8 p1, p1, 0x0

    :cond_0
    return-object p0
.end method

.method private getRevenue(Lcom/appsflyer/internal/AFd1bSDK;Lcom/appsflyer/internal/AFe1zSDK;Z)Lcom/appsflyer/internal/AFd1hSDK;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/appsflyer/internal/AFd1bSDK;",
            "Lcom/appsflyer/internal/AFe1zSDK<",
            "TT;>;Z)",
            "Lcom/appsflyer/internal/AFd1hSDK<",
            "TT;>;"
        }
    .end annotation

    .line 154
    iput-boolean p3, p1, Lcom/appsflyer/internal/AFd1bSDK;->getCurrencyIso4217Code:Z

    .line 155
    iget-object p0, p0, Lcom/appsflyer/internal/AFd1nSDK;->getCurrencyIso4217Code:Lcom/appsflyer/internal/AFd1mSDK;

    .line 156
    new-instance p3, Lcom/appsflyer/internal/AFd1hSDK;

    iget-object v0, p0, Lcom/appsflyer/internal/AFd1mSDK;->getRevenue:Ljava/util/concurrent/ExecutorService;

    iget-object p0, p0, Lcom/appsflyer/internal/AFd1mSDK;->getMonetizationNetwork:Lcom/appsflyer/internal/AFd1gSDK;

    invoke-direct {p3, p1, v0, p0, p2}, Lcom/appsflyer/internal/AFd1hSDK;-><init>(Lcom/appsflyer/internal/AFd1bSDK;Ljava/util/concurrent/ExecutorService;Lcom/appsflyer/internal/AFd1gSDK;Lcom/appsflyer/internal/AFe1zSDK;)V

    .line 157
    sget p0, Lcom/appsflyer/internal/AFd1nSDK;->copydefault:I

    add-int/lit8 p0, p0, 0x1

    rem-int/lit16 p1, p0, 0x80

    sput p1, Lcom/appsflyer/internal/AFd1nSDK;->hashCode:I

    rem-int/lit8 p0, p0, 0x2

    if-eqz p0, :cond_0

    return-object p3

    :cond_0
    const/4 p0, 0x0

    throw p0
.end method

.method private getRevenue()Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "build_number"

    .line 7
    .line 8
    const-string v2, "6.17.6"

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lcom/appsflyer/internal/AFd1nSDK;->getMediationNetwork:Lcom/appsflyer/internal/AFc1oSDK;

    .line 14
    .line 15
    iget-object v1, v1, Lcom/appsflyer/internal/AFc1oSDK;->getMediationNetwork:Lcom/appsflyer/internal/AFc1qSDK;

    .line 16
    .line 17
    const-string v2, "appsFlyerCount"

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-interface {v1, v2, v3}, Lcom/appsflyer/internal/AFc1qSDK;->getRevenue(Ljava/lang/String;I)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const-string v2, "counter"

    .line 29
    .line 30
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    const-string v1, "model"

    .line 34
    .line 35
    sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarSize()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    shr-int/lit8 v1, v1, 0x8

    .line 45
    .line 46
    rsub-int/lit8 v1, v1, 0x5

    .line 47
    .line 48
    const/4 v2, 0x1

    .line 49
    new-array v2, v2, [Ljava/lang/Object;

    .line 50
    .line 51
    const-string v4, "\u0112\u24be\u301f\u570c\uea94\u72e6"

    .line 52
    .line 53
    invoke-static {v4, v1, v2}, Lcom/appsflyer/internal/AFd1nSDK;->a(Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    aget-object v1, v2, v3

    .line 57
    .line 58
    check-cast v1, Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    sget-object v2, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 70
    .line 71
    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    const-string v2, "sdk"

    .line 76
    .line 77
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    iget-object v1, p0, Lcom/appsflyer/internal/AFd1nSDK;->getMediationNetwork:Lcom/appsflyer/internal/AFc1oSDK;

    .line 81
    .line 82
    invoke-virtual {v1}, Lcom/appsflyer/internal/AFc1oSDK;->n_()Landroid/content/pm/PackageInfo;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    iget-object v1, v1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 87
    .line 88
    const-string v2, "app_version_name"

    .line 89
    .line 90
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    iget-object p0, p0, Lcom/appsflyer/internal/AFd1nSDK;->getMediationNetwork:Lcom/appsflyer/internal/AFc1oSDK;

    .line 94
    .line 95
    iget-object p0, p0, Lcom/appsflyer/internal/AFc1oSDK;->getCurrencyIso4217Code:Lcom/appsflyer/internal/AFc1hSDK;

    .line 96
    .line 97
    iget-object p0, p0, Lcom/appsflyer/internal/AFc1hSDK;->getMonetizationNetwork:Landroid/content/Context;

    .line 98
    .line 99
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    const-string v1, "app_id"

    .line 104
    .line 105
    invoke-virtual {v0, v1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    new-instance p0, Lcom/appsflyer/internal/AFa1uSDK;

    .line 109
    .line 110
    invoke-direct {p0}, Lcom/appsflyer/internal/AFa1uSDK;-><init>()V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFa1uSDK;->AFAdRevenueData()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    const-string v1, "platformextension"

    .line 118
    .line 119
    invoke-virtual {v0, v1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    sget p0, Lcom/appsflyer/internal/AFd1nSDK;->hashCode:I

    .line 123
    .line 124
    add-int/lit8 p0, p0, 0x45

    .line 125
    .line 126
    rem-int/lit16 p0, p0, 0x80

    .line 127
    .line 128
    sput p0, Lcom/appsflyer/internal/AFd1nSDK;->copydefault:I

    .line 129
    .line 130
    return-object v0
.end method


# virtual methods
.method public final AFAdRevenueData(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lcom/appsflyer/internal/AFd1hSDK;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/appsflyer/internal/AFd1hSDK<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    const v1, 0x4eb9ad1d

    .line 4
    .line 5
    .line 6
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const/4 v2, 0x2

    .line 11
    const/4 v3, 0x0

    .line 12
    :try_start_0
    new-array v2, v2, [Ljava/lang/Object;

    .line 13
    .line 14
    const/4 v4, 0x1

    .line 15
    aput-object p2, v2, v4

    .line 16
    .line 17
    const/4 p2, 0x0

    .line 18
    aput-object p1, v2, p2

    .line 19
    .line 20
    sget-object p1, Lcom/appsflyer/internal/AFa1hSDK;->d:Ljava/util/Map;

    .line 21
    .line 22
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    if-eqz v4, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-static {v0}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    add-int/lit16 v4, v4, 0xc6

    .line 34
    .line 35
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    int-to-char v5, v5

    .line 40
    const/16 v6, 0x30

    .line 41
    .line 42
    invoke-static {v0, v6, p2}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    add-int/lit8 p2, p2, 0x26

    .line 47
    .line 48
    invoke-static {v4, v5, p2}, Lcom/appsflyer/internal/AFa1hSDK;->getRevenue(ICI)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    check-cast p2, Ljava/lang/Class;

    .line 53
    .line 54
    const-string v0, "getRevenue"

    .line 55
    .line 56
    const-class v4, Ljava/util/Map;

    .line 57
    .line 58
    const-class v5, Ljava/lang/String;

    .line 59
    .line 60
    filled-new-array {v4, v5}, [Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-virtual {p2, v0, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    invoke-interface {p1, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    :goto_0
    check-cast v4, Ljava/lang/reflect/Method;

    .line 72
    .line 73
    invoke-virtual {v4, v3, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    move-object v6, p1

    .line 78
    check-cast v6, [B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    .line 80
    iget-object p1, p0, Lcom/appsflyer/internal/AFd1nSDK;->component1:Lcom/appsflyer/internal/AFj1cSDK;

    .line 81
    .line 82
    if-eqz p3, :cond_3

    .line 83
    .line 84
    sget p2, Lcom/appsflyer/internal/AFd1nSDK;->copydefault:I

    .line 85
    .line 86
    add-int/lit8 p2, p2, 0x57

    .line 87
    .line 88
    rem-int/lit16 p2, p2, 0x80

    .line 89
    .line 90
    sput p2, Lcom/appsflyer/internal/AFd1nSDK;->hashCode:I

    .line 91
    .line 92
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 93
    .line 94
    .line 95
    move-result p2

    .line 96
    if-nez p2, :cond_1

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_1
    new-instance p2, Lkotlin/text/Regex;

    .line 100
    .line 101
    const-string v0, "4.?(\\d+)?.?(\\d+)"

    .line 102
    .line 103
    invoke-direct {p2, v0}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p2, p3}, Lkotlin/text/Regex;->b(Ljava/lang/String;)Z

    .line 107
    .line 108
    .line 109
    move-result p2

    .line 110
    if-nez p2, :cond_4

    .line 111
    .line 112
    new-instance p2, Lkotlin/text/Regex;

    .line 113
    .line 114
    const-string v0, "3.?(\\d+)?.?(\\d+)"

    .line 115
    .line 116
    invoke-direct {p2, v0}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p2, p3}, Lkotlin/text/Regex;->b(Ljava/lang/String;)Z

    .line 120
    .line 121
    .line 122
    move-result p2

    .line 123
    if-eqz p2, :cond_2

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_2
    iget-object p2, p1, Lcom/appsflyer/internal/AFj1cSDK;->getRevenue:Lcom/appsflyer/internal/AFk1zSDK;

    .line 127
    .line 128
    const-string p3, "https://%sars.%s/api/v2/android/validate_subscription_v2?app_id="

    .line 129
    .line 130
    invoke-interface {p2, p3}, Lcom/appsflyer/internal/AFk1zSDK;->getMediationNetwork(Ljava/lang/String;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p2

    .line 134
    goto :goto_3

    .line 135
    :cond_3
    :goto_1
    sget p2, Lcom/appsflyer/internal/AFd1nSDK;->hashCode:I

    .line 136
    .line 137
    add-int/lit8 p2, p2, 0x25

    .line 138
    .line 139
    rem-int/lit16 p2, p2, 0x80

    .line 140
    .line 141
    sput p2, Lcom/appsflyer/internal/AFd1nSDK;->copydefault:I

    .line 142
    .line 143
    :cond_4
    :goto_2
    iget-object p2, p1, Lcom/appsflyer/internal/AFj1cSDK;->getRevenue:Lcom/appsflyer/internal/AFk1zSDK;

    .line 144
    .line 145
    const-string p3, "https://%sars.%s/api/v2/android/validate_subscription?app_id="

    .line 146
    .line 147
    invoke-interface {p2, p3}, Lcom/appsflyer/internal/AFk1zSDK;->getMediationNetwork(Ljava/lang/String;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p2

    .line 151
    :goto_3
    invoke-virtual {p1, p2}, Lcom/appsflyer/internal/AFj1cSDK;->getMediationNetwork(Ljava/lang/String;)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object p2

    .line 155
    invoke-static {p1, p2}, Lcom/appsflyer/internal/AFj1cSDK;->getMediationNetwork(Lcom/appsflyer/internal/AFj1cSDK;Ljava/lang/String;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v5

    .line 159
    new-instance v4, Lcom/appsflyer/internal/AFd1bSDK;

    .line 160
    .line 161
    sget-object v8, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 162
    .line 163
    const/4 v9, 0x1

    .line 164
    const-string v7, "POST"

    .line 165
    .line 166
    invoke-direct/range {v4 .. v9}, Lcom/appsflyer/internal/AFd1bSDK;-><init>(Ljava/lang/String;[BLjava/lang/String;Ljava/util/Map;Z)V

    .line 167
    .line 168
    .line 169
    new-instance p1, Lcom/appsflyer/internal/AFd1dSDK;

    .line 170
    .line 171
    invoke-direct {p1}, Lcom/appsflyer/internal/AFd1dSDK;-><init>()V

    .line 172
    .line 173
    .line 174
    invoke-direct {p0, v4, p1}, Lcom/appsflyer/internal/AFd1nSDK;->getRevenue(Lcom/appsflyer/internal/AFd1bSDK;Lcom/appsflyer/internal/AFe1zSDK;)Lcom/appsflyer/internal/AFd1hSDK;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    return-object p0

    .line 179
    :catchall_0
    move-exception v0

    .line 180
    move-object p0, v0

    .line 181
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    if-eqz p1, :cond_5

    .line 186
    .line 187
    throw p1

    .line 188
    :catchall_1
    move-exception v0

    .line 189
    move-object p0, v0

    .line 190
    move-object v7, p0

    .line 191
    goto :goto_4

    .line 192
    :cond_5
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 193
    :goto_4
    sget-object v4, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 194
    .line 195
    sget-object v5, Lcom/appsflyer/internal/AFg1cSDK;->force:Lcom/appsflyer/internal/AFg1cSDK;

    .line 196
    .line 197
    const/4 v8, 0x0

    .line 198
    const/4 v9, 0x0

    .line 199
    const-string v6, "AFFinalizer: reflection init failed."

    .line 200
    .line 201
    invoke-virtual/range {v4 .. v9}, Lcom/appsflyer/internal/AFh1ySDK;->e(Lcom/appsflyer/internal/AFg1cSDK;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    .line 202
    .line 203
    .line 204
    return-object v3
.end method

.method public final getCurrencyIso4217Code(Lcom/appsflyer/internal/AFh1mSDK;Ljava/lang/String;Lcom/appsflyer/internal/AFc1hSDK;)Lcom/appsflyer/internal/AFd1hSDK;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/appsflyer/internal/AFh1mSDK;",
            "Ljava/lang/String;",
            "Lcom/appsflyer/internal/AFc1hSDK;",
            ")",
            "Lcom/appsflyer/internal/AFd1hSDK<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    const v1, -0x3dad87f0

    .line 4
    .line 5
    .line 6
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const/4 v2, 0x3

    .line 11
    const/4 v3, 0x0

    .line 12
    :try_start_0
    new-array v2, v2, [Ljava/lang/Object;

    .line 13
    .line 14
    const/4 v4, 0x2

    .line 15
    aput-object p3, v2, v4

    .line 16
    .line 17
    const/4 p3, 0x1

    .line 18
    aput-object p2, v2, p3

    .line 19
    .line 20
    const/4 p2, 0x0

    .line 21
    aput-object p1, v2, p2

    .line 22
    .line 23
    sget-object p3, Lcom/appsflyer/internal/AFa1hSDK;->d:Ljava/util/Map;

    .line 24
    .line 25
    invoke-interface {p3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    if-eqz v5, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    shr-int/lit8 v5, v5, 0x10

    .line 37
    .line 38
    add-int/lit16 v5, v5, 0xc6

    .line 39
    .line 40
    invoke-static {v0, v0, p2}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    int-to-char v0, v0

    .line 45
    invoke-static {p2}, Landroid/os/Process;->getThreadPriority(I)I

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    add-int/lit8 p2, p2, 0x14

    .line 50
    .line 51
    shr-int/lit8 p2, p2, 0x6

    .line 52
    .line 53
    add-int/lit8 p2, p2, 0x25

    .line 54
    .line 55
    invoke-static {v5, v0, p2}, Lcom/appsflyer/internal/AFa1hSDK;->getRevenue(ICI)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    check-cast p2, Ljava/lang/Class;

    .line 60
    .line 61
    const-string v0, "AFAdRevenueData"

    .line 62
    .line 63
    const-class v5, Lcom/appsflyer/internal/AFh1mSDK;

    .line 64
    .line 65
    const-class v6, Ljava/lang/String;

    .line 66
    .line 67
    const-class v7, Lcom/appsflyer/internal/AFc1hSDK;

    .line 68
    .line 69
    filled-new-array {v5, v6, v7}, [Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    invoke-virtual {p2, v0, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    invoke-interface {p3, v1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    :goto_0
    check-cast v5, Ljava/lang/reflect/Method;

    .line 81
    .line 82
    invoke-virtual {v5, v3, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    move-object v7, p2

    .line 87
    check-cast v7, [B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 88
    .line 89
    :try_start_1
    invoke-direct {p0, p1, v7}, Lcom/appsflyer/internal/AFd1nSDK;->getCurrencyIso4217Code(Lcom/appsflyer/internal/AFh1mSDK;[B)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 90
    .line 91
    .line 92
    sget p2, Lcom/appsflyer/internal/AFd1nSDK;->copydefault:I

    .line 93
    .line 94
    add-int/lit8 p2, p2, 0x43

    .line 95
    .line 96
    rem-int/lit16 p2, p2, 0x80

    .line 97
    .line 98
    sput p2, Lcom/appsflyer/internal/AFd1nSDK;->hashCode:I

    .line 99
    .line 100
    iget-object p2, p0, Lcom/appsflyer/internal/AFd1nSDK;->component1:Lcom/appsflyer/internal/AFj1cSDK;

    .line 101
    .line 102
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1}, Lcom/appsflyer/internal/AFh1mSDK;->getRevenue()Z

    .line 106
    .line 107
    .line 108
    move-result p3

    .line 109
    instance-of v0, p1, Lcom/appsflyer/internal/AFh1lSDK;

    .line 110
    .line 111
    instance-of v1, p1, Lcom/appsflyer/internal/AFh1nSDK;

    .line 112
    .line 113
    instance-of v2, p1, Lcom/appsflyer/internal/AFh1kSDK;

    .line 114
    .line 115
    instance-of v5, p1, Lcom/appsflyer/internal/AFh1cSDK;

    .line 116
    .line 117
    instance-of v6, p1, Lcom/appsflyer/internal/AFh1bSDK;

    .line 118
    .line 119
    instance-of v8, p1, Lcom/appsflyer/internal/AFg1tSDK;

    .line 120
    .line 121
    instance-of v9, p1, Lcom/appsflyer/internal/AFh1iSDK;

    .line 122
    .line 123
    if-eqz v9, :cond_1

    .line 124
    .line 125
    iget-object p3, p2, Lcom/appsflyer/internal/AFj1cSDK;->getRevenue:Lcom/appsflyer/internal/AFk1zSDK;

    .line 126
    .line 127
    const-string v1, "https://%spia.%s/api/v1.0/pia-android-event?app_id="

    .line 128
    .line 129
    invoke-interface {p3, v1}, Lcom/appsflyer/internal/AFk1zSDK;->getMediationNetwork(Ljava/lang/String;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p3

    .line 133
    goto/16 :goto_3

    .line 134
    .line 135
    :cond_1
    if-nez v2, :cond_a

    .line 136
    .line 137
    sget v2, Lcom/appsflyer/internal/AFd1nSDK;->copydefault:I

    .line 138
    .line 139
    add-int/lit8 v2, v2, 0x5

    .line 140
    .line 141
    rem-int/lit16 v9, v2, 0x80

    .line 142
    .line 143
    sput v9, Lcom/appsflyer/internal/AFd1nSDK;->hashCode:I

    .line 144
    .line 145
    rem-int/2addr v2, v4

    .line 146
    if-eqz v2, :cond_9

    .line 147
    .line 148
    if-eqz v1, :cond_2

    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_2
    if-eqz v0, :cond_3

    .line 152
    .line 153
    add-int/lit8 v9, v9, 0x3f

    .line 154
    .line 155
    rem-int/lit16 v9, v9, 0x80

    .line 156
    .line 157
    sput v9, Lcom/appsflyer/internal/AFd1nSDK;->copydefault:I

    .line 158
    .line 159
    iget-object p3, p2, Lcom/appsflyer/internal/AFj1cSDK;->getRevenue:Lcom/appsflyer/internal/AFk1zSDK;

    .line 160
    .line 161
    sget-object v1, Lcom/appsflyer/internal/AFj1cSDK;->AFAdRevenueData:Ljava/lang/String;

    .line 162
    .line 163
    invoke-interface {p3, v1}, Lcom/appsflyer/internal/AFk1zSDK;->getMediationNetwork(Ljava/lang/String;)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object p3

    .line 167
    goto :goto_3

    .line 168
    :cond_3
    if-eqz v5, :cond_4

    .line 169
    .line 170
    iget-object p3, p2, Lcom/appsflyer/internal/AFj1cSDK;->getRevenue:Lcom/appsflyer/internal/AFk1zSDK;

    .line 171
    .line 172
    sget-object v1, Lcom/appsflyer/internal/AFj1cSDK;->component1:Ljava/lang/String;

    .line 173
    .line 174
    invoke-interface {p3, v1}, Lcom/appsflyer/internal/AFk1zSDK;->getMediationNetwork(Ljava/lang/String;)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p3

    .line 178
    goto :goto_3

    .line 179
    :cond_4
    if-eqz v6, :cond_5

    .line 180
    .line 181
    iget-object p2, p2, Lcom/appsflyer/internal/AFj1cSDK;->getRevenue:Lcom/appsflyer/internal/AFk1zSDK;

    .line 182
    .line 183
    const-string p3, "https://%ssdk-services.%s/validate-android-signature"

    .line 184
    .line 185
    invoke-interface {p2, p3}, Lcom/appsflyer/internal/AFk1zSDK;->getMediationNetwork(Ljava/lang/String;)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object p2

    .line 189
    :goto_1
    move-object v6, p2

    .line 190
    goto :goto_4

    .line 191
    :cond_5
    if-eqz v8, :cond_6

    .line 192
    .line 193
    iget-object p3, p2, Lcom/appsflyer/internal/AFj1cSDK;->getRevenue:Lcom/appsflyer/internal/AFk1zSDK;

    .line 194
    .line 195
    sget-object v1, Lcom/appsflyer/internal/AFj1cSDK;->component2:Ljava/lang/String;

    .line 196
    .line 197
    invoke-interface {p3, v1}, Lcom/appsflyer/internal/AFk1zSDK;->getMediationNetwork(Ljava/lang/String;)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object p3

    .line 201
    sget v1, Lcom/appsflyer/internal/AFd1nSDK;->hashCode:I

    .line 202
    .line 203
    add-int/lit8 v1, v1, 0x5b

    .line 204
    .line 205
    rem-int/lit16 v1, v1, 0x80

    .line 206
    .line 207
    sput v1, Lcom/appsflyer/internal/AFd1nSDK;->copydefault:I

    .line 208
    .line 209
    goto :goto_3

    .line 210
    :cond_6
    if-eqz p3, :cond_8

    .line 211
    .line 212
    iget p3, p1, Lcom/appsflyer/internal/AFh1mSDK;->component4:I

    .line 213
    .line 214
    if-ge p3, v4, :cond_7

    .line 215
    .line 216
    iget-object p3, p2, Lcom/appsflyer/internal/AFj1cSDK;->getRevenue:Lcom/appsflyer/internal/AFk1zSDK;

    .line 217
    .line 218
    sget-object v1, Lcom/appsflyer/internal/AFj1cSDK;->getMonetizationNetwork:Ljava/lang/String;

    .line 219
    .line 220
    invoke-interface {p3, v1}, Lcom/appsflyer/internal/AFk1zSDK;->getMediationNetwork(Ljava/lang/String;)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object p3

    .line 224
    goto :goto_3

    .line 225
    :cond_7
    iget-object p3, p2, Lcom/appsflyer/internal/AFj1cSDK;->getRevenue:Lcom/appsflyer/internal/AFk1zSDK;

    .line 226
    .line 227
    sget-object v1, Lcom/appsflyer/internal/AFj1cSDK;->areAllFieldsValid:Ljava/lang/String;

    .line 228
    .line 229
    invoke-interface {p3, v1}, Lcom/appsflyer/internal/AFk1zSDK;->getMediationNetwork(Ljava/lang/String;)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object p3

    .line 233
    goto :goto_3

    .line 234
    :cond_8
    iget-object p3, p2, Lcom/appsflyer/internal/AFj1cSDK;->getRevenue:Lcom/appsflyer/internal/AFk1zSDK;

    .line 235
    .line 236
    sget-object v1, Lcom/appsflyer/internal/AFj1cSDK;->component4:Ljava/lang/String;

    .line 237
    .line 238
    invoke-interface {p3, v1}, Lcom/appsflyer/internal/AFk1zSDK;->getMediationNetwork(Ljava/lang/String;)Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object p3

    .line 242
    goto :goto_3

    .line 243
    :cond_9
    throw v3

    .line 244
    :cond_a
    :goto_2
    iget-object p3, p2, Lcom/appsflyer/internal/AFj1cSDK;->getRevenue:Lcom/appsflyer/internal/AFk1zSDK;

    .line 245
    .line 246
    sget-object v1, Lcom/appsflyer/internal/AFj1cSDK;->getMediationNetwork:Ljava/lang/String;

    .line 247
    .line 248
    invoke-interface {p3, v1}, Lcom/appsflyer/internal/AFk1zSDK;->getMediationNetwork(Ljava/lang/String;)Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object p3

    .line 252
    :goto_3
    invoke-virtual {p2, p3}, Lcom/appsflyer/internal/AFj1cSDK;->getMediationNetwork(Ljava/lang/String;)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object p3

    .line 256
    invoke-static {p3, v0}, Lcom/appsflyer/internal/AFj1cSDK;->getRevenue(Ljava/lang/String;Z)Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object p3

    .line 260
    invoke-virtual {p2, p3, v8}, Lcom/appsflyer/internal/AFj1cSDK;->getMediationNetwork(Ljava/lang/String;Z)Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object p2

    .line 264
    sget p3, Lcom/appsflyer/internal/AFd1nSDK;->hashCode:I

    .line 265
    .line 266
    add-int/lit8 p3, p3, 0x29

    .line 267
    .line 268
    rem-int/lit16 p3, p3, 0x80

    .line 269
    .line 270
    sput p3, Lcom/appsflyer/internal/AFd1nSDK;->copydefault:I

    .line 271
    .line 272
    goto :goto_1

    .line 273
    :goto_4
    new-instance v5, Lcom/appsflyer/internal/AFd1bSDK;

    .line 274
    .line 275
    iget-object v9, p1, Lcom/appsflyer/internal/AFh1mSDK;->getMediationNetwork:Ljava/util/Map;

    .line 276
    .line 277
    invoke-virtual {p1}, Lcom/appsflyer/internal/AFh1mSDK;->getCurrencyIso4217Code()Z

    .line 278
    .line 279
    .line 280
    move-result v10

    .line 281
    const-string v8, "POST"

    .line 282
    .line 283
    invoke-direct/range {v5 .. v10}, Lcom/appsflyer/internal/AFd1bSDK;-><init>(Ljava/lang/String;[BLjava/lang/String;Ljava/util/Map;Z)V

    .line 284
    .line 285
    .line 286
    new-instance p1, Lcom/appsflyer/internal/AFd1dSDK;

    .line 287
    .line 288
    invoke-direct {p1}, Lcom/appsflyer/internal/AFd1dSDK;-><init>()V

    .line 289
    .line 290
    .line 291
    invoke-direct {p0, v5, p1}, Lcom/appsflyer/internal/AFd1nSDK;->getRevenue(Lcom/appsflyer/internal/AFd1bSDK;Lcom/appsflyer/internal/AFe1zSDK;)Lcom/appsflyer/internal/AFd1hSDK;

    .line 292
    .line 293
    .line 294
    move-result-object p0

    .line 295
    return-object p0

    .line 296
    :catchall_0
    move-exception v0

    .line 297
    move-object p0, v0

    .line 298
    move-object v7, p0

    .line 299
    goto :goto_5

    .line 300
    :catchall_1
    move-exception v0

    .line 301
    move-object p0, v0

    .line 302
    :try_start_2
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 303
    .line 304
    .line 305
    move-result-object p1

    .line 306
    if-eqz p1, :cond_b

    .line 307
    .line 308
    throw p1

    .line 309
    :cond_b
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 310
    :goto_5
    sget-object v4, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 311
    .line 312
    sget-object v5, Lcom/appsflyer/internal/AFg1cSDK;->v:Lcom/appsflyer/internal/AFg1cSDK;

    .line 313
    .line 314
    const/4 v8, 0x0

    .line 315
    const/4 v9, 0x0

    .line 316
    const-string v6, "AFFinalizer: reflection init failed."

    .line 317
    .line 318
    invoke-virtual/range {v4 .. v9}, Lcom/appsflyer/internal/AFh1ySDK;->e(Lcom/appsflyer/internal/AFg1cSDK;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    .line 319
    .line 320
    .line 321
    return-object v3
.end method

.method public final getCurrencyIso4217Code(Ljava/lang/String;)Lcom/appsflyer/internal/AFd1hSDK;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/appsflyer/internal/AFd1hSDK<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 370
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p0

    const v0, 0x5b87bdbd

    const v1, -0x5b87bdbd

    invoke-static {p1, v0, v1, p0}, Lcom/appsflyer/internal/AFd1nSDK;->getMediationNetwork([Ljava/lang/Object;III)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/appsflyer/internal/AFd1hSDK;

    return-object p0
.end method

.method public final getCurrencyIso4217Code(Ljava/util/Map;Ljava/lang/String;)Lcom/appsflyer/internal/AFd1hSDK;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lcom/appsflyer/internal/AFd1hSDK<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const v0, 0x4eb9ad1d

    .line 322
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 323
    sget v1, Lcom/appsflyer/internal/AFd1nSDK;->hashCode:I

    add-int/lit8 v1, v1, 0x9

    rem-int/lit16 v1, v1, 0x80

    sput v1, Lcom/appsflyer/internal/AFd1nSDK;->copydefault:I

    const/4 v1, 0x2

    const/4 v2, 0x0

    .line 324
    :try_start_0
    new-array v3, v1, [Ljava/lang/Object;

    const/4 v4, 0x1

    aput-object p2, v3, v4

    const/4 p2, 0x0

    aput-object p1, v3, p2

    sget-object p1, Lcom/appsflyer/internal/AFa1hSDK;->d:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_0
    const/16 v4, 0x30

    invoke-static {v4}, Landroid/text/AndroidCharacter;->getMirror(C)C

    move-result v4

    add-int/lit16 v4, v4, 0x96

    invoke-static {p2, p2}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result p2

    int-to-char p2, p2

    invoke-static {}, Landroid/view/ViewConfiguration;->getEdgeSlop()I

    move-result v5

    shr-int/lit8 v5, v5, 0x10

    rsub-int/lit8 v5, v5, 0x25

    invoke-static {v4, p2, v5}, Lcom/appsflyer/internal/AFa1hSDK;->getRevenue(ICI)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Class;

    const-string v4, "getRevenue"

    const-class v5, Ljava/util/Map;

    const-class v6, Ljava/lang/String;

    filled-new-array {v5, v6}, [Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {p2, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    invoke-interface {p1, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    check-cast v4, Ljava/lang/reflect/Method;

    invoke-virtual {v4, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v5, p1

    check-cast v5, [B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 325
    iget-object p1, p0, Lcom/appsflyer/internal/AFd1nSDK;->component1:Lcom/appsflyer/internal/AFj1cSDK;

    .line 326
    iget-object p2, p1, Lcom/appsflyer/internal/AFj1cSDK;->getRevenue:Lcom/appsflyer/internal/AFk1zSDK;

    .line 327
    const-string v0, "https://%svalidate-and-log.%s/api/v4.0/android/subscription/validateAndLog?app_id="

    .line 328
    invoke-interface {p2, v0}, Lcom/appsflyer/internal/AFk1zSDK;->getMediationNetwork(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 329
    invoke-virtual {p1, p2}, Lcom/appsflyer/internal/AFj1cSDK;->getMediationNetwork(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 330
    new-instance v3, Lcom/appsflyer/internal/AFd1bSDK;

    .line 331
    sget-object v7, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    const/4 v8, 0x1

    const-string v6, "POST"

    invoke-direct/range {v3 .. v8}, Lcom/appsflyer/internal/AFd1bSDK;-><init>(Ljava/lang/String;[BLjava/lang/String;Ljava/util/Map;Z)V

    .line 332
    new-instance p1, Lcom/appsflyer/internal/AFd1dSDK;

    invoke-direct {p1}, Lcom/appsflyer/internal/AFd1dSDK;-><init>()V

    invoke-direct {p0, v3, p1}, Lcom/appsflyer/internal/AFd1nSDK;->getRevenue(Lcom/appsflyer/internal/AFd1bSDK;Lcom/appsflyer/internal/AFe1zSDK;)Lcom/appsflyer/internal/AFd1hSDK;

    move-result-object p0

    sget p1, Lcom/appsflyer/internal/AFd1nSDK;->hashCode:I

    add-int/lit8 p1, p1, 0x31

    rem-int/lit16 p2, p1, 0x80

    sput p2, Lcom/appsflyer/internal/AFd1nSDK;->copydefault:I

    rem-int/2addr p1, v1

    if-nez p1, :cond_1

    return-object p0

    :cond_1
    throw v2

    :catchall_0
    move-exception v0

    move-object p0, v0

    .line 333
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_2

    throw p1

    :catchall_1
    move-exception v0

    move-object p0, v0

    move-object v6, p0

    goto :goto_1

    :cond_2
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 334
    :goto_1
    sget-object v3, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v4, Lcom/appsflyer/internal/AFg1cSDK;->force:Lcom/appsflyer/internal/AFg1cSDK;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-string v5, "AFFinalizer: reflection init failed."

    invoke-virtual/range {v3 .. v8}, Lcom/appsflyer/internal/AFh1ySDK;->e(Lcom/appsflyer/internal/AFg1cSDK;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    return-object v2
.end method

.method public final getMediationNetwork(Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;)Lcom/appsflyer/internal/AFd1hSDK;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/UUID;",
            "Ljava/lang/String;",
            ")",
            "Lcom/appsflyer/internal/AFd1hSDK<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    sget-object v2, Lcom/appsflyer/internal/AFd1nSDK;->getRevenue:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-virtual {v3}, Lcom/appsflyer/AppsFlyerLib;->getHostPrefix()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-static {}, Lcom/appsflyer/internal/AFa1ySDK;->getRevenue()Lcom/appsflyer/internal/AFa1ySDK;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    invoke-virtual {v4}, Lcom/appsflyer/internal/AFa1ySDK;->getHostName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    filled-new-array {v3, v4}, [Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v2, "/"

    .line 40
    .line 41
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v2, "?id="

    .line 48
    .line 49
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    invoke-direct {p0}, Lcom/appsflyer/internal/AFd1nSDK;->getRevenue()Ljava/util/Map;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    const-string v2, "build_number"

    .line 64
    .line 65
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    new-instance v7, Ljava/util/HashMap;

    .line 74
    .line 75
    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 76
    .line 77
    .line 78
    const-string v3, "Af-UUID"

    .line 79
    .line 80
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p3

    .line 84
    invoke-virtual {v7, v3, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    const-string p3, "Af-Meta-Sdk-Ver"

    .line 88
    .line 89
    invoke-virtual {v7, p3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    const-string p3, "counter"

    .line 93
    .line 94
    invoke-interface {v1, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p3

    .line 98
    invoke-static {p3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p3

    .line 102
    const-string v3, "Af-Meta-Counter"

    .line 103
    .line 104
    invoke-virtual {v7, v3, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    const-string p3, "model"

    .line 108
    .line 109
    invoke-interface {v1, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p3

    .line 113
    invoke-static {p3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p3

    .line 117
    const-string v3, "Af-Meta-Model"

    .line 118
    .line 119
    invoke-virtual {v7, v3, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    const-string p3, "platformextension"

    .line 123
    .line 124
    invoke-interface {v1, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p3

    .line 128
    invoke-static {p3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p3

    .line 132
    const-string v3, "Af-Meta-Platform"

    .line 133
    .line 134
    invoke-virtual {v7, v3, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    const-string p3, "sdk"

    .line 138
    .line 139
    invoke-interface {v1, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p3

    .line 143
    invoke-static {p3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p3

    .line 147
    const-string v1, "Af-Meta-System-Version"

    .line 148
    .line 149
    invoke-virtual {v7, v1, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    const-string p3, ""

    .line 153
    .line 154
    const/16 v1, 0x30

    .line 155
    .line 156
    const/4 v3, 0x0

    .line 157
    invoke-static {p3, v1, v3}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    .line 158
    .line 159
    .line 160
    move-result p3

    .line 161
    add-int/lit8 p3, p3, 0xd

    .line 162
    .line 163
    const/4 v1, 0x1

    .line 164
    new-array v1, v1, [Ljava/lang/Object;

    .line 165
    .line 166
    const-string v5, "\uaab9\u11ce\u4a99\u4f67\ud7ec\ueecf\u811b\u14ac\u8975\u35d7\u0741\u8a7c"

    .line 167
    .line 168
    invoke-static {v5, p3, v1}, Lcom/appsflyer/internal/AFd1nSDK;->a(Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    aget-object p3, v1, v3

    .line 172
    .line 173
    check-cast p3, Ljava/lang/String;

    .line 174
    .line 175
    invoke-virtual {p3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p3

    .line 179
    const-string v6, "GET"

    .line 180
    .line 181
    filled-new-array {v6, v0, p1, p2, v2}, [Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    invoke-static {p4, v0, p1}, Lcom/appsflyer/internal/AFd1nSDK;->getMonetizationNetwork(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    invoke-virtual {v7, p3, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    new-instance v3, Lcom/appsflyer/internal/AFd1bSDK;

    .line 193
    .line 194
    const/4 v5, 0x0

    .line 195
    const/4 v8, 0x0

    .line 196
    invoke-direct/range {v3 .. v8}, Lcom/appsflyer/internal/AFd1bSDK;-><init>(Ljava/lang/String;[BLjava/lang/String;Ljava/util/Map;Z)V

    .line 197
    .line 198
    .line 199
    new-instance p1, Lcom/appsflyer/internal/AFd1eSDK;

    .line 200
    .line 201
    invoke-direct {p1}, Lcom/appsflyer/internal/AFd1eSDK;-><init>()V

    .line 202
    .line 203
    .line 204
    invoke-direct {p0, v3, p1}, Lcom/appsflyer/internal/AFd1nSDK;->getRevenue(Lcom/appsflyer/internal/AFd1bSDK;Lcom/appsflyer/internal/AFe1zSDK;)Lcom/appsflyer/internal/AFd1hSDK;

    .line 205
    .line 206
    .line 207
    move-result-object p0

    .line 208
    sget p1, Lcom/appsflyer/internal/AFd1nSDK;->copydefault:I

    .line 209
    .line 210
    add-int/lit8 p1, p1, 0x49

    .line 211
    .line 212
    rem-int/lit16 p1, p1, 0x80

    .line 213
    .line 214
    sput p1, Lcom/appsflyer/internal/AFd1nSDK;->hashCode:I

    .line 215
    .line 216
    return-object p0
.end method

.method public final getMediationNetwork(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lcom/appsflyer/internal/AFd1hSDK;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/appsflyer/internal/AFd1hSDK<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 227
    filled-new-array {p0, p1, p2, p3}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p0

    const p2, -0x43633001

    const p3, 0x43633003

    invoke-static {p1, p2, p3, p0}, Lcom/appsflyer/internal/AFd1nSDK;->getMediationNetwork([Ljava/lang/Object;III)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/appsflyer/internal/AFd1hSDK;

    return-object p0
.end method

.method public final getMediationNetwork(Ljava/util/Map;Ljava/lang/String;)Lcom/appsflyer/internal/AFd1kSDK;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lcom/appsflyer/internal/AFd1kSDK;"
        }
    .end annotation

    const v0, 0x4eb9ad1d

    .line 219
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 220
    sget v1, Lcom/appsflyer/internal/AFd1nSDK;->copydefault:I

    add-int/lit8 v1, v1, 0x2b

    rem-int/lit16 v1, v1, 0x80

    sput v1, Lcom/appsflyer/internal/AFd1nSDK;->hashCode:I

    const/4 v1, 0x2

    const/4 v2, 0x0

    .line 221
    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v3, 0x1

    aput-object p2, v1, v3

    const/4 p2, 0x0

    aput-object p1, v1, p2

    sget-object p1, Lcom/appsflyer/internal/AFa1hSDK;->d:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long v3, v3, v5

    add-int/lit16 v3, v3, 0xc5

    invoke-static {p2, p2}, Landroid/view/KeyEvent;->getDeadChar(II)I

    move-result p2

    int-to-char p2, p2

    invoke-static {}, Landroid/os/Process;->myTid()I

    move-result v4

    shr-int/lit8 v4, v4, 0x16

    rsub-int/lit8 v4, v4, 0x25

    invoke-static {v3, p2, v4}, Lcom/appsflyer/internal/AFa1hSDK;->getRevenue(ICI)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Class;

    const-string v3, "getRevenue"

    const-class v4, Ljava/util/Map;

    const-class v5, Ljava/lang/String;

    filled-new-array {v4, v5}, [Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {p2, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    invoke-interface {p1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    check-cast v3, Ljava/lang/reflect/Method;

    invoke-virtual {v3, v2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-nez p1, :cond_1

    .line 222
    :try_start_1
    sget-object v3, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v4, Lcom/appsflyer/internal/AFg1cSDK;->v:Lcom/appsflyer/internal/AFg1cSDK;

    const-string v5, "AFFinalizer: failed to create bytes."

    new-instance v6, Ljava/lang/IllegalArgumentException;

    const-string p0, "Failed to create bytes from proxyData, bytes are null"

    invoke-direct {v6, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-virtual/range {v3 .. v8}, Lcom/appsflyer/internal/AFh1ySDK;->e(Lcom/appsflyer/internal/AFg1cSDK;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 223
    sget p0, Lcom/appsflyer/internal/AFd1nSDK;->hashCode:I

    add-int/lit8 p0, p0, 0x4d

    rem-int/lit16 p0, p0, 0x80

    sput p0, Lcom/appsflyer/internal/AFd1nSDK;->copydefault:I

    return-object v2

    :catchall_0
    move-exception v0

    move-object p0, v0

    move-object v6, p0

    goto :goto_1

    :cond_1
    new-instance p2, Lcom/appsflyer/internal/AFd1kSDK;

    iget-object p0, p0, Lcom/appsflyer/internal/AFd1nSDK;->getMediationNetwork:Lcom/appsflyer/internal/AFc1oSDK;

    invoke-direct {p2, p0, p1}, Lcom/appsflyer/internal/AFd1kSDK;-><init>(Lcom/appsflyer/internal/AFc1oSDK;[B)V

    return-object p2

    :catchall_1
    move-exception v0

    move-object p0, v0

    .line 224
    :try_start_2
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_2

    throw p1

    :cond_2
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 225
    :goto_1
    sget-object v3, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v4, Lcom/appsflyer/internal/AFg1cSDK;->v:Lcom/appsflyer/internal/AFg1cSDK;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-string v5, "AFFinalizer: reflection init failed."

    invoke-virtual/range {v3 .. v8}, Lcom/appsflyer/internal/AFh1ySDK;->e(Lcom/appsflyer/internal/AFg1cSDK;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    return-object v2
.end method

.method public final getMonetizationNetwork(Lcom/appsflyer/internal/AFa1rSDK;)Lcom/appsflyer/internal/AFd1hSDK;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/appsflyer/internal/AFa1rSDK;",
            ")",
            "Lcom/appsflyer/internal/AFd1hSDK<",
            "Lcom/appsflyer/internal/AFa1oSDK;",
            ">;"
        }
    .end annotation

    .line 265
    iget-object v0, p1, Lcom/appsflyer/internal/AFh1mSDK;->AFAdRevenueData:Ljava/util/Map;

    .line 266
    invoke-static {v0}, Lcom/appsflyer/internal/AFg1eSDK;->getMediationNetwork(Ljava/util/Map;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    .line 267
    new-instance v1, Lcom/appsflyer/internal/AFd1bSDK;

    .line 268
    iget-object v2, p1, Lcom/appsflyer/internal/AFh1mSDK;->component2:Ljava/lang/String;

    .line 269
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v3

    .line 270
    sget-object v5, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 271
    invoke-virtual {p1}, Lcom/appsflyer/internal/AFh1mSDK;->getCurrencyIso4217Code()Z

    move-result v6

    const-string v4, "POST"

    invoke-direct/range {v1 .. v6}, Lcom/appsflyer/internal/AFd1bSDK;-><init>(Ljava/lang/String;[BLjava/lang/String;Ljava/util/Map;Z)V

    .line 272
    new-instance p1, Lcom/appsflyer/internal/AFa1pSDK;

    invoke-direct {p1}, Lcom/appsflyer/internal/AFa1pSDK;-><init>()V

    invoke-direct {p0, v1, p1}, Lcom/appsflyer/internal/AFd1nSDK;->getRevenue(Lcom/appsflyer/internal/AFd1bSDK;Lcom/appsflyer/internal/AFe1zSDK;)Lcom/appsflyer/internal/AFd1hSDK;

    move-result-object p0

    sget p1, Lcom/appsflyer/internal/AFd1nSDK;->hashCode:I

    add-int/lit8 p1, p1, 0x49

    rem-int/lit16 v0, p1, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1nSDK;->copydefault:I

    rem-int/lit8 p1, p1, 0x2

    if-nez p1, :cond_0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    throw p0
.end method

.method public final getMonetizationNetwork(Ljava/lang/String;Ljava/lang/String;)Lcom/appsflyer/internal/AFd1hSDK;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/appsflyer/internal/AFd1hSDK<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    .line 235
    iget-object v0, p0, Lcom/appsflyer/internal/AFd1nSDK;->getMediationNetwork:Lcom/appsflyer/internal/AFc1oSDK;

    .line 236
    iget-object v0, v0, Lcom/appsflyer/internal/AFc1oSDK;->getCurrencyIso4217Code:Lcom/appsflyer/internal/AFc1hSDK;

    .line 237
    iget-object v0, v0, Lcom/appsflyer/internal/AFc1hSDK;->getMonetizationNetwork:Landroid/content/Context;

    .line 238
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    .line 239
    iget-object v1, p0, Lcom/appsflyer/internal/AFd1nSDK;->getMediationNetwork:Lcom/appsflyer/internal/AFc1oSDK;

    .line 240
    iget-object v1, v1, Lcom/appsflyer/internal/AFc1oSDK;->getMediationNetwork:Lcom/appsflyer/internal/AFc1qSDK;

    invoke-static {v1}, Lcom/appsflyer/internal/AFb1kSDK;->getCurrencyIso4217Code(Lcom/appsflyer/internal/AFc1qSDK;)Ljava/lang/String;

    move-result-object v1

    .line 241
    invoke-static {v0, v1, p1, p2}, Lcom/appsflyer/internal/AFd1fSDK;->getRevenue(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/appsflyer/internal/AFd1fSDK;

    move-result-object p1

    new-instance p2, Lcom/appsflyer/internal/AFd1iSDK;

    invoke-direct {p2}, Lcom/appsflyer/internal/AFd1iSDK;-><init>()V

    invoke-direct {p0, p1, p2}, Lcom/appsflyer/internal/AFd1nSDK;->getRevenue(Lcom/appsflyer/internal/AFd1bSDK;Lcom/appsflyer/internal/AFe1zSDK;)Lcom/appsflyer/internal/AFd1hSDK;

    move-result-object p0

    sget p1, Lcom/appsflyer/internal/AFd1nSDK;->hashCode:I

    add-int/lit8 p1, p1, 0x17

    rem-int/lit16 p1, p1, 0x80

    sput p1, Lcom/appsflyer/internal/AFd1nSDK;->copydefault:I

    return-object p0
.end method

.method public final getMonetizationNetwork(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;)Lcom/appsflyer/internal/AFd1hSDK;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/UUID;",
            "Ljava/lang/String;",
            ")",
            "Lcom/appsflyer/internal/AFd1hSDK<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 242
    invoke-virtual {p4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p4

    .line 243
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 244
    const-string v1, "ttl"

    const-string v2, "-1"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 245
    const-string v1, "uuid"

    invoke-virtual {v0, v1, p4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 246
    const-string v1, "data"

    invoke-virtual {v0, v1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    const-string p2, "meta"

    invoke-direct {p0}, Lcom/appsflyer/internal/AFd1nSDK;->getRevenue()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, p2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p3, :cond_0

    .line 248
    sget p2, Lcom/appsflyer/internal/AFd1nSDK;->hashCode:I

    add-int/lit8 p2, p2, 0x55

    rem-int/lit16 p2, p2, 0x80

    sput p2, Lcom/appsflyer/internal/AFd1nSDK;->copydefault:I

    .line 249
    const-string p2, "brand_domain"

    invoke-virtual {v0, p2, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 250
    sget p2, Lcom/appsflyer/internal/AFd1nSDK;->hashCode:I

    add-int/lit8 p2, p2, 0x4b

    rem-int/lit16 p2, p2, 0x80

    sput p2, Lcom/appsflyer/internal/AFd1nSDK;->copydefault:I

    .line 251
    :cond_0
    invoke-static {v0}, Lcom/appsflyer/internal/AFg1eSDK;->getMediationNetwork(Ljava/util/Map;)Lorg/json/JSONObject;

    move-result-object p2

    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p2

    .line 252
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    const/4 p3, 0x0

    .line 253
    invoke-static {p3}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    rsub-int/lit8 v0, v0, 0xc

    const/4 v6, 0x1

    new-array v1, v6, [Ljava/lang/Object;

    const-string v2, "\uaab9\u11ce\u4a99\u4f67\ud7ec\ueecf\u811b\u14ac\u8975\u35d7\u0741\u8a7c"

    invoke-static {v2, v0, v1}, Lcom/appsflyer/internal/AFd1nSDK;->a(Ljava/lang/String;I[Ljava/lang/Object;)V

    aget-object p3, v1, p3

    check-cast p3, Ljava/lang/String;

    invoke-virtual {p3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object p3

    const-string v0, "POST"

    filled-new-array {v0, p2}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {p5, p4, v0}, Lcom/appsflyer/internal/AFd1nSDK;->getMonetizationNetwork(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {v4, p3, p4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 254
    new-instance v0, Lcom/appsflyer/internal/AFd1bSDK;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    sget-object p4, Lcom/appsflyer/internal/AFd1nSDK;->getRevenue:Ljava/lang/String;

    .line 255
    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    move-result-object p5

    invoke-virtual {p5}, Lcom/appsflyer/AppsFlyerLib;->getHostPrefix()Ljava/lang/String;

    move-result-object p5

    invoke-static {}, Lcom/appsflyer/internal/AFa1ySDK;->getRevenue()Lcom/appsflyer/internal/AFa1ySDK;

    move-result-object v1

    invoke-virtual {v1}, Lcom/appsflyer/internal/AFa1ySDK;->getHostName()Ljava/lang/String;

    move-result-object v1

    filled-new-array {p5, v1}, [Ljava/lang/Object;

    move-result-object p5

    invoke-static {p4, p5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p4

    .line 256
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, "/"

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 257
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v2

    const-string v3, "POST"

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/appsflyer/internal/AFd1bSDK;-><init>(Ljava/lang/String;[BLjava/lang/String;Ljava/util/Map;Z)V

    .line 258
    new-instance p1, Lcom/appsflyer/internal/AFd1dSDK;

    invoke-direct {p1}, Lcom/appsflyer/internal/AFd1dSDK;-><init>()V

    invoke-direct {p0, v0, p1, v6}, Lcom/appsflyer/internal/AFd1nSDK;->getRevenue(Lcom/appsflyer/internal/AFd1bSDK;Lcom/appsflyer/internal/AFe1zSDK;Z)Lcom/appsflyer/internal/AFd1hSDK;

    move-result-object p0

    return-object p0
.end method

.method public final getMonetizationNetwork(Ljava/util/Map;Ljava/lang/String;)Lcom/appsflyer/internal/AFd1hSDK;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lcom/appsflyer/internal/AFd1hSDK<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    const v0, 0x4eb9ad1d

    .line 2
    .line 3
    .line 4
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sget v1, Lcom/appsflyer/internal/AFd1nSDK;->hashCode:I

    .line 9
    .line 10
    add-int/lit8 v1, v1, 0x6f

    .line 11
    .line 12
    rem-int/lit16 v2, v1, 0x80

    .line 13
    .line 14
    sput v2, Lcom/appsflyer/internal/AFd1nSDK;->copydefault:I

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    rem-int/2addr v1, v2

    .line 18
    const-class v3, Ljava/lang/String;

    .line 19
    .line 20
    const-class v4, Ljava/util/Map;

    .line 21
    .line 22
    const-string v5, "getRevenue"

    .line 23
    .line 24
    const/16 v6, 0x30

    .line 25
    .line 26
    const/4 v7, 0x1

    .line 27
    const/4 v8, 0x0

    .line 28
    const-string v9, ""

    .line 29
    .line 30
    const/4 v10, 0x0

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    :try_start_0
    new-array p0, v2, [Ljava/lang/Object;

    .line 34
    .line 35
    aput-object p2, p0, v7

    .line 36
    .line 37
    aput-object p1, p0, v10

    .line 38
    .line 39
    sget-object p1, Lcom/appsflyer/internal/AFa1hSDK;->d:Ljava/util/Map;

    .line 40
    .line 41
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    if-eqz p2, :cond_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    invoke-static {v10, v10}, Landroid/view/KeyEvent;->getDeadChar(II)I

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    rsub-int p2, p2, 0xc6

    .line 53
    .line 54
    invoke-static {v9, v6}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    add-int/2addr v1, v7

    .line 59
    int-to-char v1, v1

    .line 60
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 61
    .line 62
    .line 63
    move-result-wide v6

    .line 64
    const-wide/16 v9, 0x0

    .line 65
    .line 66
    cmp-long v2, v6, v9

    .line 67
    .line 68
    rsub-int/lit8 v2, v2, 0x26

    .line 69
    .line 70
    invoke-static {p2, v1, v2}, Lcom/appsflyer/internal/AFa1hSDK;->getRevenue(ICI)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    check-cast p2, Ljava/lang/Class;

    .line 75
    .line 76
    filled-new-array {v4, v3}, [Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-virtual {p2, v5, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    :goto_0
    check-cast p2, Ljava/lang/reflect/Method;

    .line 88
    .line 89
    invoke-virtual {p2, v8, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    check-cast p0, [B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 94
    .line 95
    :try_start_1
    throw v8

    .line 96
    :catchall_0
    move-exception v0

    .line 97
    move-object p0, v0

    .line 98
    move-object v3, p0

    .line 99
    goto/16 :goto_2

    .line 100
    .line 101
    :catchall_1
    move-exception v0

    .line 102
    move-object p0, v0

    .line 103
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    if-eqz p1, :cond_1

    .line 108
    .line 109
    throw p1

    .line 110
    :cond_1
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 111
    :cond_2
    :try_start_2
    new-array v1, v2, [Ljava/lang/Object;

    .line 112
    .line 113
    aput-object p2, v1, v7

    .line 114
    .line 115
    aput-object p1, v1, v10

    .line 116
    .line 117
    sget-object p1, Lcom/appsflyer/internal/AFa1hSDK;->d:Ljava/util/Map;

    .line 118
    .line 119
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    if-eqz p2, :cond_3

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_3
    invoke-static {v9, v6}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;C)I

    .line 127
    .line 128
    .line 129
    move-result p2

    .line 130
    rsub-int p2, p2, 0xc5

    .line 131
    .line 132
    invoke-static {}, Landroid/view/ViewConfiguration;->getEdgeSlop()I

    .line 133
    .line 134
    .line 135
    move-result v2

    .line 136
    shr-int/lit8 v2, v2, 0x10

    .line 137
    .line 138
    int-to-char v2, v2

    .line 139
    invoke-static {v9, v9}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    .line 140
    .line 141
    .line 142
    move-result v6

    .line 143
    rsub-int/lit8 v6, v6, 0x25

    .line 144
    .line 145
    invoke-static {p2, v2, v6}, Lcom/appsflyer/internal/AFa1hSDK;->getRevenue(ICI)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object p2

    .line 149
    check-cast p2, Ljava/lang/Class;

    .line 150
    .line 151
    filled-new-array {v4, v3}, [Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    invoke-virtual {p2, v5, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 156
    .line 157
    .line 158
    move-result-object p2

    .line 159
    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    :goto_1
    check-cast p2, Ljava/lang/reflect/Method;

    .line 163
    .line 164
    invoke-virtual {p2, v8, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    move-object v2, p1

    .line 169
    check-cast v2, [B
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 170
    .line 171
    iget-object p1, p0, Lcom/appsflyer/internal/AFd1nSDK;->component1:Lcom/appsflyer/internal/AFj1cSDK;

    .line 172
    .line 173
    iget-object p2, p1, Lcom/appsflyer/internal/AFj1cSDK;->getRevenue:Lcom/appsflyer/internal/AFk1zSDK;

    .line 174
    .line 175
    const-string v0, "https://%svalidate-and-log.%s/api/v4.0/android/one_time_purchase/validateAndLog?app_id="

    .line 176
    .line 177
    invoke-interface {p2, v0}, Lcom/appsflyer/internal/AFk1zSDK;->getMediationNetwork(Ljava/lang/String;)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object p2

    .line 181
    invoke-virtual {p1, p2}, Lcom/appsflyer/internal/AFj1cSDK;->getMediationNetwork(Ljava/lang/String;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    new-instance v0, Lcom/appsflyer/internal/AFd1bSDK;

    .line 186
    .line 187
    sget-object v4, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 188
    .line 189
    const/4 v5, 0x1

    .line 190
    const-string v3, "POST"

    .line 191
    .line 192
    invoke-direct/range {v0 .. v5}, Lcom/appsflyer/internal/AFd1bSDK;-><init>(Ljava/lang/String;[BLjava/lang/String;Ljava/util/Map;Z)V

    .line 193
    .line 194
    .line 195
    new-instance p1, Lcom/appsflyer/internal/AFd1dSDK;

    .line 196
    .line 197
    invoke-direct {p1}, Lcom/appsflyer/internal/AFd1dSDK;-><init>()V

    .line 198
    .line 199
    .line 200
    invoke-direct {p0, v0, p1}, Lcom/appsflyer/internal/AFd1nSDK;->getRevenue(Lcom/appsflyer/internal/AFd1bSDK;Lcom/appsflyer/internal/AFe1zSDK;)Lcom/appsflyer/internal/AFd1hSDK;

    .line 201
    .line 202
    .line 203
    move-result-object p0

    .line 204
    sget p1, Lcom/appsflyer/internal/AFd1nSDK;->hashCode:I

    .line 205
    .line 206
    add-int/lit8 p1, p1, 0x35

    .line 207
    .line 208
    rem-int/lit16 p1, p1, 0x80

    .line 209
    .line 210
    sput p1, Lcom/appsflyer/internal/AFd1nSDK;->copydefault:I

    .line 211
    .line 212
    return-object p0

    .line 213
    :catchall_2
    move-exception v0

    .line 214
    move-object p0, v0

    .line 215
    :try_start_3
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    if-eqz p1, :cond_4

    .line 220
    .line 221
    throw p1

    .line 222
    :cond_4
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 223
    :goto_2
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 224
    .line 225
    sget-object v1, Lcom/appsflyer/internal/AFg1cSDK;->force:Lcom/appsflyer/internal/AFg1cSDK;

    .line 226
    .line 227
    const/4 v4, 0x0

    .line 228
    const/4 v5, 0x0

    .line 229
    const-string v2, "AFFinalizer: reflection init failed."

    .line 230
    .line 231
    invoke-virtual/range {v0 .. v5}, Lcom/appsflyer/internal/AFh1ySDK;->e(Lcom/appsflyer/internal/AFg1cSDK;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    .line 232
    .line 233
    .line 234
    return-object v8
.end method

.method public final getRevenue(Lcom/appsflyer/internal/AFh1gSDK;)Lcom/appsflyer/internal/AFd1hSDK;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/appsflyer/internal/AFh1gSDK;",
            ")",
            "Lcom/appsflyer/internal/AFd1hSDK<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 131
    invoke-virtual {p1}, Lcom/appsflyer/internal/AFh1mSDK;->getMonetizationNetwork()[B

    move-result-object v2

    .line 132
    new-instance v0, Lcom/appsflyer/internal/AFd1bSDK;

    .line 133
    iget-object v1, p1, Lcom/appsflyer/internal/AFh1mSDK;->component2:Ljava/lang/String;

    .line 134
    iget-object v4, p1, Lcom/appsflyer/internal/AFh1mSDK;->getMediationNetwork:Ljava/util/Map;

    const/4 v5, 0x1

    .line 135
    const-string v3, "POST"

    invoke-direct/range {v0 .. v5}, Lcom/appsflyer/internal/AFd1bSDK;-><init>(Ljava/lang/String;[BLjava/lang/String;Ljava/util/Map;Z)V

    .line 136
    new-instance p1, Lcom/appsflyer/internal/AFd1dSDK;

    invoke-direct {p1}, Lcom/appsflyer/internal/AFd1dSDK;-><init>()V

    invoke-direct {p0, v0, p1}, Lcom/appsflyer/internal/AFd1nSDK;->getRevenue(Lcom/appsflyer/internal/AFd1bSDK;Lcom/appsflyer/internal/AFe1zSDK;)Lcom/appsflyer/internal/AFd1hSDK;

    move-result-object p0

    sget p1, Lcom/appsflyer/internal/AFd1nSDK;->hashCode:I

    add-int/lit8 p1, p1, 0x23

    rem-int/lit16 p1, p1, 0x80

    sput p1, Lcom/appsflyer/internal/AFd1nSDK;->copydefault:I

    return-object p0
.end method

.method public final getRevenue(ZZLjava/lang/String;I)Lcom/appsflyer/internal/AFd1hSDK;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Ljava/lang/String;",
            "I)",
            "Lcom/appsflyer/internal/AFd1hSDK<",
            "Lcom/appsflyer/internal/AFi1vSDK;",
            ">;"
        }
    .end annotation

    .line 140
    iget-object p4, p0, Lcom/appsflyer/internal/AFd1nSDK;->component4:Lcom/appsflyer/internal/AFe1vSDK;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz p1, :cond_0

    .line 141
    sget-object p1, Lcom/appsflyer/internal/AFe1vSDK;->getCurrencyIso4217Code:Ljava/lang/String;

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/appsflyer/internal/AFe1vSDK;->getMonetizationNetwork:Ljava/lang/String;

    .line 142
    :goto_0
    const-string v0, ""

    if-eqz p2, :cond_1

    .line 143
    sget p2, Lcom/appsflyer/internal/AFd1nSDK;->hashCode:I

    add-int/lit8 p2, p2, 0x11

    rem-int/lit16 p2, p2, 0x80

    sput p2, Lcom/appsflyer/internal/AFd1nSDK;->copydefault:I

    .line 144
    const-string p2, "stg"

    goto :goto_1

    :cond_1
    move-object p2, v0

    .line 145
    :goto_1
    invoke-static {}, Lcom/appsflyer/internal/AFe1vSDK;->getMediationNetwork()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 146
    sget v0, Lcom/appsflyer/internal/AFd1nSDK;->hashCode:I

    add-int/lit8 v0, v0, 0x5d

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1nSDK;->copydefault:I

    .line 147
    iget-object v0, p4, Lcom/appsflyer/internal/AFe1vSDK;->AFAdRevenueData:Lp51;

    invoke-interface {v0}, Lp51;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 148
    :cond_2
    invoke-virtual {p4}, Lcom/appsflyer/internal/AFe1vSDK;->AFAdRevenueData()Ljava/lang/String;

    move-result-object p4

    .line 149
    filled-new-array {v0, p2, p4, p3}, [Ljava/lang/Object;

    move-result-object p2

    const/4 p3, 0x4

    .line 150
    invoke-static {p2, p3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 151
    new-instance p2, Lcom/appsflyer/internal/AFd1bSDK;

    const-string p3, "GET"

    invoke-direct {p2, p1, p3}, Lcom/appsflyer/internal/AFd1bSDK;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 p1, 0x5dc

    .line 152
    iput p1, p2, Lcom/appsflyer/internal/AFd1bSDK;->component4:I

    .line 153
    new-instance p1, Lcom/appsflyer/internal/AFd1cSDK;

    invoke-direct {p1}, Lcom/appsflyer/internal/AFd1cSDK;-><init>()V

    invoke-direct {p0, p2, p1}, Lcom/appsflyer/internal/AFd1nSDK;->getRevenue(Lcom/appsflyer/internal/AFd1bSDK;Lcom/appsflyer/internal/AFe1zSDK;)Lcom/appsflyer/internal/AFd1hSDK;

    move-result-object p0

    return-object p0
.end method
