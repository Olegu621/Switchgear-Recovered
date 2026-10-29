.class public final Lmp0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lmp0;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lmp0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 4

    .line 1
    iget v0, p0, Lmp0;->a:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object p0, p0, Lmp0;->b:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Ldq2;

    .line 11
    .line 12
    const/4 p2, 0x2

    .line 13
    new-array p2, p2, [I

    .line 14
    .line 15
    invoke-virtual {p1, p2}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 16
    .line 17
    .line 18
    aget p2, p2, v2

    .line 19
    .line 20
    iput p2, p0, Ldq2;->t0:I

    .line 21
    .line 22
    iget-object p0, p0, Ldq2;->n0:Landroid/graphics/Rect;

    .line 23
    .line 24
    invoke-virtual {p1, p0}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_0
    check-cast p0, Landroidx/appcompat/widget/SearchView;

    .line 29
    .line 30
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->d0:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    .line 31
    .line 32
    iget-object p2, p0, Landroidx/appcompat/widget/SearchView;->l0:Landroid/view/View;

    .line 33
    .line 34
    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    .line 35
    .line 36
    .line 37
    move-result p3

    .line 38
    if-le p3, v1, :cond_3

    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 41
    .line 42
    .line 43
    move-result-object p3

    .line 44
    invoke-virtual {p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 45
    .line 46
    .line 47
    move-result-object p3

    .line 48
    iget-object p4, p0, Landroidx/appcompat/widget/SearchView;->f0:Landroid/view/View;

    .line 49
    .line 50
    invoke-virtual {p4}, Landroid/view/View;->getPaddingLeft()I

    .line 51
    .line 52
    .line 53
    move-result p4

    .line 54
    new-instance p5, Landroid/graphics/Rect;

    .line 55
    .line 56
    invoke-direct {p5}, Landroid/graphics/Rect;-><init>()V

    .line 57
    .line 58
    .line 59
    sget-boolean p6, Lm53;->a:Z

    .line 60
    .line 61
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 62
    .line 63
    .line 64
    move-result p6

    .line 65
    if-ne p6, v1, :cond_0

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    move v1, v2

    .line 69
    :goto_0
    iget-boolean p0, p0, Landroidx/appcompat/widget/SearchView;->A0:Z

    .line 70
    .line 71
    if-eqz p0, :cond_1

    .line 72
    .line 73
    sget p0, Landroidx/appcompat/R$dimen;->abc_dropdownitem_icon_width:I

    .line 74
    .line 75
    invoke-virtual {p3, p0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    sget p6, Landroidx/appcompat/R$dimen;->abc_dropdownitem_text_padding_left:I

    .line 80
    .line 81
    invoke-virtual {p3, p6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 82
    .line 83
    .line 84
    move-result p3

    .line 85
    add-int v2, p3, p0

    .line 86
    .line 87
    :cond_1
    invoke-virtual {p1}, Landroid/widget/AutoCompleteTextView;->getDropDownBackground()Landroid/graphics/drawable/Drawable;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-virtual {p0, p5}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 92
    .line 93
    .line 94
    iget p0, p5, Landroid/graphics/Rect;->left:I

    .line 95
    .line 96
    if-eqz v1, :cond_2

    .line 97
    .line 98
    neg-int p0, p0

    .line 99
    goto :goto_1

    .line 100
    :cond_2
    add-int/2addr p0, v2

    .line 101
    sub-int p0, p4, p0

    .line 102
    .line 103
    :goto_1
    invoke-virtual {p1, p0}, Landroid/widget/AutoCompleteTextView;->setDropDownHorizontalOffset(I)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    .line 107
    .line 108
    .line 109
    move-result p0

    .line 110
    iget p2, p5, Landroid/graphics/Rect;->left:I

    .line 111
    .line 112
    add-int/2addr p0, p2

    .line 113
    iget p2, p5, Landroid/graphics/Rect;->right:I

    .line 114
    .line 115
    add-int/2addr p0, p2

    .line 116
    add-int/2addr p0, v2

    .line 117
    sub-int/2addr p0, p4

    .line 118
    invoke-virtual {p1, p0}, Landroid/widget/AutoCompleteTextView;->setDropDownWidth(I)V

    .line 119
    .line 120
    .line 121
    :cond_3
    return-void

    .line 122
    :pswitch_1
    check-cast p0, Lrl1;

    .line 123
    .line 124
    iget-object p1, p0, Lrl1;->V:Landroid/widget/ImageView;

    .line 125
    .line 126
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 127
    .line 128
    .line 129
    move-result p2

    .line 130
    if-nez p2, :cond_4

    .line 131
    .line 132
    iget-object p0, p0, Lrl1;->p0:Lmh;

    .line 133
    .line 134
    if-eqz p0, :cond_4

    .line 135
    .line 136
    new-instance p2, Landroid/graphics/Rect;

    .line 137
    .line 138
    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p1, p2}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p0, p2}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 145
    .line 146
    .line 147
    const/4 p2, 0x0

    .line 148
    invoke-virtual {p0, p1, p2}, Lmh;->f(Landroid/view/View;Landroid/widget/FrameLayout;)V

    .line 149
    .line 150
    .line 151
    :cond_4
    return-void

    .line 152
    :pswitch_2
    check-cast p0, Lcom/supercell/titan/GL2JNISurfaceView;

    .line 153
    .line 154
    invoke-static {}, Lcom/supercell/titan/GameApp;->isNativeLibraryLoaded()Z

    .line 155
    .line 156
    .line 157
    move-result p1

    .line 158
    if-eqz p1, :cond_5

    .line 159
    .line 160
    iget-object p1, p0, Lcom/supercell/titan/GL2JNISurfaceView;->a:Landroid/view/SurfaceHolder;

    .line 161
    .line 162
    if-eqz p1, :cond_5

    .line 163
    .line 164
    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    if-eqz p1, :cond_5

    .line 169
    .line 170
    move p1, v1

    .line 171
    goto :goto_2

    .line 172
    :cond_5
    move p1, v2

    .line 173
    :goto_2
    iget-boolean v0, p0, Lcom/supercell/titan/GL2JNISurfaceView;->d:Z

    .line 174
    .line 175
    if-nez v0, :cond_7

    .line 176
    .line 177
    iget-boolean v0, p0, Lcom/supercell/titan/GL2JNISurfaceView;->e:Z

    .line 178
    .line 179
    if-eqz v0, :cond_6

    .line 180
    .line 181
    goto :goto_3

    .line 182
    :cond_6
    move v0, v2

    .line 183
    goto :goto_4

    .line 184
    :cond_7
    :goto_3
    move v0, v1

    .line 185
    :goto_4
    iget-boolean v3, p0, Lcom/supercell/titan/GL2JNISurfaceView;->f:Z

    .line 186
    .line 187
    if-nez v3, :cond_9

    .line 188
    .line 189
    iget-boolean v3, p0, Lcom/supercell/titan/GL2JNISurfaceView;->i:Z

    .line 190
    .line 191
    if-eqz v3, :cond_8

    .line 192
    .line 193
    goto :goto_5

    .line 194
    :cond_8
    move v3, v2

    .line 195
    goto :goto_6

    .line 196
    :cond_9
    :goto_5
    move v3, v1

    .line 197
    :goto_6
    if-eq p2, p6, :cond_a

    .line 198
    .line 199
    if-nez p6, :cond_e

    .line 200
    .line 201
    :cond_a
    if-eq p4, p8, :cond_b

    .line 202
    .line 203
    if-nez p8, :cond_e

    .line 204
    .line 205
    :cond_b
    if-eq p5, p9, :cond_c

    .line 206
    .line 207
    if-nez p9, :cond_e

    .line 208
    .line 209
    :cond_c
    if-eq p3, p7, :cond_d

    .line 210
    .line 211
    if-eqz p7, :cond_d

    .line 212
    .line 213
    goto :goto_7

    .line 214
    :cond_d
    move v1, v2

    .line 215
    :cond_e
    :goto_7
    if-eqz p1, :cond_10

    .line 216
    .line 217
    if-nez v0, :cond_f

    .line 218
    .line 219
    if-nez v3, :cond_f

    .line 220
    .line 221
    if-eqz v1, :cond_10

    .line 222
    .line 223
    :cond_f
    sub-int/2addr p4, p2

    .line 224
    int-to-float p1, p4

    .line 225
    iget p2, p0, Lcom/supercell/titan/GL2JNISurfaceView;->b:F

    .line 226
    .line 227
    mul-float/2addr p1, p2

    .line 228
    float-to-int p1, p1

    .line 229
    sub-int/2addr p5, p3

    .line 230
    int-to-float p2, p5

    .line 231
    iget p3, p0, Lcom/supercell/titan/GL2JNISurfaceView;->c:F

    .line 232
    .line 233
    mul-float/2addr p2, p3

    .line 234
    float-to-int p2, p2

    .line 235
    iget-object p3, p0, Lcom/supercell/titan/GL2JNISurfaceView;->a:Landroid/view/SurfaceHolder;

    .line 236
    .line 237
    invoke-interface {p3}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    .line 238
    .line 239
    .line 240
    move-result-object p3

    .line 241
    invoke-static {p3, p1, p2}, Lcom/supercell/titan/GameApp;->nOnSurfaceChanged(Landroid/view/Surface;II)V

    .line 242
    .line 243
    .line 244
    iput-boolean v2, p0, Lcom/supercell/titan/GL2JNISurfaceView;->e:Z

    .line 245
    .line 246
    iput-boolean v2, p0, Lcom/supercell/titan/GL2JNISurfaceView;->i:Z

    .line 247
    .line 248
    :cond_10
    return-void

    .line 249
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
