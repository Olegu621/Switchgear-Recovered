.class public final Lza0;
.super Lde0;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final e:Lwa0;

.field public final f:Llv;

.field public final g:Lxa0;

.field public final h:Lmv;

.field public final i:Lnv;

.field public final j:Ltr;

.field public final k:Lgr0;

.field public l:Z

.field public m:Z

.field public n:J

.field public o:Landroid/graphics/drawable/StateListDrawable;

.field public p:Lfd1;

.field public q:Landroid/view/accessibility/AccessibilityManager;

.field public r:Landroid/animation/ValueAnimator;

.field public s:Landroid/animation/ValueAnimator;


# direct methods
.method public constructor <init>(Lcom/google/android/material/textfield/TextInputLayout;I)V
    .locals 2

    .line 1
    invoke-direct {p0, p1, p2}, Lde0;-><init>(Lcom/google/android/material/textfield/TextInputLayout;I)V

    .line 2
    .line 3
    .line 4
    new-instance p2, Lwa0;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-direct {p2, p0, v0}, Lwa0;-><init>(Lde0;I)V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, Lza0;->e:Lwa0;

    .line 11
    .line 12
    new-instance p2, Llv;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-direct {p2, p0, v1}, Llv;-><init>(Ljava/lang/Object;I)V

    .line 16
    .line 17
    .line 18
    iput-object p2, p0, Lza0;->f:Llv;

    .line 19
    .line 20
    new-instance p2, Lxa0;

    .line 21
    .line 22
    invoke-direct {p2, p0, p1}, Lxa0;-><init>(Lza0;Lcom/google/android/material/textfield/TextInputLayout;)V

    .line 23
    .line 24
    .line 25
    iput-object p2, p0, Lza0;->g:Lxa0;

    .line 26
    .line 27
    new-instance p1, Lmv;

    .line 28
    .line 29
    invoke-direct {p1, p0, v1}, Lmv;-><init>(Lde0;I)V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Lza0;->h:Lmv;

    .line 33
    .line 34
    new-instance p1, Lnv;

    .line 35
    .line 36
    invoke-direct {p1, p0, v1}, Lnv;-><init>(Lde0;I)V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, Lza0;->i:Lnv;

    .line 40
    .line 41
    new-instance p1, Ltr;

    .line 42
    .line 43
    invoke-direct {p1, p0, v1}, Ltr;-><init>(Ljava/lang/Object;I)V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, Lza0;->j:Ltr;

    .line 47
    .line 48
    new-instance p1, Lgr0;

    .line 49
    .line 50
    invoke-direct {p1, p0}, Lgr0;-><init>(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iput-object p1, p0, Lza0;->k:Lgr0;

    .line 54
    .line 55
    iput-boolean v0, p0, Lza0;->l:Z

    .line 56
    .line 57
    iput-boolean v0, p0, Lza0;->m:Z

    .line 58
    .line 59
    const-wide p1, 0x7fffffffffffffffL

    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    iput-wide p1, p0, Lza0;->n:J

    .line 65
    .line 66
    return-void
.end method

.method public static d(Lza0;Landroid/widget/AutoCompleteTextView;)V
    .locals 6

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    iget-wide v2, p0, Lza0;->n:J

    .line 9
    .line 10
    sub-long/2addr v0, v2

    .line 11
    const-wide/16 v2, 0x0

    .line 12
    .line 13
    cmp-long v2, v0, v2

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    if-ltz v2, :cond_1

    .line 17
    .line 18
    const-wide/16 v4, 0x12c

    .line 19
    .line 20
    cmp-long v0, v0, v4

    .line 21
    .line 22
    if-lez v0, :cond_2

    .line 23
    .line 24
    :cond_1
    iput-boolean v3, p0, Lza0;->l:Z

    .line 25
    .line 26
    :cond_2
    iget-boolean v0, p0, Lza0;->l:Z

    .line 27
    .line 28
    if-nez v0, :cond_4

    .line 29
    .line 30
    iget-boolean v0, p0, Lza0;->m:Z

    .line 31
    .line 32
    xor-int/lit8 v0, v0, 0x1

    .line 33
    .line 34
    invoke-virtual {p0, v0}, Lza0;->i(Z)V

    .line 35
    .line 36
    .line 37
    iget-boolean p0, p0, Lza0;->m:Z

    .line 38
    .line 39
    if-eqz p0, :cond_3

    .line 40
    .line 41
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Landroid/widget/AutoCompleteTextView;->showDropDown()V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_3
    invoke-virtual {p1}, Landroid/widget/AutoCompleteTextView;->dismissDropDown()V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_4
    iput-boolean v3, p0, Lza0;->l:Z

    .line 53
    .line 54
    return-void
.end method

.method public static h(Landroid/widget/EditText;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/widget/TextView;->getKeyListener()Landroid/text/method/KeyListener;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method


# virtual methods
.method public final a()V
    .locals 7

    .line 1
    iget-object v0, p0, Lde0;->b:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    sget v2, Lcom/google/android/material/R$dimen;->mtrl_shape_corner_size_small_component:I

    .line 8
    .line 9
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    int-to-float v1, v1

    .line 14
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    sget v3, Lcom/google/android/material/R$dimen;->mtrl_exposed_dropdown_menu_popup_elevation:I

    .line 19
    .line 20
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    int-to-float v2, v2

    .line 25
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    sget v4, Lcom/google/android/material/R$dimen;->mtrl_exposed_dropdown_menu_popup_vertical_padding:I

    .line 30
    .line 31
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    invoke-virtual {p0, v1, v1, v2, v3}, Lza0;->g(FFFI)Lfd1;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    const/4 v5, 0x0

    .line 40
    invoke-virtual {p0, v5, v1, v2, v3}, Lza0;->g(FFFI)Lfd1;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    iput-object v4, p0, Lza0;->p:Lfd1;

    .line 45
    .line 46
    new-instance v2, Landroid/graphics/drawable/StateListDrawable;

    .line 47
    .line 48
    invoke-direct {v2}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object v2, p0, Lza0;->o:Landroid/graphics/drawable/StateListDrawable;

    .line 52
    .line 53
    const v3, 0x10100aa

    .line 54
    .line 55
    .line 56
    filled-new-array {v3}, [I

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-virtual {v2, v3, v4}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 61
    .line 62
    .line 63
    iget-object v2, p0, Lza0;->o:Landroid/graphics/drawable/StateListDrawable;

    .line 64
    .line 65
    const/4 v3, 0x0

    .line 66
    new-array v3, v3, [I

    .line 67
    .line 68
    invoke-virtual {v2, v3, v1}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 69
    .line 70
    .line 71
    iget v1, p0, Lde0;->d:I

    .line 72
    .line 73
    if-nez v1, :cond_0

    .line 74
    .line 75
    sget v1, Lcom/google/android/material/R$drawable;->mtrl_dropdown_arrow:I

    .line 76
    .line 77
    :cond_0
    iget-object v2, p0, Lde0;->a:Lcom/google/android/material/textfield/TextInputLayout;

    .line 78
    .line 79
    invoke-virtual {v2, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setEndIconDrawable(I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    sget v3, Lcom/google/android/material/R$string;->exposed_dropdown_menu_content_description:I

    .line 87
    .line 88
    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-virtual {v2, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setEndIconContentDescription(Ljava/lang/CharSequence;)V

    .line 93
    .line 94
    .line 95
    new-instance v1, Lu1;

    .line 96
    .line 97
    const/4 v3, 0x3

    .line 98
    invoke-direct {v1, p0, v3}, Lu1;-><init>(Ljava/lang/Object;I)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setEndIconOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 102
    .line 103
    .line 104
    iget-object v1, v2, Lcom/google/android/material/textfield/TextInputLayout;->M0:Ljava/util/LinkedHashSet;

    .line 105
    .line 106
    iget-object v3, p0, Lza0;->h:Lmv;

    .line 107
    .line 108
    invoke-virtual {v1, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    iget-object v1, v2, Lcom/google/android/material/textfield/TextInputLayout;->e:Landroid/widget/EditText;

    .line 112
    .line 113
    if-eqz v1, :cond_1

    .line 114
    .line 115
    invoke-virtual {v3, v2}, Lmv;->a(Lcom/google/android/material/textfield/TextInputLayout;)V

    .line 116
    .line 117
    .line 118
    :cond_1
    iget-object v1, p0, Lza0;->i:Lnv;

    .line 119
    .line 120
    iget-object v3, v2, Lcom/google/android/material/textfield/TextInputLayout;->Q0:Ljava/util/LinkedHashSet;

    .line 121
    .line 122
    invoke-virtual {v3, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    const/4 v1, 0x2

    .line 126
    new-array v3, v1, [F

    .line 127
    .line 128
    fill-array-data v3, :array_0

    .line 129
    .line 130
    .line 131
    invoke-static {v3}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    sget-object v4, Lu8;->a:Landroid/view/animation/LinearInterpolator;

    .line 136
    .line 137
    invoke-virtual {v3, v4}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 138
    .line 139
    .line 140
    const-wide/16 v5, 0x43

    .line 141
    .line 142
    invoke-virtual {v3, v5, v6}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 143
    .line 144
    .line 145
    new-instance v5, Lsk;

    .line 146
    .line 147
    invoke-direct {v5, p0, v1}, Lsk;-><init>(Ljava/lang/Object;I)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v3, v5}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 151
    .line 152
    .line 153
    iput-object v3, p0, Lza0;->s:Landroid/animation/ValueAnimator;

    .line 154
    .line 155
    new-array v3, v1, [F

    .line 156
    .line 157
    fill-array-data v3, :array_1

    .line 158
    .line 159
    .line 160
    invoke-static {v3}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    invoke-virtual {v3, v4}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 165
    .line 166
    .line 167
    const-wide/16 v4, 0x32

    .line 168
    .line 169
    invoke-virtual {v3, v4, v5}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 170
    .line 171
    .line 172
    new-instance v4, Lsk;

    .line 173
    .line 174
    invoke-direct {v4, p0, v1}, Lsk;-><init>(Ljava/lang/Object;I)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v3, v4}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 178
    .line 179
    .line 180
    iput-object v3, p0, Lza0;->r:Landroid/animation/ValueAnimator;

    .line 181
    .line 182
    new-instance v4, Lw1;

    .line 183
    .line 184
    invoke-direct {v4, p0, v1}, Lw1;-><init>(Ljava/lang/Object;I)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v3, v4}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 188
    .line 189
    .line 190
    const-string v1, "accessibility"

    .line 191
    .line 192
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    check-cast v0, Landroid/view/accessibility/AccessibilityManager;

    .line 197
    .line 198
    iput-object v0, p0, Lza0;->q:Landroid/view/accessibility/AccessibilityManager;

    .line 199
    .line 200
    iget-object v0, p0, Lza0;->j:Ltr;

    .line 201
    .line 202
    invoke-virtual {v2, v0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {p0}, Lza0;->f()V

    .line 206
    .line 207
    .line 208
    return-void

    .line 209
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method public final b(I)Z
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0

    .line 5
    :cond_0
    const/4 p0, 0x0

    .line 6
    return p0
.end method

.method public final e(Landroid/widget/AutoCompleteTextView;)V
    .locals 9

    .line 1
    invoke-static {p1}, Lza0;->h(Landroid/widget/EditText;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_0

    .line 8
    .line 9
    :cond_0
    iget-object p0, p0, Lde0;->a:Lcom/google/android/material/textfield/TextInputLayout;

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getBoxBackgroundMode()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getBoxBackground()Lfd1;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    sget v2, Lcom/google/android/material/R$attr;->colorControlHighlight:I

    .line 20
    .line 21
    invoke-static {v2, p1}, Lxe2;->q(ILandroid/view/View;)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const v3, 0x10100a7

    .line 26
    .line 27
    .line 28
    filled-new-array {v3}, [I

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    const/4 v4, 0x0

    .line 33
    new-array v5, v4, [I

    .line 34
    .line 35
    filled-new-array {v3, v5}, [[I

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    const/4 v5, 0x1

    .line 40
    const/4 v6, 0x2

    .line 41
    const v7, 0x3dcccccd    # 0.1f

    .line 42
    .line 43
    .line 44
    if-ne v0, v6, :cond_1

    .line 45
    .line 46
    sget p0, Lcom/google/android/material/R$attr;->colorSurface:I

    .line 47
    .line 48
    invoke-static {p0, p1}, Lxe2;->q(ILandroid/view/View;)I

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    new-instance v0, Lfd1;

    .line 53
    .line 54
    iget-object v8, v1, Lfd1;->a:Led1;

    .line 55
    .line 56
    iget-object v8, v8, Led1;->a:Ltc2;

    .line 57
    .line 58
    invoke-direct {v0, v8}, Lfd1;-><init>(Ltc2;)V

    .line 59
    .line 60
    .line 61
    invoke-static {v2, v7, p0}, Lxe2;->A(IFI)I

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    filled-new-array {v2, v4}, [I

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    new-instance v8, Landroid/content/res/ColorStateList;

    .line 70
    .line 71
    invoke-direct {v8, v3, v7}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v8}, Lfd1;->n(Landroid/content/res/ColorStateList;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, p0}, Lfd1;->setTint(I)V

    .line 78
    .line 79
    .line 80
    filled-new-array {v2, p0}, [I

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    new-instance v2, Landroid/content/res/ColorStateList;

    .line 85
    .line 86
    invoke-direct {v2, v3, p0}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 87
    .line 88
    .line 89
    new-instance p0, Lfd1;

    .line 90
    .line 91
    iget-object v3, v1, Lfd1;->a:Led1;

    .line 92
    .line 93
    iget-object v3, v3, Led1;->a:Ltc2;

    .line 94
    .line 95
    invoke-direct {p0, v3}, Lfd1;-><init>(Ltc2;)V

    .line 96
    .line 97
    .line 98
    const/4 v3, -0x1

    .line 99
    invoke-virtual {p0, v3}, Lfd1;->setTint(I)V

    .line 100
    .line 101
    .line 102
    new-instance v3, Landroid/graphics/drawable/RippleDrawable;

    .line 103
    .line 104
    invoke-direct {v3, v2, v0, p0}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 105
    .line 106
    .line 107
    new-array p0, v6, [Landroid/graphics/drawable/Drawable;

    .line 108
    .line 109
    aput-object v3, p0, v4

    .line 110
    .line 111
    aput-object v1, p0, v5

    .line 112
    .line 113
    new-instance v0, Landroid/graphics/drawable/LayerDrawable;

    .line 114
    .line 115
    invoke-direct {v0, p0}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    .line 116
    .line 117
    .line 118
    sget-object p0, Le33;->a:Ljava/util/WeakHashMap;

    .line 119
    .line 120
    invoke-virtual {p1, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    :cond_1
    if-ne v0, v5, :cond_2

    .line 125
    .line 126
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getBoxBackgroundColor()I

    .line 127
    .line 128
    .line 129
    move-result p0

    .line 130
    invoke-static {v2, v7, p0}, Lxe2;->A(IFI)I

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    filled-new-array {v0, p0}, [I

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    new-instance v0, Landroid/content/res/ColorStateList;

    .line 139
    .line 140
    invoke-direct {v0, v3, p0}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 141
    .line 142
    .line 143
    new-instance p0, Landroid/graphics/drawable/RippleDrawable;

    .line 144
    .line 145
    invoke-direct {p0, v0, v1, v1}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 146
    .line 147
    .line 148
    sget-object v0, Le33;->a:Ljava/util/WeakHashMap;

    .line 149
    .line 150
    invoke-virtual {p1, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 151
    .line 152
    .line 153
    :cond_2
    :goto_0
    return-void
.end method

.method public final f()V
    .locals 2

    .line 1
    iget-object v0, p0, Lza0;->q:Landroid/view/accessibility/AccessibilityManager;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Le33;->a:Ljava/util/WeakHashMap;

    .line 6
    .line 7
    iget-object v0, p0, Lde0;->a:Lcom/google/android/material/textfield/TextInputLayout;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lza0;->q:Landroid/view/accessibility/AccessibilityManager;

    .line 16
    .line 17
    new-instance v1, Lu0;

    .line 18
    .line 19
    iget-object p0, p0, Lza0;->k:Lgr0;

    .line 20
    .line 21
    invoke-direct {v1, p0}, Lu0;-><init>(Lgr0;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/view/accessibility/AccessibilityManager;->addTouchExplorationStateChangeListener(Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;)Z

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public final g(FFFI)Lfd1;
    .locals 13

    .line 1
    new-instance v1, Lg52;

    .line 2
    .line 3
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v2, Lg52;

    .line 7
    .line 8
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v3, Lg52;

    .line 12
    .line 13
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    new-instance v4, Lg52;

    .line 17
    .line 18
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    .line 21
    new-instance v5, Ldc0;

    .line 22
    .line 23
    const/4 v6, 0x0

    .line 24
    invoke-direct {v5, v6}, Ldc0;-><init>(I)V

    .line 25
    .line 26
    .line 27
    new-instance v7, Ldc0;

    .line 28
    .line 29
    invoke-direct {v7, v6}, Ldc0;-><init>(I)V

    .line 30
    .line 31
    .line 32
    new-instance v8, Ldc0;

    .line 33
    .line 34
    invoke-direct {v8, v6}, Ldc0;-><init>(I)V

    .line 35
    .line 36
    .line 37
    new-instance v9, Ldc0;

    .line 38
    .line 39
    invoke-direct {v9, v6}, Ldc0;-><init>(I)V

    .line 40
    .line 41
    .line 42
    new-instance v10, Le;

    .line 43
    .line 44
    invoke-direct {v10, p1}, Le;-><init>(F)V

    .line 45
    .line 46
    .line 47
    new-instance v11, Le;

    .line 48
    .line 49
    invoke-direct {v11, p1}, Le;-><init>(F)V

    .line 50
    .line 51
    .line 52
    new-instance p1, Le;

    .line 53
    .line 54
    invoke-direct {p1, p2}, Le;-><init>(F)V

    .line 55
    .line 56
    .line 57
    new-instance v12, Le;

    .line 58
    .line 59
    invoke-direct {v12, p2}, Le;-><init>(F)V

    .line 60
    .line 61
    .line 62
    new-instance v0, Ltc2;

    .line 63
    .line 64
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 65
    .line 66
    .line 67
    iput-object v1, v0, Ltc2;->a:Lw11;

    .line 68
    .line 69
    iput-object v2, v0, Ltc2;->b:Lw11;

    .line 70
    .line 71
    iput-object v3, v0, Ltc2;->c:Lw11;

    .line 72
    .line 73
    iput-object v4, v0, Ltc2;->d:Lw11;

    .line 74
    .line 75
    iput-object v10, v0, Ltc2;->e:Lm10;

    .line 76
    .line 77
    iput-object v11, v0, Ltc2;->f:Lm10;

    .line 78
    .line 79
    iput-object v12, v0, Ltc2;->g:Lm10;

    .line 80
    .line 81
    iput-object p1, v0, Ltc2;->h:Lm10;

    .line 82
    .line 83
    iput-object v5, v0, Ltc2;->i:Ldc0;

    .line 84
    .line 85
    iput-object v7, v0, Ltc2;->j:Ldc0;

    .line 86
    .line 87
    iput-object v8, v0, Ltc2;->k:Ldc0;

    .line 88
    .line 89
    iput-object v9, v0, Ltc2;->l:Ldc0;

    .line 90
    .line 91
    sget-object p1, Lfd1;->h0:Landroid/graphics/Paint;

    .line 92
    .line 93
    sget p1, Lcom/google/android/material/R$attr;->colorSurface:I

    .line 94
    .line 95
    const-class v1, Lfd1;

    .line 96
    .line 97
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    iget-object p0, p0, Lde0;->b:Landroid/content/Context;

    .line 102
    .line 103
    invoke-static {p0, v1, p1}, Lyy1;->D(Landroid/content/Context;Ljava/lang/String;I)I

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    new-instance v1, Lfd1;

    .line 108
    .line 109
    invoke-direct {v1}, Lfd1;-><init>()V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1, p0}, Lfd1;->k(Landroid/content/Context;)V

    .line 113
    .line 114
    .line 115
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    invoke-virtual {v1, p0}, Lfd1;->n(Landroid/content/res/ColorStateList;)V

    .line 120
    .line 121
    .line 122
    move/from16 p0, p3

    .line 123
    .line 124
    invoke-virtual {v1, p0}, Lfd1;->m(F)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v1, v0}, Lfd1;->setShapeAppearanceModel(Ltc2;)V

    .line 128
    .line 129
    .line 130
    iget-object p0, v1, Lfd1;->a:Led1;

    .line 131
    .line 132
    iget-object p1, p0, Led1;->g:Landroid/graphics/Rect;

    .line 133
    .line 134
    if-nez p1, :cond_0

    .line 135
    .line 136
    new-instance p1, Landroid/graphics/Rect;

    .line 137
    .line 138
    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    .line 139
    .line 140
    .line 141
    iput-object p1, p0, Led1;->g:Landroid/graphics/Rect;

    .line 142
    .line 143
    :cond_0
    iget-object p0, v1, Lfd1;->a:Led1;

    .line 144
    .line 145
    iget-object p0, p0, Led1;->g:Landroid/graphics/Rect;

    .line 146
    .line 147
    move/from16 p1, p4

    .line 148
    .line 149
    invoke-virtual {p0, v6, p1, v6, p1}, Landroid/graphics/Rect;->set(IIII)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v1}, Lfd1;->invalidateSelf()V

    .line 153
    .line 154
    .line 155
    return-object v1
.end method

.method public final i(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lza0;->m:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-boolean p1, p0, Lza0;->m:Z

    .line 6
    .line 7
    iget-object p1, p0, Lza0;->s:Landroid/animation/ValueAnimator;

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->cancel()V

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Lza0;->r:Landroid/animation/ValueAnimator;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->start()V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method
