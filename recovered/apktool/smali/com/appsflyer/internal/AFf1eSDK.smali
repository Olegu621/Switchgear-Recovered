.class public final Lcom/appsflyer/internal/AFf1eSDK;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field private static $10:I = 0x0

.field private static $11:I = 0x1

.field private static areAllFieldsValid:C = '\u712c'

.field private static component4:C = '\u9b2b'

.field private static copydefault:C = '\u0f34'

.field private static equals:I = 0x0

.field private static hashCode:I = 0x1

.field private static toString:C = '\uc600'


# instance fields
.field private AFAdRevenueData:Z

.field private volatile component1:Ljava/lang/String;

.field private volatile component2:Ljava/lang/String;

.field private volatile component3:Z

.field private final getCurrencyIso4217Code:Lcom/appsflyer/internal/AFf1dSDK;

.field getMediationNetwork:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final getMonetizationNetwork:Lcom/appsflyer/internal/AFc1hSDK;

.field private getRevenue:J


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFc1hSDK;Lcom/appsflyer/internal/AFf1dSDK;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/appsflyer/internal/AFf1eSDK;->AFAdRevenueData:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lcom/appsflyer/internal/AFf1eSDK;->component3:Z

    .line 8
    .line 9
    iput-object p1, p0, Lcom/appsflyer/internal/AFf1eSDK;->getMonetizationNetwork:Lcom/appsflyer/internal/AFc1hSDK;

    .line 10
    .line 11
    iput-object p2, p0, Lcom/appsflyer/internal/AFf1eSDK;->getCurrencyIso4217Code:Lcom/appsflyer/internal/AFf1dSDK;

    .line 12
    .line 13
    return-void
.end method

