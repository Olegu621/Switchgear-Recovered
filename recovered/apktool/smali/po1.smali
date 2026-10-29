.class public final Lpo1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/util/ArrayList;

.field public final c:Ljava/util/ArrayList;

.field public final d:Ljava/util/ArrayList;

.field public e:Ljava/lang/CharSequence;

.field public f:Ljava/lang/CharSequence;

.field public g:Landroid/app/PendingIntent;

.field public h:Landroidx/core/graphics/drawable/IconCompat;

.field public i:I

.field public j:I

.field public k:Z

.field public l:Lsq3;

.field public m:Ljava/lang/String;

.field public n:Z

.field public o:Landroid/os/Bundle;

.field public p:I

.field public q:I

.field public r:Ljava/lang/String;

.field public final s:Z

.field public final t:Landroid/app/Notification;

.field public final u:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lpo1;->b:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lpo1;->c:Ljava/util/ArrayList;

    .line 17
    .line 18
    new-instance v0, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lpo1;->d:Ljava/util/ArrayList;

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    iput-boolean v0, p0, Lpo1;->k:Z

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    iput-boolean v1, p0, Lpo1;->n:Z

    .line 30
    .line 31
    iput v1, p0, Lpo1;->p:I

    .line 32
    .line 33
    iput v1, p0, Lpo1;->q:I

    .line 34
    .line 35
    new-instance v2, Landroid/app/Notification;

    .line 36
    .line 37
    invoke-direct {v2}, Landroid/app/Notification;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object v2, p0, Lpo1;->t:Landroid/app/Notification;

    .line 41
    .line 42
    iput-object p1, p0, Lpo1;->a:Landroid/content/Context;

    .line 43
    .line 44
    iput-object p2, p0, Lpo1;->r:Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 47
    .line 48
    .line 49
    move-result-wide p1

    .line 50
    iput-wide p1, v2, Landroid/app/Notification;->when:J

    .line 51
    .line 52
    const/4 p1, -0x1

    .line 53
    iput p1, v2, Landroid/app/Notification;->audioStreamType:I

    .line 54
    .line 55
    iput v1, p0, Lpo1;->j:I

    .line 56
    .line 57
    new-instance p1, Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 60
    .line 61
    .line 62
    iput-object p1, p0, Lpo1;->u:Ljava/util/ArrayList;

    .line 63
    .line 64
    iput-boolean v0, p0, Lpo1;->s:Z

    .line 65
    .line 66
    return-void
.end method

