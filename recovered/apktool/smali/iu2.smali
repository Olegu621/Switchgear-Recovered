.class public final Liu2;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final g0:Lew2;

.field public final h0:Lra2;

.field public final i0:Lhk2;

.field public final j0:Lhk2;

.field public final k0:Lhk2;

.field public final l0:Lhk2;

.field public final m0:Lhk2;

.field public final n0:Lhk2;

.field public final o0:Lhk2;

.field public final p0:Lhk2;


# direct methods
.method public constructor <init>(Lz00;Lew2;Lra2;)V
    .locals 6

    .line 1
    iget-object v0, p2, Lew2;->a:Lwt2;

    .line 2
    .line 3
    iget-object v1, p3, Lra2;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lhk2;

    .line 6
    .line 7
    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    new-instance p1, Landroid/util/SparseArray;

    .line 11
    .line 12
    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->a:Landroid/util/SparseArray;

    .line 16
    .line 17
    new-instance p1, Ljava/util/ArrayList;

    .line 18
    .line 19
    const/4 v2, 0x4

    .line 20
    invoke-direct {p1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ljava/util/ArrayList;

    .line 24
    .line 25
    new-instance p1, La00;

    .line 26
    .line 27
    invoke-direct {p1}, La00;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:La00;

    .line 31
    .line 32
    const/4 p1, 0x0

    .line 33
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:I

    .line 34
    .line 35
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    .line 36
    .line 37
    const v3, 0x7fffffff

    .line 38
    .line 39
    .line 40
    iput v3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    .line 41
    .line 42
    iput v3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    .line 43
    .line 44
    const/4 v3, 0x1

    .line 45
    iput-boolean v3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->v:Z

    .line 46
    .line 47
    const/16 v4, 0x101

    .line 48
    .line 49
    iput v4, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->w:I

    .line 50
    .line 51
    const/4 v4, 0x0

    .line 52
    iput-object v4, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->U:Landroidx/constraintlayout/widget/d;

    .line 53
    .line 54
    iput-object v4, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->V:Lsz;

    .line 55
    .line 56
    const/4 v5, -0x1

    .line 57
    iput v5, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->W:I

    .line 58
    .line 59
    new-instance v5, Ljava/util/HashMap;

    .line 60
    .line 61
    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 62
    .line 63
    .line 64
    iput-object v5, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->a0:Ljava/util/HashMap;

    .line 65
    .line 66
    new-instance v5, Landroid/util/SparseArray;

    .line 67
    .line 68
    invoke-direct {v5}, Landroid/util/SparseArray;-><init>()V

    .line 69
    .line 70
    .line 71
    iput-object v5, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b0:Landroid/util/SparseArray;

    .line 72
    .line 73
    new-instance v5, Landroidx/constraintlayout/widget/b;

    .line 74
    .line 75
    invoke-direct {v5, p0, p0}, Landroidx/constraintlayout/widget/b;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/constraintlayout/widget/ConstraintLayout;)V

    .line 76
    .line 77
    .line 78
    iput-object v5, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c0:Landroidx/constraintlayout/widget/b;

    .line 79
    .line 80
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->d0:I

    .line 81
    .line 82
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e0:I

    .line 83
    .line 84
    invoke-virtual {p0, v4, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->d(Landroid/util/AttributeSet;I)V

    .line 85
    .line 86
    .line 87
    iput-object p2, p0, Liu2;->g0:Lew2;

    .line 88
    .line 89
    iput-object p3, p0, Liu2;->h0:Lra2;

    .line 90
    .line 91
    new-instance p3, Lhu2;

    .line 92
    .line 93
    const/4 v5, 0x3

    .line 94
    invoke-direct {p3, p0, v5}, Lhu2;-><init>(Liu2;I)V

    .line 95
    .line 96
    .line 97
    invoke-static {p3}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 98
    .line 99
    .line 100
    move-result-object p3

    .line 101
    iput-object p3, p0, Liu2;->i0:Lhk2;

    .line 102
    .line 103
    new-instance p3, Lhu2;

    .line 104
    .line 105
    const/4 v5, 0x5

    .line 106
    invoke-direct {p3, p0, v5}, Lhu2;-><init>(Liu2;I)V

    .line 107
    .line 108
    .line 109
    invoke-static {p3}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 110
    .line 111
    .line 112
    move-result-object p3

    .line 113
    iput-object p3, p0, Liu2;->j0:Lhk2;

    .line 114
    .line 115
    new-instance p3, Lhu2;

    .line 116
    .line 117
    const/16 v5, 0x8

    .line 118
    .line 119
    invoke-direct {p3, p0, v5}, Lhu2;-><init>(Liu2;I)V

    .line 120
    .line 121
    .line 122
    invoke-static {p3}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 123
    .line 124
    .line 125
    move-result-object p3

    .line 126
    iput-object p3, p0, Liu2;->k0:Lhk2;

    .line 127
    .line 128
    new-instance p3, Lhu2;

    .line 129
    .line 130
    const/4 v5, 0x7

    .line 131
    invoke-direct {p3, p0, v5}, Lhu2;-><init>(Liu2;I)V

    .line 132
    .line 133
    .line 134
    invoke-static {p3}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 135
    .line 136
    .line 137
    move-result-object p3

    .line 138
    iput-object p3, p0, Liu2;->l0:Lhk2;

    .line 139
    .line 140
    new-instance p3, Lhu2;

    .line 141
    .line 142
    invoke-direct {p3, p0, v2}, Lhu2;-><init>(Liu2;I)V

    .line 143
    .line 144
    .line 145
    invoke-static {p3}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 146
    .line 147
    .line 148
    move-result-object p3

    .line 149
    iput-object p3, p0, Liu2;->m0:Lhk2;

    .line 150
    .line 151
    new-instance p3, Lhu2;

    .line 152
    .line 153
    const/4 v2, 0x6

    .line 154
    invoke-direct {p3, p0, v2}, Lhu2;-><init>(Liu2;I)V

    .line 155
    .line 156
    .line 157
    invoke-static {p3}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 158
    .line 159
    .line 160
    move-result-object p3

    .line 161
    iput-object p3, p0, Liu2;->n0:Lhk2;

    .line 162
    .line 163
    new-instance p3, Lhu2;

    .line 164
    .line 165
    const/4 v2, 0x2

    .line 166
    invoke-direct {p3, p0, v2}, Lhu2;-><init>(Liu2;I)V

    .line 167
    .line 168
    .line 169
    invoke-static {p3}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 170
    .line 171
    .line 172
    move-result-object p3

    .line 173
    iput-object p3, p0, Liu2;->o0:Lhk2;

    .line 174
    .line 175
    new-instance p3, Lhu2;

    .line 176
    .line 177
    invoke-direct {p3, p0, v3}, Lhu2;-><init>(Liu2;I)V

    .line 178
    .line 179
    .line 180
    invoke-static {p3}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 181
    .line 182
    .line 183
    move-result-object p3

    .line 184
    iput-object p3, p0, Liu2;->p0:Lhk2;

    .line 185
    .line 186
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 187
    .line 188
    .line 189
    move-result-object p3

    .line 190
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    const/high16 v2, 0x41400000    # 12.0f

    .line 194
    .line 195
    invoke-static {v2, p3}, Lyy1;->n(FLandroid/content/Context;)F

    .line 196
    .line 197
    .line 198
    move-result p3

    .line 199
    float-to-int p3, p3

    .line 200
    invoke-virtual {p0, p3, p3, p3, p3}, Landroid/view/View;->setPaddingRelative(IIII)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 204
    .line 205
    .line 206
    move-result-object p3

    .line 207
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    invoke-static {p3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 211
    .line 212
    .line 213
    move-result-object p3

    .line 214
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 215
    .line 216
    .line 217
    sget v2, Lcom/usercentrics/sdk/ui/R$layout;->uc_cookie_dialog:I

    .line 218
    .line 219
    invoke-virtual {p3, v2, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 220
    .line 221
    .line 222
    invoke-direct {p0}, Liu2;->getUcCookieDialogTitle()Lcom/usercentrics/sdk/ui/components/UCTextView;

    .line 223
    .line 224
    .line 225
    move-result-object p3

    .line 226
    const/16 v2, 0xc

    .line 227
    .line 228
    invoke-static {p3, p2, v2}, Lcom/usercentrics/sdk/ui/components/UCTextView;->h(Lcom/usercentrics/sdk/ui/components/UCTextView;Lew2;I)V

    .line 229
    .line 230
    .line 231
    invoke-direct {p0}, Liu2;->getUcCookieLoadingText()Lcom/usercentrics/sdk/ui/components/UCTextView;

    .line 232
    .line 233
    .line 234
    move-result-object p3

    .line 235
    const/16 v2, 0xe

    .line 236
    .line 237
    invoke-static {p3, p2, v2}, Lcom/usercentrics/sdk/ui/components/UCTextView;->h(Lcom/usercentrics/sdk/ui/components/UCTextView;Lew2;I)V

    .line 238
    .line 239
    .line 240
    invoke-direct {p0}, Liu2;->getUcCookieTryAgainBtn()Lcom/usercentrics/sdk/ui/components/UCTextView;

    .line 241
    .line 242
    .line 243
    move-result-object p3

    .line 244
    const/16 v3, 0xa

    .line 245
    .line 246
    invoke-static {p3, p2, v3}, Lcom/usercentrics/sdk/ui/components/UCTextView;->h(Lcom/usercentrics/sdk/ui/components/UCTextView;Lew2;I)V

    .line 247
    .line 248
    .line 249
    invoke-direct {p0}, Liu2;->getUcCookieRetryMessage()Lcom/usercentrics/sdk/ui/components/UCTextView;

    .line 250
    .line 251
    .line 252
    move-result-object p3

    .line 253
    invoke-static {p3, p2, v2}, Lcom/usercentrics/sdk/ui/components/UCTextView;->h(Lcom/usercentrics/sdk/ui/components/UCTextView;Lew2;I)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 257
    .line 258
    .line 259
    move-result-object p2

    .line 260
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    sget p3, Lcom/usercentrics/sdk/ui/R$drawable;->uc_ic_close:I

    .line 264
    .line 265
    invoke-static {p2, p3}, Lmn0;->p(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 266
    .line 267
    .line 268
    move-result-object p2

    .line 269
    if-eqz p2, :cond_1

    .line 270
    .line 271
    iget-object p3, v0, Lwt2;->b:Ljava/lang/Integer;

    .line 272
    .line 273
    if-eqz p3, :cond_0

    .line 274
    .line 275
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 276
    .line 277
    .line 278
    move-result p3

    .line 279
    new-instance v2, Landroid/graphics/PorterDuffColorFilter;

    .line 280
    .line 281
    sget-object v3, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 282
    .line 283
    invoke-direct {v2, p3, v3}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {p2, v2}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 287
    .line 288
    .line 289
    :cond_0
    move-object v4, p2

    .line 290
    :cond_1
    invoke-direct {p0}, Liu2;->getUcCookieDialogClose()Lcom/usercentrics/sdk/ui/components/UCImageView;

    .line 291
    .line 292
    .line 293
    move-result-object p2

    .line 294
    invoke-virtual {p2, v4}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 295
    .line 296
    .line 297
    iget-object p2, v0, Lwt2;->f:Ljava/lang/Integer;

    .line 298
    .line 299
    if-eqz p2, :cond_2

    .line 300
    .line 301
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 302
    .line 303
    .line 304
    move-result p2

    .line 305
    invoke-virtual {p0, p2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 306
    .line 307
    .line 308
    :cond_2
    invoke-direct {p0}, Liu2;->getUcCookieRetryBox()Landroid/widget/LinearLayout;

    .line 309
    .line 310
    .line 311
    move-result-object p2

    .line 312
    invoke-virtual {p0}, Liu2;->l()Landroid/graphics/drawable/GradientDrawable;

    .line 313
    .line 314
    .line 315
    move-result-object p3

    .line 316
    invoke-virtual {p2, p3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 317
    .line 318
    .line 319
    invoke-direct {p0}, Liu2;->getUcCookieLoadingBox()Landroid/widget/LinearLayout;

    .line 320
    .line 321
    .line 322
    move-result-object p2

    .line 323
    invoke-virtual {p0}, Liu2;->l()Landroid/graphics/drawable/GradientDrawable;

    .line 324
    .line 325
    .line 326
    move-result-object p3

    .line 327
    invoke-virtual {p2, p3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 328
    .line 329
    .line 330
    invoke-direct {p0}, Liu2;->getUcCookieDialogTitle()Lcom/usercentrics/sdk/ui/components/UCTextView;

    .line 331
    .line 332
    .line 333
    move-result-object p2

    .line 334
    invoke-virtual {v1}, Lhk2;->getValue()Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object p3

    .line 338
    check-cast p3, Lhu1;

    .line 339
    .line 340
    const-string v0, ""

    .line 341
    .line 342
    if-eqz p3, :cond_3

    .line 343
    .line 344
    iget-object p3, p3, Lhu1;->w:Ljava/lang/String;

    .line 345
    .line 346
    if-nez p3, :cond_4

    .line 347
    .line 348
    :cond_3
    move-object p3, v0

    .line 349
    :cond_4
    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 350
    .line 351
    .line 352
    invoke-direct {p0}, Liu2;->getUcCookieLoadingText()Lcom/usercentrics/sdk/ui/components/UCTextView;

    .line 353
    .line 354
    .line 355
    move-result-object p2

    .line 356
    invoke-virtual {v1}, Lhk2;->getValue()Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object p3

    .line 360
    check-cast p3, Lhu1;

    .line 361
    .line 362
    if-eqz p3, :cond_5

    .line 363
    .line 364
    iget-object p3, p3, Lhu1;->j:Ljava/lang/String;

    .line 365
    .line 366
    if-nez p3, :cond_6

    .line 367
    .line 368
    :cond_5
    move-object p3, v0

    .line 369
    :cond_6
    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 370
    .line 371
    .line 372
    invoke-direct {p0}, Liu2;->getUcCookieRetryMessage()Lcom/usercentrics/sdk/ui/components/UCTextView;

    .line 373
    .line 374
    .line 375
    move-result-object p2

    .line 376
    invoke-virtual {v1}, Lhk2;->getValue()Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object p3

    .line 380
    check-cast p3, Lhu1;

    .line 381
    .line 382
    if-eqz p3, :cond_7

    .line 383
    .line 384
    iget-object p3, p3, Lhu1;->f:Ljava/lang/String;

    .line 385
    .line 386
    if-nez p3, :cond_8

    .line 387
    .line 388
    :cond_7
    move-object p3, v0

    .line 389
    :cond_8
    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 390
    .line 391
    .line 392
    invoke-direct {p0}, Liu2;->getUcCookieTryAgainBtn()Lcom/usercentrics/sdk/ui/components/UCTextView;

    .line 393
    .line 394
    .line 395
    move-result-object p2

    .line 396
    invoke-virtual {v1}, Lhk2;->getValue()Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object p3

    .line 400
    check-cast p3, Lhu1;

    .line 401
    .line 402
    if-eqz p3, :cond_a

    .line 403
    .line 404
    iget-object p3, p3, Lhu1;->x:Ljava/lang/String;

    .line 405
    .line 406
    if-nez p3, :cond_9

    .line 407
    .line 408
    goto :goto_0

    .line 409
    :cond_9
    move-object v0, p3

    .line 410
    :cond_a
    :goto_0
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 411
    .line 412
    .line 413
    invoke-direct {p0}, Liu2;->getUcCookieDialogClose()Lcom/usercentrics/sdk/ui/components/UCImageView;

    .line 414
    .line 415
    .line 416
    move-result-object p2

    .line 417
    new-instance p3, Lgu2;

    .line 418
    .line 419
    invoke-direct {p3, p0, p1}, Lgu2;-><init>(Liu2;I)V

    .line 420
    .line 421
    .line 422
    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 423
    .line 424
    .line 425
    invoke-virtual {p0}, Liu2;->m()V

    .line 426
    .line 427
    .line 428
    return-void
.end method

.method private final getUcCookieDialogClose()Lcom/usercentrics/sdk/ui/components/UCImageView;
    .locals 0

    .line 1
    iget-object p0, p0, Liu2;->p0:Lhk2;

    .line 2
    .line 3
    invoke-virtual {p0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    check-cast p0, Lcom/usercentrics/sdk/ui/components/UCImageView;

    .line 11
    .line 12
    return-object p0
.end method

.method private final getUcCookieDialogList()Landroidx/recyclerview/widget/RecyclerView;
    .locals 0

    .line 1
    iget-object p0, p0, Liu2;->o0:Lhk2;

    .line 2
    .line 3
    invoke-virtual {p0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    .line 11
    .line 12
    return-object p0
.end method

.method private final getUcCookieDialogTitle()Lcom/usercentrics/sdk/ui/components/UCTextView;
    .locals 0

    .line 1
    iget-object p0, p0, Liu2;->i0:Lhk2;

    .line 2
    .line 3
    invoke-virtual {p0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    check-cast p0, Lcom/usercentrics/sdk/ui/components/UCTextView;

    .line 11
    .line 12
    return-object p0
.end method

.method private final getUcCookieLoadingBox()Landroid/widget/LinearLayout;
    .locals 0

    .line 1
    iget-object p0, p0, Liu2;->m0:Lhk2;

    .line 2
    .line 3
    invoke-virtual {p0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    check-cast p0, Landroid/widget/LinearLayout;

    .line 11
    .line 12
    return-object p0
.end method

.method private final getUcCookieLoadingText()Lcom/usercentrics/sdk/ui/components/UCTextView;
    .locals 0

    .line 1
    iget-object p0, p0, Liu2;->j0:Lhk2;

    .line 2
    .line 3
    invoke-virtual {p0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    check-cast p0, Lcom/usercentrics/sdk/ui/components/UCTextView;

    .line 11
    .line 12
    return-object p0
.end method

.method private final getUcCookieRetryBox()Landroid/widget/LinearLayout;
    .locals 0

    .line 1
    iget-object p0, p0, Liu2;->n0:Lhk2;

    .line 2
    .line 3
    invoke-virtual {p0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    check-cast p0, Landroid/widget/LinearLayout;

    .line 11
    .line 12
    return-object p0
.end method

.method private final getUcCookieRetryMessage()Lcom/usercentrics/sdk/ui/components/UCTextView;
    .locals 0

    .line 1
    iget-object p0, p0, Liu2;->l0:Lhk2;

    .line 2
    .line 3
    invoke-virtual {p0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    check-cast p0, Lcom/usercentrics/sdk/ui/components/UCTextView;

    .line 11
    .line 12
    return-object p0
.end method

.method private final getUcCookieTryAgainBtn()Lcom/usercentrics/sdk/ui/components/UCTextView;
    .locals 0

    .line 1
    iget-object p0, p0, Liu2;->k0:Lhk2;

    .line 2
    .line 3
    invoke-virtual {p0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    check-cast p0, Lcom/usercentrics/sdk/ui/components/UCTextView;

    .line 11
    .line 12
    return-object p0
.end method

.method public static final j(Liu2;Ljava/util/List;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Liu2;->getUcCookieLoadingBox()Landroid/widget/LinearLayout;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/16 v1, 0x8

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Liu2;->getUcCookieRetryBox()Landroid/widget/LinearLayout;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0}, Liu2;->getUcCookieDialogList()Landroidx/recyclerview/widget/RecyclerView;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 23
    .line 24
    .line 25
    new-instance v0, Li10;

    .line 26
    .line 27
    iget-object v1, p0, Liu2;->g0:Lew2;

    .line 28
    .line 29
    invoke-direct {v0, v1, p1}, Li10;-><init>(Lew2;Ljava/util/List;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {p0}, Liu2;->getUcCookieDialogList()Landroidx/recyclerview/widget/RecyclerView;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/g;)V

    .line 37
    .line 38
    .line 39
    invoke-direct {p0}, Liu2;->getUcCookieDialogList()Landroidx/recyclerview/widget/RecyclerView;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 44
    .line 45
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 46
    .line 47
    .line 48
    const/4 p0, 0x1

    .line 49
    invoke-direct {v0, p0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/k;)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public static final k(Liu2;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Liu2;->getUcCookieLoadingBox()Landroid/widget/LinearLayout;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/16 v1, 0x8

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Liu2;->getUcCookieDialogList()Landroidx/recyclerview/widget/RecyclerView;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0}, Liu2;->getUcCookieRetryBox()Landroid/widget/LinearLayout;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 23
    .line 24
    .line 25
    invoke-direct {p0}, Liu2;->getUcCookieTryAgainBtn()Lcom/usercentrics/sdk/ui/components/UCTextView;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    new-instance v1, Lgu2;

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    invoke-direct {v1, p0, v2}, Lgu2;-><init>(Liu2;I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public final l()Landroid/graphics/drawable/GradientDrawable;
    .locals 3

    .line 1
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Liu2;->g0:Lew2;

    .line 11
    .line 12
    iget-object v2, v1, Lew2;->a:Lwt2;

    .line 13
    .line 14
    iget-object v2, v2, Lwt2;->f:Ljava/lang/Integer;

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v2, -0x1

    .line 24
    :goto_0
    invoke-virtual {v0, v2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    const/high16 v2, 0x3f800000    # 1.0f

    .line 35
    .line 36
    invoke-static {v2, p0}, Lyy1;->n(FLandroid/content/Context;)F

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    float-to-int p0, p0

    .line 41
    iget-object v1, v1, Lew2;->a:Lwt2;

    .line 42
    .line 43
    iget v1, v1, Lwt2;->j:I

    .line 44
    .line 45
    invoke-virtual {v0, p0, v1}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 46
    .line 47
    .line 48
    return-object v0
.end method

.method public final m()V
    .locals 5

    .line 1
    invoke-direct {p0}, Liu2;->getUcCookieLoadingBox()Landroid/widget/LinearLayout;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Liu2;->getUcCookieRetryBox()Landroid/widget/LinearLayout;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/16 v2, 0x8

    .line 14
    .line 15
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 16
    .line 17
    .line 18
    invoke-direct {p0}, Liu2;->getUcCookieDialogList()Landroidx/recyclerview/widget/RecyclerView;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 23
    .line 24
    .line 25
    new-instance v0, Lo;

    .line 26
    .line 27
    const/16 v2, 0x15

    .line 28
    .line 29
    invoke-direct {v0, p0, v2}, Lo;-><init>(Ljava/lang/Object;I)V

    .line 30
    .line 31
    .line 32
    new-instance v2, Lhu2;

    .line 33
    .line 34
    invoke-direct {v2, p0, v1}, Lhu2;-><init>(Liu2;I)V

    .line 35
    .line 36
    .line 37
    iget-object p0, p0, Liu2;->h0:Lra2;

    .line 38
    .line 39
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    iget-object v1, p0, Lra2;->a:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v1, Ltv1;

    .line 45
    .line 46
    iget-object v3, v1, Ltv1;->c:Ljava/util/List;

    .line 47
    .line 48
    iget-object v1, v1, Ltv1;->b:Ljava/lang/String;

    .line 49
    .line 50
    if-eqz v1, :cond_1

    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-nez v4, :cond_0

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    iget-object p0, p0, Lra2;->c:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast p0, Lhk2;

    .line 62
    .line 63
    invoke-virtual {p0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    check-cast p0, Loz2;

    .line 68
    .line 69
    new-instance v3, Lo;

    .line 70
    .line 71
    const/16 v4, 0x16

    .line 72
    .line 73
    invoke-direct {v3, v0, v4}, Lo;-><init>(Ljava/lang/Object;I)V

    .line 74
    .line 75
    .line 76
    new-instance v0, Lf8;

    .line 77
    .line 78
    const/16 v4, 0xe

    .line 79
    .line 80
    invoke-direct {v0, v2, v4}, Lf8;-><init>(Ljava/lang/Object;I)V

    .line 81
    .line 82
    .line 83
    invoke-interface {p0, v1, v3, v0}, Loz2;->a(Ljava/lang/String;Lo;Lf8;)V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_1
    :goto_0
    if-eqz v3, :cond_3

    .line 88
    .line 89
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 90
    .line 91
    .line 92
    move-result p0

    .line 93
    if-eqz p0, :cond_2

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_2
    invoke-virtual {v0, v3}, Lo;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    :cond_3
    :goto_1
    return-void
.end method
