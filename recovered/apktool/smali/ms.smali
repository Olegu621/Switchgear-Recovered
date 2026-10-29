.class public final Lms;
.super Landroid/util/Property;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/Class;I)V
    .locals 0

    .line 1
    iput p3, p0, Lms;->a:I

    .line 2
    .line 3
    invoke-direct {p0, p2, p1}, Landroid/util/Property;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget p0, p0, Lms;->a:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    packed-switch p0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    check-cast p1, Landroid/view/View;

    .line 8
    .line 9
    sget-object p0, Le33;->a:Ljava/util/WeakHashMap;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/view/View;->getClipBounds()Landroid/graphics/Rect;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :pswitch_0
    check-cast p1, Landroid/view/View;

    .line 17
    .line 18
    sget-object p0, Ll53;->a:Ln53;

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Lyy1;->u(Landroid/view/View;)F

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :pswitch_1
    check-cast p1, Landroidx/appcompat/widget/SwitchCompat;

    .line 30
    .line 31
    iget p0, p1, Landroidx/appcompat/widget/SwitchCompat;->n0:F

    .line 32
    .line 33
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :pswitch_2
    check-cast p1, Lr71;

    .line 39
    .line 40
    iget p0, p1, Lr71;->j:F

    .line 41
    .line 42
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :pswitch_3
    check-cast p1, Lp71;

    .line 48
    .line 49
    iget p0, p1, Lp71;->i:F

    .line 50
    .line 51
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0

    .line 56
    :pswitch_4
    check-cast p1, Landroid/view/View;

    .line 57
    .line 58
    sget-object p0, Le33;->a:Ljava/util/WeakHashMap;

    .line 59
    .line 60
    invoke-virtual {p1}, Landroid/view/View;->getPaddingEnd()I

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    int-to-float p0, p0

    .line 65
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0

    .line 70
    :pswitch_5
    check-cast p1, Landroid/view/View;

    .line 71
    .line 72
    sget-object p0, Le33;->a:Ljava/util/WeakHashMap;

    .line 73
    .line 74
    invoke-virtual {p1}, Landroid/view/View;->getPaddingStart()I

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    int-to-float p0, p0

    .line 79
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    return-object p0

    .line 84
    :pswitch_6
    check-cast p1, Landroid/view/View;

    .line 85
    .line 86
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    iget p0, p0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 91
    .line 92
    int-to-float p0, p0

    .line 93
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    return-object p0

    .line 98
    :pswitch_7
    check-cast p1, Landroid/view/View;

    .line 99
    .line 100
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    iget p0, p0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 105
    .line 106
    int-to-float p0, p0

    .line 107
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    return-object p0

    .line 112
    :pswitch_8
    check-cast p1, Ly90;

    .line 113
    .line 114
    invoke-virtual {p1}, Ly90;->b()F

    .line 115
    .line 116
    .line 117
    move-result p0

    .line 118
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    return-object p0

    .line 123
    :pswitch_9
    check-cast p1, Lqu;

    .line 124
    .line 125
    iget p0, p1, Lqu;->j:F

    .line 126
    .line 127
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    return-object p0

    .line 132
    :pswitch_a
    check-cast p1, Lqu;

    .line 133
    .line 134
    iget p0, p1, Lqu;->i:F

    .line 135
    .line 136
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    return-object p0

    .line 141
    :pswitch_b
    check-cast p1, Lvs;

    .line 142
    .line 143
    return-object v0

    .line 144
    :pswitch_c
    check-cast p1, Lvs;

    .line 145
    .line 146
    return-object v0

    .line 147
    :pswitch_d
    check-cast p1, Landroid/widget/ImageView;

    .line 148
    .line 149
    return-object v0

    .line 150
    :pswitch_e
    check-cast p1, Landroid/view/View;

    .line 151
    .line 152
    return-object v0

    .line 153
    :pswitch_f
    check-cast p1, Landroid/view/View;

    .line 154
    .line 155
    return-object v0

    .line 156
    :pswitch_10
    check-cast p1, Landroid/view/View;

    .line 157
    .line 158
    return-object v0

    .line 159
    :pswitch_11
    check-cast p1, Lqs;

    .line 160
    .line 161
    return-object v0

    .line 162
    :pswitch_12
    check-cast p1, Lqs;

    .line 163
    .line 164
    return-object v0

    .line 165
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final set(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 12

    .line 1
    iget p0, p0, Lms;->a:I

    .line 2
    .line 3
    const v0, 0x4426c000    # 667.0f

    .line 4
    .line 5
    .line 6
    const v1, 0x43a68000    # 333.0f

    .line 7
    .line 8
    .line 9
    const/high16 v2, 0x3f800000    # 1.0f

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    const/4 v4, 0x4

    .line 13
    const/4 v5, 0x1

    .line 14
    const/4 v6, 0x0

    .line 15
    packed-switch p0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast p1, Landroid/view/View;

    .line 19
    .line 20
    check-cast p2, Landroid/graphics/Rect;

    .line 21
    .line 22
    sget-object p0, Le33;->a:Ljava/util/WeakHashMap;

    .line 23
    .line 24
    invoke-virtual {p1, p2}, Landroid/view/View;->setClipBounds(Landroid/graphics/Rect;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_0
    check-cast p1, Landroid/view/View;

    .line 29
    .line 30
    check-cast p2, Ljava/lang/Float;

    .line 31
    .line 32
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    invoke-static {p1, p0}, Ll53;->b(Landroid/view/View;F)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :pswitch_1
    check-cast p1, Landroidx/appcompat/widget/SwitchCompat;

    .line 41
    .line 42
    check-cast p2, Ljava/lang/Float;

    .line 43
    .line 44
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    invoke-virtual {p1, p0}, Landroidx/appcompat/widget/SwitchCompat;->setThumbPosition(F)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :pswitch_2
    check-cast p1, Lr71;

    .line 53
    .line 54
    check-cast p2, Ljava/lang/Float;

    .line 55
    .line 56
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    iput p0, p1, Lr71;->j:F

    .line 61
    .line 62
    const/high16 p2, 0x44e10000    # 1800.0f

    .line 63
    .line 64
    mul-float/2addr p0, p2

    .line 65
    float-to-int p0, p0

    .line 66
    move p2, v6

    .line 67
    :goto_0
    if-ge p2, v4, :cond_0

    .line 68
    .line 69
    sget-object v0, Lr71;->m:[I

    .line 70
    .line 71
    aget v0, v0, p2

    .line 72
    .line 73
    sget-object v1, Lr71;->l:[I

    .line 74
    .line 75
    aget v1, v1, p2

    .line 76
    .line 77
    sub-int v0, p0, v0

    .line 78
    .line 79
    int-to-float v0, v0

    .line 80
    int-to-float v1, v1

    .line 81
    div-float/2addr v0, v1

    .line 82
    iget-object v1, p1, Lr71;->f:[Landroid/view/animation/Interpolator;

    .line 83
    .line 84
    aget-object v1, v1, p2

    .line 85
    .line 86
    invoke-interface {v1, v0}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    iget-object v1, p1, Lkx0;->b:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v1, [F

    .line 93
    .line 94
    invoke-static {v2, v0}, Ljava/lang/Math;->min(FF)F

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    invoke-static {v3, v0}, Ljava/lang/Math;->max(FF)F

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    aput v0, v1, p2

    .line 103
    .line 104
    add-int/lit8 p2, p2, 0x1

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_0
    iget-boolean p0, p1, Lr71;->i:Z

    .line 108
    .line 109
    if-eqz p0, :cond_1

    .line 110
    .line 111
    iget-object p0, p1, Lkx0;->c:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast p0, [I

    .line 114
    .line 115
    iget-object p2, p1, Lr71;->g:Lcom/google/android/material/progressindicator/LinearProgressIndicatorSpec;

    .line 116
    .line 117
    iget-object p2, p2, Loi;->c:[I

    .line 118
    .line 119
    iget v0, p1, Lr71;->h:I

    .line 120
    .line 121
    aget p2, p2, v0

    .line 122
    .line 123
    iget-object v0, p1, Lkx0;->a:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v0, Llx0;

    .line 126
    .line 127
    iget v0, v0, Ly90;->U:I

    .line 128
    .line 129
    invoke-static {p2, v0}, Lxe2;->j(II)I

    .line 130
    .line 131
    .line 132
    move-result p2

    .line 133
    invoke-static {p0, p2}, Ljava/util/Arrays;->fill([II)V

    .line 134
    .line 135
    .line 136
    iput-boolean v6, p1, Lr71;->i:Z

    .line 137
    .line 138
    :cond_1
    iget-object p0, p1, Lkx0;->a:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast p0, Llx0;

    .line 141
    .line 142
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 143
    .line 144
    .line 145
    return-void

    .line 146
    :pswitch_3
    check-cast p1, Lp71;

    .line 147
    .line 148
    check-cast p2, Ljava/lang/Float;

    .line 149
    .line 150
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 151
    .line 152
    .line 153
    move-result p0

    .line 154
    iput p0, p1, Lp71;->i:F

    .line 155
    .line 156
    mul-float/2addr p0, v1

    .line 157
    float-to-int p0, p0

    .line 158
    iget-object p2, p1, Lkx0;->b:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast p2, [F

    .line 161
    .line 162
    aput v3, p2, v6

    .line 163
    .line 164
    int-to-float p0, p0

    .line 165
    div-float/2addr p0, v0

    .line 166
    iget-object v0, p1, Lp71;->e:Lxg0;

    .line 167
    .line 168
    invoke-virtual {v0, p0}, Lxg0;->getInterpolation(F)F

    .line 169
    .line 170
    .line 171
    move-result v1

    .line 172
    const/4 v3, 0x2

    .line 173
    aput v1, p2, v3

    .line 174
    .line 175
    aput v1, p2, v5

    .line 176
    .line 177
    const v1, 0x3eff9dbf

    .line 178
    .line 179
    .line 180
    add-float/2addr p0, v1

    .line 181
    invoke-virtual {v0, p0}, Lxg0;->getInterpolation(F)F

    .line 182
    .line 183
    .line 184
    move-result p0

    .line 185
    aput p0, p2, v4

    .line 186
    .line 187
    const/4 v0, 0x3

    .line 188
    aput p0, p2, v0

    .line 189
    .line 190
    const/4 v0, 0x5

    .line 191
    aput v2, p2, v0

    .line 192
    .line 193
    iget-boolean p2, p1, Lp71;->h:Z

    .line 194
    .line 195
    if-eqz p2, :cond_2

    .line 196
    .line 197
    cmpg-float p0, p0, v2

    .line 198
    .line 199
    if-gez p0, :cond_2

    .line 200
    .line 201
    iget-object p0, p1, Lkx0;->c:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast p0, [I

    .line 204
    .line 205
    aget p2, p0, v5

    .line 206
    .line 207
    aput p2, p0, v3

    .line 208
    .line 209
    aget p2, p0, v6

    .line 210
    .line 211
    aput p2, p0, v5

    .line 212
    .line 213
    iget-object p2, p1, Lp71;->f:Lcom/google/android/material/progressindicator/LinearProgressIndicatorSpec;

    .line 214
    .line 215
    iget-object p2, p2, Loi;->c:[I

    .line 216
    .line 217
    iget v0, p1, Lp71;->g:I

    .line 218
    .line 219
    aget p2, p2, v0

    .line 220
    .line 221
    iget-object v0, p1, Lkx0;->a:Ljava/lang/Object;

    .line 222
    .line 223
    check-cast v0, Llx0;

    .line 224
    .line 225
    iget v0, v0, Ly90;->U:I

    .line 226
    .line 227
    invoke-static {p2, v0}, Lxe2;->j(II)I

    .line 228
    .line 229
    .line 230
    move-result p2

    .line 231
    aput p2, p0, v6

    .line 232
    .line 233
    iput-boolean v6, p1, Lp71;->h:Z

    .line 234
    .line 235
    :cond_2
    iget-object p0, p1, Lkx0;->a:Ljava/lang/Object;

    .line 236
    .line 237
    check-cast p0, Llx0;

    .line 238
    .line 239
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 240
    .line 241
    .line 242
    return-void

    .line 243
    :pswitch_4
    check-cast p1, Landroid/view/View;

    .line 244
    .line 245
    check-cast p2, Ljava/lang/Float;

    .line 246
    .line 247
    sget-object p0, Le33;->a:Ljava/util/WeakHashMap;

    .line 248
    .line 249
    invoke-virtual {p1}, Landroid/view/View;->getPaddingStart()I

    .line 250
    .line 251
    .line 252
    move-result p0

    .line 253
    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    .line 254
    .line 255
    .line 256
    move-result v0

    .line 257
    invoke-virtual {p2}, Ljava/lang/Float;->intValue()I

    .line 258
    .line 259
    .line 260
    move-result p2

    .line 261
    invoke-virtual {p1}, Landroid/view/View;->getPaddingBottom()I

    .line 262
    .line 263
    .line 264
    move-result v1

    .line 265
    invoke-virtual {p1, p0, v0, p2, v1}, Landroid/view/View;->setPaddingRelative(IIII)V

    .line 266
    .line 267
    .line 268
    return-void

    .line 269
    :pswitch_5
    check-cast p1, Landroid/view/View;

    .line 270
    .line 271
    check-cast p2, Ljava/lang/Float;

    .line 272
    .line 273
    invoke-virtual {p2}, Ljava/lang/Float;->intValue()I

    .line 274
    .line 275
    .line 276
    move-result p0

    .line 277
    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    .line 278
    .line 279
    .line 280
    move-result p2

    .line 281
    sget-object v0, Le33;->a:Ljava/util/WeakHashMap;

    .line 282
    .line 283
    invoke-virtual {p1}, Landroid/view/View;->getPaddingEnd()I

    .line 284
    .line 285
    .line 286
    move-result v0

    .line 287
    invoke-virtual {p1}, Landroid/view/View;->getPaddingBottom()I

    .line 288
    .line 289
    .line 290
    move-result v1

    .line 291
    invoke-virtual {p1, p0, p2, v0, v1}, Landroid/view/View;->setPaddingRelative(IIII)V

    .line 292
    .line 293
    .line 294
    return-void

    .line 295
    :pswitch_6
    check-cast p1, Landroid/view/View;

    .line 296
    .line 297
    check-cast p2, Ljava/lang/Float;

    .line 298
    .line 299
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 300
    .line 301
    .line 302
    move-result-object p0

    .line 303
    invoke-virtual {p2}, Ljava/lang/Float;->intValue()I

    .line 304
    .line 305
    .line 306
    move-result p2

    .line 307
    iput p2, p0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 308
    .line 309
    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    .line 310
    .line 311
    .line 312
    return-void

    .line 313
    :pswitch_7
    check-cast p1, Landroid/view/View;

    .line 314
    .line 315
    check-cast p2, Ljava/lang/Float;

    .line 316
    .line 317
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 318
    .line 319
    .line 320
    move-result-object p0

    .line 321
    invoke-virtual {p2}, Ljava/lang/Float;->intValue()I

    .line 322
    .line 323
    .line 324
    move-result p2

    .line 325
    iput p2, p0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 326
    .line 327
    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    .line 328
    .line 329
    .line 330
    return-void

    .line 331
    :pswitch_8
    check-cast p1, Ly90;

    .line 332
    .line 333
    check-cast p2, Ljava/lang/Float;

    .line 334
    .line 335
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 336
    .line 337
    .line 338
    move-result p0

    .line 339
    iget p2, p1, Ly90;->v:F

    .line 340
    .line 341
    cmpl-float p2, p2, p0

    .line 342
    .line 343
    if-eqz p2, :cond_3

    .line 344
    .line 345
    iput p0, p1, Ly90;->v:F

    .line 346
    .line 347
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 348
    .line 349
    .line 350
    :cond_3
    return-void

    .line 351
    :pswitch_9
    check-cast p1, Lqu;

    .line 352
    .line 353
    check-cast p2, Ljava/lang/Float;

    .line 354
    .line 355
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 356
    .line 357
    .line 358
    move-result p0

    .line 359
    iput p0, p1, Lqu;->j:F

    .line 360
    .line 361
    return-void

    .line 362
    :pswitch_a
    check-cast p1, Lqu;

    .line 363
    .line 364
    check-cast p2, Ljava/lang/Float;

    .line 365
    .line 366
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 367
    .line 368
    .line 369
    move-result p0

    .line 370
    iput p0, p1, Lqu;->i:F

    .line 371
    .line 372
    const p2, 0x45a8c000    # 5400.0f

    .line 373
    .line 374
    .line 375
    mul-float/2addr p2, p0

    .line 376
    float-to-int p2, p2

    .line 377
    iget-object v7, p1, Lqu;->f:Lxg0;

    .line 378
    .line 379
    iget-object v8, p1, Lkx0;->b:Ljava/lang/Object;

    .line 380
    .line 381
    check-cast v8, [F

    .line 382
    .line 383
    const/high16 v9, 0x44be0000    # 1520.0f

    .line 384
    .line 385
    mul-float/2addr p0, v9

    .line 386
    const/high16 v9, -0x3e600000    # -20.0f

    .line 387
    .line 388
    add-float/2addr v9, p0

    .line 389
    aput v9, v8, v6

    .line 390
    .line 391
    aput p0, v8, v5

    .line 392
    .line 393
    move p0, v6

    .line 394
    :goto_1
    if-ge p0, v4, :cond_4

    .line 395
    .line 396
    sget-object v9, Lqu;->l:[I

    .line 397
    .line 398
    aget v9, v9, p0

    .line 399
    .line 400
    sub-int v9, p2, v9

    .line 401
    .line 402
    int-to-float v9, v9

    .line 403
    div-float/2addr v9, v0

    .line 404
    aget v10, v8, v5

    .line 405
    .line 406
    invoke-virtual {v7, v9}, Lxg0;->getInterpolation(F)F

    .line 407
    .line 408
    .line 409
    move-result v9

    .line 410
    const/high16 v11, 0x437a0000    # 250.0f

    .line 411
    .line 412
    mul-float/2addr v9, v11

    .line 413
    add-float/2addr v9, v10

    .line 414
    aput v9, v8, v5

    .line 415
    .line 416
    sget-object v9, Lqu;->m:[I

    .line 417
    .line 418
    aget v9, v9, p0

    .line 419
    .line 420
    sub-int v9, p2, v9

    .line 421
    .line 422
    int-to-float v9, v9

    .line 423
    div-float/2addr v9, v0

    .line 424
    aget v10, v8, v6

    .line 425
    .line 426
    invoke-virtual {v7, v9}, Lxg0;->getInterpolation(F)F

    .line 427
    .line 428
    .line 429
    move-result v9

    .line 430
    mul-float/2addr v9, v11

    .line 431
    add-float/2addr v9, v10

    .line 432
    aput v9, v8, v6

    .line 433
    .line 434
    add-int/lit8 p0, p0, 0x1

    .line 435
    .line 436
    goto :goto_1

    .line 437
    :cond_4
    aget p0, v8, v6

    .line 438
    .line 439
    aget v0, v8, v5

    .line 440
    .line 441
    sub-float v9, v0, p0

    .line 442
    .line 443
    iget v10, p1, Lqu;->j:F

    .line 444
    .line 445
    mul-float/2addr v9, v10

    .line 446
    add-float/2addr v9, p0

    .line 447
    aput v9, v8, v6

    .line 448
    .line 449
    const/high16 p0, 0x43b40000    # 360.0f

    .line 450
    .line 451
    div-float/2addr v9, p0

    .line 452
    aput v9, v8, v6

    .line 453
    .line 454
    div-float/2addr v0, p0

    .line 455
    aput v0, v8, v5

    .line 456
    .line 457
    iget-object p0, p1, Lqu;->g:Lcom/google/android/material/progressindicator/CircularProgressIndicatorSpec;

    .line 458
    .line 459
    move v0, v6

    .line 460
    :goto_2
    if-ge v0, v4, :cond_6

    .line 461
    .line 462
    sget-object v5, Lqu;->n:[I

    .line 463
    .line 464
    aget v5, v5, v0

    .line 465
    .line 466
    sub-int v5, p2, v5

    .line 467
    .line 468
    int-to-float v5, v5

    .line 469
    div-float/2addr v5, v1

    .line 470
    cmpl-float v8, v5, v3

    .line 471
    .line 472
    if-ltz v8, :cond_5

    .line 473
    .line 474
    cmpg-float v8, v5, v2

    .line 475
    .line 476
    if-gtz v8, :cond_5

    .line 477
    .line 478
    iget p2, p1, Lqu;->h:I

    .line 479
    .line 480
    add-int/2addr v0, p2

    .line 481
    iget-object p2, p0, Loi;->c:[I

    .line 482
    .line 483
    array-length v1, p2

    .line 484
    rem-int/2addr v0, v1

    .line 485
    add-int/lit8 v1, v0, 0x1

    .line 486
    .line 487
    array-length v2, p2

    .line 488
    rem-int/2addr v1, v2

    .line 489
    aget p2, p2, v0

    .line 490
    .line 491
    iget-object v0, p1, Lkx0;->a:Ljava/lang/Object;

    .line 492
    .line 493
    check-cast v0, Llx0;

    .line 494
    .line 495
    iget v0, v0, Ly90;->U:I

    .line 496
    .line 497
    invoke-static {p2, v0}, Lxe2;->j(II)I

    .line 498
    .line 499
    .line 500
    move-result p2

    .line 501
    iget-object p0, p0, Loi;->c:[I

    .line 502
    .line 503
    aget p0, p0, v1

    .line 504
    .line 505
    iget-object v0, p1, Lkx0;->a:Ljava/lang/Object;

    .line 506
    .line 507
    check-cast v0, Llx0;

    .line 508
    .line 509
    iget v0, v0, Ly90;->U:I

    .line 510
    .line 511
    invoke-static {p0, v0}, Lxe2;->j(II)I

    .line 512
    .line 513
    .line 514
    move-result p0

    .line 515
    invoke-virtual {v7, v5}, Lxg0;->getInterpolation(F)F

    .line 516
    .line 517
    .line 518
    move-result v0

    .line 519
    iget-object v1, p1, Lkx0;->c:Ljava/lang/Object;

    .line 520
    .line 521
    check-cast v1, [I

    .line 522
    .line 523
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 524
    .line 525
    .line 526
    move-result-object p2

    .line 527
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 528
    .line 529
    .line 530
    move-result-object p0

    .line 531
    invoke-static {v0, p2, p0}, Lyc;->a(FLjava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/Integer;

    .line 532
    .line 533
    .line 534
    move-result-object p0

    .line 535
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 536
    .line 537
    .line 538
    move-result p0

    .line 539
    aput p0, v1, v6

    .line 540
    .line 541
    goto :goto_3

    .line 542
    :cond_5
    add-int/lit8 v0, v0, 0x1

    .line 543
    .line 544
    goto :goto_2

    .line 545
    :cond_6
    :goto_3
    iget-object p0, p1, Lkx0;->a:Ljava/lang/Object;

    .line 546
    .line 547
    check-cast p0, Llx0;

    .line 548
    .line 549
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 550
    .line 551
    .line 552
    return-void

    .line 553
    :pswitch_b
    check-cast p1, Lvs;

    .line 554
    .line 555
    check-cast p2, Landroid/graphics/PointF;

    .line 556
    .line 557
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 558
    .line 559
    .line 560
    iget p0, p2, Landroid/graphics/PointF;->x:F

    .line 561
    .line 562
    iput p0, p1, Lvs;->d:F

    .line 563
    .line 564
    iget p0, p2, Landroid/graphics/PointF;->y:F

    .line 565
    .line 566
    iput p0, p1, Lvs;->e:F

    .line 567
    .line 568
    invoke-virtual {p1}, Lvs;->a()V

    .line 569
    .line 570
    .line 571
    return-void

    .line 572
    :pswitch_c
    check-cast p1, Lvs;

    .line 573
    .line 574
    check-cast p2, [F

    .line 575
    .line 576
    iget-object p0, p1, Lvs;->c:[F

    .line 577
    .line 578
    array-length v0, p2

    .line 579
    invoke-static {p2, v6, p0, v6, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 580
    .line 581
    .line 582
    invoke-virtual {p1}, Lvs;->a()V

    .line 583
    .line 584
    .line 585
    return-void

    .line 586
    :pswitch_d
    check-cast p1, Landroid/widget/ImageView;

    .line 587
    .line 588
    check-cast p2, Landroid/graphics/Matrix;

    .line 589
    .line 590
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 591
    .line 592
    const/16 v0, 0x1d

    .line 593
    .line 594
    if-lt p0, v0, :cond_7

    .line 595
    .line 596
    invoke-static {p1, p2}, Lv0;->n(Landroid/widget/ImageView;Landroid/graphics/Matrix;)V

    .line 597
    .line 598
    .line 599
    goto :goto_4

    .line 600
    :cond_7
    if-nez p2, :cond_8

    .line 601
    .line 602
    invoke-virtual {p1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 603
    .line 604
    .line 605
    move-result-object p0

    .line 606
    if-eqz p0, :cond_9

    .line 607
    .line 608
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 609
    .line 610
    .line 611
    move-result p2

    .line 612
    invoke-virtual {p1}, Landroid/view/View;->getPaddingLeft()I

    .line 613
    .line 614
    .line 615
    move-result v0

    .line 616
    sub-int/2addr p2, v0

    .line 617
    invoke-virtual {p1}, Landroid/view/View;->getPaddingRight()I

    .line 618
    .line 619
    .line 620
    move-result v0

    .line 621
    sub-int/2addr p2, v0

    .line 622
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 623
    .line 624
    .line 625
    move-result v0

    .line 626
    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    .line 627
    .line 628
    .line 629
    move-result v1

    .line 630
    sub-int/2addr v0, v1

    .line 631
    invoke-virtual {p1}, Landroid/view/View;->getPaddingBottom()I

    .line 632
    .line 633
    .line 634
    move-result v1

    .line 635
    sub-int/2addr v0, v1

    .line 636
    invoke-virtual {p0, v6, v6, p2, v0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 637
    .line 638
    .line 639
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 640
    .line 641
    .line 642
    goto :goto_4

    .line 643
    :cond_8
    sget-boolean p0, Lj13;->t:Z

    .line 644
    .line 645
    if-eqz p0, :cond_9

    .line 646
    .line 647
    :try_start_0
    invoke-static {p1, p2}, Lv0;->n(Landroid/widget/ImageView;Landroid/graphics/Matrix;)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    .line 648
    .line 649
    .line 650
    goto :goto_4

    .line 651
    :catch_0
    sput-boolean v6, Lj13;->t:Z

    .line 652
    .line 653
    :cond_9
    :goto_4
    return-void

    .line 654
    :pswitch_e
    check-cast p1, Landroid/view/View;

    .line 655
    .line 656
    check-cast p2, Landroid/graphics/PointF;

    .line 657
    .line 658
    iget p0, p2, Landroid/graphics/PointF;->x:F

    .line 659
    .line 660
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 661
    .line 662
    .line 663
    move-result p0

    .line 664
    iget p2, p2, Landroid/graphics/PointF;->y:F

    .line 665
    .line 666
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    .line 667
    .line 668
    .line 669
    move-result p2

    .line 670
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 671
    .line 672
    .line 673
    move-result v0

    .line 674
    add-int/2addr v0, p0

    .line 675
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 676
    .line 677
    .line 678
    move-result v1

    .line 679
    add-int/2addr v1, p2

    .line 680
    invoke-static {p1, p0, p2, v0, v1}, Ll53;->a(Landroid/view/View;IIII)V

    .line 681
    .line 682
    .line 683
    return-void

    .line 684
    :pswitch_f
    check-cast p1, Landroid/view/View;

    .line 685
    .line 686
    check-cast p2, Landroid/graphics/PointF;

    .line 687
    .line 688
    iget p0, p2, Landroid/graphics/PointF;->x:F

    .line 689
    .line 690
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 691
    .line 692
    .line 693
    move-result p0

    .line 694
    iget p2, p2, Landroid/graphics/PointF;->y:F

    .line 695
    .line 696
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    .line 697
    .line 698
    .line 699
    move-result p2

    .line 700
    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    .line 701
    .line 702
    .line 703
    move-result v0

    .line 704
    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    .line 705
    .line 706
    .line 707
    move-result v1

    .line 708
    invoke-static {p1, p0, p2, v0, v1}, Ll53;->a(Landroid/view/View;IIII)V

    .line 709
    .line 710
    .line 711
    return-void

    .line 712
    :pswitch_10
    check-cast p1, Landroid/view/View;

    .line 713
    .line 714
    check-cast p2, Landroid/graphics/PointF;

    .line 715
    .line 716
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    .line 717
    .line 718
    .line 719
    move-result p0

    .line 720
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 721
    .line 722
    .line 723
    move-result v0

    .line 724
    iget v1, p2, Landroid/graphics/PointF;->x:F

    .line 725
    .line 726
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 727
    .line 728
    .line 729
    move-result v1

    .line 730
    iget p2, p2, Landroid/graphics/PointF;->y:F

    .line 731
    .line 732
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    .line 733
    .line 734
    .line 735
    move-result p2

    .line 736
    invoke-static {p1, p0, v0, v1, p2}, Ll53;->a(Landroid/view/View;IIII)V

    .line 737
    .line 738
    .line 739
    return-void

    .line 740
    :pswitch_11
    check-cast p1, Lqs;

    .line 741
    .line 742
    check-cast p2, Landroid/graphics/PointF;

    .line 743
    .line 744
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 745
    .line 746
    .line 747
    iget p0, p2, Landroid/graphics/PointF;->x:F

    .line 748
    .line 749
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 750
    .line 751
    .line 752
    move-result p0

    .line 753
    iput p0, p1, Lqs;->c:I

    .line 754
    .line 755
    iget p0, p2, Landroid/graphics/PointF;->y:F

    .line 756
    .line 757
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 758
    .line 759
    .line 760
    move-result p0

    .line 761
    iput p0, p1, Lqs;->d:I

    .line 762
    .line 763
    iget p2, p1, Lqs;->g:I

    .line 764
    .line 765
    add-int/2addr p2, v5

    .line 766
    iput p2, p1, Lqs;->g:I

    .line 767
    .line 768
    iget v0, p1, Lqs;->f:I

    .line 769
    .line 770
    if-ne v0, p2, :cond_a

    .line 771
    .line 772
    iget-object p2, p1, Lqs;->e:Landroid/view/View;

    .line 773
    .line 774
    iget v0, p1, Lqs;->a:I

    .line 775
    .line 776
    iget v1, p1, Lqs;->b:I

    .line 777
    .line 778
    iget v2, p1, Lqs;->c:I

    .line 779
    .line 780
    invoke-static {p2, v0, v1, v2, p0}, Ll53;->a(Landroid/view/View;IIII)V

    .line 781
    .line 782
    .line 783
    iput v6, p1, Lqs;->f:I

    .line 784
    .line 785
    iput v6, p1, Lqs;->g:I

    .line 786
    .line 787
    :cond_a
    return-void

    .line 788
    :pswitch_12
    check-cast p1, Lqs;

    .line 789
    .line 790
    check-cast p2, Landroid/graphics/PointF;

    .line 791
    .line 792
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 793
    .line 794
    .line 795
    iget p0, p2, Landroid/graphics/PointF;->x:F

    .line 796
    .line 797
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 798
    .line 799
    .line 800
    move-result p0

    .line 801
    iput p0, p1, Lqs;->a:I

    .line 802
    .line 803
    iget p0, p2, Landroid/graphics/PointF;->y:F

    .line 804
    .line 805
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 806
    .line 807
    .line 808
    move-result p0

    .line 809
    iput p0, p1, Lqs;->b:I

    .line 810
    .line 811
    iget p2, p1, Lqs;->f:I

    .line 812
    .line 813
    add-int/2addr p2, v5

    .line 814
    iput p2, p1, Lqs;->f:I

    .line 815
    .line 816
    iget v0, p1, Lqs;->g:I

    .line 817
    .line 818
    if-ne p2, v0, :cond_b

    .line 819
    .line 820
    iget-object p2, p1, Lqs;->e:Landroid/view/View;

    .line 821
    .line 822
    iget v0, p1, Lqs;->a:I

    .line 823
    .line 824
    iget v1, p1, Lqs;->c:I

    .line 825
    .line 826
    iget v2, p1, Lqs;->d:I

    .line 827
    .line 828
    invoke-static {p2, v0, p0, v1, v2}, Ll53;->a(Landroid/view/View;IIII)V

    .line 829
    .line 830
    .line 831
    iput v6, p1, Lqs;->f:I

    .line 832
    .line 833
    iput v6, p1, Lqs;->g:I

    .line 834
    .line 835
    :cond_b
    return-void

    .line 836
    nop

    .line 837
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
