.class public final Lcom/appsflyer/internal/AFf1oSDK;
.super Lcom/appsflyer/internal/AFf1sSDK;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field private static $10:I = 0x0

.field private static $11:I = 0x1

.field private static AFInAppEventType:C = '\u0000'

.field private static AFKeystoreWrapper:[C = null

.field private static AFLogger:I = 0x1

.field private static registerClient:I


# instance fields
.field private final copy:Lcom/appsflyer/internal/AFc1hSDK;

.field private final copydefault:Ljava/lang/String;

.field private final equals:Lcom/appsflyer/internal/AFg1nSDK;

.field private final hashCode:Lcom/appsflyer/internal/AFc1oSDK;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x9

    .line 2
    .line 3
    new-array v0, v0, [C

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/appsflyer/internal/AFf1oSDK;->AFKeystoreWrapper:[C

    .line 9
    .line 10
    const v0, 0xcdfd

    .line 11
    .line 12
    .line 13
    sput-char v0, Lcom/appsflyer/internal/AFf1oSDK;->AFInAppEventType:C

    .line 14
    .line 15
    return-void

    .line 16
    nop

    .line 17
    :array_0
    .array-data 2
        -0x3206s
        -0x800s
        -0x3204s
        -0x7fbs
        -0x7fas
        -0x3203s
        -0x7eas
        -0x3201s
        -0x7f6s
    .end array-data
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/appsflyer/internal/AFd1zSDK;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/appsflyer/internal/AFg1tSDK;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/appsflyer/internal/AFg1tSDK;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, v0, p2, p1}, Lcom/appsflyer/internal/AFf1sSDK;-><init>(Lcom/appsflyer/internal/AFh1mSDK;Lcom/appsflyer/internal/AFd1zSDK;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-interface {p2}, Lcom/appsflyer/internal/AFd1zSDK;->AFAdRevenueData()Lcom/appsflyer/internal/AFc1oSDK;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/appsflyer/internal/AFf1oSDK;->hashCode:Lcom/appsflyer/internal/AFc1oSDK;

    .line 14
    .line 15
    invoke-interface {p2}, Lcom/appsflyer/internal/AFd1zSDK;->AFInAppEventParameterName()Lcom/appsflyer/internal/AFc1hSDK;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Lcom/appsflyer/internal/AFf1oSDK;->copy:Lcom/appsflyer/internal/AFc1hSDK;

    .line 20
    .line 21
    iput-object p1, p0, Lcom/appsflyer/internal/AFf1oSDK;->copydefault:Ljava/lang/String;

    .line 22
    .line 23
    invoke-interface {p2}, Lcom/appsflyer/internal/AFd1zSDK;->component3()Lcom/appsflyer/internal/AFg1nSDK;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Lcom/appsflyer/internal/AFf1oSDK;->equals:Lcom/appsflyer/internal/AFg1nSDK;

    .line 28
    .line 29
    return-void
.end method

.method private static a(BLjava/lang/String;I[Ljava/lang/Object;)V
    .locals 12

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    :cond_0
    check-cast p1, [C

    .line 8
    .line 9
    new-instance v0, Lcom/appsflyer/internal/AFk1pSDK;

    .line 10
    .line 11
    invoke-direct {v0}, Lcom/appsflyer/internal/AFk1pSDK;-><init>()V

    .line 12
    .line 13
    .line 14
    sget-object v1, Lcom/appsflyer/internal/AFf1oSDK;->AFKeystoreWrapper:[C

    .line 15
    .line 16
    const-wide v2, -0x7fb8f963e9bb3202L

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    array-length v5, v1

    .line 25
    new-array v6, v5, [C

    .line 26
    .line 27
    move v7, v4

    .line 28
    :goto_0
    if-ge v7, v5, :cond_1

    .line 29
    .line 30
    aget-char v8, v1, v7

    .line 31
    .line 32
    int-to-long v8, v8

    .line 33
    xor-long/2addr v8, v2

    .line 34
    long-to-int v8, v8

    .line 35
    int-to-char v8, v8

    .line 36
    aput-char v8, v6, v7

    .line 37
    .line 38
    add-int/lit8 v7, v7, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    move-object v1, v6

    .line 42
    :cond_2
    sget-char v5, Lcom/appsflyer/internal/AFf1oSDK;->AFInAppEventType:C

    .line 43
    .line 44
    int-to-long v5, v5

    .line 45
    xor-long/2addr v2, v5

    .line 46
    long-to-int v2, v2

    .line 47
    int-to-char v2, v2

    .line 48
    new-array v3, p2, [C

    .line 49
    .line 50
    rem-int/lit8 v5, p2, 0x2

    .line 51
    .line 52
    if-eqz v5, :cond_3

    .line 53
    .line 54
    add-int/lit8 v5, p2, -0x1

    .line 55
    .line 56
    aget-char v6, p1, v5

    .line 57
    .line 58
    sub-int/2addr v6, p0

    .line 59
    int-to-char v6, v6

    .line 60
    aput-char v6, v3, v5

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_3
    move v5, p2

    .line 64
    :goto_1
    const/4 v6, 0x1

    .line 65
    if-le v5, v6, :cond_8

    .line 66
    .line 67
    sget v7, Lcom/appsflyer/internal/AFf1oSDK;->$10:I

    .line 68
    .line 69
    add-int/lit8 v7, v7, 0x41

    .line 70
    .line 71
    rem-int/lit16 v8, v7, 0x80

    .line 72
    .line 73
    sput v8, Lcom/appsflyer/internal/AFf1oSDK;->$11:I

    .line 74
    .line 75
    rem-int/lit8 v7, v7, 0x2

    .line 76
    .line 77
    iput v4, v0, Lcom/appsflyer/internal/AFk1pSDK;->getMonetizationNetwork:I

    .line 78
    .line 79
    :goto_2
    iget v7, v0, Lcom/appsflyer/internal/AFk1pSDK;->getMonetizationNetwork:I

    .line 80
    .line 81
    if-ge v7, v5, :cond_8

    .line 82
    .line 83
    aget-char v8, p1, v7

    .line 84
    .line 85
    iput-char v8, v0, Lcom/appsflyer/internal/AFk1pSDK;->getRevenue:C

    .line 86
    .line 87
    add-int/lit8 v9, v7, 0x1

    .line 88
    .line 89
    aget-char v9, p1, v9

    .line 90
    .line 91
    iput-char v9, v0, Lcom/appsflyer/internal/AFk1pSDK;->getCurrencyIso4217Code:C

    .line 92
    .line 93
    if-ne v8, v9, :cond_5

    .line 94
    .line 95
    sget v10, Lcom/appsflyer/internal/AFf1oSDK;->$11:I

    .line 96
    .line 97
    add-int/lit8 v10, v10, 0x73

    .line 98
    .line 99
    rem-int/lit16 v11, v10, 0x80

    .line 100
    .line 101
    sput v11, Lcom/appsflyer/internal/AFf1oSDK;->$10:I

    .line 102
    .line 103
    rem-int/lit8 v10, v10, 0x2

    .line 104
    .line 105
    if-eqz v10, :cond_4

    .line 106
    .line 107
    ushr-int/2addr v8, p0

    .line 108
    int-to-char v8, v8

    .line 109
    aput-char v8, v3, v7

    .line 110
    .line 111
    shr-int/lit8 v8, v7, 0x1

    .line 112
    .line 113
    shl-int/2addr v9, p0

    .line 114
    int-to-char v9, v9

    .line 115
    aput-char v9, v3, v8

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_4
    sub-int/2addr v8, p0

    .line 119
    int-to-char v8, v8

    .line 120
    aput-char v8, v3, v7

    .line 121
    .line 122
    add-int/lit8 v8, v7, 0x1

    .line 123
    .line 124
    sub-int/2addr v9, p0

    .line 125
    int-to-char v9, v9

    .line 126
    aput-char v9, v3, v8

    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_5
    div-int v10, v8, v2

    .line 130
    .line 131
    iput v10, v0, Lcom/appsflyer/internal/AFk1pSDK;->getMediationNetwork:I

    .line 132
    .line 133
    rem-int/2addr v8, v2

    .line 134
    iput v8, v0, Lcom/appsflyer/internal/AFk1pSDK;->component2:I

    .line 135
    .line 136
    div-int v11, v9, v2

    .line 137
    .line 138
    iput v11, v0, Lcom/appsflyer/internal/AFk1pSDK;->AFAdRevenueData:I

    .line 139
    .line 140
    rem-int/2addr v9, v2

    .line 141
    iput v9, v0, Lcom/appsflyer/internal/AFk1pSDK;->component3:I

    .line 142
    .line 143
    if-ne v8, v9, :cond_6

    .line 144
    .line 145
    add-int/2addr v10, v2

    .line 146
    sub-int/2addr v10, v6

    .line 147
    rem-int/2addr v10, v2

    .line 148
    iput v10, v0, Lcom/appsflyer/internal/AFk1pSDK;->getMediationNetwork:I

    .line 149
    .line 150
    add-int/2addr v11, v2

    .line 151
    sub-int/2addr v11, v6

    .line 152
    rem-int/2addr v11, v2

    .line 153
    iput v11, v0, Lcom/appsflyer/internal/AFk1pSDK;->AFAdRevenueData:I

    .line 154
    .line 155
    mul-int/2addr v10, v2

    .line 156
    add-int/2addr v10, v8

    .line 157
    mul-int/2addr v11, v2

    .line 158
    add-int/2addr v11, v9

    .line 159
    aget-char v8, v1, v10

    .line 160
    .line 161
    aput-char v8, v3, v7

    .line 162
    .line 163
    add-int/lit8 v8, v7, 0x1

    .line 164
    .line 165
    aget-char v9, v1, v11

    .line 166
    .line 167
    aput-char v9, v3, v8

    .line 168
    .line 169
    goto :goto_3

    .line 170
    :cond_6
    if-ne v10, v11, :cond_7

    .line 171
    .line 172
    add-int/2addr v8, v2

    .line 173
    sub-int/2addr v8, v6

    .line 174
    rem-int/2addr v8, v2

    .line 175
    iput v8, v0, Lcom/appsflyer/internal/AFk1pSDK;->component2:I

    .line 176
    .line 177
    add-int/2addr v9, v2

    .line 178
    sub-int/2addr v9, v6

    .line 179
    rem-int/2addr v9, v2

    .line 180
    iput v9, v0, Lcom/appsflyer/internal/AFk1pSDK;->component3:I

    .line 181
    .line 182
    mul-int/2addr v10, v2

    .line 183
    add-int/2addr v10, v8

    .line 184
    mul-int/2addr v11, v2

    .line 185
    add-int/2addr v11, v9

    .line 186
    aget-char v8, v1, v10

    .line 187
    .line 188
    aput-char v8, v3, v7

    .line 189
    .line 190
    add-int/lit8 v8, v7, 0x1

    .line 191
    .line 192
    aget-char v9, v1, v11

    .line 193
    .line 194
    aput-char v9, v3, v8

    .line 195
    .line 196
    goto :goto_3

    .line 197
    :cond_7
    mul-int/2addr v10, v2

    .line 198
    add-int/2addr v10, v9

    .line 199
    mul-int/2addr v11, v2

    .line 200
    add-int/2addr v11, v8

    .line 201
    aget-char v8, v1, v10

    .line 202
    .line 203
    aput-char v8, v3, v7

    .line 204
    .line 205
    add-int/lit8 v8, v7, 0x1

    .line 206
    .line 207
    aget-char v9, v1, v11

    .line 208
    .line 209
    aput-char v9, v3, v8

    .line 210
    .line 211
    :goto_3
    add-int/lit8 v7, v7, 0x2

    .line 212
    .line 213
    iput v7, v0, Lcom/appsflyer/internal/AFk1pSDK;->getMonetizationNetwork:I

    .line 214
    .line 215
    goto/16 :goto_2

    .line 216
    .line 217
    :cond_8
    sget p0, Lcom/appsflyer/internal/AFf1oSDK;->$11:I

    .line 218
    .line 219
    add-int/lit8 p0, p0, 0x5

    .line 220
    .line 221
    rem-int/lit16 p0, p0, 0x80

    .line 222
    .line 223
    sput p0, Lcom/appsflyer/internal/AFf1oSDK;->$10:I

    .line 224
    .line 225
    move p0, v4

    .line 226
    :goto_4
    if-ge p0, p2, :cond_9

    .line 227
    .line 228
    aget-char p1, v3, p0

    .line 229
    .line 230
    xor-int/lit16 p1, p1, 0x359a

    .line 231
    .line 232
    int-to-char p1, p1

    .line 233
    aput-char p1, v3, p0

    .line 234
    .line 235
    add-int/lit8 p0, p0, 0x1

    .line 236
    .line 237
    goto :goto_4

    .line 238
    :cond_9
    new-instance p0, Ljava/lang/String;

    .line 239
    .line 240
    invoke-direct {p0, v3}, Ljava/lang/String;-><init>([C)V

    .line 241
    .line 242
    .line 243
    aput-object p0, p3, v4

    .line 244
    .line 245
    return-void
.end method

.method private equals()V
    .locals 4

    .line 1
    sget v0, Lcom/appsflyer/internal/AFf1oSDK;->AFLogger:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x21

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, Lcom/appsflyer/internal/AFf1oSDK;->registerClient:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    iget-object p0, p0, Lcom/appsflyer/internal/AFf1sSDK;->component2:Lcom/appsflyer/internal/AFc1qSDK;

    .line 12
    .line 13
    const-string v1, "[register] Successfully registered for Uninstall Tracking"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    const-string v3, "sentRegisterRequestToAF"

    .line 17
    .line 18
    invoke-interface {p0, v3, v2}, Lcom/appsflyer/internal/AFc1qSDK;->AFAdRevenueData(Ljava/lang/String;Z)V

    .line 19
    .line 20
    .line 21
    invoke-static {v1}, Lcom/appsflyer/AFLogger;->afDebugLog(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public static synthetic getCurrencyIso4217Code([Ljava/lang/Object;III)Ljava/lang/Object;
    .locals 4

    .line 1
    mul-int/lit16 v0, p1, 0x1ef

    .line 2
    .line 3
    mul-int/lit16 v1, p2, -0x1ed

    .line 4
    .line 5
    add-int/2addr v1, v0

    .line 6
    not-int v0, p2

    .line 7
    or-int v2, p1, v0

    .line 8
    .line 9
    mul-int/lit16 v2, v2, -0x3dc

    .line 10
    .line 11
    add-int/2addr v2, v1

    .line 12
    not-int v1, p1

    .line 13
    or-int v3, p2, v1

    .line 14
    .line 15
    not-int p3, p3

    .line 16
    or-int/2addr v3, p3

    .line 17
    mul-int/lit16 v3, v3, 0x1ee

    .line 18
    .line 19
    add-int/2addr v3, v2

    .line 20
    or-int/2addr v0, v1

    .line 21
    not-int v0, v0

    .line 22
    or-int/2addr p3, p2

    .line 23
    not-int p3, p3

    .line 24
    or-int/2addr p3, v0

    .line 25
    or-int/2addr p1, p2

    .line 26
    not-int p1, p1

    .line 27
    or-int/2addr p1, p3

    .line 28
    mul-int/lit16 p1, p1, 0x1ee

    .line 29
    .line 30
    add-int/2addr p1, v3

    .line 31
    const/4 p2, 0x1

    .line 32
    if-eq p1, p2, :cond_0

    .line 33
    .line 34
    invoke-static {p0}, Lcom/appsflyer/internal/AFf1oSDK;->getMonetizationNetwork([Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :cond_0
    invoke-static {p0}, Lcom/appsflyer/internal/AFf1oSDK;->getMediationNetwork([Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
.end method

.method private static synthetic getMediationNetwork([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    aget-object p0, p0, v0

    .line 3
    .line 4
    check-cast p0, Lcom/appsflyer/internal/AFf1oSDK;

    .line 5
    .line 6
    sget v0, Lcom/appsflyer/internal/AFf1oSDK;->registerClient:I

    .line 7
    .line 8
    add-int/lit8 v0, v0, 0x6d

    .line 9
    .line 10
    rem-int/lit16 v1, v0, 0x80

    .line 11
    .line 12
    sput v1, Lcom/appsflyer/internal/AFf1oSDK;->AFLogger:I

    .line 13
    .line 14
    rem-int/lit8 v0, v0, 0x2

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    invoke-super {p0}, Lcom/appsflyer/internal/AFe1fSDK;->getCurrencyIso4217Code()V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lcom/appsflyer/internal/AFe1fSDK;->areAllFieldsValid:Lcom/appsflyer/internal/AFe1wSDK;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    sget v2, Lcom/appsflyer/internal/AFf1oSDK;->registerClient:I

    .line 27
    .line 28
    add-int/lit8 v2, v2, 0x3

    .line 29
    .line 30
    rem-int/lit16 v3, v2, 0x80

    .line 31
    .line 32
    sput v3, Lcom/appsflyer/internal/AFf1oSDK;->AFLogger:I

    .line 33
    .line 34
    rem-int/lit8 v2, v2, 0x2

    .line 35
    .line 36
    if-eqz v2, :cond_0

    .line 37
    .line 38
    invoke-virtual {v0}, Lcom/appsflyer/internal/AFe1wSDK;->isSuccessful()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    invoke-direct {p0}, Lcom/appsflyer/internal/AFf1oSDK;->equals()V

    .line 45
    .line 46
    .line 47
    sget p0, Lcom/appsflyer/internal/AFf1oSDK;->AFLogger:I

    .line 48
    .line 49
    add-int/lit8 p0, p0, 0x11

    .line 50
    .line 51
    rem-int/lit16 p0, p0, 0x80

    .line 52
    .line 53
    sput p0, Lcom/appsflyer/internal/AFf1oSDK;->registerClient:I

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    invoke-virtual {v0}, Lcom/appsflyer/internal/AFe1wSDK;->isSuccessful()Z

    .line 57
    .line 58
    .line 59
    throw v1

    .line 60
    :cond_1
    :goto_0
    return-object v1

    .line 61
    :cond_2
    invoke-super {p0}, Lcom/appsflyer/internal/AFe1fSDK;->getCurrencyIso4217Code()V

    .line 62
    .line 63
    .line 64
    throw v1
.end method

.method private static synthetic getMonetizationNetwork([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    aget-object v1, p0, v0

    .line 3
    .line 4
    check-cast v1, Lcom/appsflyer/internal/AFf1oSDK;

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    aget-object p0, p0, v2

    .line 8
    .line 9
    check-cast p0, Lcom/appsflyer/internal/AFh1mSDK;

    .line 10
    .line 11
    invoke-super {v1, p0}, Lcom/appsflyer/internal/AFf1sSDK;->AFAdRevenueData(Lcom/appsflyer/internal/AFh1mSDK;)V

    .line 12
    .line 13
    .line 14
    iget-object v3, v1, Lcom/appsflyer/internal/AFf1oSDK;->copy:Lcom/appsflyer/internal/AFc1hSDK;

    .line 15
    .line 16
    iget-object v3, v3, Lcom/appsflyer/internal/AFc1hSDK;->getMonetizationNetwork:Landroid/content/Context;

    .line 17
    .line 18
    invoke-static {}, Lcom/appsflyer/internal/AFa1ySDK;->getRevenue()Lcom/appsflyer/internal/AFa1ySDK;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    const/4 v5, 0x0

    .line 23
    if-eqz v3, :cond_7

    .line 24
    .line 25
    invoke-virtual {v4}, Lcom/appsflyer/internal/AFa1ySDK;->getCurrencyIso4217Code()Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-nez v4, :cond_6

    .line 30
    .line 31
    :try_start_0
    const-string v4, "app_version_code"

    .line 32
    .line 33
    iget-object v6, v1, Lcom/appsflyer/internal/AFf1oSDK;->hashCode:Lcom/appsflyer/internal/AFc1oSDK;

    .line 34
    .line 35
    invoke-virtual {v6}, Lcom/appsflyer/internal/AFc1oSDK;->n_()Landroid/content/pm/PackageInfo;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    iget v6, v6, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 40
    .line 41
    invoke-static {v6}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    invoke-virtual {p0, v4, v6}, Lcom/appsflyer/internal/AFh1mSDK;->getMonetizationNetwork(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFh1mSDK;

    .line 46
    .line 47
    .line 48
    const-string v4, "app_version_name"

    .line 49
    .line 50
    iget-object v6, v1, Lcom/appsflyer/internal/AFf1oSDK;->hashCode:Lcom/appsflyer/internal/AFc1oSDK;

    .line 51
    .line 52
    invoke-virtual {v6}, Lcom/appsflyer/internal/AFc1oSDK;->n_()Landroid/content/pm/PackageInfo;

    .line 53
    .line 54
    .line 55
    move-result-object v6

    .line 56
    iget-object v6, v6, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {p0, v4, v6}, Lcom/appsflyer/internal/AFh1mSDK;->getMonetizationNetwork(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFh1mSDK;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    const-string v6, "app_name"

    .line 66
    .line 67
    invoke-direct {v1, v4}, Lcom/appsflyer/internal/AFf1oSDK;->s_(Landroid/content/pm/PackageManager;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    invoke-virtual {p0, v6, v4}, Lcom/appsflyer/internal/AFh1mSDK;->getMonetizationNetwork(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFh1mSDK;

    .line 72
    .line 73
    .line 74
    iget-object v4, v1, Lcom/appsflyer/internal/AFf1oSDK;->hashCode:Lcom/appsflyer/internal/AFc1oSDK;

    .line 75
    .line 76
    invoke-virtual {v4}, Lcom/appsflyer/internal/AFc1oSDK;->n_()Landroid/content/pm/PackageInfo;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    iget-wide v6, v4, Landroid/content/pm/PackageInfo;->firstInstallTime:J

    .line 81
    .line 82
    const-string v4, "yyyy-MM-dd_HHmmssZ"

    .line 83
    .line 84
    new-instance v8, Ljava/text/SimpleDateFormat;

    .line 85
    .line 86
    sget-object v9, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 87
    .line 88
    invoke-direct {v8, v4, v9}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 89
    .line 90
    .line 91
    const-string v4, "installDate"

    .line 92
    .line 93
    invoke-static {v8, v6, v7}, Lcom/appsflyer/internal/AFa1ySDK;->getMonetizationNetwork(Ljava/text/SimpleDateFormat;J)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v6

    .line 97
    invoke-virtual {p0, v4, v6}, Lcom/appsflyer/internal/AFh1mSDK;->getMonetizationNetwork(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFh1mSDK;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :catchall_0
    move-exception v4

    .line 102
    const-string v6, "Exception while collecting application version info."

    .line 103
    .line 104
    invoke-static {v6, v4}, Lcom/appsflyer/AFLogger;->afErrorLog(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 105
    .line 106
    .line 107
    :goto_0
    iget-object v4, v1, Lcom/appsflyer/internal/AFf1oSDK;->equals:Lcom/appsflyer/internal/AFg1nSDK;

    .line 108
    .line 109
    iget-object v6, p0, Lcom/appsflyer/internal/AFh1mSDK;->AFAdRevenueData:Ljava/util/Map;

    .line 110
    .line 111
    invoke-interface {v4, v6}, Lcom/appsflyer/internal/AFg1nSDK;->getRevenue(Ljava/util/Map;)V

    .line 112
    .line 113
    .line 114
    iget-object v4, p0, Lcom/appsflyer/internal/AFh1mSDK;->AFAdRevenueData:Ljava/util/Map;

    .line 115
    .line 116
    const-string v6, "ivc"

    .line 117
    .line 118
    invoke-interface {v4, v6}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    invoke-static {}, Lcom/appsflyer/internal/AFa1ySDK;->getMediationNetwork()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    if-eqz v4, :cond_1

    .line 126
    .line 127
    sget v6, Lcom/appsflyer/internal/AFf1oSDK;->AFLogger:I

    .line 128
    .line 129
    add-int/lit8 v6, v6, 0x2f

    .line 130
    .line 131
    rem-int/lit16 v7, v6, 0x80

    .line 132
    .line 133
    sput v7, Lcom/appsflyer/internal/AFf1oSDK;->registerClient:I

    .line 134
    .line 135
    rem-int/lit8 v6, v6, 0x2

    .line 136
    .line 137
    const-string v7, "appUserId"

    .line 138
    .line 139
    if-eqz v6, :cond_0

    .line 140
    .line 141
    invoke-virtual {p0, v7, v4}, Lcom/appsflyer/internal/AFh1mSDK;->getMonetizationNetwork(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFh1mSDK;

    .line 142
    .line 143
    .line 144
    const/16 v4, 0x53

    .line 145
    .line 146
    div-int/2addr v4, v0

    .line 147
    goto :goto_1

    .line 148
    :cond_0
    invoke-virtual {p0, v7, v4}, Lcom/appsflyer/internal/AFh1mSDK;->getMonetizationNetwork(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFh1mSDK;

    .line 149
    .line 150
    .line 151
    :cond_1
    :goto_1
    :try_start_1
    const-string v4, "model"

    .line 152
    .line 153
    sget-object v6, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 154
    .line 155
    invoke-virtual {p0, v4, v6}, Lcom/appsflyer/internal/AFh1mSDK;->getMonetizationNetwork(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFh1mSDK;

    .line 156
    .line 157
    .line 158
    invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I

    .line 159
    .line 160
    .line 161
    move-result v4

    .line 162
    shr-int/lit8 v4, v4, 0x8

    .line 163
    .line 164
    rsub-int/lit8 v4, v4, 0x3

    .line 165
    .line 166
    int-to-byte v4, v4

    .line 167
    const-string v6, "\u0003\u0007\u0005\u0006\u3601"

    .line 168
    .line 169
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 170
    .line 171
    .line 172
    move-result v7

    .line 173
    shr-int/lit8 v7, v7, 0x16

    .line 174
    .line 175
    rsub-int/lit8 v7, v7, 0x5

    .line 176
    .line 177
    new-array v2, v2, [Ljava/lang/Object;

    .line 178
    .line 179
    invoke-static {v4, v6, v7, v2}, Lcom/appsflyer/internal/AFf1oSDK;->a(BLjava/lang/String;I[Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    aget-object v2, v2, v0

    .line 183
    .line 184
    check-cast v2, Ljava/lang/String;

    .line 185
    .line 186
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    sget-object v4, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 191
    .line 192
    invoke-virtual {p0, v2, v4}, Lcom/appsflyer/internal/AFh1mSDK;->getMonetizationNetwork(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFh1mSDK;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 193
    .line 194
    .line 195
    goto :goto_2

    .line 196
    :catchall_1
    move-exception v2

    .line 197
    const-string v4, "Exception while collecting device brand and model."

    .line 198
    .line 199
    invoke-static {v4, v2}, Lcom/appsflyer/AFLogger;->afErrorLog(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 200
    .line 201
    .line 202
    :goto_2
    invoke-static {}, Lcom/appsflyer/AppsFlyerProperties;->getInstance()Lcom/appsflyer/AppsFlyerProperties;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    const-string v4, "deviceTrackingDisabled"

    .line 207
    .line 208
    invoke-virtual {v2, v4, v0}, Lcom/appsflyer/AppsFlyerProperties;->getBoolean(Ljava/lang/String;Z)Z

    .line 209
    .line 210
    .line 211
    move-result v2

    .line 212
    if-eqz v2, :cond_3

    .line 213
    .line 214
    sget v2, Lcom/appsflyer/internal/AFf1oSDK;->AFLogger:I

    .line 215
    .line 216
    add-int/lit8 v2, v2, 0x59

    .line 217
    .line 218
    rem-int/lit16 v6, v2, 0x80

    .line 219
    .line 220
    sput v6, Lcom/appsflyer/internal/AFf1oSDK;->registerClient:I

    .line 221
    .line 222
    rem-int/lit8 v2, v2, 0x2

    .line 223
    .line 224
    const-string v6, "true"

    .line 225
    .line 226
    if-eqz v2, :cond_2

    .line 227
    .line 228
    invoke-virtual {p0, v4, v6}, Lcom/appsflyer/internal/AFh1mSDK;->getMonetizationNetwork(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFh1mSDK;

    .line 229
    .line 230
    .line 231
    const/16 v2, 0x2f

    .line 232
    .line 233
    div-int/2addr v2, v0

    .line 234
    goto :goto_3

    .line 235
    :cond_2
    invoke-virtual {p0, v4, v6}, Lcom/appsflyer/internal/AFh1mSDK;->getMonetizationNetwork(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFh1mSDK;

    .line 236
    .line 237
    .line 238
    :cond_3
    :goto_3
    invoke-virtual {v3}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 239
    .line 240
    .line 241
    move-result-object v2

    .line 242
    invoke-static {v2}, Lcom/appsflyer/internal/AFb1lSDK;->l_(Landroid/content/ContentResolver;)Lcom/appsflyer/internal/AFb1jSDK;

    .line 243
    .line 244
    .line 245
    move-result-object v2

    .line 246
    if-eqz v2, :cond_4

    .line 247
    .line 248
    sget v3, Lcom/appsflyer/internal/AFf1oSDK;->AFLogger:I

    .line 249
    .line 250
    add-int/lit8 v3, v3, 0x23

    .line 251
    .line 252
    rem-int/lit16 v3, v3, 0x80

    .line 253
    .line 254
    sput v3, Lcom/appsflyer/internal/AFf1oSDK;->registerClient:I

    .line 255
    .line 256
    const-string v3, "amazon_aid"

    .line 257
    .line 258
    iget-object v4, v2, Lcom/appsflyer/internal/AFb1jSDK;->getRevenue:Ljava/lang/String;

    .line 259
    .line 260
    invoke-virtual {p0, v3, v4}, Lcom/appsflyer/internal/AFh1mSDK;->getMonetizationNetwork(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFh1mSDK;

    .line 261
    .line 262
    .line 263
    iget-object v2, v2, Lcom/appsflyer/internal/AFb1jSDK;->getCurrencyIso4217Code:Ljava/lang/Boolean;

    .line 264
    .line 265
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v2

    .line 269
    const-string v3, "amazon_aid_limit"

    .line 270
    .line 271
    invoke-virtual {p0, v3, v2}, Lcom/appsflyer/internal/AFh1mSDK;->getMonetizationNetwork(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFh1mSDK;

    .line 272
    .line 273
    .line 274
    :cond_4
    iget-object v2, v1, Lcom/appsflyer/internal/AFe1fSDK;->component1:Lcom/appsflyer/internal/AFf1eSDK;

    .line 275
    .line 276
    invoke-virtual {v2}, Lcom/appsflyer/internal/AFf1eSDK;->getMediationNetwork()Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v2

    .line 280
    const-string v3, "devkey"

    .line 281
    .line 282
    invoke-virtual {p0, v3, v2}, Lcom/appsflyer/internal/AFh1mSDK;->getMonetizationNetwork(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFh1mSDK;

    .line 283
    .line 284
    .line 285
    iget-object v2, v1, Lcom/appsflyer/internal/AFf1oSDK;->hashCode:Lcom/appsflyer/internal/AFc1oSDK;

    .line 286
    .line 287
    iget-object v2, v2, Lcom/appsflyer/internal/AFc1oSDK;->getMediationNetwork:Lcom/appsflyer/internal/AFc1qSDK;

    .line 288
    .line 289
    invoke-static {v2}, Lcom/appsflyer/internal/AFb1kSDK;->getCurrencyIso4217Code(Lcom/appsflyer/internal/AFc1qSDK;)Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v2

    .line 293
    const-string v3, "uid"

    .line 294
    .line 295
    invoke-virtual {p0, v3, v2}, Lcom/appsflyer/internal/AFh1mSDK;->getMonetizationNetwork(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFh1mSDK;

    .line 296
    .line 297
    .line 298
    const-string v2, "af_gcm_token"

    .line 299
    .line 300
    iget-object v3, v1, Lcom/appsflyer/internal/AFf1oSDK;->copydefault:Ljava/lang/String;

    .line 301
    .line 302
    invoke-virtual {p0, v2, v3}, Lcom/appsflyer/internal/AFh1mSDK;->getMonetizationNetwork(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFh1mSDK;

    .line 303
    .line 304
    .line 305
    iget-object v2, v1, Lcom/appsflyer/internal/AFf1sSDK;->component2:Lcom/appsflyer/internal/AFc1qSDK;

    .line 306
    .line 307
    const-string v3, "appsFlyerCount"

    .line 308
    .line 309
    invoke-interface {v2, v3, v0}, Lcom/appsflyer/internal/AFc1qSDK;->getRevenue(Ljava/lang/String;I)I

    .line 310
    .line 311
    .line 312
    move-result v0

    .line 313
    const-string v2, "launch_counter"

    .line 314
    .line 315
    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    invoke-virtual {p0, v2, v0}, Lcom/appsflyer/internal/AFh1mSDK;->getMonetizationNetwork(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFh1mSDK;

    .line 320
    .line 321
    .line 322
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 323
    .line 324
    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    const-string v2, "sdk"

    .line 329
    .line 330
    invoke-virtual {p0, v2, v0}, Lcom/appsflyer/internal/AFh1mSDK;->getMonetizationNetwork(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFh1mSDK;

    .line 331
    .line 332
    .line 333
    iget-object v0, v1, Lcom/appsflyer/internal/AFf1oSDK;->hashCode:Lcom/appsflyer/internal/AFc1oSDK;

    .line 334
    .line 335
    invoke-virtual {v0}, Lcom/appsflyer/internal/AFc1oSDK;->component3()Ljava/lang/String;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    if-eqz v0, :cond_5

    .line 340
    .line 341
    const-string v1, "channel"

    .line 342
    .line 343
    invoke-virtual {p0, v1, v0}, Lcom/appsflyer/internal/AFh1mSDK;->getMonetizationNetwork(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFh1mSDK;

    .line 344
    .line 345
    .line 346
    sget p0, Lcom/appsflyer/internal/AFf1oSDK;->registerClient:I

    .line 347
    .line 348
    add-int/lit8 p0, p0, 0x3d

    .line 349
    .line 350
    rem-int/lit16 p0, p0, 0x80

    .line 351
    .line 352
    sput p0, Lcom/appsflyer/internal/AFf1oSDK;->AFLogger:I

    .line 353
    .line 354
    :cond_5
    return-object v5

    .line 355
    :cond_6
    const-string p0, "CustomerUserId not set, Tracking is disabled"

    .line 356
    .line 357
    invoke-static {p0, v2}, Lcom/appsflyer/AFLogger;->afInfoLog(Ljava/lang/String;Z)V

    .line 358
    .line 359
    .line 360
    const-string p0, "CustomerUserId not set, register is not sent"

    .line 361
    .line 362
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    return-object v5

    .line 366
    :cond_7
    const-string p0, "Context is not provided, can\'t send register request"

    .line 367
    .line 368
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 369
    .line 370
    .line 371
    return-object v5
.end method

.method private s_(Landroid/content/pm/PackageManager;)Ljava/lang/String;
    .locals 2

    .line 1
    iget-object p0, p0, Lcom/appsflyer/internal/AFf1oSDK;->hashCode:Lcom/appsflyer/internal/AFc1oSDK;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1oSDK;->n_()Landroid/content/pm/PackageInfo;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget-object p0, p0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    if-nez p0, :cond_1

    .line 11
    .line 12
    sget p0, Lcom/appsflyer/internal/AFf1oSDK;->AFLogger:I

    .line 13
    .line 14
    add-int/lit8 p1, p0, 0x77

    .line 15
    .line 16
    rem-int/lit16 v1, p1, 0x80

    .line 17
    .line 18
    sput v1, Lcom/appsflyer/internal/AFf1oSDK;->registerClient:I

    .line 19
    .line 20
    rem-int/lit8 p1, p1, 0x2

    .line 21
    .line 22
    if-nez p1, :cond_0

    .line 23
    .line 24
    add-int/lit8 p0, p0, 0x47

    .line 25
    .line 26
    rem-int/lit16 p0, p0, 0x80

    .line 27
    .line 28
    sput p0, Lcom/appsflyer/internal/AFf1oSDK;->registerClient:I

    .line 29
    .line 30
    const-string p0, ""

    .line 31
    .line 32
    return-object p0

    .line 33
    :cond_0
    throw v0

    .line 34
    :cond_1
    invoke-virtual {p1, p0}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    sget p1, Lcom/appsflyer/internal/AFf1oSDK;->AFLogger:I

    .line 43
    .line 44
    add-int/lit8 p1, p1, 0x5f

    .line 45
    .line 46
    rem-int/lit16 v1, p1, 0x80

    .line 47
    .line 48
    sput v1, Lcom/appsflyer/internal/AFf1oSDK;->registerClient:I

    .line 49
    .line 50
    rem-int/lit8 p1, p1, 0x2

    .line 51
    .line 52
    if-nez p1, :cond_2

    .line 53
    .line 54
    return-object p0

    .line 55
    :cond_2
    throw v0
.end method


# virtual methods
.method public final AFAdRevenueData(Lcom/appsflyer/internal/AFh1mSDK;)V
    .locals 2

    .line 1
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    const v0, 0x362d3aa8

    .line 10
    .line 11
    .line 12
    const v1, -0x362d3aa8

    .line 13
    .line 14
    .line 15
    invoke-static {p1, v0, v1, p0}, Lcom/appsflyer/internal/AFf1oSDK;->getCurrencyIso4217Code([Ljava/lang/Object;III)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final component1(Lcom/appsflyer/internal/AFh1mSDK;)V
    .locals 2

    .line 1
    sget v0, Lcom/appsflyer/internal/AFf1oSDK;->AFLogger:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0xd

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, Lcom/appsflyer/internal/AFf1oSDK;->registerClient:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    iget-object p0, p0, Lcom/appsflyer/internal/AFf1oSDK;->hashCode:Lcom/appsflyer/internal/AFc1oSDK;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1oSDK;->areAllFieldsValid()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const/16 v0, 0x53

    .line 20
    .line 21
    div-int/lit8 v0, v0, 0x0

    .line 22
    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-void

    .line 27
    :cond_1
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1oSDK;->areAllFieldsValid()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    if-eqz p0, :cond_2

    .line 32
    .line 33
    :goto_0
    sget v0, Lcom/appsflyer/internal/AFf1oSDK;->AFLogger:I

    .line 34
    .line 35
    add-int/lit8 v0, v0, 0x13

    .line 36
    .line 37
    rem-int/lit16 v0, v0, 0x80

    .line 38
    .line 39
    sput v0, Lcom/appsflyer/internal/AFf1oSDK;->registerClient:I

    .line 40
    .line 41
    const-string v0, "advertiserId"

    .line 42
    .line 43
    invoke-virtual {p1, v0, p0}, Lcom/appsflyer/internal/AFh1mSDK;->getMonetizationNetwork(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFh1mSDK;

    .line 44
    .line 45
    .line 46
    sget p0, Lcom/appsflyer/internal/AFf1oSDK;->registerClient:I

    .line 47
    .line 48
    add-int/lit8 p0, p0, 0x27

    .line 49
    .line 50
    rem-int/lit16 p0, p0, 0x80

    .line 51
    .line 52
    sput p0, Lcom/appsflyer/internal/AFf1oSDK;->AFLogger:I

    .line 53
    .line 54
    :cond_2
    return-void
.end method

.method public final copydefault()Z
    .locals 1

    .line 1
    sget p0, Lcom/appsflyer/internal/AFf1oSDK;->registerClient:I

    .line 2
    .line 3
    add-int/lit8 p0, p0, 0x57

    .line 4
    .line 5
    rem-int/lit16 v0, p0, 0x80

    .line 6
    .line 7
    sput v0, Lcom/appsflyer/internal/AFf1oSDK;->AFLogger:I

    .line 8
    .line 9
    rem-int/lit8 p0, p0, 0x2

    .line 10
    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    :goto_0
    add-int/lit8 v0, v0, 0x75

    .line 17
    .line 18
    rem-int/lit16 v0, v0, 0x80

    .line 19
    .line 20
    sput v0, Lcom/appsflyer/internal/AFf1oSDK;->registerClient:I

    .line 21
    .line 22
    return p0
.end method

.method public final getCurrencyIso4217Code()V
    .locals 3

    .line 45
    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p0

    const v1, 0x31fe27d4

    const v2, -0x31fe27d3    # -5.4460704E8f

    invoke-static {v0, v1, v2, p0}, Lcom/appsflyer/internal/AFf1oSDK;->getCurrencyIso4217Code([Ljava/lang/Object;III)Ljava/lang/Object;

    return-void
.end method

.method public final getCurrencyIso4217Code(Lcom/appsflyer/internal/AFh1mSDK;)V
    .locals 0

    .line 44
    sget p0, Lcom/appsflyer/internal/AFf1oSDK;->AFLogger:I

    add-int/lit8 p0, p0, 0x43

    rem-int/lit16 p0, p0, 0x80

    sput p0, Lcom/appsflyer/internal/AFf1oSDK;->registerClient:I

    return-void
.end method

.method public final getMediationNetwork(Lcom/appsflyer/internal/AFh1mSDK;)V
    .locals 0

    .line 65
    sget p0, Lcom/appsflyer/internal/AFf1oSDK;->AFLogger:I

    add-int/lit8 p0, p0, 0x15

    rem-int/lit16 p0, p0, 0x80

    sput p0, Lcom/appsflyer/internal/AFf1oSDK;->registerClient:I

    return-void
.end method

.method public final getMonetizationNetwork(Lcom/appsflyer/internal/AFh1mSDK;)V
    .locals 0

    .line 372
    sget p0, Lcom/appsflyer/internal/AFf1oSDK;->registerClient:I

    add-int/lit8 p0, p0, 0x1

    rem-int/lit16 p0, p0, 0x80

    sput p0, Lcom/appsflyer/internal/AFf1oSDK;->AFLogger:I

    return-void
.end method

.method public final getRevenue(Lcom/appsflyer/internal/AFh1mSDK;)V
    .locals 0

    .line 1
    sget p0, Lcom/appsflyer/internal/AFf1oSDK;->AFLogger:I

    .line 2
    .line 3
    add-int/lit8 p0, p0, 0x33

    .line 4
    .line 5
    rem-int/lit16 p1, p0, 0x80

    .line 6
    .line 7
    sput p1, Lcom/appsflyer/internal/AFf1oSDK;->registerClient:I

    .line 8
    .line 9
    rem-int/lit8 p0, p0, 0x2

    .line 10
    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    throw p0
.end method
