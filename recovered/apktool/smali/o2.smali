.class public final Lo2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lo2;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lo2;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 10

    .line 1
    iget v0, p0, Lo2;->a:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object v3, p0, Lo2;->b:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast v3, Ljg2;

    .line 11
    .line 12
    iget-object p0, v3, Ljg2;->v:Landroidx/appcompat/widget/d;

    .line 13
    .line 14
    invoke-virtual {v3}, Ljg2;->a()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    iget-boolean v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->i0:Z

    .line 21
    .line 22
    if-nez v0, :cond_2

    .line 23
    .line 24
    iget-object v0, v3, Ljg2;->X:Landroid/view/View;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/view/View;->isShown()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-virtual {p0}, Landroidx/appcompat/widget/ListPopupWindow;->show()V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    :goto_0
    invoke-virtual {v3}, Ljg2;->dismiss()V

    .line 40
    .line 41
    .line 42
    :cond_2
    :goto_1
    return-void

    .line 43
    :pswitch_0
    check-cast v3, Lcom/google/android/material/navigation/NavigationView;

    .line 44
    .line 45
    iget-object p0, v3, Lcom/google/android/material/navigation/NavigationView;->w:[I

    .line 46
    .line 47
    invoke-virtual {v3, p0}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 48
    .line 49
    .line 50
    aget p0, p0, v1

    .line 51
    .line 52
    if-nez p0, :cond_3

    .line 53
    .line 54
    move p0, v1

    .line 55
    goto :goto_2

    .line 56
    :cond_3
    move p0, v2

    .line 57
    :goto_2
    iget-object v0, v3, Lcom/google/android/material/navigation/NavigationView;->i:Lgm1;

    .line 58
    .line 59
    iget-boolean v4, v0, Lgm1;->g0:Z

    .line 60
    .line 61
    if-eq v4, p0, :cond_5

    .line 62
    .line 63
    iput-boolean p0, v0, Lgm1;->g0:Z

    .line 64
    .line 65
    iget-object v4, v0, Lgm1;->b:Landroid/widget/LinearLayout;

    .line 66
    .line 67
    invoke-virtual {v4}, Landroid/view/ViewGroup;->getChildCount()I

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    if-nez v4, :cond_4

    .line 72
    .line 73
    iget-boolean v4, v0, Lgm1;->g0:Z

    .line 74
    .line 75
    if-eqz v4, :cond_4

    .line 76
    .line 77
    iget v4, v0, Lgm1;->i0:I

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_4
    move v4, v2

    .line 81
    :goto_3
    iget-object v0, v0, Lgm1;->a:Lcom/google/android/material/internal/NavigationMenuView;

    .line 82
    .line 83
    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    invoke-virtual {v0, v2, v4, v2, v5}, Landroid/view/View;->setPadding(IIII)V

    .line 88
    .line 89
    .line 90
    :cond_5
    if-eqz p0, :cond_6

    .line 91
    .line 92
    iget-boolean p0, v3, Lcom/google/android/material/navigation/NavigationView;->W:Z

    .line 93
    .line 94
    if-eqz p0, :cond_6

    .line 95
    .line 96
    move p0, v1

    .line 97
    goto :goto_4

    .line 98
    :cond_6
    move p0, v2

    .line 99
    :goto_4
    invoke-virtual {v3, p0}, Lcom/google/android/material/internal/ScrimInsetsFrameLayout;->setDrawTopInsetForeground(Z)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    :goto_5
    instance-of v0, p0, Landroid/content/ContextWrapper;

    .line 107
    .line 108
    if-eqz v0, :cond_8

    .line 109
    .line 110
    instance-of v0, p0, Landroid/app/Activity;

    .line 111
    .line 112
    if-eqz v0, :cond_7

    .line 113
    .line 114
    check-cast p0, Landroid/app/Activity;

    .line 115
    .line 116
    goto :goto_6

    .line 117
    :cond_7
    check-cast p0, Landroid/content/ContextWrapper;

    .line 118
    .line 119
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    goto :goto_5

    .line 124
    :cond_8
    const/4 p0, 0x0

    .line 125
    :goto_6
    if-eqz p0, :cond_c

    .line 126
    .line 127
    const v0, 0x1020002

    .line 128
    .line 129
    .line 130
    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    .line 139
    .line 140
    .line 141
    move-result v4

    .line 142
    if-ne v0, v4, :cond_9

    .line 143
    .line 144
    move v0, v1

    .line 145
    goto :goto_7

    .line 146
    :cond_9
    move v0, v2

    .line 147
    :goto_7
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    invoke-virtual {p0}, Landroid/view/Window;->getNavigationBarColor()I

    .line 152
    .line 153
    .line 154
    move-result p0

    .line 155
    invoke-static {p0}, Landroid/graphics/Color;->alpha(I)I

    .line 156
    .line 157
    .line 158
    move-result p0

    .line 159
    if-eqz p0, :cond_a

    .line 160
    .line 161
    move p0, v1

    .line 162
    goto :goto_8

    .line 163
    :cond_a
    move p0, v2

    .line 164
    :goto_8
    if-eqz v0, :cond_b

    .line 165
    .line 166
    if-eqz p0, :cond_b

    .line 167
    .line 168
    iget-boolean p0, v3, Lcom/google/android/material/navigation/NavigationView;->a0:Z

    .line 169
    .line 170
    if-eqz p0, :cond_b

    .line 171
    .line 172
    goto :goto_9

    .line 173
    :cond_b
    move v1, v2

    .line 174
    :goto_9
    invoke-virtual {v3, v1}, Lcom/google/android/material/internal/ScrimInsetsFrameLayout;->setDrawBottomInsetForeground(Z)V

    .line 175
    .line 176
    .line 177
    :cond_c
    return-void

    .line 178
    :pswitch_1
    check-cast v3, Lls0;

    .line 179
    .line 180
    iget-object p0, v3, Lls0;->c:Lcom/helpshift/views/HSWebView;

    .line 181
    .line 182
    if-nez p0, :cond_d

    .line 183
    .line 184
    goto :goto_b

    .line 185
    :cond_d
    new-instance p0, Landroid/graphics/Rect;

    .line 186
    .line 187
    invoke-direct {p0}, Landroid/graphics/Rect;-><init>()V

    .line 188
    .line 189
    .line 190
    iget-object v0, v3, Lls0;->c:Lcom/helpshift/views/HSWebView;

    .line 191
    .line 192
    invoke-virtual {v0, p0}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 193
    .line 194
    .line 195
    iget-object v0, v3, Lls0;->c:Lcom/helpshift/views/HSWebView;

    .line 196
    .line 197
    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 202
    .line 203
    .line 204
    move-result v0

    .line 205
    iget p0, p0, Landroid/graphics/Rect;->bottom:I

    .line 206
    .line 207
    sub-int p0, v0, p0

    .line 208
    .line 209
    int-to-double v4, p0

    .line 210
    int-to-double v6, v0

    .line 211
    const-wide v8, 0x3fc3333333333333L    # 0.15

    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    mul-double/2addr v6, v8

    .line 217
    cmpl-double p0, v4, v6

    .line 218
    .line 219
    if-lez p0, :cond_e

    .line 220
    .line 221
    goto :goto_a

    .line 222
    :cond_e
    move v1, v2

    .line 223
    :goto_a
    iget-boolean p0, v3, Lls0;->V:Z

    .line 224
    .line 225
    if-eq v1, p0, :cond_f

    .line 226
    .line 227
    invoke-virtual {v3, v1}, Lls0;->h(Z)V

    .line 228
    .line 229
    .line 230
    :cond_f
    iput-boolean v1, v3, Lls0;->V:Z

    .line 231
    .line 232
    :goto_b
    return-void

    .line 233
    :pswitch_2
    check-cast v3, Lwr;

    .line 234
    .line 235
    iget-object p0, v3, Lwr;->v:Ljava/util/ArrayList;

    .line 236
    .line 237
    invoke-virtual {v3}, Lwr;->a()Z

    .line 238
    .line 239
    .line 240
    move-result v0

    .line 241
    if-eqz v0, :cond_12

    .line 242
    .line 243
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 244
    .line 245
    .line 246
    move-result v0

    .line 247
    if-lez v0, :cond_12

    .line 248
    .line 249
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    check-cast v0, Lvr;

    .line 254
    .line 255
    iget-object v0, v0, Lvr;->a:Landroidx/appcompat/widget/d;

    .line 256
    .line 257
    iget-boolean v0, v0, Landroidx/appcompat/widget/ListPopupWindow;->i0:Z

    .line 258
    .line 259
    if-nez v0, :cond_12

    .line 260
    .line 261
    iget-object v0, v3, Lwr;->Z:Landroid/view/View;

    .line 262
    .line 263
    if-eqz v0, :cond_11

    .line 264
    .line 265
    invoke-virtual {v0}, Landroid/view/View;->isShown()Z

    .line 266
    .line 267
    .line 268
    move-result v0

    .line 269
    if-nez v0, :cond_10

    .line 270
    .line 271
    goto :goto_d

    .line 272
    :cond_10
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 273
    .line 274
    .line 275
    move-result-object p0

    .line 276
    :goto_c
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 277
    .line 278
    .line 279
    move-result v0

    .line 280
    if-eqz v0, :cond_12

    .line 281
    .line 282
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    check-cast v0, Lvr;

    .line 287
    .line 288
    iget-object v0, v0, Lvr;->a:Landroidx/appcompat/widget/d;

    .line 289
    .line 290
    invoke-virtual {v0}, Landroidx/appcompat/widget/ListPopupWindow;->show()V

    .line 291
    .line 292
    .line 293
    goto :goto_c

    .line 294
    :cond_11
    :goto_d
    invoke-virtual {v3}, Lwr;->dismiss()V

    .line 295
    .line 296
    .line 297
    :cond_12
    return-void

    .line 298
    :pswitch_3
    check-cast v3, Llb;

    .line 299
    .line 300
    iget-object p0, v3, Llb;->q0:Landroidx/appcompat/widget/AppCompatSpinner;

    .line 301
    .line 302
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 303
    .line 304
    .line 305
    move-result v0

    .line 306
    if-eqz v0, :cond_13

    .line 307
    .line 308
    iget-object v0, v3, Llb;->o0:Landroid/graphics/Rect;

    .line 309
    .line 310
    invoke-virtual {p0, v0}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 311
    .line 312
    .line 313
    move-result p0

    .line 314
    if-eqz p0, :cond_13

    .line 315
    .line 316
    invoke-virtual {v3}, Llb;->r()V

    .line 317
    .line 318
    .line 319
    invoke-virtual {v3}, Landroidx/appcompat/widget/ListPopupWindow;->show()V

    .line 320
    .line 321
    .line 322
    goto :goto_e

    .line 323
    :cond_13
    invoke-virtual {v3}, Landroidx/appcompat/widget/ListPopupWindow;->dismiss()V

    .line 324
    .line 325
    .line 326
    :goto_e
    return-void

    .line 327
    :pswitch_4
    check-cast v3, Landroidx/appcompat/widget/AppCompatSpinner;

    .line 328
    .line 329
    invoke-virtual {v3}, Landroidx/appcompat/widget/AppCompatSpinner;->getInternalPopup()Lmb;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    invoke-interface {v0}, Lmb;->a()Z

    .line 334
    .line 335
    .line 336
    move-result v0

    .line 337
    if-nez v0, :cond_14

    .line 338
    .line 339
    iget-object v0, v3, Landroidx/appcompat/widget/AppCompatSpinner;->f:Lmb;

    .line 340
    .line 341
    invoke-virtual {v3}, Landroid/view/View;->getTextDirection()I

    .line 342
    .line 343
    .line 344
    move-result v1

    .line 345
    invoke-virtual {v3}, Landroid/view/View;->getTextAlignment()I

    .line 346
    .line 347
    .line 348
    move-result v2

    .line 349
    invoke-interface {v0, v1, v2}, Lmb;->m(II)V

    .line 350
    .line 351
    .line 352
    :cond_14
    invoke-virtual {v3}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    if-eqz v0, :cond_15

    .line 357
    .line 358
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 359
    .line 360
    .line 361
    :cond_15
    return-void

    .line 362
    :pswitch_5
    check-cast v3, Landroidx/appcompat/widget/ActivityChooserView;

    .line 363
    .line 364
    invoke-virtual {v3}, Landroidx/appcompat/widget/ActivityChooserView;->b()Z

    .line 365
    .line 366
    .line 367
    move-result p0

    .line 368
    if-eqz p0, :cond_17

    .line 369
    .line 370
    invoke-virtual {v3}, Landroid/view/View;->isShown()Z

    .line 371
    .line 372
    .line 373
    move-result p0

    .line 374
    if-nez p0, :cond_16

    .line 375
    .line 376
    invoke-virtual {v3}, Landroidx/appcompat/widget/ActivityChooserView;->getListPopupWindow()Landroidx/appcompat/widget/ListPopupWindow;

    .line 377
    .line 378
    .line 379
    move-result-object p0

    .line 380
    invoke-virtual {p0}, Landroidx/appcompat/widget/ListPopupWindow;->dismiss()V

    .line 381
    .line 382
    .line 383
    goto :goto_f

    .line 384
    :cond_16
    invoke-virtual {v3}, Landroidx/appcompat/widget/ActivityChooserView;->getListPopupWindow()Landroidx/appcompat/widget/ListPopupWindow;

    .line 385
    .line 386
    .line 387
    move-result-object p0

    .line 388
    invoke-virtual {p0}, Landroidx/appcompat/widget/ListPopupWindow;->show()V

    .line 389
    .line 390
    .line 391
    iget-object p0, v3, Landroidx/appcompat/widget/ActivityChooserView;->i:Lk2;

    .line 392
    .line 393
    if-eqz p0, :cond_17

    .line 394
    .line 395
    iget-object p0, p0, Lk2;->a:Landroidx/appcompat/widget/b;

    .line 396
    .line 397
    if-eqz p0, :cond_17

    .line 398
    .line 399
    iget-object v0, p0, Lii;->e:Ldh1;

    .line 400
    .line 401
    if-eqz v0, :cond_17

    .line 402
    .line 403
    iget-object p0, p0, Lii;->c:Ljg1;

    .line 404
    .line 405
    invoke-interface {v0, p0}, Ldh1;->z(Ljg1;)Z

    .line 406
    .line 407
    .line 408
    :cond_17
    :goto_f
    return-void

    .line 409
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