.method public static b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    return-object p0

    .line 4
    :cond_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/16 v1, 0x1400

    .line 9
    .line 10
    if-le v0, v1, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-interface {p0, v0, v1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :cond_1
    return-object p0
.end method


# virtual methods
.method public final a()Landroid/app/Notification;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lra2;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v2, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    new-instance v2, Landroid/os/Bundle;

    .line 14
    .line 15
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v2, v1, Lra2;->d:Ljava/lang/Object;

    .line 19
    .line 20
    iput-object v0, v1, Lra2;->c:Ljava/lang/Object;

    .line 21
    .line 22
    iget-object v2, v0, Lpo1;->a:Landroid/content/Context;

    .line 23
    .line 24
    iput-object v2, v1, Lra2;->a:Ljava/lang/Object;

    .line 25
    .line 26
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 27
    .line 28
    const/16 v4, 0x1a

    .line 29
    .line 30
    if-lt v3, v4, :cond_0

    .line 31
    .line 32
    iget-object v3, v0, Lpo1;->r:Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {v2, v3}, Luo1;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    iput-object v3, v1, Lra2;->b:Ljava/lang/Object;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    new-instance v3, Landroid/app/Notification$Builder;

    .line 42
    .line 43
    invoke-direct {v3, v2}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;)V

    .line 44
    .line 45
    .line 46
    iput-object v3, v1, Lra2;->b:Ljava/lang/Object;

    .line 47
    .line 48
    :goto_0
    iget-object v3, v1, Lra2;->b:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v3, Landroid/app/Notification$Builder;

    .line 51
    .line 52
    iget-object v5, v0, Lpo1;->t:Landroid/app/Notification;

    .line 53
    .line 54
    iget-wide v6, v5, Landroid/app/Notification;->when:J

    .line 55
    .line 56
    invoke-virtual {v3, v6, v7}, Landroid/app/Notification$Builder;->setWhen(J)Landroid/app/Notification$Builder;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    iget v6, v5, Landroid/app/Notification;->icon:I

    .line 61
    .line 62
    iget v7, v5, Landroid/app/Notification;->iconLevel:I

    .line 63
    .line 64
    invoke-virtual {v3, v6, v7}, Landroid/app/Notification$Builder;->setSmallIcon(II)Landroid/app/Notification$Builder;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    iget-object v6, v5, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    .line 69
    .line 70
    invoke-virtual {v3, v6}, Landroid/app/Notification$Builder;->setContent(Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    iget-object v6, v5, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;

    .line 75
    .line 76
    const/4 v7, 0x0

    .line 77
    invoke-virtual {v3, v6, v7}, Landroid/app/Notification$Builder;->setTicker(Ljava/lang/CharSequence;Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    iget-object v6, v5, Landroid/app/Notification;->vibrate:[J

    .line 82
    .line 83
    invoke-virtual {v3, v6}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    iget v6, v5, Landroid/app/Notification;->ledARGB:I

    .line 88
    .line 89
    iget v8, v5, Landroid/app/Notification;->ledOnMS:I

    .line 90
    .line 91
    iget v9, v5, Landroid/app/Notification;->ledOffMS:I

    .line 92
    .line 93
    invoke-virtual {v3, v6, v8, v9}, Landroid/app/Notification$Builder;->setLights(III)Landroid/app/Notification$Builder;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    iget v6, v5, Landroid/app/Notification;->flags:I

    .line 98
    .line 99
    and-int/lit8 v6, v6, 0x2

    .line 100
    .line 101
    const/4 v8, 0x1

    .line 102
    const/4 v9, 0x0

    .line 103
    if-eqz v6, :cond_1

    .line 104
    .line 105
    move v6, v8

    .line 106
    goto :goto_1

    .line 107
    :cond_1
    move v6, v9

    .line 108
    :goto_1
    invoke-virtual {v3, v6}, Landroid/app/Notification$Builder;->setOngoing(Z)Landroid/app/Notification$Builder;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    iget v6, v5, Landroid/app/Notification;->flags:I

    .line 113
    .line 114
    and-int/lit8 v6, v6, 0x8

    .line 115
    .line 116
    if-eqz v6, :cond_2

    .line 117
    .line 118
    move v6, v8

    .line 119
    goto :goto_2

    .line 120
    :cond_2
    move v6, v9

    .line 121
    :goto_2
    invoke-virtual {v3, v6}, Landroid/app/Notification$Builder;->setOnlyAlertOnce(Z)Landroid/app/Notification$Builder;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    iget v6, v5, Landroid/app/Notification;->flags:I

    .line 126
    .line 127
    and-int/lit8 v6, v6, 0x10

    .line 128
    .line 129
    if-eqz v6, :cond_3

    .line 130
    .line 131
    move v6, v8

    .line 132
    goto :goto_3

    .line 133
    :cond_3
    move v6, v9

    .line 134
    :goto_3
    invoke-virtual {v3, v6}, Landroid/app/Notification$Builder;->setAutoCancel(Z)Landroid/app/Notification$Builder;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    iget v6, v5, Landroid/app/Notification;->defaults:I

    .line 139
    .line 140
    invoke-virtual {v3, v6}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    iget-object v6, v0, Lpo1;->e:Ljava/lang/CharSequence;

    .line 145
    .line 146
    invoke-virtual {v3, v6}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    iget-object v6, v0, Lpo1;->f:Ljava/lang/CharSequence;

    .line 151
    .line 152
    invoke-virtual {v3, v6}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    invoke-virtual {v3, v7}, Landroid/app/Notification$Builder;->setContentInfo(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    iget-object v6, v0, Lpo1;->g:Landroid/app/PendingIntent;

    .line 161
    .line 162
    invoke-virtual {v3, v6}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    iget-object v6, v5, Landroid/app/Notification;->deleteIntent:Landroid/app/PendingIntent;

    .line 167
    .line 168
    invoke-virtual {v3, v6}, Landroid/app/Notification$Builder;->setDeleteIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    iget v6, v5, Landroid/app/Notification;->flags:I

    .line 173
    .line 174
    and-int/lit16 v6, v6, 0x80

    .line 175
    .line 176
    if-eqz v6, :cond_4

    .line 177
    .line 178
    goto :goto_4

    .line 179
    :cond_4
    move v8, v9

    .line 180
    :goto_4
    invoke-virtual {v3, v7, v8}, Landroid/app/Notification$Builder;->setFullScreenIntent(Landroid/app/PendingIntent;Z)Landroid/app/Notification$Builder;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    iget v6, v0, Lpo1;->i:I

    .line 185
    .line 186
    invoke-virtual {v3, v6}, Landroid/app/Notification$Builder;->setNumber(I)Landroid/app/Notification$Builder;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    invoke-virtual {v3, v9, v9, v9}, Landroid/app/Notification$Builder;->setProgress(IIZ)Landroid/app/Notification$Builder;

    .line 191
    .line 192
    .line 193
    iget-object v3, v1, Lra2;->b:Ljava/lang/Object;

    .line 194
    .line 195
    check-cast v3, Landroid/app/Notification$Builder;

    .line 196
    .line 197
    iget-object v6, v0, Lpo1;->h:Landroidx/core/graphics/drawable/IconCompat;

    .line 198
    .line 199
    if-nez v6, :cond_5

    .line 200
    .line 201
    move-object v2, v7

    .line 202
    goto :goto_5

    .line 203
    :cond_5
    invoke-static {v6, v2}, Lgv0;->g(Landroidx/core/graphics/drawable/IconCompat;Landroid/content/Context;)Landroid/graphics/drawable/Icon;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    :goto_5
    invoke-static {v3, v2}, Lso1;->b(Landroid/app/Notification$Builder;Landroid/graphics/drawable/Icon;)Landroid/app/Notification$Builder;

    .line 208
    .line 209
    .line 210
    iget-object v2, v1, Lra2;->b:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast v2, Landroid/app/Notification$Builder;

    .line 213
    .line 214
    invoke-virtual {v2, v7}, Landroid/app/Notification$Builder;->setSubText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    invoke-virtual {v2, v9}, Landroid/app/Notification$Builder;->setUsesChronometer(Z)Landroid/app/Notification$Builder;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    iget v3, v0, Lpo1;->j:I

    .line 223
    .line 224
    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setPriority(I)Landroid/app/Notification$Builder;

    .line 225
    .line 226
    .line 227
    iget-object v2, v0, Lpo1;->b:Ljava/util/ArrayList;

    .line 228
    .line 229
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 230
    .line 231
    .line 232
    move-result-object v2

    .line 233
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 234
    .line 235
    .line 236
    move-result v3

    .line 237
    const-string v8, "android.support.allowGeneratedReplies"

    .line 238
    .line 239
    const-string v10, ""

    .line 240
    .line 241
    const/16 v11, 0x1c

    .line 242
    .line 243
    if-eqz v3, :cond_e

    .line 244
    .line 245
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v3

    .line 249
    check-cast v3, Lyn1;

    .line 250
    .line 251
    iget-object v12, v3, Lyn1;->b:Landroidx/core/graphics/drawable/IconCompat;

    .line 252
    .line 253
    if-nez v12, :cond_6

    .line 254
    .line 255
    iget v12, v3, Lyn1;->h:I

    .line 256
    .line 257
    if-eqz v12, :cond_6

    .line 258
    .line 259
    invoke-static {v12, v10}, Landroidx/core/graphics/drawable/IconCompat;->b(ILjava/lang/String;)Landroidx/core/graphics/drawable/IconCompat;

    .line 260
    .line 261
    .line 262
    move-result-object v10

    .line 263
    iput-object v10, v3, Lyn1;->b:Landroidx/core/graphics/drawable/IconCompat;

    .line 264
    .line 265
    :cond_6
    iget-object v10, v3, Lyn1;->b:Landroidx/core/graphics/drawable/IconCompat;

    .line 266
    .line 267
    iget v12, v3, Lyn1;->f:I

    .line 268
    .line 269
    iget-boolean v13, v3, Lyn1;->d:Z

    .line 270
    .line 271
    iget-object v14, v3, Lyn1;->a:Landroid/os/Bundle;

    .line 272
    .line 273
    if-eqz v10, :cond_7

    .line 274
    .line 275
    invoke-static {v10, v7}, Lgv0;->g(Landroidx/core/graphics/drawable/IconCompat;Landroid/content/Context;)Landroid/graphics/drawable/Icon;

    .line 276
    .line 277
    .line 278
    move-result-object v10

    .line 279
    goto :goto_7

    .line 280
    :cond_7
    move-object v10, v7

    .line 281
    :goto_7
    iget-object v15, v3, Lyn1;->i:Ljava/lang/CharSequence;

    .line 282
    .line 283
    iget-object v4, v3, Lyn1;->j:Landroid/app/PendingIntent;

    .line 284
    .line 285
    invoke-static {v10, v15, v4}, Lso1;->a(Landroid/graphics/drawable/Icon;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)Landroid/app/Notification$Action$Builder;

    .line 286
    .line 287
    .line 288
    move-result-object v4

    .line 289
    iget-object v10, v3, Lyn1;->c:[Lg32;

    .line 290
    .line 291
    if-eqz v10, :cond_9

    .line 292
    .line 293
    array-length v15, v10

    .line 294
    new-array v9, v15, [Landroid/app/RemoteInput;

    .line 295
    .line 296
    const/4 v7, 0x0

    .line 297
    :goto_8
    array-length v6, v10

    .line 298
    if-ge v7, v6, :cond_8

    .line 299
    .line 300
    aget-object v6, v10, v7

    .line 301
    .line 302
    invoke-static {v6}, Lg32;->a(Lg32;)Landroid/app/RemoteInput;

    .line 303
    .line 304
    .line 305
    move-result-object v6

    .line 306
    aput-object v6, v9, v7

    .line 307
    .line 308
    add-int/lit8 v7, v7, 0x1

    .line 309
    .line 310
    goto :goto_8

    .line 311
    :cond_8
    const/4 v6, 0x0

    .line 312
    :goto_9
    if-ge v6, v15, :cond_9

    .line 313
    .line 314
    aget-object v7, v9, v6

    .line 315
    .line 316
    invoke-static {v4, v7}, Lqo1;->c(Landroid/app/Notification$Action$Builder;Landroid/app/RemoteInput;)Landroid/app/Notification$Action$Builder;

    .line 317
    .line 318
    .line 319
    add-int/lit8 v6, v6, 0x1

    .line 320
    .line 321
    goto :goto_9

    .line 322
    :cond_9
    if-eqz v14, :cond_a

    .line 323
    .line 324
    new-instance v6, Landroid/os/Bundle;

    .line 325
    .line 326
    invoke-direct {v6, v14}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 327
    .line 328
    .line 329
    goto :goto_a

    .line 330
    :cond_a
    new-instance v6, Landroid/os/Bundle;

    .line 331
    .line 332
    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 333
    .line 334
    .line 335
    :goto_a
    invoke-virtual {v6, v8, v13}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 336
    .line 337
    .line 338
    invoke-static {v4, v13}, Lto1;->a(Landroid/app/Notification$Action$Builder;Z)Landroid/app/Notification$Action$Builder;

    .line 339
    .line 340
    .line 341
    const-string v7, "android.support.action.semanticAction"

    .line 342
    .line 343
    invoke-virtual {v6, v7, v12}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 344
    .line 345
    .line 346
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 347
    .line 348
    if-lt v7, v11, :cond_b

    .line 349
    .line 350
    invoke-static {v4, v12}, Lvo1;->b(Landroid/app/Notification$Action$Builder;I)Landroid/app/Notification$Action$Builder;

    .line 351
    .line 352
    .line 353
    :cond_b
    const/16 v8, 0x1d

    .line 354
    .line 355
    if-lt v7, v8, :cond_c

    .line 356
    .line 357
    iget-boolean v8, v3, Lyn1;->g:Z

    .line 358
    .line 359
    invoke-static {v4, v8}, Lwo1;->c(Landroid/app/Notification$Action$Builder;Z)Landroid/app/Notification$Action$Builder;

    .line 360
    .line 361
    .line 362
    :cond_c
    const/16 v8, 0x1f

    .line 363
    .line 364
    if-lt v7, v8, :cond_d

    .line 365
    .line 366
    iget-boolean v7, v3, Lyn1;->k:Z

    .line 367
    .line 368
    invoke-static {v4, v7}, Lxo1;->a(Landroid/app/Notification$Action$Builder;Z)Landroid/app/Notification$Action$Builder;

    .line 369
    .line 370
    .line 371
    :cond_d
    const-string v7, "android.support.action.showsUserInterface"

    .line 372
    .line 373
    iget-boolean v3, v3, Lyn1;->e:Z

    .line 374
    .line 375
    invoke-virtual {v6, v7, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 376
    .line 377
    .line 378
    invoke-static {v4, v6}, Lqo1;->b(Landroid/app/Notification$Action$Builder;Landroid/os/Bundle;)Landroid/app/Notification$Action$Builder;

    .line 379
    .line 380
    .line 381
    iget-object v3, v1, Lra2;->b:Ljava/lang/Object;

    .line 382
    .line 383
    check-cast v3, Landroid/app/Notification$Builder;

    .line 384
    .line 385
    invoke-static {v4}, Lqo1;->d(Landroid/app/Notification$Action$Builder;)Landroid/app/Notification$Action;

    .line 386
    .line 387
    .line 388
    move-result-object v4

    .line 389
    invoke-static {v3, v4}, Lqo1;->a(Landroid/app/Notification$Builder;Landroid/app/Notification$Action;)Landroid/app/Notification$Builder;

    .line 390
    .line 391
    .line 392
    const/16 v4, 0x1a

    .line 393
    .line 394
    const/4 v7, 0x0

    .line 395
    const/4 v9, 0x0

    .line 396
    goto/16 :goto_6

    .line 397
    .line 398
    :cond_e
    iget-object v2, v0, Lpo1;->o:Landroid/os/Bundle;

    .line 399
    .line 400
    if-eqz v2, :cond_f

    .line 401
    .line 402
    iget-object v3, v1, Lra2;->d:Ljava/lang/Object;

    .line 403
    .line 404
    check-cast v3, Landroid/os/Bundle;

    .line 405
    .line 406
    invoke-virtual {v3, v2}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 407
    .line 408
    .line 409
    :cond_f
    iget-object v2, v1, Lra2;->b:Ljava/lang/Object;

    .line 410
    .line 411
    check-cast v2, Landroid/app/Notification$Builder;

    .line 412
    .line 413
    iget-boolean v3, v0, Lpo1;->k:Z

    .line 414
    .line 415
    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setShowWhen(Z)Landroid/app/Notification$Builder;

    .line 416
    .line 417
    .line 418
    iget-object v2, v1, Lra2;->b:Ljava/lang/Object;

    .line 419
    .line 420
    check-cast v2, Landroid/app/Notification$Builder;

    .line 421
    .line 422
    iget-boolean v3, v0, Lpo1;->n:Z

    .line 423
    .line 424
    invoke-static {v2, v3}, Lqo1;->i(Landroid/app/Notification$Builder;Z)Landroid/app/Notification$Builder;

    .line 425
    .line 426
    .line 427
    iget-object v2, v1, Lra2;->b:Ljava/lang/Object;

    .line 428
    .line 429
    check-cast v2, Landroid/app/Notification$Builder;

    .line 430
    .line 431
    iget-object v3, v0, Lpo1;->m:Ljava/lang/String;

    .line 432
    .line 433
    invoke-static {v2, v3}, Lqo1;->g(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 434
    .line 435
    .line 436
    iget-object v2, v1, Lra2;->b:Ljava/lang/Object;

    .line 437
    .line 438
    check-cast v2, Landroid/app/Notification$Builder;

    .line 439
    .line 440
    const/4 v3, 0x0

    .line 441
    invoke-static {v2, v3}, Lqo1;->j(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 442
    .line 443
    .line 444
    iget-object v2, v1, Lra2;->b:Ljava/lang/Object;

    .line 445
    .line 446
    check-cast v2, Landroid/app/Notification$Builder;

    .line 447
    .line 448
    const/4 v4, 0x0

    .line 449
    invoke-static {v2, v4}, Lqo1;->h(Landroid/app/Notification$Builder;Z)Landroid/app/Notification$Builder;

    .line 450
    .line 451
    .line 452
    iget-object v2, v1, Lra2;->b:Ljava/lang/Object;

    .line 453
    .line 454
    check-cast v2, Landroid/app/Notification$Builder;

    .line 455
    .line 456
    invoke-static {v2, v3}, Lro1;->b(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 457
    .line 458
    .line 459
    iget-object v2, v1, Lra2;->b:Ljava/lang/Object;

    .line 460
    .line 461
    check-cast v2, Landroid/app/Notification$Builder;

    .line 462
    .line 463
    iget v4, v0, Lpo1;->p:I

    .line 464
    .line 465
    invoke-static {v2, v4}, Lro1;->c(Landroid/app/Notification$Builder;I)Landroid/app/Notification$Builder;

    .line 466
    .line 467
    .line 468
    iget-object v2, v1, Lra2;->b:Ljava/lang/Object;

    .line 469
    .line 470
    check-cast v2, Landroid/app/Notification$Builder;

    .line 471
    .line 472
    iget v4, v0, Lpo1;->q:I

    .line 473
    .line 474
    invoke-static {v2, v4}, Lro1;->f(Landroid/app/Notification$Builder;I)Landroid/app/Notification$Builder;

    .line 475
    .line 476
    .line 477
    iget-object v2, v1, Lra2;->b:Ljava/lang/Object;

    .line 478
    .line 479
    check-cast v2, Landroid/app/Notification$Builder;

    .line 480
    .line 481
    invoke-static {v2, v3}, Lro1;->d(Landroid/app/Notification$Builder;Landroid/app/Notification;)Landroid/app/Notification$Builder;

    .line 482
    .line 483
    .line 484
    iget-object v2, v1, Lra2;->b:Ljava/lang/Object;

    .line 485
    .line 486
    check-cast v2, Landroid/app/Notification$Builder;

    .line 487
    .line 488
    iget-object v3, v5, Landroid/app/Notification;->sound:Landroid/net/Uri;

    .line 489
    .line 490
    iget-object v4, v5, Landroid/app/Notification;->audioAttributes:Landroid/media/AudioAttributes;

    .line 491
    .line 492
    invoke-static {v2, v3, v4}, Lro1;->e(Landroid/app/Notification$Builder;Landroid/net/Uri;Ljava/lang/Object;)Landroid/app/Notification$Builder;

    .line 493
    .line 494
    .line 495
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 496
    .line 497
    iget-object v3, v0, Lpo1;->u:Ljava/util/ArrayList;

    .line 498
    .line 499
    iget-object v4, v0, Lpo1;->c:Ljava/util/ArrayList;

    .line 500
    .line 501
    if-ge v2, v11, :cond_16

    .line 502
    .line 503
    if-nez v4, :cond_10

    .line 504
    .line 505
    const/4 v2, 0x0

    .line 506
    goto :goto_d

    .line 507
    :cond_10
    new-instance v2, Ljava/util/ArrayList;

    .line 508
    .line 509
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 510
    .line 511
    .line 512
    move-result v5

    .line 513
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 514
    .line 515
    .line 516
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 517
    .line 518
    .line 519
    move-result-object v5

    .line 520
    :goto_b
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 521
    .line 522
    .line 523
    move-result v6

    .line 524
    if-eqz v6, :cond_13

    .line 525
    .line 526
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 527
    .line 528
    .line 529
    move-result-object v6

    .line 530
    check-cast v6, Lxr1;

    .line 531
    .line 532
    iget-object v7, v6, Lxr1;->a:Ljava/lang/CharSequence;

    .line 533
    .line 534
    iget-object v6, v6, Lxr1;->c:Ljava/lang/String;

    .line 535
    .line 536
    if-eqz v6, :cond_11

    .line 537
    .line 538
    goto :goto_c

    .line 539
    :cond_11
    if-eqz v7, :cond_12

    .line 540
    .line 541
    new-instance v6, Ljava/lang/StringBuilder;

    .line 542
    .line 543
    const-string v9, "name:"

    .line 544
    .line 545
    invoke-direct {v6, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 546
    .line 547
    .line 548
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 549
    .line 550
    .line 551
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 552
    .line 553
    .line 554
    move-result-object v6

    .line 555
    goto :goto_c

    .line 556
    :cond_12
    move-object v6, v10

    .line 557
    :goto_c
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 558
    .line 559
    .line 560
    goto :goto_b

    .line 561
    :cond_13
    :goto_d
    if-nez v2, :cond_14

    .line 562
    .line 563
    goto :goto_e

    .line 564
    :cond_14
    if-nez v3, :cond_15

    .line 565
    .line 566
    move-object v3, v2

    .line 567
    goto :goto_e

    .line 568
    :cond_15
    new-instance v5, Lkd;

    .line 569
    .line 570
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 571
    .line 572
    .line 573
    move-result v6

    .line 574
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 575
    .line 576
    .line 577
    move-result v7

    .line 578
    add-int/2addr v7, v6

    .line 579
    invoke-direct {v5, v7}, Lkd;-><init>(I)V

    .line 580
    .line 581
    .line 582
    invoke-virtual {v5, v2}, Lkd;->addAll(Ljava/util/Collection;)Z

    .line 583
    .line 584
    .line 585
    invoke-virtual {v5, v3}, Lkd;->addAll(Ljava/util/Collection;)Z

    .line 586
    .line 587
    .line 588
    new-instance v3, Ljava/util/ArrayList;

    .line 589
    .line 590
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 591
    .line 592
    .line 593
    :cond_16
    :goto_e
    if-eqz v3, :cond_17

    .line 594
    .line 595
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 596
    .line 597
    .line 598
    move-result v2

    .line 599
    if-nez v2, :cond_17

    .line 600
    .line 601
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 602
    .line 603
    .line 604
    move-result-object v2

    .line 605
    :goto_f
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 606
    .line 607
    .line 608
    move-result v3

    .line 609
    if-eqz v3, :cond_17

    .line 610
    .line 611
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 612
    .line 613
    .line 614
    move-result-object v3

    .line 615
    check-cast v3, Ljava/lang/String;

    .line 616
    .line 617
    iget-object v5, v1, Lra2;->b:Ljava/lang/Object;

    .line 618
    .line 619
    check-cast v5, Landroid/app/Notification$Builder;

    .line 620
    .line 621
    invoke-static {v5, v3}, Lro1;->a(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 622
    .line 623
    .line 624
    goto :goto_f

    .line 625
    :cond_17
    iget-object v2, v0, Lpo1;->d:Ljava/util/ArrayList;

    .line 626
    .line 627
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 628
    .line 629
    .line 630
    move-result v3

    .line 631
    if-lez v3, :cond_23

    .line 632
    .line 633
    iget-object v3, v0, Lpo1;->o:Landroid/os/Bundle;

    .line 634
    .line 635
    if-nez v3, :cond_18

    .line 636
    .line 637
    new-instance v3, Landroid/os/Bundle;

    .line 638
    .line 639
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 640
    .line 641
    .line 642
    iput-object v3, v0, Lpo1;->o:Landroid/os/Bundle;

    .line 643
    .line 644
    :cond_18
    iget-object v3, v0, Lpo1;->o:Landroid/os/Bundle;

    .line 645
    .line 646
    const-string v5, "android.car.EXTENSIONS"

    .line 647
    .line 648
    invoke-virtual {v3, v5}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 649
    .line 650
    .line 651
    move-result-object v3

    .line 652
    if-nez v3, :cond_19

    .line 653
    .line 654
    new-instance v3, Landroid/os/Bundle;

    .line 655
    .line 656
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 657
    .line 658
    .line 659
    :cond_19
    new-instance v6, Landroid/os/Bundle;

    .line 660
    .line 661
    invoke-direct {v6, v3}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 662
    .line 663
    .line 664
    new-instance v7, Landroid/os/Bundle;

    .line 665
    .line 666
    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    .line 667
    .line 668
    .line 669
    const/4 v9, 0x0

    .line 670
    :goto_10
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 671
    .line 672
    .line 673
    move-result v12

    .line 674
    if-ge v9, v12, :cond_21

    .line 675
    .line 676
    invoke-static {v9}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 677
    .line 678
    .line 679
    move-result-object v12

    .line 680
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 681
    .line 682
    .line 683
    move-result-object v13

    .line 684
    check-cast v13, Lyn1;

    .line 685
    .line 686
    new-instance v14, Landroid/os/Bundle;

    .line 687
    .line 688
    invoke-direct {v14}, Landroid/os/Bundle;-><init>()V

    .line 689
    .line 690
    .line 691
    iget-object v15, v13, Lyn1;->b:Landroidx/core/graphics/drawable/IconCompat;

    .line 692
    .line 693
    if-nez v15, :cond_1a

    .line 694
    .line 695
    iget v15, v13, Lyn1;->h:I

    .line 696
    .line 697
    if-eqz v15, :cond_1a

    .line 698
    .line 699
    invoke-static {v15, v10}, Landroidx/core/graphics/drawable/IconCompat;->b(ILjava/lang/String;)Landroidx/core/graphics/drawable/IconCompat;

    .line 700
    .line 701
    .line 702
    move-result-object v15

    .line 703
    iput-object v15, v13, Lyn1;->b:Landroidx/core/graphics/drawable/IconCompat;

    .line 704
    .line 705
    :cond_1a
    iget-object v15, v13, Lyn1;->b:Landroidx/core/graphics/drawable/IconCompat;

    .line 706
    .line 707
    iget-object v11, v13, Lyn1;->a:Landroid/os/Bundle;

    .line 708
    .line 709
    if-eqz v15, :cond_1b

    .line 710
    .line 711
    invoke-virtual {v15}, Landroidx/core/graphics/drawable/IconCompat;->c()I

    .line 712
    .line 713
    .line 714
    move-result v15

    .line 715
    :goto_11
    move-object/from16 v16, v2

    .line 716
    .line 717
    goto :goto_12

    .line 718
    :cond_1b
    const/4 v15, 0x0

    .line 719
    goto :goto_11

    .line 720
    :goto_12
    const-string v2, "icon"

    .line 721
    .line 722
    invoke-virtual {v14, v2, v15}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 723
    .line 724
    .line 725
    const-string v2, "title"

    .line 726
    .line 727
    iget-object v15, v13, Lyn1;->i:Ljava/lang/CharSequence;

    .line 728
    .line 729
    invoke-virtual {v14, v2, v15}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 730
    .line 731
    .line 732
    const-string v2, "actionIntent"

    .line 733
    .line 734
    iget-object v15, v13, Lyn1;->j:Landroid/app/PendingIntent;

    .line 735
    .line 736
    invoke-virtual {v14, v2, v15}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 737
    .line 738
    .line 739
    if-eqz v11, :cond_1c

    .line 740
    .line 741
    new-instance v2, Landroid/os/Bundle;

    .line 742
    .line 743
    invoke-direct {v2, v11}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 744
    .line 745
    .line 746
    goto :goto_13

    .line 747
    :cond_1c
    new-instance v2, Landroid/os/Bundle;

    .line 748
    .line 749
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 750
    .line 751
    .line 752
    :goto_13
    iget-boolean v11, v13, Lyn1;->d:Z

    .line 753
    .line 754
    invoke-virtual {v2, v8, v11}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 755
    .line 756
    .line 757
    const-string v11, "extras"

    .line 758
    .line 759
    invoke-virtual {v14, v11, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 760
    .line 761
    .line 762
    iget-object v2, v13, Lyn1;->c:[Lg32;

    .line 763
    .line 764
    if-nez v2, :cond_1e

    .line 765
    .line 766
    move-object/from16 v17, v4

    .line 767
    .line 768
    move-object/from16 v18, v8

    .line 769
    .line 770
    const/4 v15, 0x0

    .line 771
    :cond_1d
    move/from16 v21, v9

    .line 772
    .line 773
    goto/16 :goto_16

    .line 774
    .line 775
    :cond_1e
    array-length v15, v2

    .line 776
    new-array v15, v15, [Landroid/os/Bundle;

    .line 777
    .line 778
    move-object/from16 v17, v4

    .line 779
    .line 780
    move-object/from16 v18, v8

    .line 781
    .line 782
    const/4 v4, 0x0

    .line 783
    :goto_14
    array-length v8, v2

    .line 784
    if-ge v4, v8, :cond_1d

    .line 785
    .line 786
    aget-object v8, v2, v4

    .line 787
    .line 788
    move-object/from16 v19, v2

    .line 789
    .line 790
    new-instance v2, Landroid/os/Bundle;

    .line 791
    .line 792
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 793
    .line 794
    .line 795
    move/from16 v20, v4

    .line 796
    .line 797
    const-string v4, "resultKey"

    .line 798
    .line 799
    move/from16 v21, v9

    .line 800
    .line 801
    iget-object v9, v8, Lg32;->a:Ljava/lang/String;

    .line 802
    .line 803
    invoke-virtual {v2, v4, v9}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 804
    .line 805
    .line 806
    const-string v4, "label"

    .line 807
    .line 808
    iget-object v9, v8, Lg32;->b:Ljava/lang/CharSequence;

    .line 809
    .line 810
    invoke-virtual {v2, v4, v9}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 811
    .line 812
    .line 813
    const-string v4, "choices"

    .line 814
    .line 815
    iget-object v9, v8, Lg32;->c:[Ljava/lang/CharSequence;

    .line 816
    .line 817
    invoke-virtual {v2, v4, v9}, Landroid/os/Bundle;->putCharSequenceArray(Ljava/lang/String;[Ljava/lang/CharSequence;)V

    .line 818
    .line 819
    .line 820
    const-string v4, "allowFreeFormInput"

    .line 821
    .line 822
    iget-boolean v9, v8, Lg32;->d:Z

    .line 823
    .line 824
    invoke-virtual {v2, v4, v9}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 825
    .line 826
    .line 827
    iget-object v4, v8, Lg32;->f:Landroid/os/Bundle;

    .line 828
    .line 829
    invoke-virtual {v2, v11, v4}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 830
    .line 831
    .line 832
    iget-object v4, v8, Lg32;->g:Ljava/util/Set;

    .line 833
    .line 834
    if-eqz v4, :cond_20

    .line 835
    .line 836
    invoke-interface {v4}, Ljava/util/Set;->isEmpty()Z

    .line 837
    .line 838
    .line 839
    move-result v8

    .line 840
    if-nez v8, :cond_20

    .line 841
    .line 842
    new-instance v8, Ljava/util/ArrayList;

    .line 843
    .line 844
    invoke-interface {v4}, Ljava/util/Set;->size()I

    .line 845
    .line 846
    .line 847
    move-result v9

    .line 848
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 849
    .line 850
    .line 851
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 852
    .line 853
    .line 854
    move-result-object v4

    .line 855
    :goto_15
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 856
    .line 857
    .line 858
    move-result v9

    .line 859
    if-eqz v9, :cond_1f

    .line 860
    .line 861
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 862
    .line 863
    .line 864
    move-result-object v9

    .line 865
    check-cast v9, Ljava/lang/String;

    .line 866
    .line 867
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 868
    .line 869
    .line 870
    goto :goto_15

    .line 871
    :cond_1f
    const-string v4, "allowedDataTypes"

    .line 872
    .line 873
    invoke-virtual {v2, v4, v8}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 874
    .line 875
    .line 876
    :cond_20
    aput-object v2, v15, v20

    .line 877
    .line 878
    add-int/lit8 v4, v20, 0x1

    .line 879
    .line 880
    move-object/from16 v2, v19

    .line 881
    .line 882
    move/from16 v9, v21

    .line 883
    .line 884
    goto :goto_14

    .line 885
    :goto_16
    const-string v2, "remoteInputs"

    .line 886
    .line 887
    invoke-virtual {v14, v2, v15}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    .line 888
    .line 889
    .line 890
    const-string v2, "showsUserInterface"

    .line 891
    .line 892
    iget-boolean v4, v13, Lyn1;->e:Z

    .line 893
    .line 894
    invoke-virtual {v14, v2, v4}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 895
    .line 896
    .line 897
    const-string v2, "semanticAction"

    .line 898
    .line 899
    iget v4, v13, Lyn1;->f:I

    .line 900
    .line 901
    invoke-virtual {v14, v2, v4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 902
    .line 903
    .line 904
    invoke-virtual {v7, v12, v14}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 905
    .line 906
    .line 907
    add-int/lit8 v9, v21, 0x1

    .line 908
    .line 909
    move-object/from16 v2, v16

    .line 910
    .line 911
    move-object/from16 v4, v17

    .line 912
    .line 913
    move-object/from16 v8, v18

    .line 914
    .line 915
    const/16 v11, 0x1c

    .line 916
    .line 917
    goto/16 :goto_10

    .line 918
    .line 919
    :cond_21
    move-object/from16 v17, v4

    .line 920
    .line 921
    const-string v2, "invisible_actions"

    .line 922
    .line 923
    invoke-virtual {v3, v2, v7}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 924
    .line 925
    .line 926
    invoke-virtual {v6, v2, v7}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 927
    .line 928
    .line 929
    iget-object v2, v0, Lpo1;->o:Landroid/os/Bundle;

    .line 930
    .line 931
    if-nez v2, :cond_22

    .line 932
    .line 933
    new-instance v2, Landroid/os/Bundle;

    .line 934
    .line 935
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 936
    .line 937
    .line 938
    iput-object v2, v0, Lpo1;->o:Landroid/os/Bundle;

    .line 939
    .line 940
    :cond_22
    iget-object v2, v0, Lpo1;->o:Landroid/os/Bundle;

    .line 941
    .line 942
    invoke-virtual {v2, v5, v3}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 943
    .line 944
    .line 945
    iget-object v2, v1, Lra2;->d:Ljava/lang/Object;

    .line 946
    .line 947
    check-cast v2, Landroid/os/Bundle;

    .line 948
    .line 949
    invoke-virtual {v2, v5, v6}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 950
    .line 951
    .line 952
    goto :goto_17

    .line 953
    :cond_23
    move-object/from16 v17, v4

    .line 954
    .line 955
    :goto_17
    iget-object v2, v1, Lra2;->b:Ljava/lang/Object;

    .line 956
    .line 957
    check-cast v2, Landroid/app/Notification$Builder;

    .line 958
    .line 959
    iget-object v3, v0, Lpo1;->o:Landroid/os/Bundle;

    .line 960
    .line 961
    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setExtras(Landroid/os/Bundle;)Landroid/app/Notification$Builder;

    .line 962
    .line 963
    .line 964
    iget-object v2, v1, Lra2;->b:Ljava/lang/Object;

    .line 965
    .line 966
    check-cast v2, Landroid/app/Notification$Builder;

    .line 967
    .line 968
    const/4 v3, 0x0

    .line 969
    invoke-static {v2, v3}, Lto1;->e(Landroid/app/Notification$Builder;[Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 970
    .line 971
    .line 972
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 973
    .line 974
    const/16 v4, 0x1a

    .line 975
    .line 976
    if-lt v2, v4, :cond_24

    .line 977
    .line 978
    iget-object v4, v1, Lra2;->b:Ljava/lang/Object;

    .line 979
    .line 980
    check-cast v4, Landroid/app/Notification$Builder;

    .line 981
    .line 982
    const/4 v5, 0x0

    .line 983
    invoke-static {v4, v5}, Luo1;->b(Landroid/app/Notification$Builder;I)Landroid/app/Notification$Builder;

    .line 984
    .line 985
    .line 986
    iget-object v4, v1, Lra2;->b:Ljava/lang/Object;

    .line 987
    .line 988
    check-cast v4, Landroid/app/Notification$Builder;

    .line 989
    .line 990
    invoke-static {v4, v3}, Luo1;->e(Landroid/app/Notification$Builder;Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 991
    .line 992
    .line 993
    iget-object v4, v1, Lra2;->b:Ljava/lang/Object;

    .line 994
    .line 995
    check-cast v4, Landroid/app/Notification$Builder;

    .line 996
    .line 997
    invoke-static {v4, v3}, Luo1;->f(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 998
    .line 999
    .line 1000
    iget-object v3, v1, Lra2;->b:Ljava/lang/Object;

    .line 1001
    .line 1002
    check-cast v3, Landroid/app/Notification$Builder;

    .line 1003
    .line 1004
    const-wide/16 v4, 0x0

    .line 1005
    .line 1006
    invoke-static {v3, v4, v5}, Luo1;->g(Landroid/app/Notification$Builder;J)Landroid/app/Notification$Builder;

    .line 1007
    .line 1008
    .line 1009
    iget-object v3, v1, Lra2;->b:Ljava/lang/Object;

    .line 1010
    .line 1011
    check-cast v3, Landroid/app/Notification$Builder;

    .line 1012
    .line 1013
    const/4 v4, 0x0

    .line 1014
    invoke-static {v3, v4}, Luo1;->d(Landroid/app/Notification$Builder;I)Landroid/app/Notification$Builder;

    .line 1015
    .line 1016
    .line 1017
    iget-object v3, v0, Lpo1;->r:Ljava/lang/String;

    .line 1018
    .line 1019
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1020
    .line 1021
    .line 1022
    move-result v3

    .line 1023
    if-nez v3, :cond_24

    .line 1024
    .line 1025
    iget-object v3, v1, Lra2;->b:Ljava/lang/Object;

    .line 1026
    .line 1027
    check-cast v3, Landroid/app/Notification$Builder;

    .line 1028
    .line 1029
    const/4 v5, 0x0

    .line 1030
    invoke-virtual {v3, v5}, Landroid/app/Notification$Builder;->setSound(Landroid/net/Uri;)Landroid/app/Notification$Builder;

    .line 1031
    .line 1032
    .line 1033
    move-result-object v3

    .line 1034
    invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v3

    .line 1038
    invoke-virtual {v3, v4, v4, v4}, Landroid/app/Notification$Builder;->setLights(III)Landroid/app/Notification$Builder;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v3

    .line 1042
    invoke-virtual {v3, v5}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;

    .line 1043
    .line 1044
    .line 1045
    :cond_24
    const/16 v3, 0x1c

    .line 1046
    .line 1047
    if-lt v2, v3, :cond_25

    .line 1048
    .line 1049
    invoke-virtual/range {v17 .. v17}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1050
    .line 1051
    .line 1052
    move-result-object v2

    .line 1053
    :goto_18
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1054
    .line 1055
    .line 1056
    move-result v3

    .line 1057
    if-eqz v3, :cond_25

    .line 1058
    .line 1059
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1060
    .line 1061
    .line 1062
    move-result-object v3

    .line 1063
    check-cast v3, Lxr1;

    .line 1064
    .line 1065
    iget-object v4, v1, Lra2;->b:Ljava/lang/Object;

    .line 1066
    .line 1067
    check-cast v4, Landroid/app/Notification$Builder;

    .line 1068
    .line 1069
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1070
    .line 1071
    .line 1072
    invoke-static {v3}, Lwr1;->b(Lxr1;)Landroid/app/Person;

    .line 1073
    .line 1074
    .line 1075
    move-result-object v3

    .line 1076
    invoke-static {v4, v3}, Lvo1;->a(Landroid/app/Notification$Builder;Landroid/app/Person;)Landroid/app/Notification$Builder;

    .line 1077
    .line 1078
    .line 1079
    goto :goto_18

    .line 1080
    :cond_25
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1081
    .line 1082
    const/16 v8, 0x1d

    .line 1083
    .line 1084
    if-lt v2, v8, :cond_26

    .line 1085
    .line 1086
    iget-object v2, v1, Lra2;->b:Ljava/lang/Object;

    .line 1087
    .line 1088
    check-cast v2, Landroid/app/Notification$Builder;

    .line 1089
    .line 1090
    iget-boolean v0, v0, Lpo1;->s:Z

    .line 1091
    .line 1092
    invoke-static {v2, v0}, Lwo1;->a(Landroid/app/Notification$Builder;Z)Landroid/app/Notification$Builder;

    .line 1093
    .line 1094
    .line 1095
    iget-object v0, v1, Lra2;->b:Ljava/lang/Object;

    .line 1096
    .line 1097
    check-cast v0, Landroid/app/Notification$Builder;

    .line 1098
    .line 1099
    const/4 v3, 0x0

    .line 1100
    invoke-static {v0, v3}, Lwo1;->b(Landroid/app/Notification$Builder;Landroid/app/Notification$BubbleMetadata;)Landroid/app/Notification$Builder;

    .line 1101
    .line 1102
    .line 1103
    :cond_26
    iget-object v0, v1, Lra2;->c:Ljava/lang/Object;

    .line 1104
    .line 1105
    check-cast v0, Lpo1;

    .line 1106
    .line 1107
    iget-object v2, v0, Lpo1;->l:Lsq3;

    .line 1108
    .line 1109
    if-eqz v2, :cond_27

    .line 1110
    .line 1111
    invoke-virtual {v2, v1}, Lsq3;->g(Lra2;)V

    .line 1112
    .line 1113
    .line 1114
    :cond_27
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1115
    .line 1116
    iget-object v1, v1, Lra2;->b:Ljava/lang/Object;

    .line 1117
    .line 1118
    check-cast v1, Landroid/app/Notification$Builder;

    .line 1119
    .line 1120
    const/16 v4, 0x1a

    .line 1121
    .line 1122
    if-lt v3, v4, :cond_28

    .line 1123
    .line 1124
    invoke-virtual {v1}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    .line 1125
    .line 1126
    .line 1127
    move-result-object v1

    .line 1128
    goto :goto_19

    .line 1129
    :cond_28
    invoke-virtual {v1}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    .line 1130
    .line 1131
    .line 1132
    move-result-object v1

    .line 1133
    :goto_19
    if-eqz v2, :cond_29

    .line 1134
    .line 1135
    iget-object v0, v0, Lpo1;->l:Lsq3;

    .line 1136
    .line 1137
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1138
    .line 1139
    .line 1140
    :cond_29
    if-eqz v2, :cond_2a

    .line 1141
    .line 1142
    invoke-static {v1}, Landroidx/core/app/NotificationCompat;->getExtras(Landroid/app/Notification;)Landroid/os/Bundle;

    .line 1143
    .line 1144
    .line 1145
    move-result-object v0

    .line 1146
    if-eqz v0, :cond_2a

    .line 1147
    .line 1148
    invoke-virtual {v2}, Lsq3;->i()Ljava/lang/String;

    .line 1149
    .line 1150
    .line 1151
    move-result-object v2

    .line 1152
    const-string v3, "androidx.core.app.extra.COMPAT_TEMPLATE"

    .line 1153
    .line 1154
    invoke-virtual {v0, v3, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1155
    .line 1156
    .line 1157
    :cond_2a
    return-object v1
.end method

.method public final c(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lpo1;->t:Landroid/app/Notification;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget p1, p0, Landroid/app/Notification;->flags:I

    .line 6
    .line 7
    or-int/lit8 p1, p1, 0x10

    .line 8
    .line 9
    iput p1, p0, Landroid/app/Notification;->flags:I

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget p1, p0, Landroid/app/Notification;->flags:I

    .line 13
    .line 14
    and-int/lit8 p1, p1, -0x11

    .line 15
    .line 16
    iput p1, p0, Landroid/app/Notification;->flags:I

    .line 17
    .line 18
    return-void
.end method

.method public final d(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lpo1;->t:Landroid/app/Notification;

    .line 2
    .line 3
    iput p1, p0, Landroid/app/Notification;->defaults:I

    .line 4
    .line 5
    and-int/lit8 p1, p1, 0x4

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget p1, p0, Landroid/app/Notification;->flags:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    iput p1, p0, Landroid/app/Notification;->flags:I

    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public final e(Landroid/graphics/Bitmap;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    iget-object v0, p0, Lpo1;->a:Landroid/content/Context;

    .line 6
    .line 7
    invoke-static {v0, p1}, Landroidx/core/app/NotificationCompat;->reduceLargeIconSize(Landroid/content/Context;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    sget-object v0, Landroidx/core/graphics/drawable/IconCompat;->k:Landroid/graphics/PorterDuff$Mode;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    new-instance v0, Landroidx/core/graphics/drawable/IconCompat;

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    invoke-direct {v0, v1}, Landroidx/core/graphics/drawable/IconCompat;-><init>(I)V

    .line 20
    .line 21
    .line 22
    iput-object p1, v0, Landroidx/core/graphics/drawable/IconCompat;->b:Ljava/lang/Object;

    .line 23
    .line 24
    move-object p1, v0

    .line 25
    :goto_0
    iput-object p1, p0, Lpo1;->h:Landroidx/core/graphics/drawable/IconCompat;

    .line 26
    .line 27
    return-void
.end method

.method public final f(Landroid/net/Uri;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lpo1;->t:Landroid/app/Notification;

    .line 2
    .line 3
    iput-object p1, p0, Landroid/app/Notification;->sound:Landroid/net/Uri;

    .line 4
    .line 5
    const/4 p1, -0x1

    .line 6
    iput p1, p0, Landroid/app/Notification;->audioStreamType:I

    .line 7
    .line 8
    invoke-static {}, Loo1;->b()Landroid/media/AudioAttributes$Builder;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const/4 v0, 0x4

    .line 13
    invoke-static {p1, v0}, Loo1;->c(Landroid/media/AudioAttributes$Builder;I)Landroid/media/AudioAttributes$Builder;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const/4 v0, 0x5

    .line 18
    invoke-static {p1, v0}, Loo1;->e(Landroid/media/AudioAttributes$Builder;I)Landroid/media/AudioAttributes$Builder;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-static {p1}, Loo1;->a(Landroid/media/AudioAttributes$Builder;)Landroid/media/AudioAttributes;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, Landroid/app/Notification;->audioAttributes:Landroid/media/AudioAttributes;

    .line 27
    .line 28
    return-void
.end method

.method public final g(Lsq3;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lpo1;->l:Lsq3;

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Lpo1;->l:Lsq3;

    .line 6
    .line 7
    iget-object v0, p1, Lsq3;->a:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lpo1;

    .line 10
    .line 11
    if-eq v0, p0, :cond_0

    .line 12
    .line 13
    iput-object p0, p1, Lsq3;->a:Ljava/lang/Object;

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lpo1;->g(Lsq3;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method