.method private static a(Ljava/lang/String;I[Ljava/lang/Object;)V
    .locals 17

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->toCharArray()[C

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move-object/from16 v0, p0

    .line 9
    .line 10
    :goto_0
    check-cast v0, [C

    .line 11
    .line 12
    new-instance v1, Lcom/appsflyer/internal/AFk1qSDK;

    .line 13
    .line 14
    invoke-direct {v1}, Lcom/appsflyer/internal/AFk1qSDK;-><init>()V

    .line 15
    .line 16
    .line 17
    array-length v2, v0

    .line 18
    new-array v2, v2, [C

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    iput v3, v1, Lcom/appsflyer/internal/AFk1qSDK;->getRevenue:I

    .line 22
    .line 23
    const/4 v4, 0x2

    .line 24
    new-array v5, v4, [C

    .line 25
    .line 26
    :goto_1
    iget v6, v1, Lcom/appsflyer/internal/AFk1qSDK;->getRevenue:I

    .line 27
    .line 28
    array-length v7, v0

    .line 29
    if-ge v6, v7, :cond_2

    .line 30
    .line 31
    sget v7, Lcom/appsflyer/internal/AFf1eSDK;->$11:I

    .line 32
    .line 33
    add-int/lit8 v7, v7, 0x27

    .line 34
    .line 35
    rem-int/lit16 v7, v7, 0x80

    .line 36
    .line 37
    sput v7, Lcom/appsflyer/internal/AFf1eSDK;->$10:I

    .line 38
    .line 39
    aget-char v7, v0, v6

    .line 40
    .line 41
    aput-char v7, v5, v3

    .line 42
    .line 43
    add-int/lit8 v6, v6, 0x1

    .line 44
    .line 45
    aget-char v6, v0, v6

    .line 46
    .line 47
    const/4 v7, 0x1

    .line 48
    aput-char v6, v5, v7

    .line 49
    .line 50
    const v6, 0xe370

    .line 51
    .line 52
    .line 53
    move v8, v3

    .line 54
    :goto_2
    const/16 v9, 0x10

    .line 55
    .line 56
    if-ge v8, v9, :cond_1

    .line 57
    .line 58
    sget v9, Lcom/appsflyer/internal/AFf1eSDK;->$10:I

    .line 59
    .line 60
    add-int/lit8 v9, v9, 0x5b

    .line 61
    .line 62
    rem-int/lit16 v9, v9, 0x80

    .line 63
    .line 64
    sput v9, Lcom/appsflyer/internal/AFf1eSDK;->$11:I

    .line 65
    .line 66
    aget-char v9, v5, v7

    .line 67
    .line 68
    aget-char v10, v5, v3

    .line 69
    .line 70
    add-int v11, v10, v6

    .line 71
    .line 72
    shl-int/lit8 v12, v10, 0x4

    .line 73
    .line 74
    sget-char v13, Lcom/appsflyer/internal/AFf1eSDK;->copydefault:C

    .line 75
    .line 76
    int-to-long v13, v13

    .line 77
    const-wide v15, -0x10a3f40b27dab58cL    # -2.65765482159287E228

    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    xor-long/2addr v13, v15

    .line 83
    long-to-int v13, v13

    .line 84
    int-to-char v13, v13

    .line 85
    add-int/2addr v12, v13

    .line 86
    xor-int/2addr v11, v12

    .line 87
    ushr-int/lit8 v12, v10, 0x5

    .line 88
    .line 89
    sget-char v13, Lcom/appsflyer/internal/AFf1eSDK;->toString:C

    .line 90
    .line 91
    int-to-long v13, v13

    .line 92
    xor-long/2addr v13, v15

    .line 93
    long-to-int v13, v13

    .line 94
    int-to-char v13, v13

    .line 95
    add-int/2addr v12, v13

    .line 96
    xor-int/2addr v11, v12

    .line 97
    sub-int/2addr v9, v11

    .line 98
    int-to-char v9, v9

    .line 99
    aput-char v9, v5, v7

    .line 100
    .line 101
    add-int v11, v9, v6

    .line 102
    .line 103
    shl-int/lit8 v12, v9, 0x4

    .line 104
    .line 105
    sget-char v13, Lcom/appsflyer/internal/AFf1eSDK;->component4:C

    .line 106
    .line 107
    int-to-long v13, v13

    .line 108
    xor-long/2addr v13, v15

    .line 109
    long-to-int v13, v13

    .line 110
    int-to-char v13, v13

    .line 111
    add-int/2addr v12, v13

    .line 112
    xor-int/2addr v11, v12

    .line 113
    ushr-int/lit8 v9, v9, 0x5

    .line 114
    .line 115
    sget-char v12, Lcom/appsflyer/internal/AFf1eSDK;->areAllFieldsValid:C

    .line 116
    .line 117
    int-to-long v12, v12

    .line 118
    xor-long/2addr v12, v15

    .line 119
    long-to-int v12, v12

    .line 120
    int-to-char v12, v12

    .line 121
    add-int/2addr v9, v12

    .line 122
    xor-int/2addr v9, v11

    .line 123
    sub-int/2addr v10, v9

    .line 124
    int-to-char v9, v10

    .line 125
    aput-char v9, v5, v3

    .line 126
    .line 127
    const v9, 0x9e37

    .line 128
    .line 129
    .line 130
    sub-int/2addr v6, v9

    .line 131
    add-int/lit8 v8, v8, 0x1

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_1
    iget v6, v1, Lcom/appsflyer/internal/AFk1qSDK;->getRevenue:I

    .line 135
    .line 136
    aget-char v8, v5, v3

    .line 137
    .line 138
    aput-char v8, v2, v6

    .line 139
    .line 140
    add-int/lit8 v8, v6, 0x1

    .line 141
    .line 142
    aget-char v7, v5, v7

    .line 143
    .line 144
    aput-char v7, v2, v8

    .line 145
    .line 146
    add-int/2addr v6, v4

    .line 147
    iput v6, v1, Lcom/appsflyer/internal/AFk1qSDK;->getRevenue:I

    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_2
    new-instance v0, Ljava/lang/String;

    .line 151
    .line 152
    move/from16 v1, p1

    .line 153
    .line 154
    invoke-direct {v0, v2, v3, v1}, Ljava/lang/String;-><init>([CII)V

    .line 155
    .line 156
    .line 157
    aput-object v0, p2, v3

    .line 158
    .line 159
    return-void
.end method

.method private component1()Z
    .locals 2

    .line 1
    sget v0, Lcom/appsflyer/internal/AFf1eSDK;->hashCode:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x53

    .line 4
    .line 5
    rem-int/lit16 v1, v1, 0x80

    .line 6
    .line 7
    sput v1, Lcom/appsflyer/internal/AFf1eSDK;->equals:I

    .line 8
    .line 9
    iget-object p0, p0, Lcom/appsflyer/internal/AFf1eSDK;->getMediationNetwork:Ljava/util/Map;

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    add-int/lit8 v0, v0, 0x45

    .line 14
    .line 15
    rem-int/lit16 v0, v0, 0x80

    .line 16
    .line 17
    sput v0, Lcom/appsflyer/internal/AFf1eSDK;->equals:I

    .line 18
    .line 19
    invoke-interface {p0}, Ljava/util/Map;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-nez p0, :cond_0

    .line 24
    .line 25
    sget p0, Lcom/appsflyer/internal/AFf1eSDK;->equals:I

    .line 26
    .line 27
    add-int/lit8 p0, p0, 0x2f

    .line 28
    .line 29
    rem-int/lit16 p0, p0, 0x80

    .line 30
    .line 31
    sput p0, Lcom/appsflyer/internal/AFf1eSDK;->hashCode:I

    .line 32
    .line 33
    const/4 p0, 0x1

    .line 34
    return p0

    .line 35
    :cond_0
    const/4 p0, 0x0

    .line 36
    return p0
.end method

.method private component2()J
    .locals 3

    .line 1
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    const v1, -0x1ee3dda2

    .line 10
    .line 11
    .line 12
    const v2, 0x1ee3dda2

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1, v2, p0}, Lcom/appsflyer/internal/AFf1eSDK;->getCurrencyIso4217Code([Ljava/lang/Object;III)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Ljava/lang/Long;

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    return-wide v0
.end method

.method private getCurrencyIso4217Code(Lcom/appsflyer/internal/AFc1oSDK;)J
    .locals 2

    .line 168
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p0

    const v0, 0x4c218bdd    # 4.2348404E7f

    const v1, -0x4c218bdc

    invoke-static {p1, v0, v1, p0}, Lcom/appsflyer/internal/AFf1eSDK;->getCurrencyIso4217Code([Ljava/lang/Object;III)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Long;

    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    move-result-wide p0

    return-wide p0
.end method

.method public static synthetic getCurrencyIso4217Code([Ljava/lang/Object;III)Ljava/lang/Object;
    .locals 5

    .line 1
    mul-int/lit16 v0, p1, -0x151

    .line 2
    .line 3
    mul-int/lit16 v1, p2, 0x153

    .line 4
    .line 5
    add-int/2addr v1, v0

    .line 6
    not-int v0, p1

    .line 7
    not-int v2, p3

    .line 8
    or-int/2addr v2, v0

    .line 9
    not-int v2, v2

    .line 10
    not-int v3, p2

    .line 11
    or-int/2addr v3, p1

    .line 12
    not-int v3, v3

    .line 13
    or-int/2addr v3, v2

    .line 14
    or-int v4, p1, p3

    .line 15
    .line 16
    not-int v4, v4

    .line 17
    or-int/2addr v3, v4

    .line 18
    mul-int/lit16 v3, v3, -0x152

    .line 19
    .line 20
    add-int/2addr v3, v1

    .line 21
    or-int/2addr v0, p2

    .line 22
    not-int v0, v0

    .line 23
    mul-int/lit16 v0, v0, 0x152

    .line 24
    .line 25
    add-int/2addr v0, v3

    .line 26
    or-int/2addr p1, p2

    .line 27
    or-int/2addr p1, p3

    .line 28
    not-int p1, p1

    .line 29
    or-int/2addr p1, v2

    .line 30
    mul-int/lit16 p1, p1, 0x152

    .line 31
    .line 32
    add-int/2addr p1, v0

    .line 33
    const/4 p2, 0x0

    .line 34
    const/4 p3, 0x1

    .line 35
    if-eq p1, p3, :cond_1

    .line 36
    .line 37
    const/4 v0, 0x2

    .line 38
    if-eq p1, v0, :cond_0

    .line 39
    .line 40
    aget-object p0, p0, p2

    .line 41
    .line 42
    check-cast p0, Lcom/appsflyer/internal/AFf1eSDK;

    .line 43
    .line 44
    sget p1, Lcom/appsflyer/internal/AFf1eSDK;->hashCode:I

    .line 45
    .line 46
    add-int/lit8 p2, p1, 0x75

    .line 47
    .line 48
    rem-int/lit16 p2, p2, 0x80

    .line 49
    .line 50
    sput p2, Lcom/appsflyer/internal/AFf1eSDK;->equals:I

    .line 51
    .line 52
    iget-wide p2, p0, Lcom/appsflyer/internal/AFf1eSDK;->getRevenue:J

    .line 53
    .line 54
    add-int/lit8 p1, p1, 0x33

    .line 55
    .line 56
    rem-int/lit16 p1, p1, 0x80

    .line 57
    .line 58
    sput p1, Lcom/appsflyer/internal/AFf1eSDK;->equals:I

    .line 59
    .line 60
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0

    .line 65
    :cond_0
    aget-object p1, p0, p2

    .line 66
    .line 67
    check-cast p1, Lcom/appsflyer/internal/AFf1eSDK;

    .line 68
    .line 69
    aget-object p0, p0, p3

    .line 70
    .line 71
    check-cast p0, Ljava/lang/String;

    .line 72
    .line 73
    sget p2, Lcom/appsflyer/internal/AFf1eSDK;->hashCode:I

    .line 74
    .line 75
    add-int/lit8 p2, p2, 0x5b

    .line 76
    .line 77
    rem-int/lit16 p2, p2, 0x80

    .line 78
    .line 79
    sput p2, Lcom/appsflyer/internal/AFf1eSDK;->equals:I

    .line 80
    .line 81
    iput-object p0, p1, Lcom/appsflyer/internal/AFf1eSDK;->component2:Ljava/lang/String;

    .line 82
    .line 83
    sget p0, Lcom/appsflyer/internal/AFf1eSDK;->equals:I

    .line 84
    .line 85
    add-int/lit8 p0, p0, 0x35

    .line 86
    .line 87
    rem-int/lit16 p0, p0, 0x80

    .line 88
    .line 89
    sput p0, Lcom/appsflyer/internal/AFf1eSDK;->hashCode:I

    .line 90
    .line 91
    const/4 p0, 0x0

    .line 92
    return-object p0

    .line 93
    :cond_1
    aget-object p1, p0, p2

    .line 94
    .line 95
    check-cast p1, Lcom/appsflyer/internal/AFf1eSDK;

    .line 96
    .line 97
    aget-object p0, p0, p3

    .line 98
    .line 99
    check-cast p0, Lcom/appsflyer/internal/AFc1oSDK;

    .line 100
    .line 101
    new-instance p2, Ljava/lang/StringBuilder;

    .line 102
    .line 103
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 104
    .line 105
    .line 106
    iget-object p0, p0, Lcom/appsflyer/internal/AFc1oSDK;->getMediationNetwork:Lcom/appsflyer/internal/AFc1qSDK;

    .line 107
    .line 108
    invoke-static {p0}, Lcom/appsflyer/internal/AFb1kSDK;->getCurrencyIso4217Code(Lcom/appsflyer/internal/AFc1qSDK;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    invoke-static {p1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    const p3, -0x1ee3dda2

    .line 124
    .line 125
    .line 126
    const v0, 0x1ee3dda2

    .line 127
    .line 128
    .line 129
    invoke-static {p0, p3, v0, p1}, Lcom/appsflyer/internal/AFf1eSDK;->getCurrencyIso4217Code([Ljava/lang/Object;III)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    check-cast p0, Ljava/lang/Long;

    .line 134
    .line 135
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 136
    .line 137
    .line 138
    move-result-wide p0

    .line 139
    invoke-virtual {p2, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    invoke-static {p0}, Lcom/appsflyer/internal/AFj1dSDK;->AFAdRevenueData(Ljava/lang/String;)[B

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    invoke-static {p0}, Lcom/appsflyer/internal/AFj1dSDK;->getRevenue([B)J

    .line 151
    .line 152
    .line 153
    move-result-wide p0

    .line 154
    sget p2, Lcom/appsflyer/internal/AFf1eSDK;->hashCode:I

    .line 155
    .line 156
    add-int/lit8 p2, p2, 0x23

    .line 157
    .line 158
    rem-int/lit16 p2, p2, 0x80

    .line 159
    .line 160
    sput p2, Lcom/appsflyer/internal/AFf1eSDK;->equals:I

    .line 161
    .line 162
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    return-object p0
.end method

.method public static getMonetizationNetwork(Lcom/appsflyer/internal/AFh1mSDK;[B)V
    .locals 7

    .line 241
    :try_start_0
    new-instance v0, Lcom/appsflyer/internal/AFb1sSDK;

    invoke-direct {v0, p0, p1}, Lcom/appsflyer/internal/AFb1sSDK;-><init>(Lcom/appsflyer/internal/AFh1mSDK;[B)V

    invoke-virtual {v0}, Lcom/appsflyer/internal/AFb1sSDK;->afInfoLog()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 242
    sget p0, Lcom/appsflyer/internal/AFf1eSDK;->equals:I

    add-int/lit8 p0, p0, 0x69

    rem-int/lit16 p0, p0, 0x80

    sput p0, Lcom/appsflyer/internal/AFf1eSDK;->hashCode:I

    return-void

    :catch_0
    move-exception v0

    move-object p0, v0

    move-object v3, p0

    .line 243
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/internal/AFg1cSDK;->afInfoLog:Lcom/appsflyer/internal/AFg1cSDK;

    const/4 v5, 0x0

    const/4 v6, 0x1

    const-string v2, "native: reflection init failed"

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v6}, Lcom/appsflyer/internal/AFh1ySDK;->e(Lcom/appsflyer/internal/AFg1cSDK;Ljava/lang/String;Ljava/lang/Throwable;ZZZ)V

    return-void
.end method

.method private static getRevenue(Landroid/content/Context;)Z
    .locals 3

    .line 185
    sget v0, Lcom/appsflyer/internal/AFf1eSDK;->hashCode:I

    add-int/lit8 v0, v0, 0x3f

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFf1eSDK;->equals:I

    .line 186
    invoke-static {}, Lcom/appsflyer/AppsFlyerProperties;->getInstance()Lcom/appsflyer/AppsFlyerProperties;

    move-result-object v0

    .line 187
    const-string v1, "collectAndroidIdForceByUser"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/appsflyer/AppsFlyerProperties;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_2

    .line 188
    sget v0, Lcom/appsflyer/internal/AFf1eSDK;->hashCode:I

    add-int/lit8 v0, v0, 0x3

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFf1eSDK;->equals:I

    .line 189
    invoke-static {}, Lcom/appsflyer/AppsFlyerProperties;->getInstance()Lcom/appsflyer/AppsFlyerProperties;

    move-result-object v0

    const-string v1, "collectIMEIForceByUser"

    .line 190
    invoke-virtual {v0, v1, v2}, Lcom/appsflyer/AppsFlyerProperties;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 191
    :cond_0
    sget v0, Lcom/appsflyer/internal/AFf1eSDK;->hashCode:I

    add-int/lit8 v0, v0, 0x7b

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFf1eSDK;->equals:I

    invoke-static {}, Lcom/appsflyer/internal/AFa1ySDK;->getRevenue()Lcom/appsflyer/internal/AFa1ySDK;

    invoke-static {p0}, Lcom/appsflyer/internal/AFa1ySDK;->getRevenue(Landroid/content/Context;)Z

    move-result p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    sget p0, Lcom/appsflyer/internal/AFf1eSDK;->equals:I

    add-int/lit8 p0, p0, 0x4b

    rem-int/lit16 p0, p0, 0x80

    sput p0, Lcom/appsflyer/internal/AFf1eSDK;->hashCode:I

    return v2

    :cond_2
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static getRevenue(Lcom/appsflyer/internal/AFh1mSDK;Lcom/appsflyer/internal/AFc1oSDK;)Z
    .locals 7

    .line 1
    sget v0, Lcom/appsflyer/internal/AFf1eSDK;->hashCode:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x73

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, Lcom/appsflyer/internal/AFf1eSDK;->equals:I

    .line 8
    .line 9
    iget-object v0, p1, Lcom/appsflyer/internal/AFc1oSDK;->AFAdRevenueData:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v0}, Lcom/appsflyer/internal/AFk1wSDK;->getMonetizationNetwork(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x1

    .line 16
    const/4 v2, 0x0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    iget-object p1, p1, Lcom/appsflyer/internal/AFc1oSDK;->AFAdRevenueData:Ljava/lang/String;

    .line 20
    .line 21
    sget v0, Lcom/appsflyer/internal/AFf1eSDK;->equals:I

    .line 22
    .line 23
    add-int/2addr v0, v1

    .line 24
    rem-int/lit16 v0, v0, 0x80

    .line 25
    .line 26
    sput v0, Lcom/appsflyer/internal/AFf1eSDK;->hashCode:I

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const-string v0, "com.appsflyer.security.uuid"

    .line 30
    .line 31
    invoke-virtual {p1, v0}, Lcom/appsflyer/internal/AFc1oSDK;->getCurrencyIso4217Code(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {v0}, Lcom/appsflyer/internal/AFk1wSDK;->getMonetizationNetwork(Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_1

    .line 40
    .line 41
    const/4 p1, 0x0

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    const/16 v3, 0x8

    .line 44
    .line 45
    invoke-virtual {v0, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iput-object v0, p1, Lcom/appsflyer/internal/AFc1oSDK;->AFAdRevenueData:Ljava/lang/String;

    .line 50
    .line 51
    move-object p1, v0

    .line 52
    :goto_0
    if-eqz p1, :cond_4

    .line 53
    .line 54
    sget v0, Lcom/appsflyer/internal/AFf1eSDK;->equals:I

    .line 55
    .line 56
    add-int/lit8 v0, v0, 0x53

    .line 57
    .line 58
    rem-int/lit16 v0, v0, 0x80

    .line 59
    .line 60
    sput v0, Lcom/appsflyer/internal/AFf1eSDK;->hashCode:I

    .line 61
    .line 62
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_2

    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_2
    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFh1mSDK;->AFAdRevenueData:Ljava/util/Map;

    .line 70
    .line 71
    const-string v3, "\u98b8\u254a\u040f\u8aa2\u46af\u0fb8\uf0ec\u28d1\u7f1e\u8141\u7fa5\u71d3"

    .line 72
    .line 73
    const/16 v4, 0x30

    .line 74
    .line 75
    invoke-static {v4}, Landroid/text/AndroidCharacter;->getMirror(C)C

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    rsub-int/lit8 v4, v4, 0x3c

    .line 80
    .line 81
    new-array v5, v1, [Ljava/lang/Object;

    .line 82
    .line 83
    invoke-static {v3, v4, v5}, Lcom/appsflyer/internal/AFf1eSDK;->a(Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    aget-object v3, v5, v2

    .line 87
    .line 88
    check-cast v3, Ljava/lang/String;

    .line 89
    .line 90
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 103
    .line 104
    .line 105
    move-result-wide v3

    .line 106
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    const-wide/16 v5, 0x5e

    .line 111
    .line 112
    rem-long/2addr v3, v5

    .line 113
    long-to-int v0, v3

    .line 114
    add-int/lit8 v0, v0, 0x21

    .line 115
    .line 116
    move v3, v2

    .line 117
    :goto_1
    array-length v4, p1

    .line 118
    if-ge v3, v4, :cond_3

    .line 119
    .line 120
    aget-char v4, p1, v3

    .line 121
    .line 122
    xor-int/2addr v4, v0

    .line 123
    int-to-char v4, v4

    .line 124
    aput-char v4, p1, v3

    .line 125
    .line 126
    add-int/lit8 v3, v3, 0x1

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :catch_0
    move-exception p0

    .line 130
    goto :goto_2

    .line 131
    :cond_3
    new-instance v0, Ljava/lang/String;

    .line 132
    .line 133
    invoke-direct {v0, p1}, Ljava/lang/String;-><init>([C)V

    .line 134
    .line 135
    .line 136
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    invoke-virtual {v0, p1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    const/4 v0, 0x2

    .line 145
    invoke-static {p1, v0}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    const-string v0, "af-sdk-sbid"

    .line 150
    .line 151
    iget-object p0, p0, Lcom/appsflyer/internal/AFh1mSDK;->getMediationNetwork:Ljava/util/Map;

    .line 152
    .line 153
    invoke-interface {p0, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 154
    .line 155
    .line 156
    return v1

    .line 157
    :goto_2
    sget-object p1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 158
    .line 159
    sget-object v0, Lcom/appsflyer/internal/AFg1cSDK;->v:Lcom/appsflyer/internal/AFg1cSDK;

    .line 160
    .line 161
    const-string v1, "Exception occurred while generating sbid "

    .line 162
    .line 163
    invoke-virtual {p1, v0, v1, p0}, Lcom/appsflyer/internal/AFh1ySDK;->e(Lcom/appsflyer/internal/AFg1cSDK;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 164
    .line 165
    .line 166
    :cond_4
    :goto_3
    return v2
.end method


# virtual methods
.method public final AFAdRevenueData()Ljava/lang/String;
    .locals 3

    .line 1
    sget v0, Lcom/appsflyer/internal/AFf1eSDK;->equals:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x59

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, Lcom/appsflyer/internal/AFf1eSDK;->hashCode:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    iget-object p0, p0, Lcom/appsflyer/internal/AFf1eSDK;->component2:Ljava/lang/String;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    sget v0, Lcom/appsflyer/internal/AFf1eSDK;->equals:I

    .line 17
    .line 18
    add-int/lit8 v0, v0, 0x51

    .line 19
    .line 20
    rem-int/lit16 v2, v0, 0x80

    .line 21
    .line 22
    sput v2, Lcom/appsflyer/internal/AFf1eSDK;->hashCode:I

    .line 23
    .line 24
    rem-int/lit8 v0, v0, 0x2

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_0
    throw v1

    .line 30
    :cond_1
    throw v1
.end method

.method public final AFAdRevenueData(Ljava/lang/String;)V
    .locals 2

    .line 31
    sget v0, Lcom/appsflyer/internal/AFf1eSDK;->equals:I

    add-int/lit8 v0, v0, 0x11

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFf1eSDK;->hashCode:I

    rem-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_0

    .line 32
    iput-object p1, p0, Lcom/appsflyer/internal/AFf1eSDK;->component1:Ljava/lang/String;

    const/4 p0, 0x0

    .line 33
    div-int/2addr p0, p0

    return-void

    .line 34
    :cond_0
    iput-object p1, p0, Lcom/appsflyer/internal/AFf1eSDK;->component1:Ljava/lang/String;

    return-void
.end method

.method public final component4()V
    .locals 9

    .line 1
    sget v0, Lcom/appsflyer/internal/AFf1eSDK;->equals:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x37

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, Lcom/appsflyer/internal/AFf1eSDK;->hashCode:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const v1, 0x1ee3dda2

    .line 12
    .line 13
    .line 14
    const v2, -0x1ee3dda2

    .line 15
    .line 16
    .line 17
    const-string v3, "lvl_timestamp"

    .line 18
    .line 19
    const-string v4, "ttr"

    .line 20
    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 24
    .line 25
    .line 26
    move-result-wide v5

    .line 27
    iget-wide v7, p0, Lcom/appsflyer/internal/AFf1eSDK;->getRevenue:J

    .line 28
    .line 29
    div-long/2addr v5, v7

    .line 30
    iget-object v0, p0, Lcom/appsflyer/internal/AFf1eSDK;->getMediationNetwork:Ljava/util/Map;

    .line 31
    .line 32
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Lcom/appsflyer/internal/AFf1eSDK;->getMediationNetwork:Ljava/util/Map;

    .line 40
    .line 41
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    invoke-static {v4, v2, v1, p0}, Lcom/appsflyer/internal/AFf1eSDK;->getCurrencyIso4217Code([Ljava/lang/Object;III)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    :goto_0
    check-cast p0, Ljava/lang/Long;

    .line 54
    .line 55
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 56
    .line 57
    .line 58
    move-result-wide v1

    .line 59
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-interface {v0, v3, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 68
    .line 69
    .line 70
    move-result-wide v5

    .line 71
    iget-wide v7, p0, Lcom/appsflyer/internal/AFf1eSDK;->getRevenue:J

    .line 72
    .line 73
    sub-long/2addr v5, v7

    .line 74
    iget-object v0, p0, Lcom/appsflyer/internal/AFf1eSDK;->getMediationNetwork:Ljava/util/Map;

    .line 75
    .line 76
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    iget-object v0, p0, Lcom/appsflyer/internal/AFf1eSDK;->getMediationNetwork:Ljava/util/Map;

    .line 84
    .line 85
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 90
    .line 91
    .line 92
    move-result p0

    .line 93
    invoke-static {v4, v2, v1, p0}, Lcom/appsflyer/internal/AFf1eSDK;->getCurrencyIso4217Code([Ljava/lang/Object;III)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    goto :goto_0
.end method

.method public final getCurrencyIso4217Code()Z
    .locals 2

    .line 167
    sget v0, Lcom/appsflyer/internal/AFf1eSDK;->hashCode:I

    add-int/lit8 v0, v0, 0x27

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFf1eSDK;->equals:I

    rem-int/lit8 v0, v0, 0x2

    iget-boolean p0, p0, Lcom/appsflyer/internal/AFf1eSDK;->component3:Z

    if-nez v0, :cond_0

    sget v0, Lcom/appsflyer/internal/AFf1eSDK;->equals:I

    add-int/lit8 v0, v0, 0x27

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFf1eSDK;->hashCode:I

    return p0

    :cond_0
    const/4 p0, 0x0

    throw p0
.end method

.method public final getMediationNetwork()Ljava/lang/String;
    .locals 2

    .line 120
    sget v0, Lcom/appsflyer/internal/AFf1eSDK;->equals:I

    add-int/lit8 v0, v0, 0x33

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFf1eSDK;->hashCode:I

    rem-int/lit8 v0, v0, 0x2

    iget-object p0, p0, Lcom/appsflyer/internal/AFf1eSDK;->component1:Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    throw p0
.end method

.method public final getMediationNetwork(Ljava/util/Map;)Ljava/util/Map;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    const v1, -0x1fbbb2aa

    .line 4
    .line 5
    .line 6
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    :try_start_0
    iget-object p0, p0, Lcom/appsflyer/internal/AFf1eSDK;->getMonetizationNetwork:Lcom/appsflyer/internal/AFc1hSDK;

    .line 11
    .line 12
    iget-object p0, p0, Lcom/appsflyer/internal/AFc1hSDK;->getMonetizationNetwork:Landroid/content/Context;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 13
    .line 14
    const/4 v2, 0x2

    .line 15
    :try_start_1
    new-array v2, v2, [Ljava/lang/Object;

    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    aput-object p0, v2, v3

    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    aput-object p1, v2, p0

    .line 22
    .line 23
    sget-object p1, Lcom/appsflyer/internal/AFa1hSDK;->d:Ljava/util/Map;

    .line 24
    .line 25
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-static {v0}, Landroid/os/Process;->getGidForName(Ljava/lang/String;)I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    add-int/lit8 v3, v3, 0x7e

    .line 37
    .line 38
    invoke-static {v0, p0, p0}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    int-to-char p0, p0

    .line 43
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    shr-int/lit8 v0, v0, 0x16

    .line 48
    .line 49
    rsub-int/lit8 v0, v0, 0x24

    .line 50
    .line 51
    invoke-static {v3, p0, v0}, Lcom/appsflyer/internal/AFa1hSDK;->getRevenue(ICI)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    check-cast p0, Ljava/lang/Class;

    .line 56
    .line 57
    const-class v0, Ljava/util/Map;

    .line 58
    .line 59
    const-class v3, Landroid/content/Context;

    .line 60
    .line 61
    filled-new-array {v0, v3}, [Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {p0, v0}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-interface {p1, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    :goto_0
    check-cast v3, Ljava/lang/reflect/Constructor;

    .line 73
    .line 74
    invoke-virtual {v3, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    check-cast p0, Ljava/util/Map;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 79
    .line 80
    sget p1, Lcom/appsflyer/internal/AFf1eSDK;->equals:I

    .line 81
    .line 82
    add-int/lit8 p1, p1, 0x73

    .line 83
    .line 84
    rem-int/lit16 p1, p1, 0x80

    .line 85
    .line 86
    sput p1, Lcom/appsflyer/internal/AFf1eSDK;->hashCode:I

    .line 87
    .line 88
    return-object p0

    .line 89
    :catchall_0
    move-exception v0

    .line 90
    move-object p0, v0

    .line 91
    :try_start_2
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    if-eqz p1, :cond_1

    .line 96
    .line 97
    throw p1

    .line 98
    :cond_1
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 99
    :catchall_1
    move-exception v0

    .line 100
    move-object p0, v0

    .line 101
    move-object v3, p0

    .line 102
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 103
    .line 104
    sget-object v1, Lcom/appsflyer/internal/AFg1cSDK;->i:Lcom/appsflyer/internal/AFg1cSDK;

    .line 105
    .line 106
    const/4 v5, 0x0

    .line 107
    const/4 v6, 0x1

    .line 108
    const-string v2, "AFCksmV3: reflection init failed"

    .line 109
    .line 110
    const/4 v4, 0x0

    .line 111
    invoke-virtual/range {v0 .. v6}, Lcom/appsflyer/internal/AFh1ySDK;->e(Lcom/appsflyer/internal/AFg1cSDK;Ljava/lang/String;Ljava/lang/Throwable;ZZZ)V

    .line 112
    .line 113
    .line 114
    new-instance p0, Ljava/util/HashMap;

    .line 115
    .line 116
    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    .line 117
    .line 118
    .line 119
    return-object p0
.end method

.method public final getMonetizationNetwork(Lcom/appsflyer/internal/AFc1qSDK;)Ljava/lang/String;
    .locals 7

    .line 1
    sget v0, Lcom/appsflyer/internal/AFf1eSDK;->equals:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x51

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, Lcom/appsflyer/internal/AFf1eSDK;->hashCode:I

    .line 8
    .line 9
    invoke-static {}, Lcom/appsflyer/AppsFlyerProperties;->getInstance()Lcom/appsflyer/AppsFlyerProperties;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "collectIMEI"

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-virtual {v0, v1, v2}, Lcom/appsflyer/AppsFlyerProperties;->getBoolean(Ljava/lang/String;Z)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const-string v1, "imeiCached"

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-interface {p1, v1, v2}, Lcom/appsflyer/internal/AFc1qSDK;->getMonetizationNetwork(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    if-eqz v0, :cond_5

    .line 28
    .line 29
    iget-object v0, p0, Lcom/appsflyer/internal/AFf1eSDK;->component2:Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {v0}, Lcom/appsflyer/internal/AFk1wSDK;->getMonetizationNetwork(Ljava/lang/String;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_5

    .line 36
    .line 37
    iget-object p0, p0, Lcom/appsflyer/internal/AFf1eSDK;->getMonetizationNetwork:Lcom/appsflyer/internal/AFc1hSDK;

    .line 38
    .line 39
    iget-object p0, p0, Lcom/appsflyer/internal/AFc1hSDK;->getMonetizationNetwork:Landroid/content/Context;

    .line 40
    .line 41
    if-eqz p0, :cond_6

    .line 42
    .line 43
    invoke-static {p0}, Lcom/appsflyer/internal/AFf1eSDK;->getRevenue(Landroid/content/Context;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_6

    .line 48
    .line 49
    sget v0, Lcom/appsflyer/internal/AFf1eSDK;->hashCode:I

    .line 50
    .line 51
    add-int/lit8 v0, v0, 0x7b

    .line 52
    .line 53
    rem-int/lit16 v4, v0, 0x80

    .line 54
    .line 55
    sput v4, Lcom/appsflyer/internal/AFf1eSDK;->equals:I

    .line 56
    .line 57
    rem-int/lit8 v0, v0, 0x2

    .line 58
    .line 59
    const-string v4, "getDeviceId"

    .line 60
    .line 61
    const-string v5, "phone"

    .line 62
    .line 63
    const-string v6, "use cached IMEI: "

    .line 64
    .line 65
    if-eqz v0, :cond_0

    .line 66
    .line 67
    :try_start_0
    invoke-virtual {p0, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    check-cast p0, Landroid/telephony/TelephonyManager;

    .line 72
    .line 73
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v0, v4, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    const/4 v4, 0x1

    .line 82
    new-array v4, v4, [Ljava/lang/Object;

    .line 83
    .line 84
    invoke-virtual {v0, p0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    check-cast p0, Ljava/lang/String;

    .line 89
    .line 90
    if-eqz p0, :cond_1

    .line 91
    .line 92
    goto/16 :goto_5

    .line 93
    .line 94
    :catch_0
    move-exception p0

    .line 95
    goto :goto_1

    .line 96
    :catch_1
    move-exception p0

    .line 97
    goto :goto_3

    .line 98
    :cond_0
    invoke-virtual {p0, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    check-cast p0, Landroid/telephony/TelephonyManager;

    .line 103
    .line 104
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-virtual {v0, v4, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-virtual {v0, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    check-cast p0, Ljava/lang/String;

    .line 117
    .line 118
    if-eqz p0, :cond_1

    .line 119
    .line 120
    goto :goto_5

    .line 121
    :cond_1
    if-eqz v3, :cond_2

    .line 122
    .line 123
    invoke-virtual {v6, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    invoke-static {p0}, Lcom/appsflyer/AFLogger;->afDebugLog(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 128
    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_2
    move-object v3, v2

    .line 132
    :goto_0
    move-object p0, v3

    .line 133
    goto :goto_5

    .line 134
    :goto_1
    if-eqz v3, :cond_3

    .line 135
    .line 136
    invoke-virtual {v6, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-static {v0}, Lcom/appsflyer/AFLogger;->afDebugLog(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_3
    move-object v3, v2

    .line 145
    :goto_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 146
    .line 147
    const-string v4, "WARNING: Can\'t collect IMEI: other reason: "

    .line 148
    .line 149
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-static {v0, p0}, Lcom/appsflyer/AFLogger;->afErrorLog(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 164
    .line 165
    .line 166
    goto :goto_0

    .line 167
    :goto_3
    if-eqz v3, :cond_4

    .line 168
    .line 169
    invoke-virtual {v6, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    invoke-static {v0}, Lcom/appsflyer/AFLogger;->afDebugLog(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    goto :goto_4

    .line 177
    :cond_4
    move-object v3, v2

    .line 178
    :goto_4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 179
    .line 180
    const-string v4, "WARNING: Can\'t collect IMEI because of missing permissions: "

    .line 181
    .line 182
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v4

    .line 189
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    invoke-static {v0, p0}, Lcom/appsflyer/AFLogger;->afErrorLog(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 197
    .line 198
    .line 199
    goto :goto_0

    .line 200
    :cond_5
    iget-object v0, p0, Lcom/appsflyer/internal/AFf1eSDK;->component2:Ljava/lang/String;

    .line 201
    .line 202
    if-eqz v0, :cond_6

    .line 203
    .line 204
    iget-object p0, p0, Lcom/appsflyer/internal/AFf1eSDK;->component2:Ljava/lang/String;

    .line 205
    .line 206
    goto :goto_5

    .line 207
    :cond_6
    move-object p0, v2

    .line 208
    :goto_5
    invoke-static {p0}, Lcom/appsflyer/internal/AFk1wSDK;->getMonetizationNetwork(Ljava/lang/String;)Z

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    if-nez v0, :cond_8

    .line 213
    .line 214
    invoke-interface {p1, v1, p0}, Lcom/appsflyer/internal/AFc1qSDK;->getRevenue(Ljava/lang/String;Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    sget p1, Lcom/appsflyer/internal/AFf1eSDK;->equals:I

    .line 218
    .line 219
    add-int/lit8 p1, p1, 0x39

    .line 220
    .line 221
    rem-int/lit16 v0, p1, 0x80

    .line 222
    .line 223
    sput v0, Lcom/appsflyer/internal/AFf1eSDK;->hashCode:I

    .line 224
    .line 225
    rem-int/lit8 p1, p1, 0x2

    .line 226
    .line 227
    if-eqz p1, :cond_7

    .line 228
    .line 229
    return-object p0

    .line 230
    :cond_7
    throw v2

    .line 231
    :cond_8
    const-string p0, "IMEI was not collected."

    .line 232
    .line 233
    invoke-static {p0}, Lcom/appsflyer/AFLogger;->afInfoLog(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    return-object v2
.end method

.method public final getMonetizationNetwork(Z)V
    .locals 2

    .line 237
    sget v0, Lcom/appsflyer/internal/AFf1eSDK;->equals:I

    add-int/lit8 v0, v0, 0x2f

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFf1eSDK;->hashCode:I

    rem-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_0

    .line 238
    iput-boolean p1, p0, Lcom/appsflyer/internal/AFf1eSDK;->component3:Z

    const/16 p0, 0x17

    .line 239
    div-int/lit8 p0, p0, 0x0

    return-void

    .line 240
    :cond_0
    iput-boolean p1, p0, Lcom/appsflyer/internal/AFf1eSDK;->component3:Z

    return-void
.end method

.method public final getMonetizationNetwork()Z
    .locals 1

    .line 244
    sget v0, Lcom/appsflyer/internal/AFf1eSDK;->hashCode:I

    add-int/lit8 v0, v0, 0x25

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFf1eSDK;->equals:I

    iget-boolean v0, p0, Lcom/appsflyer/internal/AFf1eSDK;->AFAdRevenueData:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/appsflyer/internal/AFf1eSDK;->component1()Z

    move-result p0

    if-nez p0, :cond_0

    sget p0, Lcom/appsflyer/internal/AFf1eSDK;->hashCode:I

    add-int/lit8 p0, p0, 0x15

    rem-int/lit16 p0, p0, 0x80

    sput p0, Lcom/appsflyer/internal/AFf1eSDK;->equals:I

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public final getRevenue()Ljava/util/Map;
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

    .line 170
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 171
    invoke-direct {p0}, Lcom/appsflyer/internal/AFf1eSDK;->component1()Z

    move-result v1

    const-string v2, "lvl"

    if-eqz v1, :cond_0

    .line 172
    sget v1, Lcom/appsflyer/internal/AFf1eSDK;->equals:I

    add-int/lit8 v1, v1, 0x35

    rem-int/lit16 v1, v1, 0x80

    sput v1, Lcom/appsflyer/internal/AFf1eSDK;->hashCode:I

    .line 173
    iget-object p0, p0, Lcom/appsflyer/internal/AFf1eSDK;->getMediationNetwork:Ljava/util/Map;

    invoke-virtual {v0, v2, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    sget p0, Lcom/appsflyer/internal/AFf1eSDK;->equals:I

    add-int/lit8 p0, p0, 0x37

    rem-int/lit16 p0, p0, 0x80

    sput p0, Lcom/appsflyer/internal/AFf1eSDK;->hashCode:I

    return-object v0

    .line 175
    :cond_0
    iget-boolean v1, p0, Lcom/appsflyer/internal/AFf1eSDK;->AFAdRevenueData:Z

    if-eqz v1, :cond_1

    .line 176
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Lcom/appsflyer/internal/AFf1eSDK;->getMediationNetwork:Ljava/util/Map;

    .line 177
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFf1eSDK;->component4()V

    .line 178
    iget-object v1, p0, Lcom/appsflyer/internal/AFf1eSDK;->getMediationNetwork:Ljava/util/Map;

    const-string v3, "error"

    const-string v4, "pending LVL response"

    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    iget-object p0, p0, Lcom/appsflyer/internal/AFf1eSDK;->getMediationNetwork:Ljava/util/Map;

    invoke-virtual {v0, v2, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

.method public final getRevenue(Ljava/util/Map;)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 167
    new-instance v0, Lcom/appsflyer/internal/AFc1iSDK;

    iget-object p0, p0, Lcom/appsflyer/internal/AFf1eSDK;->getMonetizationNetwork:Lcom/appsflyer/internal/AFc1hSDK;

    .line 168
    iget-object p0, p0, Lcom/appsflyer/internal/AFc1hSDK;->getMonetizationNetwork:Landroid/content/Context;

    .line 169
    invoke-direct {v0, p1, p0}, Lcom/appsflyer/internal/AFc1iSDK;-><init>(Ljava/util/Map;Landroid/content/Context;)V

    sget p0, Lcom/appsflyer/internal/AFf1eSDK;->hashCode:I

    add-int/lit8 p0, p0, 0x4d

    rem-int/lit16 p1, p0, 0x80

    sput p1, Lcom/appsflyer/internal/AFf1eSDK;->equals:I

    rem-int/lit8 p0, p0, 0x2

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    const/4 p0, 0x0

    throw p0
.end method

.method public final getRevenue(Lcom/appsflyer/internal/AFc1oSDK;)V
    .locals 4

    .line 180
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/appsflyer/internal/AFf1eSDK;->getRevenue:J

    .line 181
    iget-object v0, p0, Lcom/appsflyer/internal/AFf1eSDK;->getCurrencyIso4217Code:Lcom/appsflyer/internal/AFf1dSDK;

    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    const v2, 0x4c218bdd    # 4.2348404E7f

    const v3, -0x4c218bdc

    invoke-static {p1, v2, v3, v1}, Lcom/appsflyer/internal/AFf1eSDK;->getCurrencyIso4217Code([Ljava/lang/Object;III)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    iget-object p1, p0, Lcom/appsflyer/internal/AFf1eSDK;->getMonetizationNetwork:Lcom/appsflyer/internal/AFc1hSDK;

    .line 182
    iget-object p1, p1, Lcom/appsflyer/internal/AFc1hSDK;->getMonetizationNetwork:Landroid/content/Context;

    .line 183
    new-instance v3, Lcom/appsflyer/internal/AFf1eSDK$3;

    invoke-direct {v3, p0}, Lcom/appsflyer/internal/AFf1eSDK$3;-><init>(Lcom/appsflyer/internal/AFf1eSDK;)V

    invoke-virtual {v0, v1, v2, p1, v3}, Lcom/appsflyer/internal/AFf1dSDK;->getRevenue(JLandroid/content/Context;Lcom/appsflyer/internal/AFf1dSDK$AFa1tSDK;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/appsflyer/internal/AFf1eSDK;->AFAdRevenueData:Z

    .line 184
    sget p0, Lcom/appsflyer/internal/AFf1eSDK;->equals:I

    add-int/lit8 p0, p0, 0x45

    rem-int/lit16 p1, p0, 0x80

    sput p1, Lcom/appsflyer/internal/AFf1eSDK;->hashCode:I

    rem-int/lit8 p0, p0, 0x2

    if-nez p0, :cond_0

    const/16 p0, 0x3d

    div-int/lit8 p0, p0, 0x0

    :cond_0
    return-void
.end method

.method public final getRevenue(Ljava/lang/String;)V
    .locals 2

    .line 192
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p0

    const v0, -0x5411bcb1

    const v1, 0x5411bcb3

    invoke-static {p1, v0, v1, p0}, Lcom/appsflyer/internal/AFf1eSDK;->getCurrencyIso4217Code([Ljava/lang/Object;III)Ljava/lang/Object;

    return-void
.end method
