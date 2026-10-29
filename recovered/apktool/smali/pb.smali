.class public final Lpb;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/widget/TextView;Landroid/graphics/Typeface;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lpb;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lpb;->c:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lpb;->d:Ljava/lang/Object;

    .line 10
    .line 11
    iput p3, p0, Lpb;->b:I

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Landroid/view/View;I)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lpb;->a:I

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpb;->d:Ljava/lang/Object;

    iput-object p2, p0, Lpb;->c:Ljava/lang/Object;

    iput p3, p0, Lpb;->b:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;I)V
    .locals 0

    .line 14
    iput p4, p0, Lpb;->a:I

    iput-object p1, p0, Lpb;->d:Ljava/lang/Object;

    iput p2, p0, Lpb;->b:I

    iput-object p3, p0, Lpb;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 12

    .line 1
    iget v0, p0, Lpb;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lpb;->c:Ljava/lang/Object;

    .line 5
    .line 6
    iget v3, p0, Lpb;->b:I

    .line 7
    .line 8
    iget-object p0, p0, Lpb;->d:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p0, Lf81;

    .line 14
    .line 15
    check-cast v2, Ls81;

    .line 16
    .line 17
    iget-boolean v0, p0, Lf81;->c:Z

    .line 18
    .line 19
    const-string v4, "Less than 0 remaining futures"

    .line 20
    .line 21
    iget-object v5, p0, Lf81;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 22
    .line 23
    iget-object v6, p0, Lf81;->b:Ljava/util/ArrayList;

    .line 24
    .line 25
    iget-object v7, p0, Lf81;->e:Ls81;

    .line 26
    .line 27
    invoke-interface {v7}, Ljava/util/concurrent/Future;->isDone()Z

    .line 28
    .line 29
    .line 30
    move-result v8

    .line 31
    if-nez v8, :cond_d

    .line 32
    .line 33
    if-nez v6, :cond_0

    .line 34
    .line 35
    goto/16 :goto_7

    .line 36
    .line 37
    :cond_0
    const/4 v8, 0x0

    .line 38
    const/4 v9, 0x1

    .line 39
    :try_start_0
    invoke-interface {v2}, Ljava/util/concurrent/Future;->isDone()Z

    .line 40
    .line 41
    .line 42
    move-result v10

    .line 43
    const-string v11, "Tried to set value from future which is not done"

    .line 44
    .line 45
    invoke-static {v11, v10}, Lde3;->j(Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    invoke-static {v2}, Lw11;->r(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {v6, v3, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    .line 54
    .line 55
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-ltz v0, :cond_1

    .line 60
    .line 61
    move v1, v9

    .line 62
    :cond_1
    invoke-static {v4, v1}, Lde3;->j(Ljava/lang/String;Z)V

    .line 63
    .line 64
    .line 65
    if-nez v0, :cond_e

    .line 66
    .line 67
    iget-object v0, p0, Lf81;->b:Ljava/util/ArrayList;

    .line 68
    .line 69
    if-eqz v0, :cond_2

    .line 70
    .line 71
    iget-object p0, p0, Lf81;->f:Lum;

    .line 72
    .line 73
    new-instance v1, Ljava/util/ArrayList;

    .line 74
    .line 75
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 76
    .line 77
    .line 78
    :goto_0
    invoke-virtual {p0, v1}, Lum;->a(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    goto/16 :goto_8

    .line 82
    .line 83
    :cond_2
    invoke-interface {v7}, Ljava/util/concurrent/Future;->isDone()Z

    .line 84
    .line 85
    .line 86
    move-result p0

    .line 87
    invoke-static {v8, p0}, Lde3;->j(Ljava/lang/String;Z)V

    .line 88
    .line 89
    .line 90
    goto/16 :goto_8

    .line 91
    .line 92
    :catchall_0
    move-exception v0

    .line 93
    goto/16 :goto_4

    .line 94
    .line 95
    :catch_0
    move-exception v0

    .line 96
    goto :goto_1

    .line 97
    :catch_1
    move-exception v2

    .line 98
    goto :goto_2

    .line 99
    :catch_2
    move-exception v2

    .line 100
    goto :goto_3

    .line 101
    :goto_1
    :try_start_1
    iget-object v2, p0, Lf81;->f:Lum;

    .line 102
    .line 103
    invoke-virtual {v2, v0}, Lum;->b(Ljava/lang/Throwable;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 104
    .line 105
    .line 106
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-ltz v0, :cond_3

    .line 111
    .line 112
    move v1, v9

    .line 113
    :cond_3
    invoke-static {v4, v1}, Lde3;->j(Ljava/lang/String;Z)V

    .line 114
    .line 115
    .line 116
    if-nez v0, :cond_e

    .line 117
    .line 118
    iget-object v0, p0, Lf81;->b:Ljava/util/ArrayList;

    .line 119
    .line 120
    if-eqz v0, :cond_2

    .line 121
    .line 122
    iget-object p0, p0, Lf81;->f:Lum;

    .line 123
    .line 124
    new-instance v1, Ljava/util/ArrayList;

    .line 125
    .line 126
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 127
    .line 128
    .line 129
    goto :goto_0

    .line 130
    :goto_2
    if-eqz v0, :cond_4

    .line 131
    .line 132
    :try_start_2
    iget-object v0, p0, Lf81;->f:Lum;

    .line 133
    .line 134
    invoke-virtual {v0, v2}, Lum;->b(Ljava/lang/Throwable;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 135
    .line 136
    .line 137
    :cond_4
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    if-ltz v0, :cond_5

    .line 142
    .line 143
    move v1, v9

    .line 144
    :cond_5
    invoke-static {v4, v1}, Lde3;->j(Ljava/lang/String;Z)V

    .line 145
    .line 146
    .line 147
    if-nez v0, :cond_e

    .line 148
    .line 149
    iget-object v0, p0, Lf81;->b:Ljava/util/ArrayList;

    .line 150
    .line 151
    if-eqz v0, :cond_2

    .line 152
    .line 153
    iget-object p0, p0, Lf81;->f:Lum;

    .line 154
    .line 155
    new-instance v1, Ljava/util/ArrayList;

    .line 156
    .line 157
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 158
    .line 159
    .line 160
    goto :goto_0

    .line 161
    :goto_3
    if-eqz v0, :cond_6

    .line 162
    .line 163
    :try_start_3
    iget-object v0, p0, Lf81;->f:Lum;

    .line 164
    .line 165
    invoke-virtual {v2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    invoke-virtual {v0, v2}, Lum;->b(Ljava/lang/Throwable;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 170
    .line 171
    .line 172
    :cond_6
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    if-ltz v0, :cond_7

    .line 177
    .line 178
    move v1, v9

    .line 179
    :cond_7
    invoke-static {v4, v1}, Lde3;->j(Ljava/lang/String;Z)V

    .line 180
    .line 181
    .line 182
    if-nez v0, :cond_e

    .line 183
    .line 184
    iget-object v0, p0, Lf81;->b:Ljava/util/ArrayList;

    .line 185
    .line 186
    if-eqz v0, :cond_2

    .line 187
    .line 188
    iget-object p0, p0, Lf81;->f:Lum;

    .line 189
    .line 190
    new-instance v1, Ljava/util/ArrayList;

    .line 191
    .line 192
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 193
    .line 194
    .line 195
    goto :goto_0

    .line 196
    :catch_3
    if-eqz v0, :cond_b

    .line 197
    .line 198
    :try_start_4
    invoke-virtual {p0, v1}, Lf81;->cancel(Z)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 199
    .line 200
    .line 201
    goto :goto_6

    .line 202
    :goto_4
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 203
    .line 204
    .line 205
    move-result v2

    .line 206
    if-ltz v2, :cond_8

    .line 207
    .line 208
    move v1, v9

    .line 209
    :cond_8
    invoke-static {v4, v1}, Lde3;->j(Ljava/lang/String;Z)V

    .line 210
    .line 211
    .line 212
    if-nez v2, :cond_a

    .line 213
    .line 214
    iget-object v1, p0, Lf81;->b:Ljava/util/ArrayList;

    .line 215
    .line 216
    if-eqz v1, :cond_9

    .line 217
    .line 218
    iget-object p0, p0, Lf81;->f:Lum;

    .line 219
    .line 220
    new-instance v2, Ljava/util/ArrayList;

    .line 221
    .line 222
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {p0, v2}, Lum;->a(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    goto :goto_5

    .line 229
    :cond_9
    invoke-interface {v7}, Ljava/util/concurrent/Future;->isDone()Z

    .line 230
    .line 231
    .line 232
    move-result p0

    .line 233
    invoke-static {v8, p0}, Lde3;->j(Ljava/lang/String;Z)V

    .line 234
    .line 235
    .line 236
    :cond_a
    :goto_5
    throw v0

    .line 237
    :cond_b
    :goto_6
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 238
    .line 239
    .line 240
    move-result v0

    .line 241
    if-ltz v0, :cond_c

    .line 242
    .line 243
    move v1, v9

    .line 244
    :cond_c
    invoke-static {v4, v1}, Lde3;->j(Ljava/lang/String;Z)V

    .line 245
    .line 246
    .line 247
    if-nez v0, :cond_e

    .line 248
    .line 249
    iget-object v0, p0, Lf81;->b:Ljava/util/ArrayList;

    .line 250
    .line 251
    if-eqz v0, :cond_2

    .line 252
    .line 253
    iget-object p0, p0, Lf81;->f:Lum;

    .line 254
    .line 255
    new-instance v1, Ljava/util/ArrayList;

    .line 256
    .line 257
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 258
    .line 259
    .line 260
    goto/16 :goto_0

    .line 261
    .line 262
    :cond_d
    :goto_7
    const-string p0, "Future was done before all dependencies completed"

    .line 263
    .line 264
    invoke-static {p0, v0}, Lde3;->j(Ljava/lang/String;Z)V

    .line 265
    .line 266
    .line 267
    :cond_e
    :goto_8
    return-void

    .line 268
    :pswitch_0
    check-cast p0, Ld30;

    .line 269
    .line 270
    iget-object p0, p0, Ld30;->b:Lw20;

    .line 271
    .line 272
    check-cast v2, Landroid/os/Bundle;

    .line 273
    .line 274
    invoke-virtual {p0, v3, v2}, Lw20;->onNavigationEvent(ILandroid/os/Bundle;)V

    .line 275
    .line 276
    .line 277
    return-void

    .line 278
    :pswitch_1
    check-cast p0, Lvx;

    .line 279
    .line 280
    new-instance v0, Landroid/content/Intent;

    .line 281
    .line 282
    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 283
    .line 284
    .line 285
    const-string v4, "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST"

    .line 286
    .line 287
    invoke-virtual {v0, v4}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    const-string v4, "androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION"

    .line 292
    .line 293
    check-cast v2, Landroid/content/IntentSender$SendIntentException;

    .line 294
    .line 295
    invoke-virtual {v0, v4, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    invoke-virtual {p0, v3, v1, v0}, Lk3;->a(IILandroid/content/Intent;)Z

    .line 300
    .line 301
    .line 302
    return-void

    .line 303
    :pswitch_2
    check-cast p0, Lvx;

    .line 304
    .line 305
    check-cast v2, Lqc3;

    .line 306
    .line 307
    iget-object v0, v2, Lqc3;->b:Ljava/lang/Object;

    .line 308
    .line 309
    iget-object v1, p0, Lk3;->a:Ljava/util/HashMap;

    .line 310
    .line 311
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 312
    .line 313
    .line 314
    move-result-object v2

    .line 315
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v1

    .line 319
    check-cast v1, Ljava/lang/String;

    .line 320
    .line 321
    if-nez v1, :cond_f

    .line 322
    .line 323
    goto :goto_a

    .line 324
    :cond_f
    iget-object v2, p0, Lk3;->e:Ljava/util/HashMap;

    .line 325
    .line 326
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v2

    .line 330
    check-cast v2, Li3;

    .line 331
    .line 332
    if-eqz v2, :cond_11

    .line 333
    .line 334
    iget-object v2, v2, Li3;->a:Lc3;

    .line 335
    .line 336
    if-nez v2, :cond_10

    .line 337
    .line 338
    goto :goto_9

    .line 339
    :cond_10
    iget-object p0, p0, Lk3;->d:Ljava/util/ArrayList;

    .line 340
    .line 341
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 342
    .line 343
    .line 344
    move-result p0

    .line 345
    if-eqz p0, :cond_12

    .line 346
    .line 347
    invoke-interface {v2, v0}, Lc3;->c(Ljava/lang/Object;)V

    .line 348
    .line 349
    .line 350
    goto :goto_a

    .line 351
    :cond_11
    :goto_9
    iget-object v2, p0, Lk3;->g:Landroid/os/Bundle;

    .line 352
    .line 353
    invoke-virtual {v2, v1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 354
    .line 355
    .line 356
    iget-object p0, p0, Lk3;->f:Ljava/util/HashMap;

    .line 357
    .line 358
    invoke-virtual {p0, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    :cond_12
    :goto_a
    return-void

    .line 362
    :pswitch_3
    check-cast p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 363
    .line 364
    check-cast v2, Landroid/view/View;

    .line 365
    .line 366
    sget v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->b0:I

    .line 367
    .line 368
    invoke-virtual {p0, v3, v2, v1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->D(ILandroid/view/View;Z)V

    .line 369
    .line 370
    .line 371
    return-void

    .line 372
    :pswitch_4
    check-cast v2, Landroid/widget/TextView;

    .line 373
    .line 374
    check-cast p0, Landroid/graphics/Typeface;

    .line 375
    .line 376
    invoke-virtual {v2, p0, v3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 377
    .line 378
    .line 379
    return-void

    .line 380
    nop

    .line 381
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
