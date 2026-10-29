.class abstract Lcom/google/android/material/slider/BaseSlider;
.super Landroid/view/View;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/material/slider/BaseSlider$SliderState;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<S:",
        "Lcom/google/android/material/slider/BaseSlider<",
        "TS;T",
        "L;",
        "TT;>;",
        "L:Ljava/lang/Object;",
        "T:",
        "Ljava/lang/Object;",
        ">",
        "Landroid/view/View;"
    }
.end annotation


# static fields
.field public static final N0:I


# instance fields
.field public A0:I

.field public B0:Z

.field public C0:Z

.field public D0:Landroid/content/res/ColorStateList;

.field public E0:Landroid/content/res/ColorStateList;

.field public F0:Landroid/content/res/ColorStateList;

.field public G0:Landroid/content/res/ColorStateList;

.field public H0:Landroid/content/res/ColorStateList;

.field public final I0:Lfd1;

.field public J0:Landroid/graphics/drawable/Drawable;

.field public K0:Ljava/util/List;

.field public L0:F

.field public M0:I

.field public final U:Lcom/google/android/material/slider/a;

.field public final V:Ljava/util/ArrayList;

.field public final W:Ljava/util/ArrayList;

.field public final a:Landroid/graphics/Paint;

.field public final a0:Ljava/util/ArrayList;

.field public final b:Landroid/graphics/Paint;

.field public b0:Z

.field public final c:Landroid/graphics/Paint;

.field public c0:Landroid/animation/ValueAnimator;

.field public final d:Landroid/graphics/Paint;

.field public d0:Landroid/animation/ValueAnimator;

.field public final e:Landroid/graphics/Paint;

.field public final e0:I

.field public final f:Landroid/graphics/Paint;

.field public final f0:I

.field public final g0:I

.field public final h0:I

.field public final i:Lcom/google/android/material/slider/e;

.field public i0:I

.field public j0:I

.field public k0:I

.field public final l0:I

.field public m0:I

.field public n0:I

.field public final o0:I

.field public p0:F

.field public q0:Landroid/view/MotionEvent;

.field public r0:Z

.field public s0:F

.field public t0:F

.field public u0:Ljava/util/ArrayList;

.field public final v:Landroid/view/accessibility/AccessibilityManager;

.field public v0:I

.field public w:Lcom/google/android/material/slider/d;

.field public w0:I

.field public x0:F

