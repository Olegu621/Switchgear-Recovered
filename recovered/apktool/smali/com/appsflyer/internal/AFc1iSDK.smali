.class public final Lcom/appsflyer/internal/AFc1iSDK;
.super Ljava/util/HashMap;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/appsflyer/internal/AFc1iSDK$AFa1ySDK;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/HashMap<",
        "Ljava/lang/String;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field private static $10:I = 0x0

.field private static $11:I = 0x1

.field private static AFAdRevenueData:J = 0x0L

.field private static areAllFieldsValid:I = 0x0

.field private static component1:I = 0x1

.field private static getCurrencyIso4217Code:J

.field private static getMediationNetwork:[C


# instance fields
.field private final getMonetizationNetwork:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final getRevenue:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/appsflyer/internal/AFc1iSDK;->getCurrencyIso4217Code()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-static {v0}, Landroid/util/TypedValue;->complexToFloat(I)F

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Landroid/graphics/Color;->red(I)I

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-static {v1, v1}, Landroid/graphics/PointF;->length(FF)F

    .line 13
    .line 14
    .line 15
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 16
    .line 17
    .line 18
    const-string v1, ""

    .line 19
    .line 20
    invoke-static {v1}, Landroid/os/Process;->getGidForName(Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Landroid/graphics/Color;->alpha(I)I

    .line 24
    .line 25
    .line 26
    invoke-static {v1, v1, v0}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    .line 27
    .line 28
    .line 29
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumDrawingCacheSize()I

    .line 30
    .line 31
    .line 32
    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    .line 33
    .line 34
    .line 35
    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    .line 36
    .line 37
    .line 38
    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    .line 39
    .line 40
    .line 41
    sget v0, Lcom/appsflyer/internal/AFc1iSDK;->component1:I

    .line 42
    .line 43
    add-int/lit8 v0, v0, 0x65

    .line 44
    .line 45
    rem-int/lit16 v0, v0, 0x80

    .line 46
    .line 47
    sput v0, Lcom/appsflyer/internal/AFc1iSDK;->areAllFieldsValid:I

    .line 48
    .line 49
    return-void
.end method

.method public constructor <init>(Ljava/util/Map;Landroid/content/Context;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Landroid/content/Context;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/appsflyer/internal/AFc1iSDK;->getMonetizationNetwork:Ljava/util/Map;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/appsflyer/internal/AFc1iSDK;->getRevenue:Landroid/content/Context;

    .line 7
    .line 8
    invoke-direct {p0}, Lcom/appsflyer/internal/AFc1iSDK;->AFAdRevenueData()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-direct {p0}, Lcom/appsflyer/internal/AFc1iSDK;->getMediationNetwork()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    invoke-virtual {p0, p1, p2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method private AFAdRevenueData()Ljava/lang/String;
    .locals 11

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    sget v1, Lcom/appsflyer/internal/AFc1iSDK;->component1:I

    .line 4
    .line 5
    add-int/lit8 v1, v1, 0x57

    .line 6
    .line 7
    rem-int/lit16 v1, v1, 0x80

    .line 8
    .line 9
    sput v1, Lcom/appsflyer/internal/AFc1iSDK;->areAllFieldsValid:I

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    const/4 v2, 0x0

    .line 13
    :try_start_0
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 14
    .line 15
    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    iget-object v4, p0, Lcom/appsflyer/internal/AFc1iSDK;->getMonetizationNetwork:Ljava/util/Map;

    .line 20
    .line 21
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    .line 22
    .line 23
    .line 24
    move-result-wide v5

    .line 25
    const-wide/16 v7, 0x0

    .line 26
    .line 27
    cmp-long v5, v5, v7

    .line 28
    .line 29
    rsub-int/lit8 v5, v5, 0xd

    .line 30
    .line 31
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    shr-int/lit8 v6, v6, 0x16

    .line 36
    .line 37
    invoke-static {v2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 38
    .line 39
    .line 40
    move-result v9

    .line 41
    add-int/lit16 v9, v9, 0x32ad

    .line 42
    .line 43
    int-to-char v9, v9

    .line 44
    new-array v10, v1, [Ljava/lang/Object;

    .line 45
    .line 46
    invoke-static {v5, v6, v9, v10}, Lcom/appsflyer/internal/AFc1iSDK;->a(IIC[Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    aget-object v5, v10, v2

    .line 50
    .line 51
    check-cast v5, Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    iget-object p0, p0, Lcom/appsflyer/internal/AFc1iSDK;->getMonetizationNetwork:Ljava/util/Map;

    .line 66
    .line 67
    const-string v5, "\uf4f5\u566c\ub1e4\u1362\u7ed7"

    .line 68
    .line 69
    invoke-static {v0, v0}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    const v9, 0xa289

    .line 74
    .line 75
    .line 76
    add-int/2addr v6, v9

    .line 77
    new-array v9, v1, [Ljava/lang/Object;

    .line 78
    .line 79
    invoke-static {v5, v6, v9}, Lcom/appsflyer/internal/AFc1iSDK;->b(Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    aget-object v5, v9, v2

    .line 83
    .line 84
    check-cast v5, Ljava/lang/String;

    .line 85
    .line 86
    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    invoke-interface {p0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 98
    if-nez p0, :cond_1

    .line 99
    .line 100
    sget p0, Lcom/appsflyer/internal/AFc1iSDK;->component1:I

    .line 101
    .line 102
    add-int/lit8 p0, p0, 0x65

    .line 103
    .line 104
    rem-int/lit16 v5, p0, 0x80

    .line 105
    .line 106
    sput v5, Lcom/appsflyer/internal/AFc1iSDK;->areAllFieldsValid:I

    .line 107
    .line 108
    rem-int/lit8 p0, p0, 0x2

    .line 109
    .line 110
    if-eqz p0, :cond_0

    .line 111
    .line 112
    :try_start_1
    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    .line 113
    .line 114
    .line 115
    move-result p0

    .line 116
    ushr-int/lit8 p0, p0, 0x43

    .line 117
    .line 118
    const/16 v5, 0x1a

    .line 119
    .line 120
    rem-int/2addr v5, p0

    .line 121
    invoke-static {v1, v2}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    .line 122
    .line 123
    .line 124
    move-result p0

    .line 125
    const/16 v6, 0x6b

    .line 126
    .line 127
    ushr-int p0, v6, p0

    .line 128
    .line 129
    invoke-static {v0, v0, v2}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    int-to-char v0, v0

    .line 134
    new-array v6, v1, [Ljava/lang/Object;

    .line 135
    .line 136
    invoke-static {v5, p0, v0, v6}, Lcom/appsflyer/internal/AFc1iSDK;->a(IIC[Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    aget-object p0, v6, v2

    .line 140
    .line 141
    :goto_0
    check-cast p0, Ljava/lang/String;

    .line 142
    .line 143
    invoke-virtual {p0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    goto :goto_1

    .line 148
    :catch_0
    move-exception p0

    .line 149
    goto :goto_4

    .line 150
    :cond_0
    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    .line 151
    .line 152
    .line 153
    move-result p0

    .line 154
    shr-int/lit8 p0, p0, 0x10

    .line 155
    .line 156
    rsub-int/lit8 p0, p0, 0x8

    .line 157
    .line 158
    invoke-static {v2, v2}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    .line 159
    .line 160
    .line 161
    move-result v5

    .line 162
    rsub-int/lit8 v5, v5, 0xc

    .line 163
    .line 164
    invoke-static {v0, v0, v2}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    int-to-char v0, v0

    .line 169
    new-array v6, v1, [Ljava/lang/Object;

    .line 170
    .line 171
    invoke-static {p0, v5, v0, v6}, Lcom/appsflyer/internal/AFc1iSDK;->a(IIC[Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    aget-object p0, v6, v2

    .line 175
    .line 176
    goto :goto_0

    .line 177
    :cond_1
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 178
    .line 179
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->reverse()Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    filled-new-array {v3, p0, v0}, [Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object p0

    .line 193
    invoke-static {p0}, Lcom/appsflyer/internal/AFc1iSDK;->getCurrencyIso4217Code([Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->length()I

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    const/4 v3, 0x4

    .line 202
    if-le v0, v3, :cond_2

    .line 203
    .line 204
    invoke-virtual {p0, v3, v0}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    goto :goto_3

    .line 208
    :cond_2
    :goto_2
    if-ge v0, v3, :cond_3

    .line 209
    .line 210
    add-int/lit8 v0, v0, 0x1

    .line 211
    .line 212
    const/16 v4, 0x31

    .line 213
    .line 214
    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 215
    .line 216
    .line 217
    sget v4, Lcom/appsflyer/internal/AFc1iSDK;->component1:I

    .line 218
    .line 219
    add-int/lit8 v4, v4, 0xb

    .line 220
    .line 221
    rem-int/lit16 v4, v4, 0x80

    .line 222
    .line 223
    sput v4, Lcom/appsflyer/internal/AFc1iSDK;->areAllFieldsValid:I

    .line 224
    .line 225
    goto :goto_2

    .line 226
    :cond_3
    :goto_3
    :try_start_2
    const-string v0, "\uf4fc\ub32f\u7b4b"

    .line 227
    .line 228
    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    .line 229
    .line 230
    .line 231
    move-result-wide v3

    .line 232
    cmp-long v3, v3, v7

    .line 233
    .line 234
    add-int/lit16 v3, v3, 0x47dc

    .line 235
    .line 236
    new-array v4, v1, [Ljava/lang/Object;

    .line 237
    .line 238
    invoke-static {v0, v3, v4}, Lcom/appsflyer/internal/AFc1iSDK;->b(Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 239
    .line 240
    .line 241
    aget-object v0, v4, v2

    .line 242
    .line 243
    check-cast v0, Ljava/lang/String;

    .line 244
    .line 245
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    invoke-virtual {p0, v2, v0}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object p0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 256
    return-object p0

    .line 257
    :goto_4
    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    .line 258
    .line 259
    .line 260
    move-result v0

    .line 261
    int-to-byte v0, v0

    .line 262
    const v3, 0xe044

    .line 263
    .line 264
    .line 265
    sub-int/2addr v3, v0

    .line 266
    new-array v0, v1, [Ljava/lang/Object;

    .line 267
    .line 268
    const-string v4, "\uf4b7\u14b5\u3478\u542c\u75d5\u95fc\ub542\ud511\uf6c6\u16da\u3643\u5601\u77c2\u977a\ub734\ud0f8\uf0e7\u1065\u3028\u51e6\u7196\u914c\ub118\ud2d0\uf286\u1244\u33f2\u53f0\u7370\u9323\ubce7\udcec\ufc5c\u1c17\u3dc4\u5dd8\u7d54\u9d07\ubedd\ude7c"

    .line 269
    .line 270
    invoke-static {v4, v3, v0}, Lcom/appsflyer/internal/AFc1iSDK;->b(Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 271
    .line 272
    .line 273
    aget-object v0, v0, v2

    .line 274
    .line 275
    check-cast v0, Ljava/lang/String;

    .line 276
    .line 277
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    invoke-static {v0, p0}, Lcom/appsflyer/AFLogger;->afErrorLogForExcManagerOnly(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 282
    .line 283
    .line 284
    new-instance v0, Ljava/lang/StringBuilder;

    .line 285
    .line 286
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 287
    .line 288
    .line 289
    invoke-static {v2}, Landroid/graphics/Color;->green(I)I

    .line 290
    .line 291
    .line 292
    move-result v3

    .line 293
    add-int/lit8 v3, v3, 0x2a

    .line 294
    .line 295
    invoke-static {v2}, Landroid/util/TypedValue;->complexToFloat(I)F

    .line 296
    .line 297
    .line 298
    move-result v4

    .line 299
    const/4 v5, 0x0

    .line 300
    cmpl-float v4, v4, v5

    .line 301
    .line 302
    rsub-int/lit8 v4, v4, 0x14

    .line 303
    .line 304
    invoke-static {v2}, Landroid/util/TypedValue;->complexToFloat(I)F

    .line 305
    .line 306
    .line 307
    move-result v6

    .line 308
    cmpl-float v5, v6, v5

    .line 309
    .line 310
    int-to-char v5, v5

    .line 311
    new-array v6, v1, [Ljava/lang/Object;

    .line 312
    .line 313
    invoke-static {v3, v4, v5, v6}, Lcom/appsflyer/internal/AFc1iSDK;->a(IIC[Ljava/lang/Object;)V

    .line 314
    .line 315
    .line 316
    aget-object v3, v6, v2

    .line 317
    .line 318
    check-cast v3, Ljava/lang/String;

    .line 319
    .line 320
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v3

    .line 324
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 325
    .line 326
    .line 327
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 328
    .line 329
    .line 330
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object p0

    .line 334
    invoke-static {p0}, Lcom/appsflyer/AFLogger;->afRDLog(Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I

    .line 338
    .line 339
    .line 340
    move-result p0

    .line 341
    shr-int/lit8 p0, p0, 0x8

    .line 342
    .line 343
    add-int/lit16 p0, p0, 0x2e7f

    .line 344
    .line 345
    new-array v0, v1, [Ljava/lang/Object;

    .line 346
    .line 347
    const-string v1, "\uf4fc\uda8d\ua80f\u7fd3\u4d52\u1cd5\ue254"

    .line 348
    .line 349
    invoke-static {v1, p0, v0}, Lcom/appsflyer/internal/AFc1iSDK;->b(Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 350
    .line 351
    .line 352
    aget-object p0, v0, v2

    .line 353
    .line 354
    check-cast p0, Ljava/lang/String;

    .line 355
    .line 356
    invoke-virtual {p0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object p0

    .line 360
    return-object p0
.end method

.method private static a(IIC[Ljava/lang/Object;)V
    .locals 12

    .line 1
    new-instance v0, Lcom/appsflyer/internal/AFk1mSDK;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/appsflyer/internal/AFk1mSDK;-><init>()V

    .line 4
    .line 5
    .line 6
    new-array v1, p0, [J

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    iput v2, v0, Lcom/appsflyer/internal/AFk1mSDK;->getMediationNetwork:I

    .line 10
    .line 11
    sget v3, Lcom/appsflyer/internal/AFc1iSDK;->$11:I

    .line 12
    .line 13
    add-int/lit8 v3, v3, 0x6f

    .line 14
    .line 15
    rem-int/lit16 v3, v3, 0x80

    .line 16
    .line 17
    sput v3, Lcom/appsflyer/internal/AFc1iSDK;->$10:I

    .line 18
    .line 19
    :goto_0
    iget v3, v0, Lcom/appsflyer/internal/AFk1mSDK;->getMediationNetwork:I

    .line 20
    .line 21
    if-ge v3, p0, :cond_0

    .line 22
    .line 23
    sget-object v4, Lcom/appsflyer/internal/AFc1iSDK;->getMediationNetwork:[C

    .line 24
    .line 25
    add-int v5, p1, v3

    .line 26
    .line 27
    aget-char v4, v4, v5

    .line 28
    .line 29
    int-to-long v4, v4

    .line 30
    const-wide v6, -0x23c534f92ee84d1bL    # -1.9474242828924747E136

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    xor-long/2addr v4, v6

    .line 36
    long-to-int v4, v4

    .line 37
    int-to-char v4, v4

    .line 38
    int-to-long v4, v4

    .line 39
    int-to-long v8, v3

    .line 40
    sget-wide v10, Lcom/appsflyer/internal/AFc1iSDK;->getCurrencyIso4217Code:J

    .line 41
    .line 42
    xor-long/2addr v6, v10

    .line 43
    mul-long/2addr v8, v6

    .line 44
    xor-long/2addr v4, v8

    .line 45
    int-to-long v6, p2

    .line 46
    xor-long/2addr v4, v6

    .line 47
    aput-wide v4, v1, v3

    .line 48
    .line 49
    add-int/lit8 v3, v3, 0x1

    .line 50
    .line 51
    iput v3, v0, Lcom/appsflyer/internal/AFk1mSDK;->getMediationNetwork:I

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    new-array p1, p0, [C

    .line 55
    .line 56
    iput v2, v0, Lcom/appsflyer/internal/AFk1mSDK;->getMediationNetwork:I

    .line 57
    .line 58
    sget p2, Lcom/appsflyer/internal/AFc1iSDK;->$11:I

    .line 59
    .line 60
    add-int/lit8 p2, p2, 0x6f

    .line 61
    .line 62
    rem-int/lit16 p2, p2, 0x80

    .line 63
    .line 64
    sput p2, Lcom/appsflyer/internal/AFc1iSDK;->$10:I

    .line 65
    .line 66
    :goto_1
    iget p2, v0, Lcom/appsflyer/internal/AFk1mSDK;->getMediationNetwork:I

    .line 67
    .line 68
    if-ge p2, p0, :cond_2

    .line 69
    .line 70
    sget v3, Lcom/appsflyer/internal/AFc1iSDK;->$11:I

    .line 71
    .line 72
    add-int/lit8 v3, v3, 0x4b

    .line 73
    .line 74
    rem-int/lit16 v4, v3, 0x80

    .line 75
    .line 76
    sput v4, Lcom/appsflyer/internal/AFc1iSDK;->$10:I

    .line 77
    .line 78
    rem-int/lit8 v3, v3, 0x2

    .line 79
    .line 80
    if-eqz v3, :cond_1

    .line 81
    .line 82
    aget-wide v3, v1, p2

    .line 83
    .line 84
    long-to-int v3, v3

    .line 85
    int-to-char v3, v3

    .line 86
    aput-char v3, p1, p2

    .line 87
    .line 88
    div-int/lit8 p2, p2, 0x0

    .line 89
    .line 90
    :goto_2
    iput p2, v0, Lcom/appsflyer/internal/AFk1mSDK;->getMediationNetwork:I

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_1
    aget-wide v3, v1, p2

    .line 94
    .line 95
    long-to-int v3, v3

    .line 96
    int-to-char v3, v3

    .line 97
    aput-char v3, p1, p2

    .line 98
    .line 99
    add-int/lit8 p2, p2, 0x1

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_2
    new-instance p0, Ljava/lang/String;

    .line 103
    .line 104
    invoke-direct {p0, p1}, Ljava/lang/String;-><init>([C)V

    .line 105
    .line 106
    .line 107
    aput-object p0, p3, v2

    .line 108
    .line 109
    return-void
.end method

.method private static b(Ljava/lang/String;I[Ljava/lang/Object;)V
    .locals 11

    .line 1
    sget v0, Lcom/appsflyer/internal/AFc1iSDK;->$10:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x39

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, Lcom/appsflyer/internal/AFc1iSDK;->$11:I

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    :cond_0
    check-cast p0, [C

    .line 16
    .line 17
    new-instance v0, Lcom/appsflyer/internal/AFk1nSDK;

    .line 18
    .line 19
    invoke-direct {v0}, Lcom/appsflyer/internal/AFk1nSDK;-><init>()V

    .line 20
    .line 21
    .line 22
    iput p1, v0, Lcom/appsflyer/internal/AFk1nSDK;->AFAdRevenueData:I

    .line 23
    .line 24
    array-length p1, p0

    .line 25
    new-array v1, p1, [J

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    iput v2, v0, Lcom/appsflyer/internal/AFk1nSDK;->getRevenue:I

    .line 29
    .line 30
    sget v3, Lcom/appsflyer/internal/AFc1iSDK;->$10:I

    .line 31
    .line 32
    add-int/lit8 v3, v3, 0x1d

    .line 33
    .line 34
    rem-int/lit16 v3, v3, 0x80

    .line 35
    .line 36
    sput v3, Lcom/appsflyer/internal/AFc1iSDK;->$11:I

    .line 37
    .line 38
    :goto_0
    iget v3, v0, Lcom/appsflyer/internal/AFk1nSDK;->getRevenue:I

    .line 39
    .line 40
    array-length v4, p0

    .line 41
    if-ge v3, v4, :cond_1

    .line 42
    .line 43
    sget v4, Lcom/appsflyer/internal/AFc1iSDK;->$11:I

    .line 44
    .line 45
    add-int/lit8 v4, v4, 0x55

    .line 46
    .line 47
    rem-int/lit16 v4, v4, 0x80

    .line 48
    .line 49
    sput v4, Lcom/appsflyer/internal/AFc1iSDK;->$10:I

    .line 50
    .line 51
    aget-char v5, p0, v3

    .line 52
    .line 53
    int-to-long v5, v5

    .line 54
    int-to-long v7, v3

    .line 55
    iget v9, v0, Lcom/appsflyer/internal/AFk1nSDK;->AFAdRevenueData:I

    .line 56
    .line 57
    int-to-long v9, v9

    .line 58
    mul-long/2addr v7, v9

    .line 59
    xor-long/2addr v5, v7

    .line 60
    sget-wide v7, Lcom/appsflyer/internal/AFc1iSDK;->AFAdRevenueData:J

    .line 61
    .line 62
    const-wide v9, -0x40d670a12214c690L    # -1.9500763933994912E-4

    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    xor-long/2addr v7, v9

    .line 68
    xor-long/2addr v5, v7

    .line 69
    aput-wide v5, v1, v3

    .line 70
    .line 71
    add-int/lit8 v3, v3, 0x1

    .line 72
    .line 73
    iput v3, v0, Lcom/appsflyer/internal/AFk1nSDK;->getRevenue:I

    .line 74
    .line 75
    add-int/lit8 v4, v4, 0x65

    .line 76
    .line 77
    rem-int/lit16 v4, v4, 0x80

    .line 78
    .line 79
    sput v4, Lcom/appsflyer/internal/AFc1iSDK;->$11:I

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_1
    new-array p1, p1, [C

    .line 83
    .line 84
    iput v2, v0, Lcom/appsflyer/internal/AFk1nSDK;->getRevenue:I

    .line 85
    .line 86
    :goto_1
    iget v3, v0, Lcom/appsflyer/internal/AFk1nSDK;->getRevenue:I

    .line 87
    .line 88
    array-length v4, p0

    .line 89
    if-ge v3, v4, :cond_2

    .line 90
    .line 91
    aget-wide v4, v1, v3

    .line 92
    .line 93
    long-to-int v4, v4

    .line 94
    int-to-char v4, v4

    .line 95
    aput-char v4, p1, v3

    .line 96
    .line 97
    add-int/lit8 v3, v3, 0x1

    .line 98
    .line 99
    iput v3, v0, Lcom/appsflyer/internal/AFk1nSDK;->getRevenue:I

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_2
    new-instance p0, Ljava/lang/String;

    .line 103
    .line 104
    invoke-direct {p0, p1}, Ljava/lang/String;-><init>([C)V

    .line 105
    .line 106
    .line 107
    aput-object p0, p2, v2

    .line 108
    .line 109
    return-void
.end method

.method private static varargs getCurrencyIso4217Code([Ljava/lang/String;)Ljava/lang/StringBuilder;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 25
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 26
    array-length v1, p0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    const/4 v3, 0x3

    if-ge v2, v3, :cond_0

    aget-object v3, p0, v2

    .line 27
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    .line 28
    sget v3, Lcom/appsflyer/internal/AFc1iSDK;->areAllFieldsValid:I

    add-int/lit8 v3, v3, 0x57

    rem-int/lit16 v3, v3, 0x80

    sput v3, Lcom/appsflyer/internal/AFc1iSDK;->component1:I

    goto :goto_0

    .line 29
    :cond_0
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 30
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    .line 31
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    move v4, v1

    :goto_1
    if-ge v4, v0, :cond_3

    const/4 v5, 0x0

    move v6, v1

    :goto_2
    if-ge v6, v3, :cond_2

    .line 32
    aget-object v7, p0, v6

    .line 33
    invoke-virtual {v7, v4}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-nez v5, :cond_1

    goto :goto_3

    .line 34
    :cond_1
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    xor-int/2addr v7, v5

    :goto_3
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 35
    :cond_2
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v5

    .line 36
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, 0x1

    .line 37
    sget v5, Lcom/appsflyer/internal/AFc1iSDK;->areAllFieldsValid:I

    add-int/lit8 v5, v5, 0x55

    rem-int/lit16 v5, v5, 0x80

    sput v5, Lcom/appsflyer/internal/AFc1iSDK;->component1:I

    goto :goto_1

    :cond_3
    return-object v2
.end method

.method public static getCurrencyIso4217Code()V
    .locals 2

    .line 1
    const/16 v0, 0xb8

    .line 2
    .line 3
    new-array v0, v0, [C

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/appsflyer/internal/AFc1iSDK;->getMediationNetwork:[C

    .line 9
    .line 10
    const-wide v0, 0x4447fe275cdbdecaL    # 8.85177644408901E20

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    sput-wide v0, Lcom/appsflyer/internal/AFc1iSDK;->getCurrencyIso4217Code:J

    .line 16
    .line 17
    const-wide v0, 0x23dcaa397ae6cde7L    # 6.162160406582387E-136

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    sput-wide v0, Lcom/appsflyer/internal/AFc1iSDK;->AFAdRevenueData:J

    .line 23
    .line 24
    return-void

    .line 25
    :array_0
    .array-data 2
        -0x7fd7s
        -0x13ffs
        0x5849s
        -0x3b4fs
        0x309ds
        -0x6332s
        0x937s
        0x7572s
        -0x1ebcs
        0x4d8es
        -0x460ds
        0x263ds
        -0x4d55s
        -0x217bs
        0x6ae4s
        -0x9d6s
        0x20bs
        -0x51b1s
        0x3bb1s
        0x47e8s
        -0x4d7ds
        -0x2155s
        0x6ad2s
        -0x9fcs
        0x23cs
        -0x5196s
        0x3bdfs
        0x47cbs
        -0x2c08s
        0x7f2cs
        -0x74aas
        0x1492s
        -0x5f50s
        -0x330es
        0x581es
        -0x1bb6s
        0x7072s
        -0x6226s
        0x29c0s
        -0x4a03s
        -0x3ed1s
        0x6d1es
        -0x17cs
        0xab9s
        -0x690cs
        0x2252s
        0x4e54s
        -0x2587s
        0x67b5s
        -0xc22s
        0x1f47s
        -0x54cfs
        0x377ds
        0x4089s
        -0x1342s
        0x78f8s
        -0x7bf3s
        0x1047s
        -0x4390s
        -0x365es
        0x5587s
        -0x1ebes
        -0x6c3es
        -0xbs
        0x4b9bs
        -0x28b2s
        0x2366s
        -0x70d7s
        -0x4d38s
        -0x2148s
        0x6ad8s
        -0x9bas
        0x273s
        -0x4d7ds
        -0x2155s
        0x6ad2s
        -0x9fcs
        0x23cs
        -0x5196s
        0x3bdfs
        0x47cbs
        -0x2c08s
        0x7f2cs
        -0x74aas
        0x1492s
        -0x5f50s
        -0x330es
        0x581es
        -0x1bb6s
        0x7072s
        -0x6226s
        0x29c0s
        -0x4a03s
        -0x3ed1s
        0x6d1es
        -0x167s
        0xabds
        -0x691fs
        0x2207s
        0x4e46s
        -0x25d0s
        0x67b6s
        -0xc21s
        0x1f13s
        -0x54c4s
        0x3725s
        0x408fs
        -0x135ds
        0x78ebs
        -0x7be4s
        0x105es
        -0x4395s
        -0x365bs
        0x55d2s
        -0x1ef4s
        0xd69s
        -0x66e0s
        -0x4d7cs
        -0x215cs
        0x6adfs
        -0x9e6s
        0x236s
        -0x5199s
        0x3b9bs
        0x4782s
        -0x2c0cs
        0x7f2cs
        -0x74b9s
        0x1485s
        -0x5f41s
        -0x330es
        0x5859s
        -0x1bbbs
        0x7076s
        -0x6272s
        0x29c2s
        -0x4a09s
        -0x3ed9s
        0x6d10s
        -0x153s
        0xa9ds
        -0x6927s
        0x2226s
        0x4e66s
        -0x25bes
        0x6798s
        -0xc17s
        0x1f24s
        -0x54e4s
        0x3744s
        0x40a4s
        -0x1364s
        0x78cds
        -0x7bc3s
        -0x4d6fs
        -0x2151s
        0x6ad6s
        -0x9e8s
        0x23cs
        -0x5184s
        0x3b9es
        0x47d8s
        -0x2c18s
        0x7f30s
        -0x74aas
        -0x4d79s
        0x78c9s
        0x14b3s
        -0x4d7es
        -0x2151s
        0x6acfs
        -0x9c2s
        0x26bs
        -0x51a8s
        0x3b9es
        0x47c0s
        -0x2c18s
        0x7f27s
        -0x74eds
        0x1485s
        -0x5f5ds
        -0x330cs
        0x5818s
        -0x1baas
    .end array-data
.end method

.method private getMediationNetwork()Ljava/lang/String;
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v2, ""

    .line 4
    .line 5
    const/16 v3, 0x30

    .line 6
    .line 7
    const-wide/16 v4, 0x0

    .line 8
    .line 9
    const/16 v6, 0x10

    .line 10
    .line 11
    const/4 v7, 0x1

    .line 12
    const/4 v8, 0x0

    .line 13
    :try_start_0
    iget-object v0, v1, Lcom/appsflyer/internal/AFc1iSDK;->getMonetizationNetwork:Ljava/util/Map;

    .line 14
    .line 15
    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    .line 16
    .line 17
    .line 18
    move-result v9

    .line 19
    shr-int/2addr v9, v6

    .line 20
    rsub-int/lit8 v9, v9, 0xc

    .line 21
    .line 22
    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    .line 23
    .line 24
    .line 25
    move-result v10

    .line 26
    shr-int/2addr v10, v6

    .line 27
    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    .line 28
    .line 29
    .line 30
    move-result-wide v11

    .line 31
    cmp-long v11, v11, v4

    .line 32
    .line 33
    add-int/lit16 v11, v11, 0x32ac

    .line 34
    .line 35
    int-to-char v11, v11

    .line 36
    new-array v12, v7, [Ljava/lang/Object;

    .line 37
    .line 38
    invoke-static {v9, v10, v11, v12}, Lcom/appsflyer/internal/AFc1iSDK;->a(IIC[Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    aget-object v9, v12, v8

    .line 42
    .line 43
    check-cast v9, Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {v9}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v9

    .line 49
    invoke-interface {v0, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iget-object v9, v1, Lcom/appsflyer/internal/AFc1iSDK;->getMonetizationNetwork:Ljava/util/Map;

    .line 58
    .line 59
    const-string v10, "\uf4f1\u379b\u722f\ubecb\uf977\u2422\u60a8\ua321\uefd1\u2a79\u550d\u9184\udc4a\u18c2\u5b74"

    .line 60
    .line 61
    invoke-static {v8}, Landroid/graphics/Color;->blue(I)I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    const v12, 0xc365

    .line 66
    .line 67
    .line 68
    add-int/2addr v11, v12

    .line 69
    new-array v12, v7, [Ljava/lang/Object;

    .line 70
    .line 71
    invoke-static {v10, v11, v12}, Lcom/appsflyer/internal/AFc1iSDK;->b(Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    aget-object v10, v12, v8

    .line 75
    .line 76
    check-cast v10, Ljava/lang/String;

    .line 77
    .line 78
    invoke-virtual {v10}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v10

    .line 82
    invoke-interface {v9, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v9

    .line 86
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v9

    .line 90
    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    .line 91
    .line 92
    .line 93
    move-result v10

    .line 94
    shr-int/lit8 v10, v10, 0x8

    .line 95
    .line 96
    add-int/lit8 v10, v10, 0x6

    .line 97
    .line 98
    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    .line 99
    .line 100
    .line 101
    move-result v11

    .line 102
    shr-int/2addr v11, v6

    .line 103
    rsub-int/lit8 v11, v11, 0x3e

    .line 104
    .line 105
    invoke-static {v8, v8}, Landroid/view/KeyEvent;->getDeadChar(II)I

    .line 106
    .line 107
    .line 108
    move-result v12

    .line 109
    add-int/lit16 v12, v12, 0x2111

    .line 110
    .line 111
    int-to-char v12, v12

    .line 112
    new-array v13, v7, [Ljava/lang/Object;

    .line 113
    .line 114
    invoke-static {v10, v11, v12, v13}, Lcom/appsflyer/internal/AFc1iSDK;->a(IIC[Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    aget-object v10, v13, v8

    .line 118
    .line 119
    check-cast v10, Ljava/lang/String;

    .line 120
    .line 121
    invoke-virtual {v10}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v10

    .line 125
    invoke-static {v3}, Landroid/text/AndroidCharacter;->getMirror(C)C

    .line 126
    .line 127
    .line 128
    move-result v11

    .line 129
    rsub-int/lit8 v11, v11, 0x35

    .line 130
    .line 131
    invoke-static {v8, v8, v8}, Landroid/graphics/Color;->rgb(III)I

    .line 132
    .line 133
    .line 134
    move-result v12

    .line 135
    const v13, 0x1000044

    .line 136
    .line 137
    .line 138
    add-int/2addr v12, v13

    .line 139
    invoke-static {v8}, Landroid/util/TypedValue;->complexToFloat(I)F

    .line 140
    .line 141
    .line 142
    move-result v13

    .line 143
    const/4 v14, 0x0

    .line 144
    cmpl-float v13, v13, v14

    .line 145
    .line 146
    int-to-char v13, v13

    .line 147
    new-array v14, v7, [Ljava/lang/Object;

    .line 148
    .line 149
    invoke-static {v11, v12, v13, v14}, Lcom/appsflyer/internal/AFc1iSDK;->a(IIC[Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    aget-object v11, v14, v8

    .line 153
    .line 154
    check-cast v11, Ljava/lang/String;

    .line 155
    .line 156
    invoke-virtual {v11}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v11

    .line 160
    invoke-virtual {v10, v11, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v10

    .line 164
    new-instance v11, Ljava/lang/StringBuilder;

    .line 165
    .line 166
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    invoke-static {v0}, Lcom/appsflyer/internal/AFj1dSDK;->getCurrencyIso4217Code(Ljava/lang/String;)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    invoke-virtual {v0, v8, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 190
    :goto_0
    move-object v9, v0

    .line 191
    goto :goto_1

    .line 192
    :catch_0
    move-exception v0

    .line 193
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    .line 194
    .line 195
    .line 196
    move-result v9

    .line 197
    shr-int/2addr v9, v6

    .line 198
    rsub-int v9, v9, 0x535d

    .line 199
    .line 200
    new-array v10, v7, [Ljava/lang/Object;

    .line 201
    .line 202
    const-string v11, "\uf4f0\ua7af\u5259\u0ed6\ub9d1\u5410\u00d8\ub370\u6e0a\u1ab7\ub515\u600e\u1caa\ucf47\u7bed\u1681\uc123\u7d9a\u287a\udb15\u77bd\u2253\udd1b\u89ad\u245b\ud0eb\u838b\u3e3f\uea9b\u8575\u3014\uecb2\u9f17\u4a1c\ue6ac\u914c\u4df6\uf883"

    .line 203
    .line 204
    invoke-static {v11, v9, v10}, Lcom/appsflyer/internal/AFc1iSDK;->b(Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    aget-object v9, v10, v8

    .line 208
    .line 209
    check-cast v9, Ljava/lang/String;

    .line 210
    .line 211
    invoke-virtual {v9}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v9

    .line 215
    invoke-static {v9, v0}, Lcom/appsflyer/AFLogger;->afErrorLogForExcManagerOnly(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 216
    .line 217
    .line 218
    new-instance v9, Ljava/lang/StringBuilder;

    .line 219
    .line 220
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 221
    .line 222
    .line 223
    invoke-static {v8}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 224
    .line 225
    .line 226
    move-result v10

    .line 227
    rsub-int/lit8 v10, v10, 0x2c

    .line 228
    .line 229
    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    .line 230
    .line 231
    .line 232
    move-result v11

    .line 233
    shr-int/lit8 v11, v11, 0x8

    .line 234
    .line 235
    rsub-int/lit8 v11, v11, 0x49

    .line 236
    .line 237
    invoke-static {v8}, Landroid/graphics/Color;->red(I)I

    .line 238
    .line 239
    .line 240
    move-result v12

    .line 241
    int-to-char v12, v12

    .line 242
    new-array v13, v7, [Ljava/lang/Object;

    .line 243
    .line 244
    invoke-static {v10, v11, v12, v13}, Lcom/appsflyer/internal/AFc1iSDK;->a(IIC[Ljava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    aget-object v10, v13, v8

    .line 248
    .line 249
    check-cast v10, Ljava/lang/String;

    .line 250
    .line 251
    invoke-virtual {v10}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v10

    .line 255
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    invoke-static {v0}, Lcom/appsflyer/AFLogger;->afRDLog(Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    new-instance v0, Ljava/lang/StringBuilder;

    .line 269
    .line 270
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    .line 274
    .line 275
    .line 276
    move-result-wide v9

    .line 277
    cmp-long v9, v9, v4

    .line 278
    .line 279
    add-int/lit16 v9, v9, 0x50b6

    .line 280
    .line 281
    new-array v10, v7, [Ljava/lang/Object;

    .line 282
    .line 283
    const-string v11, "\uf4f5\ua441\u559b\u06d7\ub62a\u6761\u10ed\uc1a3\u711b\u22c8\ud3d5\u8373\u3c32\uedba\u9ea7\u4e1e\uffd6\ua888"

    .line 284
    .line 285
    invoke-static {v11, v9, v10}, Lcom/appsflyer/internal/AFc1iSDK;->b(Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 286
    .line 287
    .line 288
    aget-object v9, v10, v8

    .line 289
    .line 290
    check-cast v9, Ljava/lang/String;

    .line 291
    .line 292
    invoke-virtual {v9}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v9

    .line 296
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 297
    .line 298
    .line 299
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    goto :goto_0

    .line 304
    :goto_1
    :try_start_1
    iget-object v0, v1, Lcom/appsflyer/internal/AFc1iSDK;->getRevenue:Landroid/content/Context;

    .line 305
    .line 306
    new-instance v10, Landroid/content/IntentFilter;

    .line 307
    .line 308
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarSize()I

    .line 309
    .line 310
    .line 311
    move-result v11

    .line 312
    shr-int/lit8 v11, v11, 0x8

    .line 313
    .line 314
    rsub-int/lit8 v11, v11, 0x25

    .line 315
    .line 316
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 317
    .line 318
    .line 319
    move-result v12

    .line 320
    shr-int/lit8 v12, v12, 0x16

    .line 321
    .line 322
    rsub-int/lit8 v12, v12, 0x75

    .line 323
    .line 324
    invoke-static {v2, v8}, Landroid/text/TextUtils;->getOffsetBefore(Ljava/lang/CharSequence;I)I

    .line 325
    .line 326
    .line 327
    move-result v13

    .line 328
    int-to-char v13, v13

    .line 329
    new-array v14, v7, [Ljava/lang/Object;

    .line 330
    .line 331
    invoke-static {v11, v12, v13, v14}, Lcom/appsflyer/internal/AFc1iSDK;->a(IIC[Ljava/lang/Object;)V

    .line 332
    .line 333
    .line 334
    aget-object v11, v14, v8

    .line 335
    .line 336
    check-cast v11, Ljava/lang/String;

    .line 337
    .line 338
    invoke-virtual {v11}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object v11

    .line 342
    invoke-direct {v10, v11}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 343
    .line 344
    .line 345
    const/4 v11, 0x0

    .line 346
    invoke-virtual {v0, v11, v10}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    const/16 v10, -0xa8c

    .line 351
    .line 352
    if-eqz v0, :cond_0

    .line 353
    .line 354
    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    .line 355
    .line 356
    .line 357
    move-result-wide v11

    .line 358
    cmp-long v11, v11, v4

    .line 359
    .line 360
    add-int/lit8 v11, v11, 0xa

    .line 361
    .line 362
    invoke-static {v8, v8}, Landroid/view/View;->combineMeasuredStates(II)I

    .line 363
    .line 364
    .line 365
    move-result v12

    .line 366
    add-int/lit16 v12, v12, 0x9a

    .line 367
    .line 368
    invoke-static {v8, v8, v8, v8}, Landroid/graphics/Color;->argb(IIII)I

    .line 369
    .line 370
    .line 371
    move-result v13

    .line 372
    int-to-char v13, v13

    .line 373
    new-array v14, v7, [Ljava/lang/Object;

    .line 374
    .line 375
    invoke-static {v11, v12, v13, v14}, Lcom/appsflyer/internal/AFc1iSDK;->a(IIC[Ljava/lang/Object;)V

    .line 376
    .line 377
    .line 378
    aget-object v11, v14, v8

    .line 379
    .line 380
    check-cast v11, Ljava/lang/String;

    .line 381
    .line 382
    invoke-virtual {v11}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v11

    .line 386
    invoke-virtual {v0, v11, v10}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 387
    .line 388
    .line 389
    move-result v10

    .line 390
    goto :goto_2

    .line 391
    :catch_1
    move-exception v0

    .line 392
    goto/16 :goto_6

    .line 393
    .line 394
    :cond_0
    :goto_2
    iget-object v0, v1, Lcom/appsflyer/internal/AFc1iSDK;->getRevenue:Landroid/content/Context;

    .line 395
    .line 396
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->nativeLibraryDir:Ljava/lang/String;

    .line 401
    .line 402
    if-eqz v0, :cond_1

    .line 403
    .line 404
    const-string v11, "\uf4ef\udfc6\ua273"

    .line 405
    .line 406
    invoke-static {v2, v3}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    .line 407
    .line 408
    .line 409
    move-result v12

    .line 410
    rsub-int v12, v12, 0x2b68

    .line 411
    .line 412
    new-array v13, v7, [Ljava/lang/Object;

    .line 413
    .line 414
    invoke-static {v11, v12, v13}, Lcom/appsflyer/internal/AFc1iSDK;->b(Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 415
    .line 416
    .line 417
    aget-object v11, v13, v8

    .line 418
    .line 419
    check-cast v11, Ljava/lang/String;

    .line 420
    .line 421
    invoke-virtual {v11}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object v11

    .line 425
    invoke-virtual {v0, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 426
    .line 427
    .line 428
    move-result v0

    .line 429
    if-eqz v0, :cond_1

    .line 430
    .line 431
    move v0, v7

    .line 432
    goto :goto_3

    .line 433
    :cond_1
    move v0, v8

    .line 434
    :goto_3
    iget-object v11, v1, Lcom/appsflyer/internal/AFc1iSDK;->getRevenue:Landroid/content/Context;

    .line 435
    .line 436
    const-string v12, "\uf4e4\u971b\u332b\udf5f\u7b5c\u0768"

    .line 437
    .line 438
    invoke-static {v2, v3}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    .line 439
    .line 440
    .line 441
    move-result v13

    .line 442
    add-int/lit16 v13, v13, 0x63ea

    .line 443
    .line 444
    new-array v14, v7, [Ljava/lang/Object;

    .line 445
    .line 446
    invoke-static {v12, v13, v14}, Lcom/appsflyer/internal/AFc1iSDK;->b(Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 447
    .line 448
    .line 449
    aget-object v12, v14, v8

    .line 450
    .line 451
    check-cast v12, Ljava/lang/String;

    .line 452
    .line 453
    invoke-virtual {v12}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    move-result-object v12

    .line 457
    invoke-virtual {v11, v12}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    move-result-object v11

    .line 461
    check-cast v11, Landroid/hardware/SensorManager;

    .line 462
    .line 463
    const/4 v12, -0x1

    .line 464
    invoke-virtual {v11, v12}, Landroid/hardware/SensorManager;->getSensorList(I)Ljava/util/List;

    .line 465
    .line 466
    .line 467
    move-result-object v11

    .line 468
    invoke-interface {v11}, Ljava/util/List;->size()I

    .line 469
    .line 470
    .line 471
    move-result v11

    .line 472
    new-instance v13, Ljava/lang/StringBuilder;

    .line 473
    .line 474
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 475
    .line 476
    .line 477
    invoke-static {v8}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    .line 478
    .line 479
    .line 480
    move-result-wide v14

    .line 481
    cmp-long v4, v14, v4

    .line 482
    .line 483
    add-int/2addr v4, v7

    .line 484
    invoke-static {v8}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 485
    .line 486
    .line 487
    move-result v5

    .line 488
    rsub-int v5, v5, 0xa5

    .line 489
    .line 490
    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    .line 491
    .line 492
    .line 493
    move-result-wide v14

    .line 494
    const-wide/16 v16, -0x1

    .line 495
    .line 496
    cmp-long v14, v14, v16

    .line 497
    .line 498
    add-int/2addr v14, v12

    .line 499
    int-to-char v12, v14

    .line 500
    new-array v14, v7, [Ljava/lang/Object;

    .line 501
    .line 502
    invoke-static {v4, v5, v12, v14}, Lcom/appsflyer/internal/AFc1iSDK;->a(IIC[Ljava/lang/Object;)V

    .line 503
    .line 504
    .line 505
    aget-object v4, v14, v8

    .line 506
    .line 507
    check-cast v4, Ljava/lang/String;

    .line 508
    .line 509
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 510
    .line 511
    .line 512
    move-result-object v4

    .line 513
    invoke-virtual {v13, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 514
    .line 515
    .line 516
    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 517
    .line 518
    .line 519
    const-string v4, "\uf4b1\uc57e"

    .line 520
    .line 521
    invoke-static {v8}, Landroid/graphics/Color;->red(I)I

    .line 522
    .line 523
    .line 524
    move-result v5

    .line 525
    add-int/lit16 v5, v5, 0x3191

    .line 526
    .line 527
    new-array v10, v7, [Ljava/lang/Object;

    .line 528
    .line 529
    invoke-static {v4, v5, v10}, Lcom/appsflyer/internal/AFc1iSDK;->b(Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 530
    .line 531
    .line 532
    aget-object v4, v10, v8

    .line 533
    .line 534
    check-cast v4, Ljava/lang/String;

    .line 535
    .line 536
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 537
    .line 538
    .line 539
    move-result-object v4

    .line 540
    invoke-virtual {v13, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 541
    .line 542
    .line 543
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 544
    .line 545
    .line 546
    invoke-static {v8, v8}, Landroid/view/View;->combineMeasuredStates(II)I

    .line 547
    .line 548
    .line 549
    move-result v0

    .line 550
    add-int/lit8 v0, v0, 0x2

    .line 551
    .line 552
    invoke-static {v8, v8, v8}, Landroid/graphics/Color;->rgb(III)I

    .line 553
    .line 554
    .line 555
    move-result v4

    .line 556
    const v5, -0xffff5a

    .line 557
    .line 558
    .line 559
    sub-int/2addr v5, v4

    .line 560
    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    .line 561
    .line 562
    .line 563
    move-result v4

    .line 564
    shr-int/lit8 v4, v4, 0x8

    .line 565
    .line 566
    const v10, 0xca0a

    .line 567
    .line 568
    .line 569
    add-int/2addr v4, v10

    .line 570
    int-to-char v4, v4

    .line 571
    new-array v10, v7, [Ljava/lang/Object;

    .line 572
    .line 573
    invoke-static {v0, v5, v4, v10}, Lcom/appsflyer/internal/AFc1iSDK;->a(IIC[Ljava/lang/Object;)V

    .line 574
    .line 575
    .line 576
    aget-object v0, v10, v8

    .line 577
    .line 578
    check-cast v0, Ljava/lang/String;

    .line 579
    .line 580
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 581
    .line 582
    .line 583
    move-result-object v0

    .line 584
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 585
    .line 586
    .line 587
    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 588
    .line 589
    .line 590
    const-string v0, "\uf4b1\u8bd6"

    .line 591
    .line 592
    invoke-static {v8, v8, v8}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 593
    .line 594
    .line 595
    move-result v4

    .line 596
    rsub-int v4, v4, 0x7f31

    .line 597
    .line 598
    new-array v5, v7, [Ljava/lang/Object;

    .line 599
    .line 600
    invoke-static {v0, v4, v5}, Lcom/appsflyer/internal/AFc1iSDK;->b(Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 601
    .line 602
    .line 603
    aget-object v0, v5, v8

    .line 604
    .line 605
    check-cast v0, Ljava/lang/String;

    .line 606
    .line 607
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 608
    .line 609
    .line 610
    move-result-object v0

    .line 611
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 612
    .line 613
    .line 614
    iget-object v0, v1, Lcom/appsflyer/internal/AFc1iSDK;->getMonetizationNetwork:Ljava/util/Map;

    .line 615
    .line 616
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 617
    .line 618
    .line 619
    move-result v0

    .line 620
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 621
    .line 622
    .line 623
    invoke-virtual {v13}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 624
    .line 625
    .line 626
    move-result-object v0

    .line 627
    new-instance v1, Ljava/lang/StringBuilder;

    .line 628
    .line 629
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 630
    .line 631
    .line 632
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 633
    .line 634
    .line 635
    invoke-static {v0}, Lcom/appsflyer/internal/AFc1iSDK$AFa1ySDK;->AFAdRevenueData(Ljava/lang/String;)[B

    .line 636
    .line 637
    .line 638
    move-result-object v0

    .line 639
    invoke-static {v0}, Lcom/appsflyer/internal/AFc1iSDK$AFa1ySDK;->getMediationNetwork([B)[B

    .line 640
    .line 641
    .line 642
    move-result-object v0

    .line 643
    new-instance v4, Ljava/lang/StringBuilder;

    .line 644
    .line 645
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 646
    .line 647
    .line 648
    array-length v5, v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 649
    move v10, v8

    .line 650
    :goto_4
    if-ge v10, v5, :cond_4

    .line 651
    .line 652
    sget v11, Lcom/appsflyer/internal/AFc1iSDK;->component1:I

    .line 653
    .line 654
    add-int/lit8 v11, v11, 0x25

    .line 655
    .line 656
    rem-int/lit16 v12, v11, 0x80

    .line 657
    .line 658
    sput v12, Lcom/appsflyer/internal/AFc1iSDK;->areAllFieldsValid:I

    .line 659
    .line 660
    rem-int/lit8 v11, v11, 0x2

    .line 661
    .line 662
    if-eqz v11, :cond_2

    .line 663
    .line 664
    :try_start_2
    aget-byte v11, v0, v10

    .line 665
    .line 666
    invoke-static {v11}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 667
    .line 668
    .line 669
    move-result-object v11

    .line 670
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 671
    .line 672
    .line 673
    move-result v12

    .line 674
    if-ne v12, v7, :cond_3

    .line 675
    .line 676
    goto :goto_5

    .line 677
    :cond_2
    aget-byte v11, v0, v10

    .line 678
    .line 679
    invoke-static {v11}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 680
    .line 681
    .line 682
    move-result-object v11

    .line 683
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 684
    .line 685
    .line 686
    move-result v12

    .line 687
    if-ne v12, v7, :cond_3

    .line 688
    .line 689
    :goto_5
    const-string v12, "0"

    .line 690
    .line 691
    invoke-virtual {v12, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 692
    .line 693
    .line 694
    move-result-object v11
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 695
    sget v12, Lcom/appsflyer/internal/AFc1iSDK;->component1:I

    .line 696
    .line 697
    add-int/lit8 v12, v12, 0x45

    .line 698
    .line 699
    rem-int/lit16 v12, v12, 0x80

    .line 700
    .line 701
    sput v12, Lcom/appsflyer/internal/AFc1iSDK;->areAllFieldsValid:I

    .line 702
    .line 703
    :cond_3
    :try_start_3
    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 704
    .line 705
    .line 706
    add-int/lit8 v10, v10, 0x1

    .line 707
    .line 708
    goto :goto_4

    .line 709
    :cond_4
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 710
    .line 711
    .line 712
    move-result-object v0

    .line 713
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 714
    .line 715
    .line 716
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 717
    .line 718
    .line 719
    move-result-object v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 720
    goto :goto_7

    .line 721
    :goto_6
    invoke-static {v8}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 722
    .line 723
    .line 724
    move-result v1

    .line 725
    rsub-int/lit8 v1, v1, 0x10

    .line 726
    .line 727
    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    .line 728
    .line 729
    .line 730
    move-result v4

    .line 731
    shr-int/lit8 v4, v4, 0x8

    .line 732
    .line 733
    add-int/lit16 v4, v4, 0xa8

    .line 734
    .line 735
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    .line 736
    .line 737
    .line 738
    move-result v5

    .line 739
    shr-int/2addr v5, v6

    .line 740
    int-to-char v5, v5

    .line 741
    new-array v10, v7, [Ljava/lang/Object;

    .line 742
    .line 743
    invoke-static {v1, v4, v5, v10}, Lcom/appsflyer/internal/AFc1iSDK;->a(IIC[Ljava/lang/Object;)V

    .line 744
    .line 745
    .line 746
    aget-object v1, v10, v8

    .line 747
    .line 748
    check-cast v1, Ljava/lang/String;

    .line 749
    .line 750
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 751
    .line 752
    .line 753
    move-result-object v1

    .line 754
    invoke-static {v1, v0}, Lcom/appsflyer/AFLogger;->afErrorLogForExcManagerOnly(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 755
    .line 756
    .line 757
    new-instance v1, Ljava/lang/StringBuilder;

    .line 758
    .line 759
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 760
    .line 761
    .line 762
    invoke-static {v8, v8}, Landroid/view/KeyEvent;->getDeadChar(II)I

    .line 763
    .line 764
    .line 765
    move-result v4

    .line 766
    add-int/lit8 v4, v4, 0x2c

    .line 767
    .line 768
    invoke-static {v2, v3}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    .line 769
    .line 770
    .line 771
    move-result v2

    .line 772
    add-int/lit8 v2, v2, 0x4a

    .line 773
    .line 774
    invoke-static {v8, v8}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 775
    .line 776
    .line 777
    move-result v3

    .line 778
    int-to-char v3, v3

    .line 779
    new-array v5, v7, [Ljava/lang/Object;

    .line 780
    .line 781
    invoke-static {v4, v2, v3, v5}, Lcom/appsflyer/internal/AFc1iSDK;->a(IIC[Ljava/lang/Object;)V

    .line 782
    .line 783
    .line 784
    aget-object v2, v5, v8

    .line 785
    .line 786
    check-cast v2, Ljava/lang/String;

    .line 787
    .line 788
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 789
    .line 790
    .line 791
    move-result-object v2

    .line 792
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 793
    .line 794
    .line 795
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 796
    .line 797
    .line 798
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 799
    .line 800
    .line 801
    move-result-object v0

    .line 802
    invoke-static {v0}, Lcom/appsflyer/AFLogger;->afRDLog(Ljava/lang/String;)V

    .line 803
    .line 804
    .line 805
    new-instance v0, Ljava/lang/StringBuilder;

    .line 806
    .line 807
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 808
    .line 809
    .line 810
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 811
    .line 812
    .line 813
    invoke-static {}, Landroid/view/ViewConfiguration;->getJumpTapTimeout()I

    .line 814
    .line 815
    .line 816
    move-result v1

    .line 817
    shr-int/2addr v1, v6

    .line 818
    const v2, 0xba41

    .line 819
    .line 820
    .line 821
    add-int/2addr v1, v2

    .line 822
    new-array v2, v7, [Ljava/lang/Object;

    .line 823
    .line 824
    const-string v3, "\uf4f1\u4ee6\u8064\uda64\u1de2\u57e3\ua961\ue361\u26ef\u78ec\ub22f\uf43f\u4ff3\u81ae\udb78\u1d35"

    .line 825
    .line 826
    invoke-static {v3, v1, v2}, Lcom/appsflyer/internal/AFc1iSDK;->b(Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 827
    .line 828
    .line 829
    aget-object v1, v2, v8

    .line 830
    .line 831
    check-cast v1, Ljava/lang/String;

    .line 832
    .line 833
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 834
    .line 835
    .line 836
    move-result-object v1

    .line 837
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 838
    .line 839
    .line 840
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 841
    .line 842
    .line 843
    move-result-object v0

    .line 844
    :goto_7
    return-object v0
.end method