.field public y0:[F

.field public z0:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget v0, Lcom/google/android/material/R$style;->Widget_MaterialComponents_Slider:I

    .line 2
    .line 3
    sput v0, Lcom/google/android/material/slider/BaseSlider;->N0:I

    .line 4
    .line 5
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 537
    sget v0, Lcom/google/android/material/R$attr;->sliderStyle:I

    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/material/slider/BaseSlider;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 11

    .line 1
    sget v4, Lcom/google/android/material/slider/BaseSlider;->N0:I

    .line 2
    .line 3
    invoke-static {p1, p2, p3, v4}, Lhd1;->a(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 8
    .line 9
    .line 10
    new-instance p1, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lcom/google/android/material/slider/BaseSlider;->V:Ljava/util/ArrayList;

    .line 16
    .line 17
    new-instance p1, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lcom/google/android/material/slider/BaseSlider;->W:Ljava/util/ArrayList;

    .line 23
    .line 24
    new-instance p1, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lcom/google/android/material/slider/BaseSlider;->a0:Ljava/util/ArrayList;

    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    iput-boolean p1, p0, Lcom/google/android/material/slider/BaseSlider;->b0:Z

    .line 33
    .line 34
    iput-boolean p1, p0, Lcom/google/android/material/slider/BaseSlider;->r0:Z

    .line 35
    .line 36
    new-instance v0, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, Lcom/google/android/material/slider/BaseSlider;->u0:Ljava/util/ArrayList;

    .line 42
    .line 43
    const/4 v0, -0x1

    .line 44
    iput v0, p0, Lcom/google/android/material/slider/BaseSlider;->v0:I

    .line 45
    .line 46
    iput v0, p0, Lcom/google/android/material/slider/BaseSlider;->w0:I

    .line 47
    .line 48
    const/4 v6, 0x0

    .line 49
    iput v6, p0, Lcom/google/android/material/slider/BaseSlider;->x0:F

    .line 50
    .line 51
    const/4 v7, 0x1

    .line 52
    iput-boolean v7, p0, Lcom/google/android/material/slider/BaseSlider;->z0:Z

    .line 53
    .line 54
    iput-boolean p1, p0, Lcom/google/android/material/slider/BaseSlider;->B0:Z

    .line 55
    .line 56
    new-instance v8, Lfd1;

    .line 57
    .line 58
    invoke-direct {v8}, Lfd1;-><init>()V

    .line 59
    .line 60
    .line 61
    iput-object v8, p0, Lcom/google/android/material/slider/BaseSlider;->I0:Lfd1;

    .line 62
    .line 63
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 64
    .line 65
    iput-object v0, p0, Lcom/google/android/material/slider/BaseSlider;->K0:Ljava/util/List;

    .line 66
    .line 67
    iput p1, p0, Lcom/google/android/material/slider/BaseSlider;->M0:I

    .line 68
    .line 69
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    new-instance v1, Landroid/graphics/Paint;

    .line 74
    .line 75
    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    .line 76
    .line 77
    .line 78
    iput-object v1, p0, Lcom/google/android/material/slider/BaseSlider;->a:Landroid/graphics/Paint;

    .line 79
    .line 80
    sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 81
    .line 82
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 83
    .line 84
    .line 85
    sget-object v3, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 86
    .line 87
    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 88
    .line 89
    .line 90
    new-instance v1, Landroid/graphics/Paint;

    .line 91
    .line 92
    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    .line 93
    .line 94
    .line 95
    iput-object v1, p0, Lcom/google/android/material/slider/BaseSlider;->b:Landroid/graphics/Paint;

    .line 96
    .line 97
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 101
    .line 102
    .line 103
    new-instance v1, Landroid/graphics/Paint;

    .line 104
    .line 105
    invoke-direct {v1, v7}, Landroid/graphics/Paint;-><init>(I)V

    .line 106
    .line 107
    .line 108
    iput-object v1, p0, Lcom/google/android/material/slider/BaseSlider;->c:Landroid/graphics/Paint;

    .line 109
    .line 110
    sget-object v5, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 111
    .line 112
    invoke-virtual {v1, v5}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 113
    .line 114
    .line 115
    new-instance v9, Landroid/graphics/PorterDuffXfermode;

    .line 116
    .line 117
    sget-object v10, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    .line 118
    .line 119
    invoke-direct {v9, v10}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1, v9}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 123
    .line 124
    .line 125
    new-instance v1, Landroid/graphics/Paint;

    .line 126
    .line 127
    invoke-direct {v1, v7}, Landroid/graphics/Paint;-><init>(I)V

    .line 128
    .line 129
    .line 130
    iput-object v1, p0, Lcom/google/android/material/slider/BaseSlider;->d:Landroid/graphics/Paint;

    .line 131
    .line 132
    invoke-virtual {v1, v5}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 133
    .line 134
    .line 135
    new-instance v1, Landroid/graphics/Paint;

    .line 136
    .line 137
    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    .line 138
    .line 139
    .line 140
    iput-object v1, p0, Lcom/google/android/material/slider/BaseSlider;->e:Landroid/graphics/Paint;

    .line 141
    .line 142
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 146
    .line 147
    .line 148
    new-instance v1, Landroid/graphics/Paint;

    .line 149
    .line 150
    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    .line 151
    .line 152
    .line 153
    iput-object v1, p0, Lcom/google/android/material/slider/BaseSlider;->f:Landroid/graphics/Paint;

    .line 154
    .line 155
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    sget v2, Lcom/google/android/material/R$dimen;->mtrl_slider_widget_height:I

    .line 166
    .line 167
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 168
    .line 169
    .line 170
    move-result v2

    .line 171
    iput v2, p0, Lcom/google/android/material/slider/BaseSlider;->h0:I

    .line 172
    .line 173
    sget v2, Lcom/google/android/material/R$dimen;->mtrl_slider_track_side_padding:I

    .line 174
    .line 175
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 176
    .line 177
    .line 178
    move-result v2

    .line 179
    iput v2, p0, Lcom/google/android/material/slider/BaseSlider;->f0:I

    .line 180
    .line 181
    iput v2, p0, Lcom/google/android/material/slider/BaseSlider;->k0:I

    .line 182
    .line 183
    sget v2, Lcom/google/android/material/R$dimen;->mtrl_slider_thumb_radius:I

    .line 184
    .line 185
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 186
    .line 187
    .line 188
    move-result v2

    .line 189
    iput v2, p0, Lcom/google/android/material/slider/BaseSlider;->g0:I

    .line 190
    .line 191
    sget v2, Lcom/google/android/material/R$dimen;->mtrl_slider_track_top:I

    .line 192
    .line 193
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 194
    .line 195
    .line 196
    move-result v2

    .line 197
    iput v2, p0, Lcom/google/android/material/slider/BaseSlider;->l0:I

    .line 198
    .line 199
    sget v2, Lcom/google/android/material/R$dimen;->mtrl_slider_label_padding:I

    .line 200
    .line 201
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 202
    .line 203
    .line 204
    move-result v1

    .line 205
    iput v1, p0, Lcom/google/android/material/slider/BaseSlider;->o0:I

    .line 206
    .line 207
    new-instance v1, Lcom/google/android/material/slider/a;

    .line 208
    .line 209
    invoke-direct {v1, p0, p2, p3}, Lcom/google/android/material/slider/a;-><init>(Lcom/google/android/material/slider/BaseSlider;Landroid/util/AttributeSet;I)V

    .line 210
    .line 211
    .line 212
    iput-object v1, p0, Lcom/google/android/material/slider/BaseSlider;->U:Lcom/google/android/material/slider/a;

    .line 213
    .line 214
    sget-object v2, Lcom/google/android/material/R$styleable;->Slider:[I

    .line 215
    .line 216
    new-array v5, p1, [I

    .line 217
    .line 218
    invoke-static {v0, p2, p3, v4}, Lrn2;->a(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 219
    .line 220
    .line 221
    move-object v1, p2

    .line 222
    move v3, p3

    .line 223
    invoke-static/range {v0 .. v5}, Lrn2;->b(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 227
    .line 228
    .line 229
    move-result-object p2

    .line 230
    sget p3, Lcom/google/android/material/R$styleable;->Slider_android_valueFrom:I

    .line 231
    .line 232
    invoke-virtual {p2, p3, v6}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 233
    .line 234
    .line 235
    move-result p3

    .line 236
    iput p3, p0, Lcom/google/android/material/slider/BaseSlider;->s0:F

    .line 237
    .line 238
    sget p3, Lcom/google/android/material/R$styleable;->Slider_android_valueTo:I

    .line 239
    .line 240
    const/high16 v1, 0x3f800000    # 1.0f

    .line 241
    .line 242
    invoke-virtual {p2, p3, v1}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 243
    .line 244
    .line 245
    move-result p3

    .line 246
    iput p3, p0, Lcom/google/android/material/slider/BaseSlider;->t0:F

    .line 247
    .line 248
    iget p3, p0, Lcom/google/android/material/slider/BaseSlider;->s0:F

    .line 249
    .line 250
    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 251
    .line 252
    .line 253
    move-result-object p3

    .line 254
    filled-new-array {p3}, [Ljava/lang/Float;

    .line 255
    .line 256
    .line 257
    move-result-object p3

    .line 258
    invoke-virtual {p0, p3}, Lcom/google/android/material/slider/BaseSlider;->setValues([Ljava/lang/Float;)V

    .line 259
    .line 260
    .line 261
    sget p3, Lcom/google/android/material/R$styleable;->Slider_android_stepSize:I

    .line 262
    .line 263
    invoke-virtual {p2, p3, v6}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 264
    .line 265
    .line 266
    move-result p3

    .line 267
    iput p3, p0, Lcom/google/android/material/slider/BaseSlider;->x0:F

    .line 268
    .line 269
    sget p3, Lcom/google/android/material/R$styleable;->Slider_trackColor:I

    .line 270
    .line 271
    invoke-virtual {p2, p3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 272
    .line 273
    .line 274
    move-result p3

    .line 275
    if-eqz p3, :cond_0

    .line 276
    .line 277
    sget v1, Lcom/google/android/material/R$styleable;->Slider_trackColor:I

    .line 278
    .line 279
    goto :goto_0

    .line 280
    :cond_0
    sget v1, Lcom/google/android/material/R$styleable;->Slider_trackColorInactive:I

    .line 281
    .line 282
    :goto_0
    if-eqz p3, :cond_1

    .line 283
    .line 284
    sget p3, Lcom/google/android/material/R$styleable;->Slider_trackColor:I

    .line 285
    .line 286
    goto :goto_1

    .line 287
    :cond_1
    sget p3, Lcom/google/android/material/R$styleable;->Slider_trackColorActive:I

    .line 288
    .line 289
    :goto_1
    invoke-static {v0, p2, v1}, Lde3;->o(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    if-eqz v1, :cond_2

    .line 294
    .line 295
    goto :goto_2

    .line 296
    :cond_2
    sget v1, Lcom/google/android/material/R$color;->material_slider_inactive_track_color:I

    .line 297
    .line 298
    invoke-static {v0, v1}, Lv00;->getColorStateList(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 299
    .line 300
    .line 301
    move-result-object v1

    .line 302
    :goto_2
    invoke-virtual {p0, v1}, Lcom/google/android/material/slider/BaseSlider;->setTrackInactiveTintList(Landroid/content/res/ColorStateList;)V

    .line 303
    .line 304
    .line 305
    invoke-static {v0, p2, p3}, Lde3;->o(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 306
    .line 307
    .line 308
    move-result-object p3

    .line 309
    if-eqz p3, :cond_3

    .line 310
    .line 311
    goto :goto_3

    .line 312
    :cond_3
    sget p3, Lcom/google/android/material/R$color;->material_slider_active_track_color:I

    .line 313
    .line 314
    invoke-static {v0, p3}, Lv00;->getColorStateList(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 315
    .line 316
    .line 317
    move-result-object p3

    .line 318
    :goto_3
    invoke-virtual {p0, p3}, Lcom/google/android/material/slider/BaseSlider;->setTrackActiveTintList(Landroid/content/res/ColorStateList;)V

    .line 319
    .line 320
    .line 321
    sget p3, Lcom/google/android/material/R$styleable;->Slider_thumbColor:I

    .line 322
    .line 323
    invoke-static {v0, p2, p3}, Lde3;->o(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 324
    .line 325
    .line 326
    move-result-object p3

    .line 327
    invoke-virtual {v8, p3}, Lfd1;->n(Landroid/content/res/ColorStateList;)V

    .line 328
    .line 329
    .line 330
    sget p3, Lcom/google/android/material/R$styleable;->Slider_thumbStrokeColor:I

    .line 331
    .line 332
    invoke-virtual {p2, p3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 333
    .line 334
    .line 335
    move-result p3

    .line 336
    if-eqz p3, :cond_4

    .line 337
    .line 338
    sget p3, Lcom/google/android/material/R$styleable;->Slider_thumbStrokeColor:I

    .line 339
    .line 340
    invoke-static {v0, p2, p3}, Lde3;->o(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 341
    .line 342
    .line 343
    move-result-object p3

    .line 344
    invoke-virtual {p0, p3}, Lcom/google/android/material/slider/BaseSlider;->setThumbStrokeColor(Landroid/content/res/ColorStateList;)V

    .line 345
    .line 346
    .line 347
    :cond_4
    sget p3, Lcom/google/android/material/R$styleable;->Slider_thumbStrokeWidth:I

    .line 348
    .line 349
    invoke-virtual {p2, p3, v6}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 350
    .line 351
    .line 352
    move-result p3

    .line 353
    invoke-virtual {p0, p3}, Lcom/google/android/material/slider/BaseSlider;->setThumbStrokeWidth(F)V

    .line 354
    .line 355
    .line 356
    sget p3, Lcom/google/android/material/R$styleable;->Slider_haloColor:I

    .line 357
    .line 358
    invoke-static {v0, p2, p3}, Lde3;->o(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 359
    .line 360
    .line 361
    move-result-object p3

    .line 362
    if-eqz p3, :cond_5

    .line 363
    .line 364
    goto :goto_4

    .line 365
    :cond_5
    sget p3, Lcom/google/android/material/R$color;->material_slider_halo_color:I

    .line 366
    .line 367
    invoke-static {v0, p3}, Lv00;->getColorStateList(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 368
    .line 369
    .line 370
    move-result-object p3

    .line 371
    :goto_4
    invoke-virtual {p0, p3}, Lcom/google/android/material/slider/BaseSlider;->setHaloTintList(Landroid/content/res/ColorStateList;)V

    .line 372
    .line 373
    .line 374
    sget p3, Lcom/google/android/material/R$styleable;->Slider_tickVisible:I

    .line 375
    .line 376
    invoke-virtual {p2, p3, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 377
    .line 378
    .line 379
    move-result p3

    .line 380
    iput-boolean p3, p0, Lcom/google/android/material/slider/BaseSlider;->z0:Z

    .line 381
    .line 382
    sget p3, Lcom/google/android/material/R$styleable;->Slider_tickColor:I

    .line 383
    .line 384
    invoke-virtual {p2, p3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 385
    .line 386
    .line 387
    move-result p3

    .line 388
    if-eqz p3, :cond_6

    .line 389
    .line 390
    sget v1, Lcom/google/android/material/R$styleable;->Slider_tickColor:I

    .line 391
    .line 392
    goto :goto_5

    .line 393
    :cond_6
    sget v1, Lcom/google/android/material/R$styleable;->Slider_tickColorInactive:I

    .line 394
    .line 395
    :goto_5
    if-eqz p3, :cond_7

    .line 396
    .line 397
    sget p3, Lcom/google/android/material/R$styleable;->Slider_tickColor:I

    .line 398
    .line 399
    goto :goto_6

    .line 400
    :cond_7
    sget p3, Lcom/google/android/material/R$styleable;->Slider_tickColorActive:I

    .line 401
    .line 402
    :goto_6
    invoke-static {v0, p2, v1}, Lde3;->o(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 403
    .line 404
    .line 405
    move-result-object v1

    .line 406
    if-eqz v1, :cond_8

    .line 407
    .line 408
    goto :goto_7

    .line 409
    :cond_8
    sget v1, Lcom/google/android/material/R$color;->material_slider_inactive_tick_marks_color:I

    .line 410
    .line 411
    invoke-static {v0, v1}, Lv00;->getColorStateList(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 412
    .line 413
    .line 414
    move-result-object v1

    .line 415
    :goto_7
    invoke-virtual {p0, v1}, Lcom/google/android/material/slider/BaseSlider;->setTickInactiveTintList(Landroid/content/res/ColorStateList;)V

    .line 416
    .line 417
    .line 418
    invoke-static {v0, p2, p3}, Lde3;->o(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 419
    .line 420
    .line 421
    move-result-object p3

    .line 422
    if-eqz p3, :cond_9

    .line 423
    .line 424
    goto :goto_8

    .line 425
    :cond_9
    sget p3, Lcom/google/android/material/R$color;->material_slider_active_tick_marks_color:I

    .line 426
    .line 427
    invoke-static {v0, p3}, Lv00;->getColorStateList(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 428
    .line 429
    .line 430
    move-result-object p3

    .line 431
    :goto_8
    invoke-virtual {p0, p3}, Lcom/google/android/material/slider/BaseSlider;->setTickActiveTintList(Landroid/content/res/ColorStateList;)V

    .line 432
    .line 433
    .line 434
    sget p3, Lcom/google/android/material/R$styleable;->Slider_thumbRadius:I

    .line 435
    .line 436
    invoke-virtual {p2, p3, p1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 437
    .line 438
    .line 439
    move-result p3

    .line 440
    invoke-virtual {p0, p3}, Lcom/google/android/material/slider/BaseSlider;->setThumbRadius(I)V

    .line 441
    .line 442
    .line 443
    sget p3, Lcom/google/android/material/R$styleable;->Slider_haloRadius:I

    .line 444
    .line 445
    invoke-virtual {p2, p3, p1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 446
    .line 447
    .line 448
    move-result p3

    .line 449
    invoke-virtual {p0, p3}, Lcom/google/android/material/slider/BaseSlider;->setHaloRadius(I)V

    .line 450
    .line 451
    .line 452
    sget p3, Lcom/google/android/material/R$styleable;->Slider_thumbElevation:I

    .line 453
    .line 454
    invoke-virtual {p2, p3, v6}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 455
    .line 456
    .line 457
    move-result p3

    .line 458
    invoke-virtual {p0, p3}, Lcom/google/android/material/slider/BaseSlider;->setThumbElevation(F)V

    .line 459
    .line 460
    .line 461
    sget p3, Lcom/google/android/material/R$styleable;->Slider_trackHeight:I

    .line 462
    .line 463
    invoke-virtual {p2, p3, p1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 464
    .line 465
    .line 466
    move-result p3

    .line 467
    invoke-virtual {p0, p3}, Lcom/google/android/material/slider/BaseSlider;->setTrackHeight(I)V

    .line 468
    .line 469
    .line 470
    sget p3, Lcom/google/android/material/R$styleable;->Slider_labelBehavior:I

    .line 471
    .line 472
    invoke-virtual {p2, p3, p1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 473
    .line 474
    .line 475
    move-result p3

    .line 476
    invoke-virtual {p0, p3}, Lcom/google/android/material/slider/BaseSlider;->setLabelBehavior(I)V

    .line 477
    .line 478
    .line 479
    sget p3, Lcom/google/android/material/R$styleable;->Slider_android_enabled:I

    .line 480
    .line 481
    invoke-virtual {p2, p3, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 482
    .line 483
    .line 484
    move-result p3

    .line 485
    if-nez p3, :cond_a

    .line 486
    .line 487
    invoke-virtual {p0, p1}, Lcom/google/android/material/slider/BaseSlider;->setEnabled(Z)V

    .line 488
    .line 489
    .line 490
    :cond_a
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 491
    .line 492
    .line 493
    invoke-virtual {p0, v7}, Landroid/view/View;->setFocusable(Z)V

    .line 494
    .line 495
    .line 496
    invoke-virtual {p0, v7}, Landroid/view/View;->setClickable(Z)V

    .line 497
    .line 498
    .line 499
    invoke-virtual {v8}, Lfd1;->r()V

    .line 500
    .line 501
    .line 502
    invoke-static {v0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 503
    .line 504
    .line 505
    move-result-object p1

    .line 506
    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    .line 507
    .line 508
    .line 509
    move-result p1

    .line 510
    iput p1, p0, Lcom/google/android/material/slider/BaseSlider;->e0:I

    .line 511
    .line 512
    new-instance p1, Lcom/google/android/material/slider/e;

    .line 513
    .line 514
    invoke-direct {p1, p0}, Lcom/google/android/material/slider/e;-><init>(Lcom/google/android/material/slider/BaseSlider;)V

    .line 515
    .line 516
    .line 517
    iput-object p1, p0, Lcom/google/android/material/slider/BaseSlider;->i:Lcom/google/android/material/slider/e;

    .line 518
    .line 519
    invoke-static {p0, p1}, Le33;->n(Landroid/view/View;Lt0;)V

    .line 520
    .line 521
    .line 522
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 523
    .line 524
    .line 525
    move-result-object p1

    .line 526
    const-string p2, "accessibility"

    .line 527
    .line 528
    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 529
    .line 530
    .line 531
    move-result-object p1

    .line 532
    check-cast p1, Landroid/view/accessibility/AccessibilityManager;

    .line 533
    .line 534
    iput-object p1, p0, Lcom/google/android/material/slider/BaseSlider;->v:Landroid/view/accessibility/AccessibilityManager;

    .line 535
    .line 536
    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/drawable/Drawable;)V
    .locals 4

    .line 1
    iget p0, p0, Lcom/google/android/material/slider/BaseSlider;->m0:I

    .line 2
    .line 3
    mul-int/lit8 p0, p0, 0x2

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, -0x1

    .line 15
    if-ne v0, v3, :cond_0

    .line 16
    .line 17
    if-ne v1, v3, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1, v2, v2, p0, p0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    int-to-float p0, p0

    .line 24
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    int-to-float v3, v3

    .line 29
    div-float/2addr p0, v3

    .line 30
    int-to-float v0, v0

    .line 31
    mul-float/2addr v0, p0

    .line 32
    float-to-int v0, v0

    .line 33
    int-to-float v1, v1

    .line 34
    mul-float/2addr v1, p0

    .line 35
    float-to-int p0, v1

    .line 36
    invoke-virtual {p1, v2, v2, v0, p0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final b()I
    .locals 3

    .line 1
    iget v0, p0, Lcom/google/android/material/slider/BaseSlider;->i0:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x3

    .line 8
    if-ne v0, v1, :cond_1

    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/slider/BaseSlider;->V:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Ldq2;

    .line 17
    .line 18
    invoke-virtual {v0}, Ldq2;->getIntrinsicHeight()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    :cond_1
    iget p0, p0, Lcom/google/android/material/slider/BaseSlider;->l0:I

    .line 23
    .line 24
    add-int/2addr p0, v2

    .line 25
    return p0
.end method

.method public final c(Z)Landroid/animation/ValueAnimator;
    .locals 5

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    move v2, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move v2, v0

    .line 9
    :goto_0
    if-eqz p1, :cond_1

    .line 10
    .line 11
    iget-object v3, p0, Lcom/google/android/material/slider/BaseSlider;->d0:Landroid/animation/ValueAnimator;

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_1
    iget-object v3, p0, Lcom/google/android/material/slider/BaseSlider;->c0:Landroid/animation/ValueAnimator;

    .line 15
    .line 16
    :goto_1
    if-eqz v3, :cond_2

    .line 17
    .line 18
    invoke-virtual {v3}, Landroid/animation/ValueAnimator;->isRunning()Z

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    if-eqz v4, :cond_2

    .line 23
    .line 24
    invoke-virtual {v3}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Ljava/lang/Float;

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    invoke-virtual {v3}, Landroid/animation/ValueAnimator;->cancel()V

    .line 35
    .line 36
    .line 37
    :cond_2
    if-eqz p1, :cond_3

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_3
    move v0, v1

    .line 41
    :goto_2
    const/4 v1, 0x2

    .line 42
    new-array v1, v1, [F

    .line 43
    .line 44
    const/4 v3, 0x0

    .line 45
    aput v2, v1, v3

    .line 46
    .line 47
    const/4 v2, 0x1

    .line 48
    aput v0, v1, v2

    .line 49
    .line 50
    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    if-eqz p1, :cond_4

    .line 55
    .line 56
    const-wide/16 v1, 0x53

    .line 57
    .line 58
    goto :goto_3

    .line 59
    :cond_4
    const-wide/16 v1, 0x75

    .line 60
    .line 61
    :goto_3
    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 62
    .line 63
    .line 64
    if-eqz p1, :cond_5

    .line 65
    .line 66
    sget-object p1, Lu8;->e:Landroid/view/animation/DecelerateInterpolator;

    .line 67
    .line 68
    goto :goto_4

    .line 69
    :cond_5
    sget-object p1, Lu8;->c:Lxg0;

    .line 70
    .line 71
    :goto_4
    invoke-virtual {v0, p1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 72
    .line 73
    .line 74
    new-instance p1, Lcom/google/android/material/slider/b;

    .line 75
    .line 76
    invoke-direct {p1, p0}, Lcom/google/android/material/slider/b;-><init>(Lcom/google/android/material/slider/BaseSlider;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, p1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 80
    .line 81
    .line 82
    return-object v0
.end method

.method public final d(Landroid/graphics/Canvas;IIFLandroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/google/android/material/slider/BaseSlider;->k0:I

    .line 5
    .line 6
    invoke-virtual {p0, p4}, Lcom/google/android/material/slider/BaseSlider;->o(F)F

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    int-to-float p2, p2

    .line 11
    mul-float/2addr p0, p2

    .line 12
    float-to-int p0, p0

    .line 13
    add-int/2addr v0, p0

    .line 14
    int-to-float p0, v0

    .line 15
    invoke-virtual {p5}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    int-to-float p2, p2

    .line 24
    const/high16 p4, 0x40000000    # 2.0f

    .line 25
    .line 26
    div-float/2addr p2, p4

    .line 27
    sub-float/2addr p0, p2

    .line 28
    int-to-float p2, p3

    .line 29
    invoke-virtual {p5}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 30
    .line 31
    .line 32
    move-result-object p3

    .line 33
    invoke-virtual {p3}, Landroid/graphics/Rect;->height()I

    .line 34
    .line 35
    .line 36
    move-result p3

    .line 37
    int-to-float p3, p3

    .line 38
    div-float/2addr p3, p4

    .line 39
    sub-float/2addr p2, p3

    .line 40
    invoke-virtual {p1, p0, p2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p5, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public dispatchHoverEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/slider/BaseSlider;->i:Lcom/google/android/material/slider/e;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lsf0;->m(Landroid/view/MotionEvent;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    invoke-super {p0, p1}, Landroid/view/View;->dispatchHoverEvent(Landroid/view/MotionEvent;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return p0

    .line 18
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 19
    return p0
.end method

.method public final drawableStateChanged()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/view/View;->drawableStateChanged()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/material/slider/BaseSlider;->H0:Landroid/content/res/ColorStateList;

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lcom/google/android/material/slider/BaseSlider;->h(Landroid/content/res/ColorStateList;)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iget-object v1, p0, Lcom/google/android/material/slider/BaseSlider;->a:Landroid/graphics/Paint;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/google/android/material/slider/BaseSlider;->G0:Landroid/content/res/ColorStateList;

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lcom/google/android/material/slider/BaseSlider;->h(Landroid/content/res/ColorStateList;)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iget-object v1, p0, Lcom/google/android/material/slider/BaseSlider;->b:Landroid/graphics/Paint;

    .line 22
    .line 23
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/google/android/material/slider/BaseSlider;->F0:Landroid/content/res/ColorStateList;

    .line 27
    .line 28
    invoke-virtual {p0, v0}, Lcom/google/android/material/slider/BaseSlider;->h(Landroid/content/res/ColorStateList;)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iget-object v1, p0, Lcom/google/android/material/slider/BaseSlider;->e:Landroid/graphics/Paint;

    .line 33
    .line 34
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lcom/google/android/material/slider/BaseSlider;->E0:Landroid/content/res/ColorStateList;

    .line 38
    .line 39
    invoke-virtual {p0, v0}, Lcom/google/android/material/slider/BaseSlider;->h(Landroid/content/res/ColorStateList;)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    iget-object v1, p0, Lcom/google/android/material/slider/BaseSlider;->f:Landroid/graphics/Paint;

    .line 44
    .line 45
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, Lcom/google/android/material/slider/BaseSlider;->V:Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-eqz v1, :cond_1

    .line 59
    .line 60
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    check-cast v1, Ldq2;

    .line 65
    .line 66
    invoke-virtual {v1}, Lfd1;->isStateful()Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-eqz v2, :cond_0

    .line 71
    .line 72
    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-virtual {v1, v2}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_1
    iget-object v0, p0, Lcom/google/android/material/slider/BaseSlider;->I0:Lfd1;

    .line 81
    .line 82
    invoke-virtual {v0}, Lfd1;->isStateful()Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-eqz v1, :cond_2

    .line 87
    .line 88
    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 93
    .line 94
    .line 95
    :cond_2
    iget-object v0, p0, Lcom/google/android/material/slider/BaseSlider;->D0:Landroid/content/res/ColorStateList;

    .line 96
    .line 97
    invoke-virtual {p0, v0}, Lcom/google/android/material/slider/BaseSlider;->h(Landroid/content/res/ColorStateList;)I

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    iget-object p0, p0, Lcom/google/android/material/slider/BaseSlider;->d:Landroid/graphics/Paint;

    .line 102
    .line 103
    invoke-virtual {p0, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 104
    .line 105
    .line 106
    const/16 v0, 0x3f

    .line 107
    .line 108
    invoke-virtual {p0, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 109
    .line 110
    .line 111
    return-void
.end method

.method public final e()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/slider/BaseSlider;->b0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lcom/google/android/material/slider/BaseSlider;->b0:Z

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lcom/google/android/material/slider/BaseSlider;->c(Z)Landroid/animation/ValueAnimator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, Lcom/google/android/material/slider/BaseSlider;->d0:Landroid/animation/ValueAnimator;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    iput-object v1, p0, Lcom/google/android/material/slider/BaseSlider;->c0:Landroid/animation/ValueAnimator;

    .line 16
    .line 17
    new-instance v1, Lcom/google/android/material/slider/c;

    .line 18
    .line 19
    invoke-direct {v1, p0}, Lcom/google/android/material/slider/c;-><init>(Lcom/google/android/material/slider/BaseSlider;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 23
    .line 24
    .line 25
    iget-object p0, p0, Lcom/google/android/material/slider/BaseSlider;->d0:Landroid/animation/ValueAnimator;

    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->start()V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
.end method

.method public final f(F)Ljava/lang/String;
    .locals 0

    .line 1
    float-to-int p0, p1

    .line 2
    int-to-float p0, p0

    .line 3
    cmpl-float p0, p0, p1

    .line 4
    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const-string p0, "%.0f"

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const-string p0, "%.2f"

    .line 11
    .line 12
    :goto_0
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-static {p0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public final g()[F
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/google/android/material/slider/BaseSlider;->getValues()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Ljava/util/Collections;->max(Ljava/util/Collection;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/lang/Float;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-virtual {p0}, Lcom/google/android/material/slider/BaseSlider;->getValues()Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-static {v1}, Ljava/util/Collections;->min(Ljava/util/Collection;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Ljava/lang/Float;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    iget-object v2, p0, Lcom/google/android/material/slider/BaseSlider;->u0:Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    const/4 v3, 0x1

    .line 36
    if-ne v2, v3, :cond_0

    .line 37
    .line 38
    iget v1, p0, Lcom/google/android/material/slider/BaseSlider;->s0:F

    .line 39
    .line 40
    :cond_0
    invoke-virtual {p0, v1}, Lcom/google/android/material/slider/BaseSlider;->o(F)F

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    invoke-virtual {p0, v0}, Lcom/google/android/material/slider/BaseSlider;->o(F)F

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    invoke-virtual {p0}, Lcom/google/android/material/slider/BaseSlider;->k()Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    const/4 v2, 0x0

    .line 53
    const/4 v4, 0x2

    .line 54
    if-eqz p0, :cond_1

    .line 55
    .line 56
    new-array p0, v4, [F

    .line 57
    .line 58
    aput v0, p0, v2

    .line 59
    .line 60
    aput v1, p0, v3

    .line 61
    .line 62
    return-object p0

    .line 63
    :cond_1
    new-array p0, v4, [F

    .line 64
    .line 65
    aput v1, p0, v2

    .line 66
    .line 67
    aput v0, p0, v3

    .line 68
    .line 69
    return-object p0
.end method

.method public getAccessibilityClassName()Ljava/lang/CharSequence;
    .locals 0

    .line 1
    const-class p0, Landroid/widget/SeekBar;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final getAccessibilityFocusedVirtualViewId()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/slider/BaseSlider;->i:Lcom/google/android/material/slider/e;

    .line 2
    .line 3
    iget p0, p0, Lsf0;->k:I

    .line 4
    .line 5
    return p0
.end method

.method public getMinSeparation()F
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public getValueFrom()F
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/android/material/slider/BaseSlider;->s0:F

    .line 2
    .line 3
    return p0
.end method

.method public getValueTo()F
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/android/material/slider/BaseSlider;->t0:F

    .line 2
    .line 3
    return p0
.end method

.method public getValues()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/google/android/material/slider/BaseSlider;->u0:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final h(Landroid/content/res/ColorStateList;)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p1, p0, v0}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final i()Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :goto_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 6
    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    move-object v0, p0

    .line 10
    check-cast v0, Landroid/view/ViewGroup;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-virtual {v0, v1}, Landroid/view/View;->canScrollVertically(I)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    const/4 v2, -0x1

    .line 20
    invoke-virtual {v0, v2}, Landroid/view/View;->canScrollVertically(I)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    :cond_0
    invoke-virtual {v0}, Landroid/view/ViewGroup;->shouldDelayChildPressedState()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    return v1

    .line 33
    :cond_1
    invoke-interface {p0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    goto :goto_0

    .line 38
    :cond_2
    const/4 p0, 0x0

    .line 39
    return p0
.end method

.method public final j(F)Z
    .locals 2

    .line 1
    new-instance v0, Ljava/math/BigDecimal;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-direct {v0, p1}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    new-instance p1, Ljava/math/BigDecimal;

    .line 11
    .line 12
    iget p0, p0, Lcom/google/android/material/slider/BaseSlider;->x0:F

    .line 13
    .line 14
    invoke-static {p0}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-direct {p1, p0}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    sget-object p0, Ljava/math/MathContext;->DECIMAL64:Ljava/math/MathContext;

    .line 22
    .line 23
    invoke-virtual {v0, p1, p0}, Ljava/math/BigDecimal;->divide(Ljava/math/BigDecimal;Ljava/math/MathContext;)Ljava/math/BigDecimal;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0}, Ljava/math/BigDecimal;->doubleValue()D

    .line 28
    .line 29
    .line 30
    move-result-wide p0

    .line 31
    invoke-static {p0, p1}, Ljava/lang/Math;->round(D)J

    .line 32
    .line 33
    .line 34
    move-result-wide v0

    .line 35
    long-to-double v0, v0

    .line 36
    sub-double/2addr v0, p0

    .line 37
    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    .line 38
    .line 39
    .line 40
    move-result-wide p0

    .line 41
    const-wide v0, 0x3f1a36e2eb1c432dL    # 1.0E-4

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    cmpg-double p0, p0, v0

    .line 47
    .line 48
    if-gez p0, :cond_0

    .line 49
    .line 50
    const/4 p0, 0x1

    .line 51
    return p0

    .line 52
    :cond_0
    const/4 p0, 0x0

    .line 53
    return p0
.end method

.method public final k()Z
    .locals 1

    .line 1
    sget-object v0, Le33;->a:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    const/4 v0, 0x1

    .line 8
    if-ne p0, v0, :cond_0

    .line 9
    .line 10
    return v0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public final l()V
    .locals 6

    .line 1
    iget v0, p0, Lcom/google/android/material/slider/BaseSlider;->x0:F

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    cmpg-float v0, v0, v1

    .line 5
    .line 6
    if-gtz v0, :cond_0

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/material/slider/BaseSlider;->x()V

    .line 10
    .line 11
    .line 12
    iget v0, p0, Lcom/google/android/material/slider/BaseSlider;->t0:F

    .line 13
    .line 14
    iget v1, p0, Lcom/google/android/material/slider/BaseSlider;->s0:F

    .line 15
    .line 16
    sub-float/2addr v0, v1

    .line 17
    iget v1, p0, Lcom/google/android/material/slider/BaseSlider;->x0:F

    .line 18
    .line 19
    div-float/2addr v0, v1

    .line 20
    const/high16 v1, 0x3f800000    # 1.0f

    .line 21
    .line 22
    add-float/2addr v0, v1

    .line 23
    float-to-int v0, v0

    .line 24
    iget v1, p0, Lcom/google/android/material/slider/BaseSlider;->A0:I

    .line 25
    .line 26
    iget v2, p0, Lcom/google/android/material/slider/BaseSlider;->j0:I

    .line 27
    .line 28
    mul-int/lit8 v2, v2, 0x2

    .line 29
    .line 30
    div-int/2addr v1, v2

    .line 31
    add-int/lit8 v1, v1, 0x1

    .line 32
    .line 33
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    iget-object v1, p0, Lcom/google/android/material/slider/BaseSlider;->y0:[F

    .line 38
    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    array-length v1, v1

    .line 42
    mul-int/lit8 v2, v0, 0x2

    .line 43
    .line 44
    if-eq v1, v2, :cond_2

    .line 45
    .line 46
    :cond_1
    mul-int/lit8 v1, v0, 0x2

    .line 47
    .line 48
    new-array v1, v1, [F

    .line 49
    .line 50
    iput-object v1, p0, Lcom/google/android/material/slider/BaseSlider;->y0:[F

    .line 51
    .line 52
    :cond_2
    iget v1, p0, Lcom/google/android/material/slider/BaseSlider;->A0:I

    .line 53
    .line 54
    int-to-float v1, v1

    .line 55
    add-int/lit8 v2, v0, -0x1

    .line 56
    .line 57
    int-to-float v2, v2

    .line 58
    div-float/2addr v1, v2

    .line 59
    const/4 v2, 0x0

    .line 60
    :goto_0
    mul-int/lit8 v3, v0, 0x2

    .line 61
    .line 62
    if-ge v2, v3, :cond_3

    .line 63
    .line 64
    iget-object v3, p0, Lcom/google/android/material/slider/BaseSlider;->y0:[F

    .line 65
    .line 66
    iget v4, p0, Lcom/google/android/material/slider/BaseSlider;->k0:I

    .line 67
    .line 68
    int-to-float v4, v4

    .line 69
    div-int/lit8 v5, v2, 0x2

    .line 70
    .line 71
    int-to-float v5, v5

    .line 72
    mul-float/2addr v5, v1

    .line 73
    add-float/2addr v5, v4

    .line 74
    aput v5, v3, v2

    .line 75
    .line 76
    add-int/lit8 v4, v2, 0x1

    .line 77
    .line 78
    invoke-virtual {p0}, Lcom/google/android/material/slider/BaseSlider;->b()I

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    int-to-float v5, v5

    .line 83
    aput v5, v3, v4

    .line 84
    .line 85
    add-int/lit8 v2, v2, 0x2

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_3
    :goto_1
    return-void
.end method

.method public final m(I)Z
    .locals 8

    .line 1
    iget v0, p0, Lcom/google/android/material/slider/BaseSlider;->w0:I

    .line 2
    .line 3
    int-to-long v1, v0

    .line 4
    int-to-long v3, p1

    .line 5
    add-long/2addr v1, v3

    .line 6
    iget-object p1, p0, Lcom/google/android/material/slider/BaseSlider;->u0:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    const/4 v3, 0x1

    .line 13
    sub-int/2addr p1, v3

    .line 14
    int-to-long v4, p1

    .line 15
    const-wide/16 v6, 0x0

    .line 16
    .line 17
    cmp-long p1, v1, v6

    .line 18
    .line 19
    if-gez p1, :cond_0

    .line 20
    .line 21
    move-wide v1, v6

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    cmp-long p1, v1, v4

    .line 24
    .line 25
    if-lez p1, :cond_1

    .line 26
    .line 27
    move-wide v1, v4

    .line 28
    :cond_1
    :goto_0
    long-to-int p1, v1

    .line 29
    iput p1, p0, Lcom/google/android/material/slider/BaseSlider;->w0:I

    .line 30
    .line 31
    if-ne p1, v0, :cond_2

    .line 32
    .line 33
    const/4 p0, 0x0

    .line 34
    return p0

    .line 35
    :cond_2
    iget v0, p0, Lcom/google/android/material/slider/BaseSlider;->v0:I

    .line 36
    .line 37
    const/4 v1, -0x1

    .line 38
    if-eq v0, v1, :cond_3

    .line 39
    .line 40
    iput p1, p0, Lcom/google/android/material/slider/BaseSlider;->v0:I

    .line 41
    .line 42
    :cond_3
    invoke-virtual {p0}, Lcom/google/android/material/slider/BaseSlider;->w()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 46
    .line 47
    .line 48
    return v3
.end method

.method public final n(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/material/slider/BaseSlider;->k()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    const/high16 v0, -0x80000000

    .line 8
    .line 9
    if-ne p1, v0, :cond_0

    .line 10
    .line 11
    const p1, 0x7fffffff

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    neg-int p1, p1

    .line 16
    :cond_1
    :goto_0
    invoke-virtual {p0, p1}, Lcom/google/android/material/slider/BaseSlider;->m(I)Z

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final o(F)F
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/android/material/slider/BaseSlider;->s0:F

    .line 2
    .line 3
    sub-float/2addr p1, v0

    .line 4
    iget v1, p0, Lcom/google/android/material/slider/BaseSlider;->t0:F

    .line 5
    .line 6
    sub-float/2addr v1, v0

    .line 7
    div-float/2addr p1, v1

    .line 8
    invoke-virtual {p0}, Lcom/google/android/material/slider/BaseSlider;->k()Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    const/high16 p0, 0x3f800000    # 1.0f

    .line 15
    .line 16
    sub-float/2addr p0, p1

    .line 17
    return p0

    .line 18
    :cond_0
    return p1
.end method

.method public final onAttachedToWindow()V
    .locals 5

    .line 1
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/material/slider/BaseSlider;->V:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Ldq2;

    .line 21
    .line 22
    invoke-static {p0}, Lkb1;->G(Landroid/view/View;)Landroid/view/ViewGroup;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    if-nez v2, :cond_0

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    const/4 v3, 0x2

    .line 36
    new-array v3, v3, [I

    .line 37
    .line 38
    invoke-virtual {v2, v3}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 39
    .line 40
    .line 41
    const/4 v4, 0x0

    .line 42
    aget v3, v3, v4

    .line 43
    .line 44
    iput v3, v1, Ldq2;->t0:I

    .line 45
    .line 46
    iget-object v3, v1, Ldq2;->n0:Landroid/graphics/Rect;

    .line 47
    .line 48
    invoke-virtual {v2, v3}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 49
    .line 50
    .line 51
    iget-object v1, v1, Ldq2;->m0:Lmp0;

    .line 52
    .line 53
    invoke-virtual {v2, v1}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/material/slider/BaseSlider;->w:Lcom/google/android/material/slider/d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Lcom/google/android/material/slider/BaseSlider;->b0:Z

    .line 10
    .line 11
    iget-object v0, p0, Lcom/google/android/material/slider/BaseSlider;->V:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_4

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Ldq2;

    .line 28
    .line 29
    invoke-static {p0}, Lkb1;->G(Landroid/view/View;)Landroid/view/ViewGroup;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    if-nez v2, :cond_2

    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    goto :goto_1

    .line 37
    :cond_2
    new-instance v3, Lfs0;

    .line 38
    .line 39
    invoke-direct {v3, v2}, Lfs0;-><init>(Landroid/view/ViewGroup;)V

    .line 40
    .line 41
    .line 42
    move-object v2, v3

    .line 43
    :goto_1
    if-eqz v2, :cond_1

    .line 44
    .line 45
    iget-object v2, v2, Lfs0;->b:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v2, Landroid/view/ViewOverlay;

    .line 48
    .line 49
    invoke-virtual {v2, v1}, Landroid/view/ViewOverlay;->remove(Landroid/graphics/drawable/Drawable;)V

    .line 50
    .line 51
    .line 52
    invoke-static {p0}, Lkb1;->G(Landroid/view/View;)Landroid/view/ViewGroup;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    if-nez v2, :cond_3

    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_3
    iget-object v1, v1, Ldq2;->m0:Lmp0;

    .line 63
    .line 64
    invoke-virtual {v2, v1}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_4
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 13

    .line 1
    iget-boolean v1, p0, Lcom/google/android/material/slider/BaseSlider;->C0:Z

    .line 2
    .line 3
    if-eqz v1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/android/material/slider/BaseSlider;->x()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/google/android/material/slider/BaseSlider;->l()V

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-super/range {p0 .. p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/google/android/material/slider/BaseSlider;->b()I

    .line 15
    .line 16
    .line 17
    move-result v7

    .line 18
    iget v1, p0, Lcom/google/android/material/slider/BaseSlider;->A0:I

    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/google/android/material/slider/BaseSlider;->g()[F

    .line 21
    .line 22
    .line 23
    move-result-object v8

    .line 24
    iget v2, p0, Lcom/google/android/material/slider/BaseSlider;->k0:I

    .line 25
    .line 26
    int-to-float v3, v2

    .line 27
    const/4 v9, 0x1

    .line 28
    aget v4, v8, v9

    .line 29
    .line 30
    int-to-float v10, v1

    .line 31
    mul-float/2addr v4, v10

    .line 32
    add-float/2addr v4, v3

    .line 33
    add-int/2addr v2, v1

    .line 34
    int-to-float v1, v2

    .line 35
    cmpg-float v2, v4, v1

    .line 36
    .line 37
    iget-object v6, p0, Lcom/google/android/material/slider/BaseSlider;->a:Landroid/graphics/Paint;

    .line 38
    .line 39
    if-gez v2, :cond_1

    .line 40
    .line 41
    int-to-float v3, v7

    .line 42
    move v5, v3

    .line 43
    move v2, v4

    .line 44
    move v4, v1

    .line 45
    move-object v1, p1

    .line 46
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 47
    .line 48
    .line 49
    :cond_1
    iget v1, p0, Lcom/google/android/material/slider/BaseSlider;->k0:I

    .line 50
    .line 51
    int-to-float v2, v1

    .line 52
    const/4 v11, 0x0

    .line 53
    aget v1, v8, v11

    .line 54
    .line 55
    mul-float/2addr v1, v10

    .line 56
    add-float v4, v1, v2

    .line 57
    .line 58
    cmpl-float v1, v4, v2

    .line 59
    .line 60
    if-lez v1, :cond_2

    .line 61
    .line 62
    int-to-float v3, v7

    .line 63
    move v5, v3

    .line 64
    move-object v1, p1

    .line 65
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 66
    .line 67
    .line 68
    :cond_2
    invoke-virtual {p0}, Lcom/google/android/material/slider/BaseSlider;->getValues()Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-static {v1}, Ljava/util/Collections;->max(Ljava/util/Collection;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    check-cast v1, Ljava/lang/Float;

    .line 77
    .line 78
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    iget v2, p0, Lcom/google/android/material/slider/BaseSlider;->s0:F

    .line 83
    .line 84
    cmpl-float v1, v1, v2

    .line 85
    .line 86
    if-lez v1, :cond_3

    .line 87
    .line 88
    iget v1, p0, Lcom/google/android/material/slider/BaseSlider;->A0:I

    .line 89
    .line 90
    invoke-virtual {p0}, Lcom/google/android/material/slider/BaseSlider;->g()[F

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    iget v3, p0, Lcom/google/android/material/slider/BaseSlider;->k0:I

    .line 95
    .line 96
    int-to-float v3, v3

    .line 97
    aget v4, v2, v9

    .line 98
    .line 99
    int-to-float v1, v1

    .line 100
    mul-float/2addr v4, v1

    .line 101
    add-float/2addr v4, v3

    .line 102
    aget v2, v2, v11

    .line 103
    .line 104
    mul-float/2addr v2, v1

    .line 105
    add-float/2addr v2, v3

    .line 106
    int-to-float v3, v7

    .line 107
    iget-object v6, p0, Lcom/google/android/material/slider/BaseSlider;->b:Landroid/graphics/Paint;

    .line 108
    .line 109
    move v5, v3

    .line 110
    move-object v1, p1

    .line 111
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 112
    .line 113
    .line 114
    :cond_3
    iget-boolean v2, p0, Lcom/google/android/material/slider/BaseSlider;->z0:Z

    .line 115
    .line 116
    const/4 v8, 0x2

    .line 117
    if-eqz v2, :cond_5

    .line 118
    .line 119
    iget v2, p0, Lcom/google/android/material/slider/BaseSlider;->x0:F

    .line 120
    .line 121
    const/4 v3, 0x0

    .line 122
    cmpg-float v2, v2, v3

    .line 123
    .line 124
    if-gtz v2, :cond_4

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_4
    invoke-virtual {p0}, Lcom/google/android/material/slider/BaseSlider;->g()[F

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    iget-object v3, p0, Lcom/google/android/material/slider/BaseSlider;->y0:[F

    .line 132
    .line 133
    aget v4, v2, v11

    .line 134
    .line 135
    array-length v3, v3

    .line 136
    div-int/2addr v3, v8

    .line 137
    sub-int/2addr v3, v9

    .line 138
    int-to-float v3, v3

    .line 139
    mul-float/2addr v4, v3

    .line 140
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 141
    .line 142
    .line 143
    move-result v3

    .line 144
    iget-object v4, p0, Lcom/google/android/material/slider/BaseSlider;->y0:[F

    .line 145
    .line 146
    aget v2, v2, v9

    .line 147
    .line 148
    array-length v4, v4

    .line 149
    div-int/2addr v4, v8

    .line 150
    sub-int/2addr v4, v9

    .line 151
    int-to-float v4, v4

    .line 152
    mul-float/2addr v2, v4

    .line 153
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 154
    .line 155
    .line 156
    move-result v2

    .line 157
    iget-object v4, p0, Lcom/google/android/material/slider/BaseSlider;->y0:[F

    .line 158
    .line 159
    mul-int/2addr v3, v8

    .line 160
    iget-object v5, p0, Lcom/google/android/material/slider/BaseSlider;->e:Landroid/graphics/Paint;

    .line 161
    .line 162
    invoke-virtual {p1, v4, v11, v3, v5}, Landroid/graphics/Canvas;->drawPoints([FIILandroid/graphics/Paint;)V

    .line 163
    .line 164
    .line 165
    iget-object v4, p0, Lcom/google/android/material/slider/BaseSlider;->y0:[F

    .line 166
    .line 167
    mul-int/2addr v2, v8

    .line 168
    sub-int v6, v2, v3

    .line 169
    .line 170
    iget-object v10, p0, Lcom/google/android/material/slider/BaseSlider;->f:Landroid/graphics/Paint;

    .line 171
    .line 172
    invoke-virtual {p1, v4, v3, v6, v10}, Landroid/graphics/Canvas;->drawPoints([FIILandroid/graphics/Paint;)V

    .line 173
    .line 174
    .line 175
    iget-object v3, p0, Lcom/google/android/material/slider/BaseSlider;->y0:[F

    .line 176
    .line 177
    array-length v4, v3

    .line 178
    sub-int/2addr v4, v2

    .line 179
    invoke-virtual {p1, v3, v2, v4, v5}, Landroid/graphics/Canvas;->drawPoints([FIILandroid/graphics/Paint;)V

    .line 180
    .line 181
    .line 182
    :cond_5
    :goto_0
    iget-boolean v2, p0, Lcom/google/android/material/slider/BaseSlider;->r0:Z

    .line 183
    .line 184
    const/4 v10, 0x3

    .line 185
    if-nez v2, :cond_6

    .line 186
    .line 187
    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    .line 188
    .line 189
    .line 190
    move-result v2

    .line 191
    if-nez v2, :cond_6

    .line 192
    .line 193
    iget v2, p0, Lcom/google/android/material/slider/BaseSlider;->i0:I

    .line 194
    .line 195
    if-ne v2, v10, :cond_10

    .line 196
    .line 197
    :cond_6
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 198
    .line 199
    .line 200
    move-result v2

    .line 201
    if-eqz v2, :cond_10

    .line 202
    .line 203
    iget v2, p0, Lcom/google/android/material/slider/BaseSlider;->A0:I

    .line 204
    .line 205
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 206
    .line 207
    .line 208
    move-result-object v3

    .line 209
    instance-of v3, v3, Landroid/graphics/drawable/RippleDrawable;

    .line 210
    .line 211
    if-nez v3, :cond_8

    .line 212
    .line 213
    iget v3, p0, Lcom/google/android/material/slider/BaseSlider;->k0:I

    .line 214
    .line 215
    int-to-float v3, v3

    .line 216
    iget-object v4, p0, Lcom/google/android/material/slider/BaseSlider;->u0:Ljava/util/ArrayList;

    .line 217
    .line 218
    iget v5, p0, Lcom/google/android/material/slider/BaseSlider;->w0:I

    .line 219
    .line 220
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v4

    .line 224
    check-cast v4, Ljava/lang/Float;

    .line 225
    .line 226
    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    .line 227
    .line 228
    .line 229
    move-result v4

    .line 230
    invoke-virtual {p0, v4}, Lcom/google/android/material/slider/BaseSlider;->o(F)F

    .line 231
    .line 232
    .line 233
    move-result v4

    .line 234
    int-to-float v2, v2

    .line 235
    mul-float/2addr v4, v2

    .line 236
    add-float/2addr v4, v3

    .line 237
    float-to-int v12, v4

    .line 238
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 239
    .line 240
    const/16 v3, 0x1c

    .line 241
    .line 242
    if-ge v2, v3, :cond_7

    .line 243
    .line 244
    iget v2, p0, Lcom/google/android/material/slider/BaseSlider;->n0:I

    .line 245
    .line 246
    sub-int v3, v12, v2

    .line 247
    .line 248
    int-to-float v3, v3

    .line 249
    sub-int v4, v7, v2

    .line 250
    .line 251
    int-to-float v4, v4

    .line 252
    add-int v5, v12, v2

    .line 253
    .line 254
    int-to-float v5, v5

    .line 255
    add-int/2addr v2, v7

    .line 256
    int-to-float v2, v2

    .line 257
    sget-object v6, Landroid/graphics/Region$Op;->UNION:Landroid/graphics/Region$Op;

    .line 258
    .line 259
    move v1, v5

    .line 260
    move v5, v2

    .line 261
    move v2, v3

    .line 262
    move v3, v4

    .line 263
    move v4, v1

    .line 264
    move-object v1, p1

    .line 265
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->clipRect(FFFFLandroid/graphics/Region$Op;)Z

    .line 266
    .line 267
    .line 268
    :cond_7
    int-to-float v2, v12

    .line 269
    int-to-float v3, v7

    .line 270
    iget v4, p0, Lcom/google/android/material/slider/BaseSlider;->n0:I

    .line 271
    .line 272
    int-to-float v4, v4

    .line 273
    iget-object v5, p0, Lcom/google/android/material/slider/BaseSlider;->d:Landroid/graphics/Paint;

    .line 274
    .line 275
    invoke-virtual {p1, v2, v3, v4, v5}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 276
    .line 277
    .line 278
    :cond_8
    iget v2, p0, Lcom/google/android/material/slider/BaseSlider;->v0:I

    .line 279
    .line 280
    const/4 v3, -0x1

    .line 281
    if-ne v2, v3, :cond_a

    .line 282
    .line 283
    iget v2, p0, Lcom/google/android/material/slider/BaseSlider;->i0:I

    .line 284
    .line 285
    if-ne v2, v10, :cond_9

    .line 286
    .line 287
    goto :goto_1

    .line 288
    :cond_9
    invoke-virtual {p0}, Lcom/google/android/material/slider/BaseSlider;->e()V

    .line 289
    .line 290
    .line 291
    goto/16 :goto_4

    .line 292
    .line 293
    :cond_a
    :goto_1
    iget v2, p0, Lcom/google/android/material/slider/BaseSlider;->i0:I

    .line 294
    .line 295
    if-ne v2, v8, :cond_b

    .line 296
    .line 297
    goto/16 :goto_4

    .line 298
    .line 299
    :cond_b
    iget-boolean v2, p0, Lcom/google/android/material/slider/BaseSlider;->b0:Z

    .line 300
    .line 301
    if-nez v2, :cond_c

    .line 302
    .line 303
    iput-boolean v9, p0, Lcom/google/android/material/slider/BaseSlider;->b0:Z

    .line 304
    .line 305
    invoke-virtual {p0, v9}, Lcom/google/android/material/slider/BaseSlider;->c(Z)Landroid/animation/ValueAnimator;

    .line 306
    .line 307
    .line 308
    move-result-object v2

    .line 309
    iput-object v2, p0, Lcom/google/android/material/slider/BaseSlider;->c0:Landroid/animation/ValueAnimator;

    .line 310
    .line 311
    const/4 v3, 0x0

    .line 312
    iput-object v3, p0, Lcom/google/android/material/slider/BaseSlider;->d0:Landroid/animation/ValueAnimator;

    .line 313
    .line 314
    invoke-virtual {v2}, Landroid/animation/ValueAnimator;->start()V

    .line 315
    .line 316
    .line 317
    :cond_c
    iget-object v2, p0, Lcom/google/android/material/slider/BaseSlider;->V:Ljava/util/ArrayList;

    .line 318
    .line 319
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 320
    .line 321
    .line 322
    move-result-object v3

    .line 323
    move v4, v11

    .line 324
    :goto_2
    iget-object v5, p0, Lcom/google/android/material/slider/BaseSlider;->u0:Ljava/util/ArrayList;

    .line 325
    .line 326
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 327
    .line 328
    .line 329
    move-result v5

    .line 330
    if-ge v4, v5, :cond_e

    .line 331
    .line 332
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 333
    .line 334
    .line 335
    move-result v5

    .line 336
    if-eqz v5, :cond_e

    .line 337
    .line 338
    iget v5, p0, Lcom/google/android/material/slider/BaseSlider;->w0:I

    .line 339
    .line 340
    if-ne v4, v5, :cond_d

    .line 341
    .line 342
    goto :goto_3

    .line 343
    :cond_d
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v5

    .line 347
    check-cast v5, Ldq2;

    .line 348
    .line 349
    iget-object v6, p0, Lcom/google/android/material/slider/BaseSlider;->u0:Ljava/util/ArrayList;

    .line 350
    .line 351
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v6

    .line 355
    check-cast v6, Ljava/lang/Float;

    .line 356
    .line 357
    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    .line 358
    .line 359
    .line 360
    move-result v6

    .line 361
    invoke-virtual {p0, v5, v6}, Lcom/google/android/material/slider/BaseSlider;->r(Ldq2;F)V

    .line 362
    .line 363
    .line 364
    :goto_3
    add-int/lit8 v4, v4, 0x1

    .line 365
    .line 366
    goto :goto_2

    .line 367
    :cond_e
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 368
    .line 369
    .line 370
    move-result v4

    .line 371
    if-eqz v4, :cond_f

    .line 372
    .line 373
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v2

    .line 377
    check-cast v2, Ldq2;

    .line 378
    .line 379
    iget-object v3, p0, Lcom/google/android/material/slider/BaseSlider;->u0:Ljava/util/ArrayList;

    .line 380
    .line 381
    iget v4, p0, Lcom/google/android/material/slider/BaseSlider;->w0:I

    .line 382
    .line 383
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object v3

    .line 387
    check-cast v3, Ljava/lang/Float;

    .line 388
    .line 389
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    .line 390
    .line 391
    .line 392
    move-result v3

    .line 393
    invoke-virtual {p0, v2, v3}, Lcom/google/android/material/slider/BaseSlider;->r(Ldq2;F)V

    .line 394
    .line 395
    .line 396
    goto :goto_4

    .line 397
    :cond_f
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 398
    .line 399
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 400
    .line 401
    .line 402
    move-result v2

    .line 403
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 404
    .line 405
    .line 406
    move-result-object v2

    .line 407
    iget-object v0, p0, Lcom/google/android/material/slider/BaseSlider;->u0:Ljava/util/ArrayList;

    .line 408
    .line 409
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 410
    .line 411
    .line 412
    move-result v0

    .line 413
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 414
    .line 415
    .line 416
    move-result-object v0

    .line 417
    filled-new-array {v2, v0}, [Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v0

    .line 421
    const-string v2, "Not enough labels(%d) to display all the values(%d)"

    .line 422
    .line 423
    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 424
    .line 425
    .line 426
    move-result-object v0

    .line 427
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 428
    .line 429
    .line 430
    throw v1

    .line 431
    :cond_10
    invoke-virtual {p0}, Lcom/google/android/material/slider/BaseSlider;->e()V

    .line 432
    .line 433
    .line 434
    :goto_4
    iget v2, p0, Lcom/google/android/material/slider/BaseSlider;->A0:I

    .line 435
    .line 436
    :goto_5
    iget-object v3, p0, Lcom/google/android/material/slider/BaseSlider;->u0:Ljava/util/ArrayList;

    .line 437
    .line 438
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 439
    .line 440
    .line 441
    move-result v3

    .line 442
    if-ge v11, v3, :cond_14

    .line 443
    .line 444
    iget-object v3, p0, Lcom/google/android/material/slider/BaseSlider;->u0:Ljava/util/ArrayList;

    .line 445
    .line 446
    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object v3

    .line 450
    check-cast v3, Ljava/lang/Float;

    .line 451
    .line 452
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    .line 453
    .line 454
    .line 455
    move-result v4

    .line 456
    iget-object v5, p0, Lcom/google/android/material/slider/BaseSlider;->J0:Landroid/graphics/drawable/Drawable;

    .line 457
    .line 458
    if-eqz v5, :cond_11

    .line 459
    .line 460
    move-object v0, p0

    .line 461
    move-object v1, p1

    .line 462
    move v3, v7

    .line 463
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/material/slider/BaseSlider;->d(Landroid/graphics/Canvas;IIFLandroid/graphics/drawable/Drawable;)V

    .line 464
    .line 465
    .line 466
    goto :goto_6

    .line 467
    :cond_11
    move v3, v7

    .line 468
    iget-object v1, p0, Lcom/google/android/material/slider/BaseSlider;->K0:Ljava/util/List;

    .line 469
    .line 470
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 471
    .line 472
    .line 473
    move-result v1

    .line 474
    if-ge v11, v1, :cond_12

    .line 475
    .line 476
    iget-object v1, p0, Lcom/google/android/material/slider/BaseSlider;->K0:Ljava/util/List;

    .line 477
    .line 478
    invoke-interface {v1, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    move-result-object v1

    .line 482
    move-object v5, v1

    .line 483
    check-cast v5, Landroid/graphics/drawable/Drawable;

    .line 484
    .line 485
    move-object v0, p0

    .line 486
    move-object v1, p1

    .line 487
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/material/slider/BaseSlider;->d(Landroid/graphics/Canvas;IIFLandroid/graphics/drawable/Drawable;)V

    .line 488
    .line 489
    .line 490
    goto :goto_6

    .line 491
    :cond_12
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 492
    .line 493
    .line 494
    move-result v5

    .line 495
    if-nez v5, :cond_13

    .line 496
    .line 497
    iget v5, p0, Lcom/google/android/material/slider/BaseSlider;->k0:I

    .line 498
    .line 499
    int-to-float v5, v5

    .line 500
    invoke-virtual {p0, v4}, Lcom/google/android/material/slider/BaseSlider;->o(F)F

    .line 501
    .line 502
    .line 503
    move-result v6

    .line 504
    int-to-float v7, v2

    .line 505
    mul-float/2addr v6, v7

    .line 506
    add-float/2addr v6, v5

    .line 507
    int-to-float v5, v3

    .line 508
    iget v7, p0, Lcom/google/android/material/slider/BaseSlider;->m0:I

    .line 509
    .line 510
    int-to-float v7, v7

    .line 511
    iget-object v8, p0, Lcom/google/android/material/slider/BaseSlider;->c:Landroid/graphics/Paint;

    .line 512
    .line 513
    invoke-virtual {p1, v6, v5, v7, v8}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 514
    .line 515
    .line 516
    :cond_13
    iget-object v5, p0, Lcom/google/android/material/slider/BaseSlider;->I0:Lfd1;

    .line 517
    .line 518
    move-object v0, p0

    .line 519
    move-object v1, p1

    .line 520
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/material/slider/BaseSlider;->d(Landroid/graphics/Canvas;IIFLandroid/graphics/drawable/Drawable;)V

    .line 521
    .line 522
    .line 523
    :goto_6
    add-int/lit8 v11, v11, 0x1

    .line 524
    .line 525
    move v7, v3

    .line 526
    goto :goto_5

    .line 527
    :cond_14
    return-void
.end method

.method public final onFocusChanged(ZILandroid/graphics/Rect;)V
    .locals 2

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroid/view/View;->onFocusChanged(ZILandroid/graphics/Rect;)V

    .line 2
    .line 3
    .line 4
    iget-object p3, p0, Lcom/google/android/material/slider/BaseSlider;->i:Lcom/google/android/material/slider/e;

    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    const/4 p1, -0x1

    .line 9
    iput p1, p0, Lcom/google/android/material/slider/BaseSlider;->v0:I

    .line 10
    .line 11
    iget p0, p0, Lcom/google/android/material/slider/BaseSlider;->w0:I

    .line 12
    .line 13
    invoke-virtual {p3, p0}, Lsf0;->j(I)Z

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    const/4 p1, 0x1

    .line 18
    const v0, 0x7fffffff

    .line 19
    .line 20
    .line 21
    if-eq p2, p1, :cond_4

    .line 22
    .line 23
    const/4 p1, 0x2

    .line 24
    const/high16 v1, -0x80000000

    .line 25
    .line 26
    if-eq p2, p1, :cond_3

    .line 27
    .line 28
    const/16 p1, 0x11

    .line 29
    .line 30
    if-eq p2, p1, :cond_2

    .line 31
    .line 32
    const/16 p1, 0x42

    .line 33
    .line 34
    if-eq p2, p1, :cond_1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-virtual {p0, v1}, Lcom/google/android/material/slider/BaseSlider;->n(I)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    invoke-virtual {p0, v0}, Lcom/google/android/material/slider/BaseSlider;->n(I)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_3
    invoke-virtual {p0, v1}, Lcom/google/android/material/slider/BaseSlider;->m(I)Z

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_4
    invoke-virtual {p0, v0}, Lcom/google/android/material/slider/BaseSlider;->m(I)Z

    .line 50
    .line 51
    .line 52
    :goto_0
    iget p0, p0, Lcom/google/android/material/slider/BaseSlider;->w0:I

    .line 53
    .line 54
    invoke-virtual {p3, p0}, Lsf0;->w(I)Z

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 13

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-super {p0, p1, p2}, Landroid/view/View;->onKeyDown(ILandroid/view/KeyEvent;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/slider/BaseSlider;->u0:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x0

    .line 19
    const/4 v2, 0x1

    .line 20
    if-ne v0, v2, :cond_1

    .line 21
    .line 22
    iput v1, p0, Lcom/google/android/material/slider/BaseSlider;->v0:I

    .line 23
    .line 24
    :cond_1
    iget v0, p0, Lcom/google/android/material/slider/BaseSlider;->v0:I

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    const/16 v4, 0x46

    .line 28
    .line 29
    const/16 v5, 0x45

    .line 30
    .line 31
    const/16 v6, 0x51

    .line 32
    .line 33
    const/16 v7, 0x42

    .line 34
    .line 35
    const/16 v8, 0x3d

    .line 36
    .line 37
    const/4 v9, -0x1

    .line 38
    if-ne v0, v9, :cond_9

    .line 39
    .line 40
    if-eq p1, v8, :cond_5

    .line 41
    .line 42
    if-eq p1, v7, :cond_4

    .line 43
    .line 44
    if-eq p1, v6, :cond_3

    .line 45
    .line 46
    if-eq p1, v5, :cond_2

    .line 47
    .line 48
    if-eq p1, v4, :cond_3

    .line 49
    .line 50
    packed-switch p1, :pswitch_data_0

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :pswitch_0
    invoke-virtual {p0, v2}, Lcom/google/android/material/slider/BaseSlider;->n(I)V

    .line 55
    .line 56
    .line 57
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :pswitch_1
    invoke-virtual {p0, v9}, Lcom/google/android/material/slider/BaseSlider;->n(I)V

    .line 61
    .line 62
    .line 63
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    invoke-virtual {p0, v9}, Lcom/google/android/material/slider/BaseSlider;->m(I)Z

    .line 67
    .line 68
    .line 69
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_3
    invoke-virtual {p0, v2}, Lcom/google/android/material/slider/BaseSlider;->m(I)Z

    .line 73
    .line 74
    .line 75
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_4
    :pswitch_2
    iget v0, p0, Lcom/google/android/material/slider/BaseSlider;->w0:I

    .line 79
    .line 80
    iput v0, p0, Lcom/google/android/material/slider/BaseSlider;->v0:I

    .line 81
    .line 82
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 83
    .line 84
    .line 85
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_5
    invoke-virtual {p2}, Landroid/view/KeyEvent;->hasNoModifiers()Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-eqz v0, :cond_6

    .line 93
    .line 94
    invoke-virtual {p0, v2}, Lcom/google/android/material/slider/BaseSlider;->m(I)Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    goto :goto_0

    .line 103
    :cond_6
    invoke-virtual {p2}, Landroid/view/KeyEvent;->isShiftPressed()Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-eqz v0, :cond_7

    .line 108
    .line 109
    invoke-virtual {p0, v9}, Lcom/google/android/material/slider/BaseSlider;->m(I)Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    goto :goto_0

    .line 118
    :cond_7
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 119
    .line 120
    :goto_0
    if-eqz v3, :cond_8

    .line 121
    .line 122
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 123
    .line 124
    .line 125
    move-result p0

    .line 126
    return p0

    .line 127
    :cond_8
    invoke-super {p0, p1, p2}, Landroid/view/View;->onKeyDown(ILandroid/view/KeyEvent;)Z

    .line 128
    .line 129
    .line 130
    move-result p0

    .line 131
    return p0

    .line 132
    :cond_9
    iget-boolean v0, p0, Lcom/google/android/material/slider/BaseSlider;->B0:Z

    .line 133
    .line 134
    invoke-virtual {p2}, Landroid/view/KeyEvent;->isLongPress()Z

    .line 135
    .line 136
    .line 137
    move-result v10

    .line 138
    or-int/2addr v0, v10

    .line 139
    iput-boolean v0, p0, Lcom/google/android/material/slider/BaseSlider;->B0:Z

    .line 140
    .line 141
    iget v10, p0, Lcom/google/android/material/slider/BaseSlider;->x0:F

    .line 142
    .line 143
    const/high16 v11, 0x3f800000    # 1.0f

    .line 144
    .line 145
    const/4 v12, 0x0

    .line 146
    if-eqz v0, :cond_c

    .line 147
    .line 148
    cmpl-float v0, v10, v12

    .line 149
    .line 150
    if-nez v0, :cond_a

    .line 151
    .line 152
    move v10, v11

    .line 153
    :cond_a
    iget v0, p0, Lcom/google/android/material/slider/BaseSlider;->t0:F

    .line 154
    .line 155
    iget v11, p0, Lcom/google/android/material/slider/BaseSlider;->s0:F

    .line 156
    .line 157
    sub-float/2addr v0, v11

    .line 158
    div-float/2addr v0, v10

    .line 159
    const/high16 v11, 0x41a00000    # 20.0f

    .line 160
    .line 161
    cmpg-float v12, v0, v11

    .line 162
    .line 163
    if-gtz v12, :cond_b

    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_b
    div-float/2addr v0, v11

    .line 167
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    int-to-float v0, v0

    .line 172
    mul-float/2addr v10, v0

    .line 173
    goto :goto_1

    .line 174
    :cond_c
    cmpl-float v0, v10, v12

    .line 175
    .line 176
    if-nez v0, :cond_d

    .line 177
    .line 178
    move v10, v11

    .line 179
    :cond_d
    :goto_1
    const/16 v0, 0x15

    .line 180
    .line 181
    if-eq p1, v0, :cond_12

    .line 182
    .line 183
    const/16 v0, 0x16

    .line 184
    .line 185
    if-eq p1, v0, :cond_10

    .line 186
    .line 187
    if-eq p1, v5, :cond_f

    .line 188
    .line 189
    if-eq p1, v4, :cond_e

    .line 190
    .line 191
    if-eq p1, v6, :cond_e

    .line 192
    .line 193
    goto :goto_3

    .line 194
    :cond_e
    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 195
    .line 196
    .line 197
    move-result-object v3

    .line 198
    goto :goto_3

    .line 199
    :cond_f
    neg-float v0, v10

    .line 200
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 201
    .line 202
    .line 203
    move-result-object v3

    .line 204
    goto :goto_3

    .line 205
    :cond_10
    invoke-virtual {p0}, Lcom/google/android/material/slider/BaseSlider;->k()Z

    .line 206
    .line 207
    .line 208
    move-result v0

    .line 209
    if-eqz v0, :cond_11

    .line 210
    .line 211
    neg-float v10, v10

    .line 212
    :cond_11
    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 213
    .line 214
    .line 215
    move-result-object v3

    .line 216
    goto :goto_3

    .line 217
    :cond_12
    invoke-virtual {p0}, Lcom/google/android/material/slider/BaseSlider;->k()Z

    .line 218
    .line 219
    .line 220
    move-result v0

    .line 221
    if-eqz v0, :cond_13

    .line 222
    .line 223
    goto :goto_2

    .line 224
    :cond_13
    neg-float v10, v10

    .line 225
    :goto_2
    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 226
    .line 227
    .line 228
    move-result-object v3

    .line 229
    :goto_3
    if-eqz v3, :cond_15

    .line 230
    .line 231
    iget-object p1, p0, Lcom/google/android/material/slider/BaseSlider;->u0:Ljava/util/ArrayList;

    .line 232
    .line 233
    iget p2, p0, Lcom/google/android/material/slider/BaseSlider;->v0:I

    .line 234
    .line 235
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    check-cast p1, Ljava/lang/Float;

    .line 240
    .line 241
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 242
    .line 243
    .line 244
    move-result p1

    .line 245
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    .line 246
    .line 247
    .line 248
    move-result p2

    .line 249
    add-float/2addr p2, p1

    .line 250
    iget p1, p0, Lcom/google/android/material/slider/BaseSlider;->v0:I

    .line 251
    .line 252
    invoke-virtual {p0, p2, p1}, Lcom/google/android/material/slider/BaseSlider;->t(FI)Z

    .line 253
    .line 254
    .line 255
    move-result p1

    .line 256
    if-eqz p1, :cond_14

    .line 257
    .line 258
    invoke-virtual {p0}, Lcom/google/android/material/slider/BaseSlider;->w()V

    .line 259
    .line 260
    .line 261
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 262
    .line 263
    .line 264
    :cond_14
    return v2

    .line 265
    :cond_15
    const/16 v0, 0x17

    .line 266
    .line 267
    if-eq p1, v0, :cond_19

    .line 268
    .line 269
    if-eq p1, v8, :cond_16

    .line 270
    .line 271
    if-eq p1, v7, :cond_19

    .line 272
    .line 273
    invoke-super {p0, p1, p2}, Landroid/view/View;->onKeyDown(ILandroid/view/KeyEvent;)Z

    .line 274
    .line 275
    .line 276
    move-result p0

    .line 277
    return p0

    .line 278
    :cond_16
    invoke-virtual {p2}, Landroid/view/KeyEvent;->hasNoModifiers()Z

    .line 279
    .line 280
    .line 281
    move-result p1

    .line 282
    if-eqz p1, :cond_17

    .line 283
    .line 284
    invoke-virtual {p0, v2}, Lcom/google/android/material/slider/BaseSlider;->m(I)Z

    .line 285
    .line 286
    .line 287
    move-result p0

    .line 288
    return p0

    .line 289
    :cond_17
    invoke-virtual {p2}, Landroid/view/KeyEvent;->isShiftPressed()Z

    .line 290
    .line 291
    .line 292
    move-result p1

    .line 293
    if-eqz p1, :cond_18

    .line 294
    .line 295
    invoke-virtual {p0, v9}, Lcom/google/android/material/slider/BaseSlider;->m(I)Z

    .line 296
    .line 297
    .line 298
    move-result p0

    .line 299
    return p0

    .line 300
    :cond_18
    return v1

    .line 301
    :cond_19
    iput v9, p0, Lcom/google/android/material/slider/BaseSlider;->v0:I

    .line 302
    .line 303
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 304
    .line 305
    .line 306
    return v2

    .line 307
    :pswitch_data_0
    .packed-switch 0x15
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method public onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/google/android/material/slider/BaseSlider;->B0:Z

    .line 3
    .line 4
    invoke-super {p0, p1, p2}, Landroid/view/View;->onKeyUp(ILandroid/view/KeyEvent;)Z

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    return p0
.end method

.method public final onMeasure(II)V
    .locals 2

    .line 1
    iget p2, p0, Lcom/google/android/material/slider/BaseSlider;->i0:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const/4 v1, 0x0

    .line 5
    if-eq p2, v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x3

    .line 8
    if-ne p2, v0, :cond_1

    .line 9
    .line 10
    :cond_0
    iget-object p2, p0, Lcom/google/android/material/slider/BaseSlider;->V:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    check-cast p2, Ldq2;

    .line 17
    .line 18
    invoke-virtual {p2}, Ldq2;->getIntrinsicHeight()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    :cond_1
    iget p2, p0, Lcom/google/android/material/slider/BaseSlider;->h0:I

    .line 23
    .line 24
    add-int/2addr p2, v1

    .line 25
    const/high16 v0, 0x40000000    # 2.0f

    .line 26
    .line 27
    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    check-cast p1, Lcom/google/android/material/slider/BaseSlider$SliderState;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/AbsSavedState;->getSuperState()Landroid/os/Parcelable;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-super {p0, v0}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 8
    .line 9
    .line 10
    iget v0, p1, Lcom/google/android/material/slider/BaseSlider$SliderState;->a:F

    .line 11
    .line 12
    iput v0, p0, Lcom/google/android/material/slider/BaseSlider;->s0:F

    .line 13
    .line 14
    iget v0, p1, Lcom/google/android/material/slider/BaseSlider$SliderState;->b:F

    .line 15
    .line 16
    iput v0, p0, Lcom/google/android/material/slider/BaseSlider;->t0:F

    .line 17
    .line 18
    iget-object v0, p1, Lcom/google/android/material/slider/BaseSlider$SliderState;->c:Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Lcom/google/android/material/slider/BaseSlider;->s(Ljava/util/ArrayList;)V

    .line 21
    .line 22
    .line 23
    iget v0, p1, Lcom/google/android/material/slider/BaseSlider$SliderState;->d:F

    .line 24
    .line 25
    iput v0, p0, Lcom/google/android/material/slider/BaseSlider;->x0:F

    .line 26
    .line 27
    iget-boolean p1, p1, Lcom/google/android/material/slider/BaseSlider$SliderState;->e:Z

    .line 28
    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 32
    .line 33
    .line 34
    :cond_0
    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/google/android/material/slider/BaseSlider$SliderState;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcelable;)V

    .line 8
    .line 9
    .line 10
    iget v0, p0, Lcom/google/android/material/slider/BaseSlider;->s0:F

    .line 11
    .line 12
    iput v0, v1, Lcom/google/android/material/slider/BaseSlider$SliderState;->a:F

    .line 13
    .line 14
    iget v0, p0, Lcom/google/android/material/slider/BaseSlider;->t0:F

    .line 15
    .line 16
    iput v0, v1, Lcom/google/android/material/slider/BaseSlider$SliderState;->b:F

    .line 17
    .line 18
    new-instance v0, Ljava/util/ArrayList;

    .line 19
    .line 20
    iget-object v2, p0, Lcom/google/android/material/slider/BaseSlider;->u0:Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 23
    .line 24
    .line 25
    iput-object v0, v1, Lcom/google/android/material/slider/BaseSlider$SliderState;->c:Ljava/util/ArrayList;

    .line 26
    .line 27
    iget v0, p0, Lcom/google/android/material/slider/BaseSlider;->x0:F

    .line 28
    .line 29
    iput v0, v1, Lcom/google/android/material/slider/BaseSlider$SliderState;->d:F

    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/view/View;->hasFocus()Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    iput-boolean p0, v1, Lcom/google/android/material/slider/BaseSlider$SliderState;->e:Z

    .line 36
    .line 37
    return-object v1
.end method

.method public final onSizeChanged(IIII)V
    .locals 0

    .line 1
    iget p2, p0, Lcom/google/android/material/slider/BaseSlider;->k0:I

    .line 2
    .line 3
    mul-int/lit8 p2, p2, 0x2

    .line 4
    .line 5
    sub-int/2addr p1, p2

    .line 6
    const/4 p2, 0x0

    .line 7
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iput p1, p0, Lcom/google/android/material/slider/BaseSlider;->A0:I

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/google/android/material/slider/BaseSlider;->l()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/google/android/material/slider/BaseSlider;->w()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget v2, p0, Lcom/google/android/material/slider/BaseSlider;->k0:I

    .line 14
    .line 15
    int-to-float v2, v2

    .line 16
    sub-float v2, v0, v2

    .line 17
    .line 18
    iget v3, p0, Lcom/google/android/material/slider/BaseSlider;->A0:I

    .line 19
    .line 20
    int-to-float v3, v3

    .line 21
    div-float/2addr v2, v3

    .line 22
    iput v2, p0, Lcom/google/android/material/slider/BaseSlider;->L0:F

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    invoke-static {v3, v2}, Ljava/lang/Math;->max(FF)F

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    iput v2, p0, Lcom/google/android/material/slider/BaseSlider;->L0:F

    .line 30
    .line 31
    const/high16 v3, 0x3f800000    # 1.0f

    .line 32
    .line 33
    invoke-static {v3, v2}, Ljava/lang/Math;->min(FF)F

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    iput v2, p0, Lcom/google/android/material/slider/BaseSlider;->L0:F

    .line 38
    .line 39
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    const/4 v3, 0x1

    .line 44
    if-eqz v2, :cond_9

    .line 45
    .line 46
    iget v4, p0, Lcom/google/android/material/slider/BaseSlider;->e0:I

    .line 47
    .line 48
    if-eq v2, v3, :cond_5

    .line 49
    .line 50
    const/4 v5, 0x2

    .line 51
    if-eq v2, v5, :cond_1

    .line 52
    .line 53
    goto/16 :goto_2

    .line 54
    .line 55
    :cond_1
    iget-boolean v2, p0, Lcom/google/android/material/slider/BaseSlider;->r0:Z

    .line 56
    .line 57
    if-nez v2, :cond_3

    .line 58
    .line 59
    invoke-virtual {p0}, Lcom/google/android/material/slider/BaseSlider;->i()Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_2

    .line 64
    .line 65
    iget v2, p0, Lcom/google/android/material/slider/BaseSlider;->p0:F

    .line 66
    .line 67
    sub-float/2addr v0, v2

    .line 68
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    int-to-float v2, v4

    .line 73
    cmpg-float v0, v0, v2

    .line 74
    .line 75
    if-gez v0, :cond_2

    .line 76
    .line 77
    :goto_0
    return v1

    .line 78
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-interface {v0, v3}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, Lcom/google/android/material/slider/BaseSlider;->p()V

    .line 86
    .line 87
    .line 88
    :cond_3
    invoke-virtual {p0}, Lcom/google/android/material/slider/BaseSlider;->q()Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-nez v0, :cond_4

    .line 93
    .line 94
    goto/16 :goto_2

    .line 95
    .line 96
    :cond_4
    iput-boolean v3, p0, Lcom/google/android/material/slider/BaseSlider;->r0:Z

    .line 97
    .line 98
    invoke-virtual {p0}, Lcom/google/android/material/slider/BaseSlider;->u()V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0}, Lcom/google/android/material/slider/BaseSlider;->w()V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 105
    .line 106
    .line 107
    goto/16 :goto_2

    .line 108
    .line 109
    :cond_5
    iput-boolean v1, p0, Lcom/google/android/material/slider/BaseSlider;->r0:Z

    .line 110
    .line 111
    iget-object v0, p0, Lcom/google/android/material/slider/BaseSlider;->q0:Landroid/view/MotionEvent;

    .line 112
    .line 113
    if-eqz v0, :cond_6

    .line 114
    .line 115
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    if-nez v0, :cond_6

    .line 120
    .line 121
    iget-object v0, p0, Lcom/google/android/material/slider/BaseSlider;->q0:Landroid/view/MotionEvent;

    .line 122
    .line 123
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getX()F

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    sub-float/2addr v0, v1

    .line 132
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    int-to-float v1, v4

    .line 137
    cmpg-float v0, v0, v1

    .line 138
    .line 139
    if-gtz v0, :cond_6

    .line 140
    .line 141
    iget-object v0, p0, Lcom/google/android/material/slider/BaseSlider;->q0:Landroid/view/MotionEvent;

    .line 142
    .line 143
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getY()F

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    sub-float/2addr v0, v2

    .line 152
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    cmpg-float v0, v0, v1

    .line 157
    .line 158
    if-gtz v0, :cond_6

    .line 159
    .line 160
    invoke-virtual {p0}, Lcom/google/android/material/slider/BaseSlider;->q()Z

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    if-eqz v0, :cond_6

    .line 165
    .line 166
    invoke-virtual {p0}, Lcom/google/android/material/slider/BaseSlider;->p()V

    .line 167
    .line 168
    .line 169
    :cond_6
    iget v0, p0, Lcom/google/android/material/slider/BaseSlider;->v0:I

    .line 170
    .line 171
    const/4 v1, -0x1

    .line 172
    if-eq v0, v1, :cond_8

    .line 173
    .line 174
    invoke-virtual {p0}, Lcom/google/android/material/slider/BaseSlider;->u()V

    .line 175
    .line 176
    .line 177
    iput v1, p0, Lcom/google/android/material/slider/BaseSlider;->v0:I

    .line 178
    .line 179
    iget-object v0, p0, Lcom/google/android/material/slider/BaseSlider;->a0:Ljava/util/ArrayList;

    .line 180
    .line 181
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 186
    .line 187
    .line 188
    move-result v1

    .line 189
    if-nez v1, :cond_7

    .line 190
    .line 191
    goto :goto_1

    .line 192
    :cond_7
    invoke-static {v0}, Lfm0;->f(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    throw p0

    .line 197
    :cond_8
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 198
    .line 199
    .line 200
    goto :goto_2

    .line 201
    :cond_9
    iput v0, p0, Lcom/google/android/material/slider/BaseSlider;->p0:F

    .line 202
    .line 203
    invoke-virtual {p0}, Lcom/google/android/material/slider/BaseSlider;->i()Z

    .line 204
    .line 205
    .line 206
    move-result v0

    .line 207
    if-eqz v0, :cond_a

    .line 208
    .line 209
    goto :goto_2

    .line 210
    :cond_a
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    invoke-interface {v0, v3}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {p0}, Lcom/google/android/material/slider/BaseSlider;->q()Z

    .line 218
    .line 219
    .line 220
    move-result v0

    .line 221
    if-nez v0, :cond_b

    .line 222
    .line 223
    goto :goto_2

    .line 224
    :cond_b
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 225
    .line 226
    .line 227
    iput-boolean v3, p0, Lcom/google/android/material/slider/BaseSlider;->r0:Z

    .line 228
    .line 229
    invoke-virtual {p0}, Lcom/google/android/material/slider/BaseSlider;->u()V

    .line 230
    .line 231
    .line 232
    invoke-virtual {p0}, Lcom/google/android/material/slider/BaseSlider;->w()V

    .line 233
    .line 234
    .line 235
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 236
    .line 237
    .line 238
    invoke-virtual {p0}, Lcom/google/android/material/slider/BaseSlider;->p()V

    .line 239
    .line 240
    .line 241
    :goto_2
    iget-boolean v0, p0, Lcom/google/android/material/slider/BaseSlider;->r0:Z

    .line 242
    .line 243
    invoke-virtual {p0, v0}, Landroid/view/View;->setPressed(Z)V

    .line 244
    .line 245
    .line 246
    invoke-static {p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    .line 247
    .line 248
    .line 249
    move-result-object p1

    .line 250
    iput-object p1, p0, Lcom/google/android/material/slider/BaseSlider;->q0:Landroid/view/MotionEvent;

    .line 251
    .line 252
    return v3
.end method

.method public final p()V
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/google/android/material/slider/BaseSlider;->a0:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-static {p0}, Lfm0;->f(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    throw p0
.end method

.method public q()Z
    .locals 11

    .line 1
    iget v0, p0, Lcom/google/android/material/slider/BaseSlider;->v0:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, -0x1

    .line 5
    if-eq v0, v2, :cond_0

    .line 6
    .line 7
    goto/16 :goto_5

    .line 8
    .line 9
    :cond_0
    iget v0, p0, Lcom/google/android/material/slider/BaseSlider;->L0:F

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/google/android/material/slider/BaseSlider;->k()Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-eqz v3, :cond_1

    .line 16
    .line 17
    const/high16 v3, 0x3f800000    # 1.0f

    .line 18
    .line 19
    sub-float v0, v3, v0

    .line 20
    .line 21
    :cond_1
    iget v3, p0, Lcom/google/android/material/slider/BaseSlider;->t0:F

    .line 22
    .line 23
    iget v4, p0, Lcom/google/android/material/slider/BaseSlider;->s0:F

    .line 24
    .line 25
    invoke-static {v3, v4, v0, v4}, Len;->g(FFFF)F

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-virtual {p0, v0}, Lcom/google/android/material/slider/BaseSlider;->o(F)F

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    iget v4, p0, Lcom/google/android/material/slider/BaseSlider;->A0:I

    .line 34
    .line 35
    int-to-float v4, v4

    .line 36
    mul-float/2addr v3, v4

    .line 37
    iget v4, p0, Lcom/google/android/material/slider/BaseSlider;->k0:I

    .line 38
    .line 39
    int-to-float v4, v4

    .line 40
    add-float/2addr v3, v4

    .line 41
    const/4 v4, 0x0

    .line 42
    iput v4, p0, Lcom/google/android/material/slider/BaseSlider;->v0:I

    .line 43
    .line 44
    iget-object v5, p0, Lcom/google/android/material/slider/BaseSlider;->u0:Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    check-cast v5, Ljava/lang/Float;

    .line 51
    .line 52
    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    sub-float/2addr v5, v0

    .line 57
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    move v6, v1

    .line 62
    :goto_0
    iget-object v7, p0, Lcom/google/android/material/slider/BaseSlider;->u0:Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 65
    .line 66
    .line 67
    move-result v7

    .line 68
    if-ge v6, v7, :cond_8

    .line 69
    .line 70
    iget-object v7, p0, Lcom/google/android/material/slider/BaseSlider;->u0:Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    check-cast v7, Ljava/lang/Float;

    .line 77
    .line 78
    invoke-virtual {v7}, Ljava/lang/Float;->floatValue()F

    .line 79
    .line 80
    .line 81
    move-result v7

    .line 82
    sub-float/2addr v7, v0

    .line 83
    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    .line 84
    .line 85
    .line 86
    move-result v7

    .line 87
    iget-object v8, p0, Lcom/google/android/material/slider/BaseSlider;->u0:Ljava/util/ArrayList;

    .line 88
    .line 89
    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v8

    .line 93
    check-cast v8, Ljava/lang/Float;

    .line 94
    .line 95
    invoke-virtual {v8}, Ljava/lang/Float;->floatValue()F

    .line 96
    .line 97
    .line 98
    move-result v8

    .line 99
    invoke-virtual {p0, v8}, Lcom/google/android/material/slider/BaseSlider;->o(F)F

    .line 100
    .line 101
    .line 102
    move-result v8

    .line 103
    iget v9, p0, Lcom/google/android/material/slider/BaseSlider;->A0:I

    .line 104
    .line 105
    int-to-float v9, v9

    .line 106
    mul-float/2addr v8, v9

    .line 107
    iget v9, p0, Lcom/google/android/material/slider/BaseSlider;->k0:I

    .line 108
    .line 109
    int-to-float v9, v9

    .line 110
    add-float/2addr v8, v9

    .line 111
    invoke-static {v7, v5}, Ljava/lang/Float;->compare(FF)I

    .line 112
    .line 113
    .line 114
    move-result v9

    .line 115
    if-le v9, v1, :cond_2

    .line 116
    .line 117
    goto :goto_4

    .line 118
    :cond_2
    invoke-virtual {p0}, Lcom/google/android/material/slider/BaseSlider;->k()Z

    .line 119
    .line 120
    .line 121
    move-result v9

    .line 122
    const/4 v10, 0x0

    .line 123
    if-eqz v9, :cond_4

    .line 124
    .line 125
    sub-float v9, v8, v3

    .line 126
    .line 127
    cmpl-float v9, v9, v10

    .line 128
    .line 129
    if-lez v9, :cond_3

    .line 130
    .line 131
    :goto_1
    move v9, v1

    .line 132
    goto :goto_2

    .line 133
    :cond_3
    move v9, v4

    .line 134
    goto :goto_2

    .line 135
    :cond_4
    sub-float v9, v8, v3

    .line 136
    .line 137
    cmpg-float v9, v9, v10

    .line 138
    .line 139
    if-gez v9, :cond_3

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :goto_2
    invoke-static {v7, v5}, Ljava/lang/Float;->compare(FF)I

    .line 143
    .line 144
    .line 145
    move-result v10

    .line 146
    if-gez v10, :cond_5

    .line 147
    .line 148
    iput v6, p0, Lcom/google/android/material/slider/BaseSlider;->v0:I

    .line 149
    .line 150
    goto :goto_3

    .line 151
    :cond_5
    invoke-static {v7, v5}, Ljava/lang/Float;->compare(FF)I

    .line 152
    .line 153
    .line 154
    move-result v10

    .line 155
    if-nez v10, :cond_7

    .line 156
    .line 157
    sub-float/2addr v8, v3

    .line 158
    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    .line 159
    .line 160
    .line 161
    move-result v8

    .line 162
    iget v10, p0, Lcom/google/android/material/slider/BaseSlider;->e0:I

    .line 163
    .line 164
    int-to-float v10, v10

    .line 165
    cmpg-float v8, v8, v10

    .line 166
    .line 167
    if-gez v8, :cond_6

    .line 168
    .line 169
    iput v2, p0, Lcom/google/android/material/slider/BaseSlider;->v0:I

    .line 170
    .line 171
    return v4

    .line 172
    :cond_6
    if-eqz v9, :cond_7

    .line 173
    .line 174
    iput v6, p0, Lcom/google/android/material/slider/BaseSlider;->v0:I

    .line 175
    .line 176
    :goto_3
    move v5, v7

    .line 177
    :cond_7
    add-int/lit8 v6, v6, 0x1

    .line 178
    .line 179
    goto :goto_0

    .line 180
    :cond_8
    :goto_4
    iget p0, p0, Lcom/google/android/material/slider/BaseSlider;->v0:I

    .line 181
    .line 182
    if-eq p0, v2, :cond_9

    .line 183
    .line 184
    :goto_5
    return v1

    .line 185
    :cond_9
    return v4
.end method

.method public final r(Ldq2;F)V
    .locals 3

    .line 1
    invoke-virtual {p0, p2}, Lcom/google/android/material/slider/BaseSlider;->f(F)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p1, Ldq2;->i0:Ljava/lang/CharSequence;

    .line 6
    .line 7
    invoke-static {v1, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    iput-object v0, p1, Ldq2;->i0:Ljava/lang/CharSequence;

    .line 14
    .line 15
    iget-object v0, p1, Ldq2;->l0:Lgn2;

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    iput-boolean v1, v0, Lgn2;->d:Z

    .line 19
    .line 20
    invoke-virtual {p1}, Lfd1;->invalidateSelf()V

    .line 21
    .line 22
    .line 23
    :cond_0
    iget v0, p0, Lcom/google/android/material/slider/BaseSlider;->k0:I

    .line 24
    .line 25
    invoke-virtual {p0, p2}, Lcom/google/android/material/slider/BaseSlider;->o(F)F

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    iget v1, p0, Lcom/google/android/material/slider/BaseSlider;->A0:I

    .line 30
    .line 31
    int-to-float v1, v1

    .line 32
    mul-float/2addr p2, v1

    .line 33
    float-to-int p2, p2

    .line 34
    add-int/2addr v0, p2

    .line 35
    invoke-virtual {p1}, Ldq2;->getIntrinsicWidth()I

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    div-int/lit8 p2, p2, 0x2

    .line 40
    .line 41
    sub-int/2addr v0, p2

    .line 42
    invoke-virtual {p0}, Lcom/google/android/material/slider/BaseSlider;->b()I

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    iget v1, p0, Lcom/google/android/material/slider/BaseSlider;->o0:I

    .line 47
    .line 48
    iget v2, p0, Lcom/google/android/material/slider/BaseSlider;->m0:I

    .line 49
    .line 50
    add-int/2addr v1, v2

    .line 51
    sub-int/2addr p2, v1

    .line 52
    invoke-virtual {p1}, Ldq2;->getIntrinsicHeight()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    sub-int v1, p2, v1

    .line 57
    .line 58
    invoke-virtual {p1}, Ldq2;->getIntrinsicWidth()I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    add-int/2addr v2, v0

    .line 63
    invoke-virtual {p1, v0, v1, v2, p2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 64
    .line 65
    .line 66
    new-instance p2, Landroid/graphics/Rect;

    .line 67
    .line 68
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-direct {p2, v0}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    .line 73
    .line 74
    .line 75
    invoke-static {p0}, Lkb1;->G(Landroid/view/View;)Landroid/view/ViewGroup;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-static {v0, p0, p2}, Lw70;->c(Landroid/view/ViewGroup;Landroid/view/View;Landroid/graphics/Rect;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1, p2}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 83
    .line 84
    .line 85
    invoke-static {p0}, Lkb1;->G(Landroid/view/View;)Landroid/view/ViewGroup;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    if-nez p0, :cond_1

    .line 90
    .line 91
    const/4 p0, 0x0

    .line 92
    goto :goto_0

    .line 93
    :cond_1
    new-instance p2, Lfs0;

    .line 94
    .line 95
    invoke-direct {p2, p0}, Lfs0;-><init>(Landroid/view/ViewGroup;)V

    .line 96
    .line 97
    .line 98
    move-object p0, p2

    .line 99
    :goto_0
    iget-object p0, p0, Lfs0;->b:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast p0, Landroid/view/ViewOverlay;

    .line 102
    .line 103
    invoke-virtual {p0, p1}, Landroid/view/ViewOverlay;->add(Landroid/graphics/drawable/Drawable;)V

    .line 104
    .line 105
    .line 106
    return-void
.end method

.method public final s(Ljava/util/ArrayList;)V
    .locals 13

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_10

    .line 6
    .line 7
    invoke-static {p1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/google/android/material/slider/BaseSlider;->u0:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-ne v0, v1, :cond_0

    .line 21
    .line 22
    iget-object v0, p0, Lcom/google/android/material/slider/BaseSlider;->u0:Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    iput-object p1, p0, Lcom/google/android/material/slider/BaseSlider;->u0:Ljava/util/ArrayList;

    .line 32
    .line 33
    const/4 p1, 0x1

    .line 34
    iput-boolean p1, p0, Lcom/google/android/material/slider/BaseSlider;->C0:Z

    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    iput v0, p0, Lcom/google/android/material/slider/BaseSlider;->w0:I

    .line 38
    .line 39
    invoke-virtual {p0}, Lcom/google/android/material/slider/BaseSlider;->w()V

    .line 40
    .line 41
    .line 42
    iget-object v1, p0, Lcom/google/android/material/slider/BaseSlider;->V:Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    iget-object v3, p0, Lcom/google/android/material/slider/BaseSlider;->u0:Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    const/4 v4, 0x0

    .line 55
    if-le v2, v3, :cond_5

    .line 56
    .line 57
    iget-object v2, p0, Lcom/google/android/material/slider/BaseSlider;->u0:Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    invoke-virtual {v1, v2, v3}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    if-eqz v5, :cond_4

    .line 80
    .line 81
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    check-cast v5, Ldq2;

    .line 86
    .line 87
    sget-object v6, Le33;->a:Ljava/util/WeakHashMap;

    .line 88
    .line 89
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 90
    .line 91
    .line 92
    move-result v6

    .line 93
    if-eqz v6, :cond_1

    .line 94
    .line 95
    invoke-static {p0}, Lkb1;->G(Landroid/view/View;)Landroid/view/ViewGroup;

    .line 96
    .line 97
    .line 98
    move-result-object v6

    .line 99
    if-nez v6, :cond_2

    .line 100
    .line 101
    move-object v7, v4

    .line 102
    goto :goto_1

    .line 103
    :cond_2
    new-instance v7, Lfs0;

    .line 104
    .line 105
    invoke-direct {v7, v6}, Lfs0;-><init>(Landroid/view/ViewGroup;)V

    .line 106
    .line 107
    .line 108
    :goto_1
    if-eqz v7, :cond_1

    .line 109
    .line 110
    iget-object v6, v7, Lfs0;->b:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v6, Landroid/view/ViewOverlay;

    .line 113
    .line 114
    invoke-virtual {v6, v5}, Landroid/view/ViewOverlay;->remove(Landroid/graphics/drawable/Drawable;)V

    .line 115
    .line 116
    .line 117
    invoke-static {p0}, Lkb1;->G(Landroid/view/View;)Landroid/view/ViewGroup;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    if-nez v6, :cond_3

    .line 122
    .line 123
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_3
    iget-object v5, v5, Ldq2;->m0:Lmp0;

    .line 128
    .line 129
    invoke-virtual {v6, v5}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 130
    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_4
    invoke-interface {v2}, Ljava/util/List;->clear()V

    .line 134
    .line 135
    .line 136
    :cond_5
    :goto_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    iget-object v3, p0, Lcom/google/android/material/slider/BaseSlider;->u0:Ljava/util/ArrayList;

    .line 141
    .line 142
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 143
    .line 144
    .line 145
    move-result v3

    .line 146
    if-ge v2, v3, :cond_a

    .line 147
    .line 148
    iget-object v2, p0, Lcom/google/android/material/slider/BaseSlider;->U:Lcom/google/android/material/slider/a;

    .line 149
    .line 150
    iget-object v3, v2, Lcom/google/android/material/slider/a;->c:Lcom/google/android/material/slider/BaseSlider;

    .line 151
    .line 152
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 153
    .line 154
    .line 155
    move-result-object v5

    .line 156
    iget-object v6, v2, Lcom/google/android/material/slider/a;->a:Landroid/util/AttributeSet;

    .line 157
    .line 158
    sget-object v7, Lcom/google/android/material/R$styleable;->Slider:[I

    .line 159
    .line 160
    iget v8, v2, Lcom/google/android/material/slider/a;->b:I

    .line 161
    .line 162
    sget v9, Lcom/google/android/material/slider/BaseSlider;->N0:I

    .line 163
    .line 164
    new-array v10, v0, [I

    .line 165
    .line 166
    invoke-static/range {v5 .. v10}, Lrn2;->d(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Landroid/content/res/TypedArray;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    sget v5, Lcom/google/android/material/R$styleable;->Slider_labelStyle:I

    .line 175
    .line 176
    sget v6, Lcom/google/android/material/R$style;->Widget_MaterialComponents_Tooltip:I

    .line 177
    .line 178
    invoke-virtual {v2, v5, v6}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 179
    .line 180
    .line 181
    move-result v11

    .line 182
    new-instance v5, Ldq2;

    .line 183
    .line 184
    invoke-direct {v5, v3, v11}, Ldq2;-><init>(Landroid/content/Context;I)V

    .line 185
    .line 186
    .line 187
    sget-object v9, Lcom/google/android/material/R$styleable;->Tooltip:[I

    .line 188
    .line 189
    new-array v12, v0, [I

    .line 190
    .line 191
    iget-object v7, v5, Ldq2;->j0:Landroid/content/Context;

    .line 192
    .line 193
    const/4 v8, 0x0

    .line 194
    const/4 v10, 0x0

    .line 195
    invoke-static/range {v7 .. v12}, Lrn2;->d(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Landroid/content/res/TypedArray;

    .line 196
    .line 197
    .line 198
    move-result-object v3

    .line 199
    iget-object v6, v5, Ldq2;->j0:Landroid/content/Context;

    .line 200
    .line 201
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 202
    .line 203
    .line 204
    move-result-object v7

    .line 205
    sget v8, Lcom/google/android/material/R$dimen;->mtrl_tooltip_arrowSize:I

    .line 206
    .line 207
    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 208
    .line 209
    .line 210
    move-result v7

    .line 211
    iput v7, v5, Ldq2;->s0:I

    .line 212
    .line 213
    iget-object v7, v5, Lfd1;->a:Led1;

    .line 214
    .line 215
    iget-object v7, v7, Led1;->a:Ltc2;

    .line 216
    .line 217
    invoke-virtual {v7}, Ltc2;->f()Lsc2;

    .line 218
    .line 219
    .line 220
    move-result-object v7

    .line 221
    invoke-virtual {v5}, Ldq2;->x()Lgp1;

    .line 222
    .line 223
    .line 224
    move-result-object v8

    .line 225
    iput-object v8, v7, Lsc2;->k:Ldc0;

    .line 226
    .line 227
    invoke-virtual {v7}, Lsc2;->a()Ltc2;

    .line 228
    .line 229
    .line 230
    move-result-object v7

    .line 231
    invoke-virtual {v5, v7}, Lfd1;->setShapeAppearanceModel(Ltc2;)V

    .line 232
    .line 233
    .line 234
    sget v7, Lcom/google/android/material/R$styleable;->Tooltip_android_text:I

    .line 235
    .line 236
    invoke-virtual {v3, v7}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    .line 237
    .line 238
    .line 239
    move-result-object v7

    .line 240
    iget-object v8, v5, Ldq2;->i0:Ljava/lang/CharSequence;

    .line 241
    .line 242
    invoke-static {v8, v7}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 243
    .line 244
    .line 245
    move-result v8

    .line 246
    iget-object v9, v5, Ldq2;->l0:Lgn2;

    .line 247
    .line 248
    if-nez v8, :cond_6

    .line 249
    .line 250
    iput-object v7, v5, Ldq2;->i0:Ljava/lang/CharSequence;

    .line 251
    .line 252
    iput-boolean p1, v9, Lgn2;->d:Z

    .line 253
    .line 254
    invoke-virtual {v5}, Lfd1;->invalidateSelf()V

    .line 255
    .line 256
    .line 257
    :cond_6
    sget v7, Lcom/google/android/material/R$styleable;->Tooltip_android_textAppearance:I

    .line 258
    .line 259
    invoke-virtual {v3, v7}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 260
    .line 261
    .line 262
    move-result v8

    .line 263
    if-eqz v8, :cond_7

    .line 264
    .line 265
    invoke-virtual {v3, v7, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 266
    .line 267
    .line 268
    move-result v7

    .line 269
    if-eqz v7, :cond_7

    .line 270
    .line 271
    new-instance v8, Ldn2;

    .line 272
    .line 273
    invoke-direct {v8, v6, v7}, Ldn2;-><init>(Landroid/content/Context;I)V

    .line 274
    .line 275
    .line 276
    goto :goto_3

    .line 277
    :cond_7
    move-object v8, v4

    .line 278
    :goto_3
    if-eqz v8, :cond_8

    .line 279
    .line 280
    sget v7, Lcom/google/android/material/R$styleable;->Tooltip_android_textColor:I

    .line 281
    .line 282
    invoke-virtual {v3, v7}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 283
    .line 284
    .line 285
    move-result v7

    .line 286
    if-eqz v7, :cond_8

    .line 287
    .line 288
    sget v7, Lcom/google/android/material/R$styleable;->Tooltip_android_textColor:I

    .line 289
    .line 290
    invoke-static {v6, v3, v7}, Lde3;->o(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 291
    .line 292
    .line 293
    move-result-object v7

    .line 294
    iput-object v7, v8, Ldn2;->j:Landroid/content/res/ColorStateList;

    .line 295
    .line 296
    :cond_8
    invoke-virtual {v9, v8, v6}, Lgn2;->b(Ldn2;Landroid/content/Context;)V

    .line 297
    .line 298
    .line 299
    sget v7, Lcom/google/android/material/R$attr;->colorOnBackground:I

    .line 300
    .line 301
    const-class v8, Ldq2;

    .line 302
    .line 303
    invoke-virtual {v8}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v9

    .line 307
    invoke-static {v6, v9, v7}, Lyy1;->D(Landroid/content/Context;Ljava/lang/String;I)I

    .line 308
    .line 309
    .line 310
    move-result v7

    .line 311
    const v9, 0x1010031

    .line 312
    .line 313
    .line 314
    invoke-virtual {v8}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v10

    .line 318
    invoke-static {v6, v10, v9}, Lyy1;->D(Landroid/content/Context;Ljava/lang/String;I)I

    .line 319
    .line 320
    .line 321
    move-result v9

    .line 322
    const/16 v10, 0xe5

    .line 323
    .line 324
    invoke-static {v9, v10}, Lbx;->f(II)I

    .line 325
    .line 326
    .line 327
    move-result v9

    .line 328
    const/16 v10, 0x99

    .line 329
    .line 330
    invoke-static {v7, v10}, Lbx;->f(II)I

    .line 331
    .line 332
    .line 333
    move-result v7

    .line 334
    invoke-static {v7, v9}, Lbx;->d(II)I

    .line 335
    .line 336
    .line 337
    move-result v7

    .line 338
    sget v9, Lcom/google/android/material/R$styleable;->Tooltip_backgroundTint:I

    .line 339
    .line 340
    invoke-virtual {v3, v9, v7}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 341
    .line 342
    .line 343
    move-result v7

    .line 344
    invoke-static {v7}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 345
    .line 346
    .line 347
    move-result-object v7

    .line 348
    invoke-virtual {v5, v7}, Lfd1;->n(Landroid/content/res/ColorStateList;)V

    .line 349
    .line 350
    .line 351
    sget v7, Lcom/google/android/material/R$attr;->colorSurface:I

    .line 352
    .line 353
    invoke-virtual {v8}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object v8

    .line 357
    invoke-static {v6, v8, v7}, Lyy1;->D(Landroid/content/Context;Ljava/lang/String;I)I

    .line 358
    .line 359
    .line 360
    move-result v6

    .line 361
    invoke-static {v6}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 362
    .line 363
    .line 364
    move-result-object v6

    .line 365
    invoke-virtual {v5, v6}, Lfd1;->s(Landroid/content/res/ColorStateList;)V

    .line 366
    .line 367
    .line 368
    sget v6, Lcom/google/android/material/R$styleable;->Tooltip_android_padding:I

    .line 369
    .line 370
    invoke-virtual {v3, v6, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 371
    .line 372
    .line 373
    move-result v6

    .line 374
    iput v6, v5, Ldq2;->o0:I

    .line 375
    .line 376
    sget v6, Lcom/google/android/material/R$styleable;->Tooltip_android_minWidth:I

    .line 377
    .line 378
    invoke-virtual {v3, v6, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 379
    .line 380
    .line 381
    move-result v6

    .line 382
    iput v6, v5, Ldq2;->p0:I

    .line 383
    .line 384
    sget v6, Lcom/google/android/material/R$styleable;->Tooltip_android_minHeight:I

    .line 385
    .line 386
    invoke-virtual {v3, v6, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 387
    .line 388
    .line 389
    move-result v6

    .line 390
    iput v6, v5, Ldq2;->q0:I

    .line 391
    .line 392
    sget v6, Lcom/google/android/material/R$styleable;->Tooltip_android_layout_margin:I

    .line 393
    .line 394
    invoke-virtual {v3, v6, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 395
    .line 396
    .line 397
    move-result v6

    .line 398
    iput v6, v5, Ldq2;->r0:I

    .line 399
    .line 400
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    .line 401
    .line 402
    .line 403
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 404
    .line 405
    .line 406
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 407
    .line 408
    .line 409
    sget-object v2, Le33;->a:Ljava/util/WeakHashMap;

    .line 410
    .line 411
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 412
    .line 413
    .line 414
    move-result v2

    .line 415
    if-eqz v2, :cond_5

    .line 416
    .line 417
    invoke-static {p0}, Lkb1;->G(Landroid/view/View;)Landroid/view/ViewGroup;

    .line 418
    .line 419
    .line 420
    move-result-object v2

    .line 421
    if-nez v2, :cond_9

    .line 422
    .line 423
    goto/16 :goto_2

    .line 424
    .line 425
    :cond_9
    const/4 v3, 0x2

    .line 426
    new-array v3, v3, [I

    .line 427
    .line 428
    invoke-virtual {v2, v3}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 429
    .line 430
    .line 431
    aget v3, v3, v0

    .line 432
    .line 433
    iput v3, v5, Ldq2;->t0:I

    .line 434
    .line 435
    iget-object v3, v5, Ldq2;->n0:Landroid/graphics/Rect;

    .line 436
    .line 437
    invoke-virtual {v2, v3}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 438
    .line 439
    .line 440
    iget-object v3, v5, Ldq2;->m0:Lmp0;

    .line 441
    .line 442
    invoke-virtual {v2, v3}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 443
    .line 444
    .line 445
    goto/16 :goto_2

    .line 446
    .line 447
    :cond_a
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 448
    .line 449
    .line 450
    move-result v2

    .line 451
    if-ne v2, p1, :cond_b

    .line 452
    .line 453
    move p1, v0

    .line 454
    :cond_b
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 455
    .line 456
    .line 457
    move-result-object v0

    .line 458
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 459
    .line 460
    .line 461
    move-result v1

    .line 462
    if-eqz v1, :cond_c

    .line 463
    .line 464
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v1

    .line 468
    check-cast v1, Ldq2;

    .line 469
    .line 470
    int-to-float v2, p1

    .line 471
    iget-object v3, v1, Lfd1;->a:Led1;

    .line 472
    .line 473
    iput v2, v3, Led1;->j:F

    .line 474
    .line 475
    invoke-virtual {v1}, Lfd1;->invalidateSelf()V

    .line 476
    .line 477
    .line 478
    goto :goto_4

    .line 479
    :cond_c
    iget-object p1, p0, Lcom/google/android/material/slider/BaseSlider;->W:Ljava/util/ArrayList;

    .line 480
    .line 481
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 482
    .line 483
    .line 484
    move-result-object p1

    .line 485
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 486
    .line 487
    .line 488
    move-result v0

    .line 489
    if-eqz v0, :cond_f

    .line 490
    .line 491
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 492
    .line 493
    .line 494
    move-result-object v0

    .line 495
    if-nez v0, :cond_e

    .line 496
    .line 497
    iget-object v0, p0, Lcom/google/android/material/slider/BaseSlider;->u0:Ljava/util/ArrayList;

    .line 498
    .line 499
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 500
    .line 501
    .line 502
    move-result-object v0

    .line 503
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 504
    .line 505
    .line 506
    move-result v1

    .line 507
    if-nez v1, :cond_d

    .line 508
    .line 509
    goto :goto_5

    .line 510
    :cond_d
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object p0

    .line 514
    check-cast p0, Ljava/lang/Float;

    .line 515
    .line 516
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 517
    .line 518
    .line 519
    throw v4

    .line 520
    :cond_e
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 521
    .line 522
    .line 523
    return-void

    .line 524
    :cond_f
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 525
    .line 526
    .line 527
    return-void

    .line 528
    :cond_10
    const-string p0, "At least one value must be set"

    .line 529
    .line 530
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 531
    .line 532
    .line 533
    return-void
.end method

.method public setActiveThumbIndex(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/android/material/slider/BaseSlider;->v0:I

    .line 2
    .line 3
    return-void
.end method

.method public setCustomThumbDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable()Landroid/graphics/drawable/Drawable;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p0, p1}, Lcom/google/android/material/slider/BaseSlider;->a(Landroid/graphics/drawable/Drawable;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lcom/google/android/material/slider/BaseSlider;->J0:Landroid/graphics/drawable/Drawable;

    .line 17
    .line 18
    iget-object p1, p0, Lcom/google/android/material/slider/BaseSlider;->K0:Ljava/util/List;

    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public varargs setCustomThumbDrawablesForValues([I)V
    .locals 4

    .line 44
    array-length v0, p1

    new-array v0, v0, [Landroid/graphics/drawable/Drawable;

    const/4 v1, 0x0

    .line 45
    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_0

    .line 46
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    aget v3, p1, v1

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 47
    :cond_0
    invoke-virtual {p0, v0}, Lcom/google/android/material/slider/BaseSlider;->setCustomThumbDrawablesForValues([Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public varargs setCustomThumbDrawablesForValues([Landroid/graphics/drawable/Drawable;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/google/android/material/slider/BaseSlider;->J0:Landroid/graphics/drawable/Drawable;

    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/google/android/material/slider/BaseSlider;->K0:Ljava/util/List;

    .line 10
    .line 11
    array-length v0, p1

    .line 12
    const/4 v1, 0x0

    .line 13
    :goto_0
    if-ge v1, v0, :cond_0

    .line 14
    .line 15
    aget-object v2, p1, v1

    .line 16
    .line 17
    iget-object v3, p0, Lcom/google/android/material/slider/BaseSlider;->K0:Ljava/util/List;

    .line 18
    .line 19
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable()Landroid/graphics/drawable/Drawable;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {p0, v2}, Lcom/google/android/material/slider/BaseSlider;->a(Landroid/graphics/drawable/Drawable;)V

    .line 32
    .line 33
    .line 34
    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    add-int/lit8 v1, v1, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public setEnabled(Z)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, 0x2

    .line 9
    :goto_0
    const/4 v0, 0x0

    .line 10
    invoke-virtual {p0, p1, v0}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public setFocusedThumbIndex(I)V
    .locals 1

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lcom/google/android/material/slider/BaseSlider;->u0:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-ge p1, v0, :cond_0

    .line 10
    .line 11
    iput p1, p0, Lcom/google/android/material/slider/BaseSlider;->w0:I

    .line 12
    .line 13
    iget-object v0, p0, Lcom/google/android/material/slider/BaseSlider;->i:Lcom/google/android/material/slider/e;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lsf0;->w(I)Z

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    const-string p0, "index out of range"

    .line 23
    .line 24
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public setHaloRadius(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/material/slider/BaseSlider;->n0:I

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput p1, p0, Lcom/google/android/material/slider/BaseSlider;->n0:I

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    instance-of v0, v0, Landroid/graphics/drawable/RippleDrawable;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    instance-of v0, p1, Landroid/graphics/drawable/RippleDrawable;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    check-cast p1, Landroid/graphics/drawable/RippleDrawable;

    .line 25
    .line 26
    iget p0, p0, Lcom/google/android/material/slider/BaseSlider;->n0:I

    .line 27
    .line 28
    invoke-virtual {p1, p0}, Landroid/graphics/drawable/RippleDrawable;->setRadius(I)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public setHaloTintList(Landroid/content/res/ColorStateList;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/slider/BaseSlider;->D0:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iput-object p1, p0, Lcom/google/android/material/slider/BaseSlider;->D0:Landroid/content/res/ColorStateList;

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    instance-of v1, v1, Landroid/graphics/drawable/RippleDrawable;

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    instance-of v1, v0, Landroid/graphics/drawable/RippleDrawable;

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    check-cast v0, Landroid/graphics/drawable/RippleDrawable;

    .line 29
    .line 30
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/RippleDrawable;->setColor(Landroid/content/res/ColorStateList;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_1
    invoke-virtual {p0, p1}, Lcom/google/android/material/slider/BaseSlider;->h(Landroid/content/res/ColorStateList;)I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    iget-object v0, p0, Lcom/google/android/material/slider/BaseSlider;->d:Landroid/graphics/Paint;

    .line 39
    .line 40
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 41
    .line 42
    .line 43
    const/16 p1, 0x3f

    .line 44
    .line 45
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public setLabelBehavior(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/material/slider/BaseSlider;->i0:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lcom/google/android/material/slider/BaseSlider;->i0:I

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setSeparationUnit(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/android/material/slider/BaseSlider;->M0:I

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lcom/google/android/material/slider/BaseSlider;->C0:Z

    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setStepSize(F)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v0, p1, v0

    .line 3
    .line 4
    if-ltz v0, :cond_1

    .line 5
    .line 6
    iget v0, p0, Lcom/google/android/material/slider/BaseSlider;->x0:F

    .line 7
    .line 8
    cmpl-float v0, v0, p1

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iput p1, p0, Lcom/google/android/material/slider/BaseSlider;->x0:F

    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    iput-boolean p1, p0, Lcom/google/android/material/slider/BaseSlider;->C0:Z

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void

    .line 21
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 22
    .line 23
    iget v1, p0, Lcom/google/android/material/slider/BaseSlider;->s0:F

    .line 24
    .line 25
    iget p0, p0, Lcom/google/android/material/slider/BaseSlider;->t0:F

    .line 26
    .line 27
    new-instance v2, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    const-string v3, "The stepSize("

    .line 30
    .line 31
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string p1, ") must be 0, or a factor of the valueFrom("

    .line 38
    .line 39
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string p1, ")-valueTo("

    .line 46
    .line 47
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string p0, ") range"

    .line 54
    .line 55
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw v0
.end method

.method public setThumbElevation(F)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/slider/BaseSlider;->I0:Lfd1;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lfd1;->m(F)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setThumbRadius(I)V
    .locals 10

    .line 1
    iget v0, p0, Lcom/google/android/material/slider/BaseSlider;->m0:I

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput p1, p0, Lcom/google/android/material/slider/BaseSlider;->m0:I

    .line 7
    .line 8
    iget v0, p0, Lcom/google/android/material/slider/BaseSlider;->g0:I

    .line 9
    .line 10
    sub-int/2addr p1, v0

    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    iget v1, p0, Lcom/google/android/material/slider/BaseSlider;->f0:I

    .line 17
    .line 18
    add-int/2addr v1, p1

    .line 19
    iput v1, p0, Lcom/google/android/material/slider/BaseSlider;->k0:I

    .line 20
    .line 21
    sget-object p1, Le33;->a:Ljava/util/WeakHashMap;

    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/view/View;->isLaidOut()Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    iget v1, p0, Lcom/google/android/material/slider/BaseSlider;->k0:I

    .line 34
    .line 35
    mul-int/lit8 v1, v1, 0x2

    .line 36
    .line 37
    sub-int/2addr p1, v1

    .line 38
    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    iput p1, p0, Lcom/google/android/material/slider/BaseSlider;->A0:I

    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/google/android/material/slider/BaseSlider;->l()V

    .line 45
    .line 46
    .line 47
    :cond_1
    new-instance p1, Ldc0;

    .line 48
    .line 49
    invoke-direct {p1, v0}, Ldc0;-><init>(I)V

    .line 50
    .line 51
    .line 52
    new-instance v1, Ldc0;

    .line 53
    .line 54
    invoke-direct {v1, v0}, Ldc0;-><init>(I)V

    .line 55
    .line 56
    .line 57
    new-instance v2, Ldc0;

    .line 58
    .line 59
    invoke-direct {v2, v0}, Ldc0;-><init>(I)V

    .line 60
    .line 61
    .line 62
    new-instance v3, Ldc0;

    .line 63
    .line 64
    invoke-direct {v3, v0}, Ldc0;-><init>(I)V

    .line 65
    .line 66
    .line 67
    iget v4, p0, Lcom/google/android/material/slider/BaseSlider;->m0:I

    .line 68
    .line 69
    int-to-float v4, v4

    .line 70
    invoke-static {v0}, Lhe3;->c(I)Lw11;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    new-instance v6, Le;

    .line 75
    .line 76
    invoke-direct {v6, v4}, Le;-><init>(F)V

    .line 77
    .line 78
    .line 79
    new-instance v7, Le;

    .line 80
    .line 81
    invoke-direct {v7, v4}, Le;-><init>(F)V

    .line 82
    .line 83
    .line 84
    new-instance v8, Le;

    .line 85
    .line 86
    invoke-direct {v8, v4}, Le;-><init>(F)V

    .line 87
    .line 88
    .line 89
    new-instance v9, Le;

    .line 90
    .line 91
    invoke-direct {v9, v4}, Le;-><init>(F)V

    .line 92
    .line 93
    .line 94
    new-instance v4, Ltc2;

    .line 95
    .line 96
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 97
    .line 98
    .line 99
    iput-object v5, v4, Ltc2;->a:Lw11;

    .line 100
    .line 101
    iput-object v5, v4, Ltc2;->b:Lw11;

    .line 102
    .line 103
    iput-object v5, v4, Ltc2;->c:Lw11;

    .line 104
    .line 105
    iput-object v5, v4, Ltc2;->d:Lw11;

    .line 106
    .line 107
    iput-object v6, v4, Ltc2;->e:Lm10;

    .line 108
    .line 109
    iput-object v7, v4, Ltc2;->f:Lm10;

    .line 110
    .line 111
    iput-object v8, v4, Ltc2;->g:Lm10;

    .line 112
    .line 113
    iput-object v9, v4, Ltc2;->h:Lm10;

    .line 114
    .line 115
    iput-object p1, v4, Ltc2;->i:Ldc0;

    .line 116
    .line 117
    iput-object v1, v4, Ltc2;->j:Ldc0;

    .line 118
    .line 119
    iput-object v2, v4, Ltc2;->k:Ldc0;

    .line 120
    .line 121
    iput-object v3, v4, Ltc2;->l:Ldc0;

    .line 122
    .line 123
    iget-object p1, p0, Lcom/google/android/material/slider/BaseSlider;->I0:Lfd1;

    .line 124
    .line 125
    invoke-virtual {p1, v4}, Lfd1;->setShapeAppearanceModel(Ltc2;)V

    .line 126
    .line 127
    .line 128
    iget v1, p0, Lcom/google/android/material/slider/BaseSlider;->m0:I

    .line 129
    .line 130
    mul-int/lit8 v1, v1, 0x2

    .line 131
    .line 132
    invoke-virtual {p1, v0, v0, v1, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 133
    .line 134
    .line 135
    iget-object p1, p0, Lcom/google/android/material/slider/BaseSlider;->J0:Landroid/graphics/drawable/Drawable;

    .line 136
    .line 137
    if-eqz p1, :cond_2

    .line 138
    .line 139
    invoke-virtual {p0, p1}, Lcom/google/android/material/slider/BaseSlider;->a(Landroid/graphics/drawable/Drawable;)V

    .line 140
    .line 141
    .line 142
    :cond_2
    iget-object p1, p0, Lcom/google/android/material/slider/BaseSlider;->K0:Ljava/util/List;

    .line 143
    .line 144
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    if-eqz v0, :cond_3

    .line 153
    .line 154
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    check-cast v0, Landroid/graphics/drawable/Drawable;

    .line 159
    .line 160
    invoke-virtual {p0, v0}, Lcom/google/android/material/slider/BaseSlider;->a(Landroid/graphics/drawable/Drawable;)V

    .line 161
    .line 162
    .line 163
    goto :goto_0

    .line 164
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 165
    .line 166
    .line 167
    return-void
.end method

.method public setThumbStrokeColor(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/slider/BaseSlider;->I0:Lfd1;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lfd1;->s(Landroid/content/res/ColorStateList;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setThumbStrokeWidth(F)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/slider/BaseSlider;->I0:Lfd1;

    .line 2
    .line 3
    iget-object v1, v0, Lfd1;->a:Led1;

    .line 4
    .line 5
    iput p1, v1, Led1;->j:F

    .line 6
    .line 7
    invoke-virtual {v0}, Lfd1;->invalidateSelf()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public setTickActiveTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/slider/BaseSlider;->E0:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iput-object p1, p0, Lcom/google/android/material/slider/BaseSlider;->E0:Landroid/content/res/ColorStateList;

    .line 11
    .line 12
    iget-object v0, p0, Lcom/google/android/material/slider/BaseSlider;->f:Landroid/graphics/Paint;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lcom/google/android/material/slider/BaseSlider;->h(Landroid/content/res/ColorStateList;)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public setTickInactiveTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/slider/BaseSlider;->F0:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iput-object p1, p0, Lcom/google/android/material/slider/BaseSlider;->F0:Landroid/content/res/ColorStateList;

    .line 11
    .line 12
    iget-object v0, p0, Lcom/google/android/material/slider/BaseSlider;->e:Landroid/graphics/Paint;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lcom/google/android/material/slider/BaseSlider;->h(Landroid/content/res/ColorStateList;)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public setTrackActiveTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/slider/BaseSlider;->G0:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iput-object p1, p0, Lcom/google/android/material/slider/BaseSlider;->G0:Landroid/content/res/ColorStateList;

    .line 11
    .line 12
    iget-object v0, p0, Lcom/google/android/material/slider/BaseSlider;->b:Landroid/graphics/Paint;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lcom/google/android/material/slider/BaseSlider;->h(Landroid/content/res/ColorStateList;)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public setTrackHeight(I)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/android/material/slider/BaseSlider;->j0:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lcom/google/android/material/slider/BaseSlider;->j0:I

    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/android/material/slider/BaseSlider;->a:Landroid/graphics/Paint;

    .line 8
    .line 9
    int-to-float p1, p1

    .line 10
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 11
    .line 12
    .line 13
    iget p1, p0, Lcom/google/android/material/slider/BaseSlider;->j0:I

    .line 14
    .line 15
    int-to-float p1, p1

    .line 16
    iget-object v0, p0, Lcom/google/android/material/slider/BaseSlider;->b:Landroid/graphics/Paint;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 19
    .line 20
    .line 21
    iget p1, p0, Lcom/google/android/material/slider/BaseSlider;->j0:I

    .line 22
    .line 23
    int-to-float p1, p1

    .line 24
    const/high16 v0, 0x40000000    # 2.0f

    .line 25
    .line 26
    div-float/2addr p1, v0

    .line 27
    iget-object v1, p0, Lcom/google/android/material/slider/BaseSlider;->e:Landroid/graphics/Paint;

    .line 28
    .line 29
    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 30
    .line 31
    .line 32
    iget p1, p0, Lcom/google/android/material/slider/BaseSlider;->j0:I

    .line 33
    .line 34
    int-to-float p1, p1

    .line 35
    div-float/2addr p1, v0

    .line 36
    iget-object v0, p0, Lcom/google/android/material/slider/BaseSlider;->f:Landroid/graphics/Paint;

    .line 37
    .line 38
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 42
    .line 43
    .line 44
    :cond_0
    return-void
.end method

.method public setTrackInactiveTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/slider/BaseSlider;->H0:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iput-object p1, p0, Lcom/google/android/material/slider/BaseSlider;->H0:Landroid/content/res/ColorStateList;

    .line 11
    .line 12
    iget-object v0, p0, Lcom/google/android/material/slider/BaseSlider;->a:Landroid/graphics/Paint;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lcom/google/android/material/slider/BaseSlider;->h(Landroid/content/res/ColorStateList;)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public setValues(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;)V"
        }
    .end annotation

    .line 13
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p0, v0}, Lcom/google/android/material/slider/BaseSlider;->s(Ljava/util/ArrayList;)V

    return-void
.end method

.method public varargs setValues([Ljava/lang/Float;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0, p1}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lcom/google/android/material/slider/BaseSlider;->s(Ljava/util/ArrayList;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final t(FI)Z
    .locals 5

    .line 1
    iput p2, p0, Lcom/google/android/material/slider/BaseSlider;->w0:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/google/android/material/slider/BaseSlider;->u0:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/lang/Float;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    sub-float v0, p1, v0

    .line 16
    .line 17
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    float-to-double v0, v0

    .line 22
    const-wide v2, 0x3f1a36e2eb1c432dL    # 1.0E-4

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    cmpg-double v0, v0, v2

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    if-gez v0, :cond_0

    .line 31
    .line 32
    return v1

    .line 33
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/material/slider/BaseSlider;->getMinSeparation()F

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    iget v2, p0, Lcom/google/android/material/slider/BaseSlider;->M0:I

    .line 38
    .line 39
    if-nez v2, :cond_2

    .line 40
    .line 41
    const/4 v2, 0x0

    .line 42
    cmpl-float v3, v0, v2

    .line 43
    .line 44
    if-nez v3, :cond_1

    .line 45
    .line 46
    move v0, v2

    .line 47
    goto :goto_0

    .line 48
    :cond_1
    iget v2, p0, Lcom/google/android/material/slider/BaseSlider;->k0:I

    .line 49
    .line 50
    int-to-float v2, v2

    .line 51
    sub-float/2addr v0, v2

    .line 52
    iget v2, p0, Lcom/google/android/material/slider/BaseSlider;->A0:I

    .line 53
    .line 54
    int-to-float v2, v2

    .line 55
    div-float/2addr v0, v2

    .line 56
    iget v2, p0, Lcom/google/android/material/slider/BaseSlider;->s0:F

    .line 57
    .line 58
    iget v3, p0, Lcom/google/android/material/slider/BaseSlider;->t0:F

    .line 59
    .line 60
    invoke-static {v2, v3, v0, v2}, Len;->g(FFFF)F

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    :cond_2
    :goto_0
    invoke-virtual {p0}, Lcom/google/android/material/slider/BaseSlider;->k()Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-eqz v2, :cond_3

    .line 69
    .line 70
    neg-float v0, v0

    .line 71
    :cond_3
    add-int/lit8 v2, p2, 0x1

    .line 72
    .line 73
    iget-object v3, p0, Lcom/google/android/material/slider/BaseSlider;->u0:Ljava/util/ArrayList;

    .line 74
    .line 75
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    if-lt v2, v3, :cond_4

    .line 80
    .line 81
    iget v2, p0, Lcom/google/android/material/slider/BaseSlider;->t0:F

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_4
    iget-object v3, p0, Lcom/google/android/material/slider/BaseSlider;->u0:Ljava/util/ArrayList;

    .line 85
    .line 86
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    check-cast v2, Ljava/lang/Float;

    .line 91
    .line 92
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    sub-float/2addr v2, v0

    .line 97
    :goto_1
    add-int/lit8 v3, p2, -0x1

    .line 98
    .line 99
    if-gez v3, :cond_5

    .line 100
    .line 101
    iget v0, p0, Lcom/google/android/material/slider/BaseSlider;->s0:F

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_5
    iget-object v4, p0, Lcom/google/android/material/slider/BaseSlider;->u0:Ljava/util/ArrayList;

    .line 105
    .line 106
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    check-cast v3, Ljava/lang/Float;

    .line 111
    .line 112
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    add-float/2addr v0, v3

    .line 117
    :goto_2
    cmpg-float v3, p1, v0

    .line 118
    .line 119
    if-gez v3, :cond_6

    .line 120
    .line 121
    move p1, v0

    .line 122
    goto :goto_3

    .line 123
    :cond_6
    cmpl-float v0, p1, v2

    .line 124
    .line 125
    if-lez v0, :cond_7

    .line 126
    .line 127
    move p1, v2

    .line 128
    :cond_7
    :goto_3
    iget-object v0, p0, Lcom/google/android/material/slider/BaseSlider;->u0:Ljava/util/ArrayList;

    .line 129
    .line 130
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    invoke-virtual {v0, p2, p1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    iget-object p1, p0, Lcom/google/android/material/slider/BaseSlider;->W:Ljava/util/ArrayList;

    .line 138
    .line 139
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    if-nez v0, :cond_a

    .line 148
    .line 149
    const/4 p1, 0x1

    .line 150
    iget-object v0, p0, Lcom/google/android/material/slider/BaseSlider;->v:Landroid/view/accessibility/AccessibilityManager;

    .line 151
    .line 152
    if-eqz v0, :cond_9

    .line 153
    .line 154
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    if-eqz v0, :cond_9

    .line 159
    .line 160
    iget-object v0, p0, Lcom/google/android/material/slider/BaseSlider;->w:Lcom/google/android/material/slider/d;

    .line 161
    .line 162
    if-nez v0, :cond_8

    .line 163
    .line 164
    new-instance v0, Lcom/google/android/material/slider/d;

    .line 165
    .line 166
    invoke-direct {v0, p0}, Lcom/google/android/material/slider/d;-><init>(Lcom/google/android/material/slider/BaseSlider;)V

    .line 167
    .line 168
    .line 169
    iput-object v0, p0, Lcom/google/android/material/slider/BaseSlider;->w:Lcom/google/android/material/slider/d;

    .line 170
    .line 171
    goto :goto_4

    .line 172
    :cond_8
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 173
    .line 174
    .line 175
    :goto_4
    iget-object v0, p0, Lcom/google/android/material/slider/BaseSlider;->w:Lcom/google/android/material/slider/d;

    .line 176
    .line 177
    iput p2, v0, Lcom/google/android/material/slider/d;->a:I

    .line 178
    .line 179
    const-wide/16 v1, 0xc8

    .line 180
    .line 181
    invoke-virtual {p0, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 182
    .line 183
    .line 184
    :cond_9
    return p1

    .line 185
    :cond_a
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    if-eqz p1, :cond_b

    .line 190
    .line 191
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 192
    .line 193
    .line 194
    return v1

    .line 195
    :cond_b
    iget-object p0, p0, Lcom/google/android/material/slider/BaseSlider;->u0:Ljava/util/ArrayList;

    .line 196
    .line 197
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    check-cast p0, Ljava/lang/Float;

    .line 202
    .line 203
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    const/4 p0, 0x0

    .line 207
    throw p0
.end method

.method public final u()V
    .locals 6

    .line 1
    iget v0, p0, Lcom/google/android/material/slider/BaseSlider;->L0:F

    .line 2
    .line 3
    iget v1, p0, Lcom/google/android/material/slider/BaseSlider;->x0:F

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    cmpl-float v2, v1, v2

    .line 7
    .line 8
    if-lez v2, :cond_0

    .line 9
    .line 10
    iget v2, p0, Lcom/google/android/material/slider/BaseSlider;->t0:F

    .line 11
    .line 12
    iget v3, p0, Lcom/google/android/material/slider/BaseSlider;->s0:F

    .line 13
    .line 14
    sub-float/2addr v2, v3

    .line 15
    div-float/2addr v2, v1

    .line 16
    float-to-int v1, v2

    .line 17
    int-to-float v2, v1

    .line 18
    mul-float/2addr v0, v2

    .line 19
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    int-to-double v2, v0

    .line 24
    int-to-double v0, v1

    .line 25
    div-double/2addr v2, v0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    float-to-double v2, v0

    .line 28
    :goto_0
    invoke-virtual {p0}, Lcom/google/android/material/slider/BaseSlider;->k()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 35
    .line 36
    sub-double v2, v0, v2

    .line 37
    .line 38
    :cond_1
    iget v0, p0, Lcom/google/android/material/slider/BaseSlider;->t0:F

    .line 39
    .line 40
    iget v1, p0, Lcom/google/android/material/slider/BaseSlider;->s0:F

    .line 41
    .line 42
    sub-float/2addr v0, v1

    .line 43
    float-to-double v4, v0

    .line 44
    mul-double/2addr v2, v4

    .line 45
    float-to-double v0, v1

    .line 46
    add-double/2addr v2, v0

    .line 47
    double-to-float v0, v2

    .line 48
    iget v1, p0, Lcom/google/android/material/slider/BaseSlider;->v0:I

    .line 49
    .line 50
    invoke-virtual {p0, v0, v1}, Lcom/google/android/material/slider/BaseSlider;->t(FI)Z

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public final v(ILandroid/graphics/Rect;)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/google/android/material/slider/BaseSlider;->k0:I

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/material/slider/BaseSlider;->getValues()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Ljava/lang/Float;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-virtual {p0, p1}, Lcom/google/android/material/slider/BaseSlider;->o(F)F

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    iget v1, p0, Lcom/google/android/material/slider/BaseSlider;->A0:I

    .line 22
    .line 23
    int-to-float v1, v1

    .line 24
    mul-float/2addr p1, v1

    .line 25
    float-to-int p1, p1

    .line 26
    add-int/2addr v0, p1

    .line 27
    invoke-virtual {p0}, Lcom/google/android/material/slider/BaseSlider;->b()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    iget p0, p0, Lcom/google/android/material/slider/BaseSlider;->m0:I

    .line 32
    .line 33
    sub-int v1, v0, p0

    .line 34
    .line 35
    sub-int v2, p1, p0

    .line 36
    .line 37
    add-int/2addr v0, p0

    .line 38
    add-int/2addr p1, p0

    .line 39
    invoke-virtual {p2, v1, v2, v0, p1}, Landroid/graphics/Rect;->set(IIII)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final w()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v0, v0, Landroid/graphics/drawable/RippleDrawable;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-lez v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    instance-of v1, v0, Landroid/graphics/drawable/RippleDrawable;

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    iget-object v1, p0, Lcom/google/android/material/slider/BaseSlider;->u0:Ljava/util/ArrayList;

    .line 24
    .line 25
    iget v2, p0, Lcom/google/android/material/slider/BaseSlider;->w0:I

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Ljava/lang/Float;

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-virtual {p0, v1}, Lcom/google/android/material/slider/BaseSlider;->o(F)F

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    iget v2, p0, Lcom/google/android/material/slider/BaseSlider;->A0:I

    .line 42
    .line 43
    int-to-float v2, v2

    .line 44
    mul-float/2addr v1, v2

    .line 45
    iget v2, p0, Lcom/google/android/material/slider/BaseSlider;->k0:I

    .line 46
    .line 47
    int-to-float v2, v2

    .line 48
    add-float/2addr v1, v2

    .line 49
    float-to-int v1, v1

    .line 50
    invoke-virtual {p0}, Lcom/google/android/material/slider/BaseSlider;->b()I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    iget p0, p0, Lcom/google/android/material/slider/BaseSlider;->n0:I

    .line 55
    .line 56
    sub-int v3, v1, p0

    .line 57
    .line 58
    sub-int v4, v2, p0

    .line 59
    .line 60
    add-int/2addr v1, p0

    .line 61
    add-int/2addr v2, p0

    .line 62
    invoke-static {v0, v3, v4, v1, v2}, Ls90;->f(Landroid/graphics/drawable/Drawable;IIII)V

    .line 63
    .line 64
    .line 65
    :cond_0
    return-void
.end method

.method public final x()V
    .locals 8

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/slider/BaseSlider;->C0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_10

    .line 4
    .line 5
    iget v0, p0, Lcom/google/android/material/slider/BaseSlider;->s0:F

    .line 6
    .line 7
    iget v1, p0, Lcom/google/android/material/slider/BaseSlider;->t0:F

    .line 8
    .line 9
    cmpl-float v2, v0, v1

    .line 10
    .line 11
    if-gez v2, :cond_f

    .line 12
    .line 13
    cmpg-float v2, v1, v0

    .line 14
    .line 15
    if-lez v2, :cond_e

    .line 16
    .line 17
    iget v2, p0, Lcom/google/android/material/slider/BaseSlider;->x0:F

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    cmpl-float v2, v2, v3

    .line 21
    .line 22
    if-lez v2, :cond_1

    .line 23
    .line 24
    sub-float/2addr v1, v0

    .line 25
    invoke-virtual {p0, v1}, Lcom/google/android/material/slider/BaseSlider;->j(F)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 33
    .line 34
    iget v1, p0, Lcom/google/android/material/slider/BaseSlider;->x0:F

    .line 35
    .line 36
    iget v2, p0, Lcom/google/android/material/slider/BaseSlider;->s0:F

    .line 37
    .line 38
    iget p0, p0, Lcom/google/android/material/slider/BaseSlider;->t0:F

    .line 39
    .line 40
    new-instance v3, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    const-string v4, "The stepSize("

    .line 43
    .line 44
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v1, ") must be 0, or a factor of the valueFrom("

    .line 51
    .line 52
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string v1, ")-valueTo("

    .line 59
    .line 60
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string p0, ") range"

    .line 67
    .line 68
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw v0

    .line 79
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/google/android/material/slider/BaseSlider;->u0:Ljava/util/ArrayList;

    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    const-string v2, ") when using stepSize("

    .line 90
    .line 91
    const-string v4, ")"

    .line 92
    .line 93
    if-eqz v1, :cond_5

    .line 94
    .line 95
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    check-cast v1, Ljava/lang/Float;

    .line 100
    .line 101
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 102
    .line 103
    .line 104
    move-result v5

    .line 105
    iget v6, p0, Lcom/google/android/material/slider/BaseSlider;->s0:F

    .line 106
    .line 107
    cmpg-float v5, v5, v6

    .line 108
    .line 109
    if-ltz v5, :cond_4

    .line 110
    .line 111
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 112
    .line 113
    .line 114
    move-result v5

    .line 115
    iget v6, p0, Lcom/google/android/material/slider/BaseSlider;->t0:F

    .line 116
    .line 117
    cmpl-float v5, v5, v6

    .line 118
    .line 119
    if-gtz v5, :cond_4

    .line 120
    .line 121
    iget v5, p0, Lcom/google/android/material/slider/BaseSlider;->x0:F

    .line 122
    .line 123
    cmpl-float v5, v5, v3

    .line 124
    .line 125
    if-lez v5, :cond_2

    .line 126
    .line 127
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 128
    .line 129
    .line 130
    move-result v5

    .line 131
    iget v6, p0, Lcom/google/android/material/slider/BaseSlider;->s0:F

    .line 132
    .line 133
    sub-float/2addr v5, v6

    .line 134
    invoke-virtual {p0, v5}, Lcom/google/android/material/slider/BaseSlider;->j(F)Z

    .line 135
    .line 136
    .line 137
    move-result v5

    .line 138
    if-eqz v5, :cond_3

    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 142
    .line 143
    iget v3, p0, Lcom/google/android/material/slider/BaseSlider;->s0:F

    .line 144
    .line 145
    iget p0, p0, Lcom/google/android/material/slider/BaseSlider;->x0:F

    .line 146
    .line 147
    new-instance v5, Ljava/lang/StringBuilder;

    .line 148
    .line 149
    const-string v6, "Value("

    .line 150
    .line 151
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    const-string v1, ") must be equal to valueFrom("

    .line 158
    .line 159
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    const-string v1, ") plus a multiple of stepSize("

    .line 166
    .line 167
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    throw v0

    .line 190
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 191
    .line 192
    iget v2, p0, Lcom/google/android/material/slider/BaseSlider;->s0:F

    .line 193
    .line 194
    iget p0, p0, Lcom/google/android/material/slider/BaseSlider;->t0:F

    .line 195
    .line 196
    new-instance v3, Ljava/lang/StringBuilder;

    .line 197
    .line 198
    const-string v5, "Slider value("

    .line 199
    .line 200
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    const-string v1, ") must be greater or equal to valueFrom("

    .line 207
    .line 208
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    const-string v1, "), and lower or equal to valueTo("

    .line 215
    .line 216
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object p0

    .line 229
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    throw v0

    .line 233
    :cond_5
    invoke-virtual {p0}, Lcom/google/android/material/slider/BaseSlider;->getMinSeparation()F

    .line 234
    .line 235
    .line 236
    move-result v0

    .line 237
    cmpg-float v1, v0, v3

    .line 238
    .line 239
    const-string v5, "minSeparation("

    .line 240
    .line 241
    if-ltz v1, :cond_d

    .line 242
    .line 243
    iget v1, p0, Lcom/google/android/material/slider/BaseSlider;->x0:F

    .line 244
    .line 245
    cmpl-float v6, v1, v3

    .line 246
    .line 247
    if-lez v6, :cond_8

    .line 248
    .line 249
    cmpl-float v6, v0, v3

    .line 250
    .line 251
    if-lez v6, :cond_8

    .line 252
    .line 253
    iget v6, p0, Lcom/google/android/material/slider/BaseSlider;->M0:I

    .line 254
    .line 255
    const/4 v7, 0x1

    .line 256
    if-ne v6, v7, :cond_7

    .line 257
    .line 258
    cmpg-float v1, v0, v1

    .line 259
    .line 260
    if-ltz v1, :cond_6

    .line 261
    .line 262
    invoke-virtual {p0, v0}, Lcom/google/android/material/slider/BaseSlider;->j(F)Z

    .line 263
    .line 264
    .line 265
    move-result v1

    .line 266
    if-eqz v1, :cond_6

    .line 267
    .line 268
    goto :goto_2

    .line 269
    :cond_6
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 270
    .line 271
    iget p0, p0, Lcom/google/android/material/slider/BaseSlider;->x0:F

    .line 272
    .line 273
    new-instance v3, Ljava/lang/StringBuilder;

    .line 274
    .line 275
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 279
    .line 280
    .line 281
    const-string v0, ") must be greater or equal and a multiple of stepSize("

    .line 282
    .line 283
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 284
    .line 285
    .line 286
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 290
    .line 291
    .line 292
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 293
    .line 294
    .line 295
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 296
    .line 297
    .line 298
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object p0

    .line 302
    invoke-direct {v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    throw v1

    .line 306
    :cond_7
    const-string p0, ") cannot be set as a dimension when using stepSize("

    .line 307
    .line 308
    invoke-static {v5, v0, p0, v1}, Ln4;->k(Ljava/lang/String;FLjava/lang/Object;F)V

    .line 309
    .line 310
    .line 311
    return-void

    .line 312
    :cond_8
    :goto_2
    iget v0, p0, Lcom/google/android/material/slider/BaseSlider;->x0:F

    .line 313
    .line 314
    cmpl-float v1, v0, v3

    .line 315
    .line 316
    if-nez v1, :cond_9

    .line 317
    .line 318
    goto :goto_3

    .line 319
    :cond_9
    float-to-int v1, v0

    .line 320
    int-to-float v1, v1

    .line 321
    cmpl-float v1, v1, v0

    .line 322
    .line 323
    const-string v2, "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly."

    .line 324
    .line 325
    const-string v3, "BaseSlider"

    .line 326
    .line 327
    if-eqz v1, :cond_a

    .line 328
    .line 329
    new-instance v1, Ljava/lang/StringBuilder;

    .line 330
    .line 331
    const-string v4, "Floating point value used for stepSize("

    .line 332
    .line 333
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 337
    .line 338
    .line 339
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 340
    .line 341
    .line 342
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    invoke-static {v3, v0}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 347
    .line 348
    .line 349
    :cond_a
    iget v0, p0, Lcom/google/android/material/slider/BaseSlider;->s0:F

    .line 350
    .line 351
    float-to-int v1, v0

    .line 352
    int-to-float v1, v1

    .line 353
    cmpl-float v1, v1, v0

    .line 354
    .line 355
    if-eqz v1, :cond_b

    .line 356
    .line 357
    new-instance v1, Ljava/lang/StringBuilder;

    .line 358
    .line 359
    const-string v4, "Floating point value used for valueFrom("

    .line 360
    .line 361
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 362
    .line 363
    .line 364
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 365
    .line 366
    .line 367
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 368
    .line 369
    .line 370
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    invoke-static {v3, v0}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 375
    .line 376
    .line 377
    :cond_b
    iget v0, p0, Lcom/google/android/material/slider/BaseSlider;->t0:F

    .line 378
    .line 379
    float-to-int v1, v0

    .line 380
    int-to-float v1, v1

    .line 381
    cmpl-float v1, v1, v0

    .line 382
    .line 383
    if-eqz v1, :cond_c

    .line 384
    .line 385
    new-instance v1, Ljava/lang/StringBuilder;

    .line 386
    .line 387
    const-string v4, "Floating point value used for valueTo("

    .line 388
    .line 389
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 390
    .line 391
    .line 392
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 393
    .line 394
    .line 395
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 396
    .line 397
    .line 398
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v0

    .line 402
    invoke-static {v3, v0}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 403
    .line 404
    .line 405
    :cond_c
    :goto_3
    const/4 v0, 0x0

    .line 406
    iput-boolean v0, p0, Lcom/google/android/material/slider/BaseSlider;->C0:Z

    .line 407
    .line 408
    return-void

    .line 409
    :cond_d
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 410
    .line 411
    new-instance v1, Ljava/lang/StringBuilder;

    .line 412
    .line 413
    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 414
    .line 415
    .line 416
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 417
    .line 418
    .line 419
    const-string v0, ") must be greater or equal to 0"

    .line 420
    .line 421
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 422
    .line 423
    .line 424
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object v0

    .line 428
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 429
    .line 430
    .line 431
    throw p0

    .line 432
    :cond_e
    const-string p0, "valueTo("

    .line 433
    .line 434
    const-string v2, ") must be greater than valueFrom("

    .line 435
    .line 436
    invoke-static {p0, v1, v2, v0}, Ln4;->k(Ljava/lang/String;FLjava/lang/Object;F)V

    .line 437
    .line 438
    .line 439
    return-void

    .line 440
    :cond_f
    const-string p0, "valueFrom("

    .line 441
    .line 442
    const-string v2, ") must be smaller than valueTo("

    .line 443
    .line 444
    invoke-static {p0, v0, v2, v1}, Ln4;->k(Ljava/lang/String;FLjava/lang/Object;F)V

    .line 445
    .line 446
    .line 447
    :cond_10
    return-void
.end method
