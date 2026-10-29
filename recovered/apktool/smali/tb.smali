.class public final Ltb;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Landroid/widget/TextView;

.field public b:Lvo2;

.field public c:Lvo2;

.field public d:Lvo2;

.field public e:Lvo2;

.field public f:Lvo2;

.field public g:Lvo2;

.field public h:Lvo2;

.field public final i:Lbc;

.field public j:I

.field public k:I

.field public l:Landroid/graphics/Typeface;

.field public m:Z


# direct methods
.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Ltb;->j:I

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    iput v0, p0, Ltb;->k:I

    .line 9
    .line 10
    iput-object p1, p0, Ltb;->a:Landroid/widget/TextView;

    .line 11
    .line 12
    new-instance v0, Lbc;

    .line 13
    .line 14
    invoke-direct {v0, p1}, Lbc;-><init>(Landroid/widget/TextView;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Ltb;->i:Lbc;

    .line 18
    .line 19
    return-void
.end method

.method public static c(Landroid/content/Context;Lya;I)Lvo2;
    .locals 1

    .line 1
    monitor-enter p1

    .line 2
    :try_start_0
    iget-object v0, p1, Lya;->a:Lx32;

    .line 3
    .line 4
    invoke-virtual {v0, p0, p2}, Lx32;->f(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 5
    .line 6
    .line 7
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    monitor-exit p1

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    new-instance p1, Lvo2;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    const/4 p2, 0x1

    .line 17
    iput-boolean p2, p1, Lvo2;->d:Z

    .line 18
    .line 19
    iput-object p0, p1, Lvo2;->a:Landroid/content/res/ColorStateList;

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return-object p0

    .line 24
    :catchall_0
    move-exception p0

    .line 25
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    throw p0
.end method

.method public static h(Landroid/view/inputmethod/EditorInfo;Landroid/view/inputmethod/InputConnection;Landroid/widget/TextView;)V
    .locals 10

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1e

    .line 4
    .line 5
    if-ge v0, v1, :cond_d

    .line 6
    .line 7
    if-eqz p1, :cond_d

    .line 8
    .line 9
    invoke-virtual {p2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-lt v0, v1, :cond_0

    .line 14
    .line 15
    invoke-static {p0, p1}, La10;->c(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    if-lt v0, v1, :cond_1

    .line 23
    .line 24
    invoke-static {p0, p1}, La10;->c(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    iget p2, p0, Landroid/view/inputmethod/EditorInfo;->initialSelStart:I

    .line 29
    .line 30
    iget v0, p0, Landroid/view/inputmethod/EditorInfo;->initialSelEnd:I

    .line 31
    .line 32
    if-le p2, v0, :cond_2

    .line 33
    .line 34
    move v1, v0

    .line 35
    goto :goto_0

    .line 36
    :cond_2
    move v1, p2

    .line 37
    :goto_0
    if-le p2, v0, :cond_3

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_3
    move p2, v0

    .line 41
    :goto_1
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    const/4 v2, 0x0

    .line 46
    const/4 v3, 0x0

    .line 47
    if-ltz v1, :cond_c

    .line 48
    .line 49
    if-le p2, v0, :cond_4

    .line 50
    .line 51
    goto/16 :goto_5

    .line 52
    .line 53
    :cond_4
    iget v4, p0, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 54
    .line 55
    and-int/lit16 v4, v4, 0xfff

    .line 56
    .line 57
    const/16 v5, 0x81

    .line 58
    .line 59
    if-eq v4, v5, :cond_b

    .line 60
    .line 61
    const/16 v5, 0xe1

    .line 62
    .line 63
    if-eq v4, v5, :cond_b

    .line 64
    .line 65
    const/16 v5, 0x12

    .line 66
    .line 67
    if-ne v4, v5, :cond_5

    .line 68
    .line 69
    goto/16 :goto_4

    .line 70
    .line 71
    :cond_5
    const/16 v3, 0x800

    .line 72
    .line 73
    if-gt v0, v3, :cond_6

    .line 74
    .line 75
    invoke-static {p0, p1, v1, p2}, Lde3;->F(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;II)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_6
    sub-int v0, p2, v1

    .line 80
    .line 81
    const/16 v3, 0x400

    .line 82
    .line 83
    if-le v0, v3, :cond_7

    .line 84
    .line 85
    move v3, v2

    .line 86
    goto :goto_2

    .line 87
    :cond_7
    move v3, v0

    .line 88
    :goto_2
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    sub-int/2addr v4, p2

    .line 93
    rsub-int v5, v3, 0x800

    .line 94
    .line 95
    const-wide v6, 0x3fe999999999999aL    # 0.8

    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    int-to-double v8, v5

    .line 101
    mul-double/2addr v8, v6

    .line 102
    double-to-int v6, v8

    .line 103
    invoke-static {v1, v6}, Ljava/lang/Math;->min(II)I

    .line 104
    .line 105
    .line 106
    move-result v6

    .line 107
    sub-int v6, v5, v6

    .line 108
    .line 109
    invoke-static {v4, v6}, Ljava/lang/Math;->min(II)I

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    sub-int/2addr v5, v4

    .line 114
    invoke-static {v1, v5}, Ljava/lang/Math;->min(II)I

    .line 115
    .line 116
    .line 117
    move-result v5

    .line 118
    sub-int/2addr v1, v5

    .line 119
    invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 120
    .line 121
    .line 122
    move-result v6

    .line 123
    invoke-static {v6}, Ljava/lang/Character;->isLowSurrogate(C)Z

    .line 124
    .line 125
    .line 126
    move-result v6

    .line 127
    if-eqz v6, :cond_8

    .line 128
    .line 129
    add-int/lit8 v1, v1, 0x1

    .line 130
    .line 131
    add-int/lit8 v5, v5, -0x1

    .line 132
    .line 133
    :cond_8
    add-int v6, p2, v4

    .line 134
    .line 135
    const/4 v7, 0x1

    .line 136
    sub-int/2addr v6, v7

    .line 137
    invoke-interface {p1, v6}, Ljava/lang/CharSequence;->charAt(I)C

    .line 138
    .line 139
    .line 140
    move-result v6

    .line 141
    invoke-static {v6}, Ljava/lang/Character;->isHighSurrogate(C)Z

    .line 142
    .line 143
    .line 144
    move-result v6

    .line 145
    if-eqz v6, :cond_9

    .line 146
    .line 147
    add-int/lit8 v4, v4, -0x1

    .line 148
    .line 149
    :cond_9
    add-int v6, v5, v3

    .line 150
    .line 151
    add-int v8, v6, v4

    .line 152
    .line 153
    if-eq v3, v0, :cond_a

    .line 154
    .line 155
    add-int v0, v1, v5

    .line 156
    .line 157
    invoke-interface {p1, v1, v0}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    add-int/2addr v4, p2

    .line 162
    invoke-interface {p1, p2, v4}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    const/4 p2, 0x2

    .line 167
    new-array p2, p2, [Ljava/lang/CharSequence;

    .line 168
    .line 169
    aput-object v0, p2, v2

    .line 170
    .line 171
    aput-object p1, p2, v7

    .line 172
    .line 173
    invoke-static {p2}, Landroid/text/TextUtils;->concat([Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    goto :goto_3

    .line 178
    :cond_a
    add-int/2addr v8, v1

    .line 179
    invoke-interface {p1, v1, v8}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    :goto_3
    invoke-static {p0, p1, v5, v6}, Lde3;->F(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;II)V

    .line 184
    .line 185
    .line 186
    return-void

    .line 187
    :cond_b
    :goto_4
    invoke-static {p0, v3, v2, v2}, Lde3;->F(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;II)V

    .line 188
    .line 189
    .line 190
    return-void

    .line 191
    :cond_c
    :goto_5
    invoke-static {p0, v3, v2, v2}, Lde3;->F(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;II)V

    .line 192
    .line 193
    .line 194
    :cond_d
    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/drawable/Drawable;Lvo2;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Ltb;->a:Landroid/widget/TextView;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p1, p2, p0}, Lya;->e(Landroid/graphics/drawable/Drawable;Lvo2;[I)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final b()V
    .locals 6

    .line 1
    iget-object v0, p0, Ltb;->b:Lvo2;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object v3, p0, Ltb;->a:Landroid/widget/TextView;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Ltb;->c:Lvo2;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Ltb;->d:Lvo2;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Ltb;->e:Lvo2;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    :cond_0
    invoke-virtual {v3}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    aget-object v4, v0, v2

    .line 26
    .line 27
    iget-object v5, p0, Ltb;->b:Lvo2;

    .line 28
    .line 29
    invoke-virtual {p0, v4, v5}, Ltb;->a(Landroid/graphics/drawable/Drawable;Lvo2;)V

    .line 30
    .line 31
    .line 32
    const/4 v4, 0x1

    .line 33
    aget-object v4, v0, v4

    .line 34
    .line 35
    iget-object v5, p0, Ltb;->c:Lvo2;

    .line 36
    .line 37
    invoke-virtual {p0, v4, v5}, Ltb;->a(Landroid/graphics/drawable/Drawable;Lvo2;)V

    .line 38
    .line 39
    .line 40
    aget-object v4, v0, v1

    .line 41
    .line 42
    iget-object v5, p0, Ltb;->d:Lvo2;

    .line 43
    .line 44
    invoke-virtual {p0, v4, v5}, Ltb;->a(Landroid/graphics/drawable/Drawable;Lvo2;)V

    .line 45
    .line 46
    .line 47
    const/4 v4, 0x3

    .line 48
    aget-object v0, v0, v4

    .line 49
    .line 50
    iget-object v4, p0, Ltb;->e:Lvo2;

    .line 51
    .line 52
    invoke-virtual {p0, v0, v4}, Ltb;->a(Landroid/graphics/drawable/Drawable;Lvo2;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    iget-object v0, p0, Ltb;->f:Lvo2;

    .line 56
    .line 57
    if-nez v0, :cond_3

    .line 58
    .line 59
    iget-object v0, p0, Ltb;->g:Lvo2;

    .line 60
    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    return-void

    .line 65
    :cond_3
    :goto_0
    invoke-virtual {v3}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    aget-object v2, v0, v2

    .line 70
    .line 71
    iget-object v3, p0, Ltb;->f:Lvo2;

    .line 72
    .line 73
    invoke-virtual {p0, v2, v3}, Ltb;->a(Landroid/graphics/drawable/Drawable;Lvo2;)V

    .line 74
    .line 75
    .line 76
    aget-object v0, v0, v1

    .line 77
    .line 78
    iget-object v1, p0, Ltb;->g:Lvo2;

    .line 79
    .line 80
    invoke-virtual {p0, v0, v1}, Ltb;->a(Landroid/graphics/drawable/Drawable;Lvo2;)V

    .line 81
    .line 82
    .line 83
    return-void
.end method

.method public final d()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    iget-object p0, p0, Ltb;->h:Lvo2;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lvo2;->a:Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return-object p0
.end method

.method public final e()Landroid/graphics/PorterDuff$Mode;
    .locals 0

    .line 1
    iget-object p0, p0, Ltb;->h:Lvo2;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lvo2;->b:Landroid/graphics/PorterDuff$Mode;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return-object p0
.end method

.method public final f(Landroid/util/AttributeSet;I)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v3, p1

    .line 4
    .line 5
    move/from16 v5, p2

    .line 6
    .line 7
    iget-object v1, v0, Ltb;->a:Landroid/widget/TextView;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v7

    .line 13
    invoke-static {}, Lya;->a()Lya;

    .line 14
    .line 15
    .line 16
    move-result-object v8

    .line 17
    sget-object v2, Landroidx/appcompat/R$styleable;->AppCompatTextHelper:[I

    .line 18
    .line 19
    invoke-static {v7, v3, v2, v5}, Lac1;->H(Landroid/content/Context;Landroid/util/AttributeSet;[II)Lac1;

    .line 20
    .line 21
    .line 22
    move-result-object v9

    .line 23
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    sget-object v3, Landroidx/appcompat/R$styleable;->AppCompatTextHelper:[I

    .line 28
    .line 29
    iget-object v4, v9, Lac1;->c:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v4, Landroid/content/res/TypedArray;

    .line 32
    .line 33
    move v6, v5

    .line 34
    move-object v5, v4

    .line 35
    move-object/from16 v4, p1

    .line 36
    .line 37
    invoke-static/range {v1 .. v6}, Le33;->m(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V

    .line 38
    .line 39
    .line 40
    move-object v3, v4

    .line 41
    move v5, v6

    .line 42
    move-object v6, v1

    .line 43
    sget v1, Landroidx/appcompat/R$styleable;->AppCompatTextHelper_android_textAppearance:I

    .line 44
    .line 45
    iget-object v2, v9, Lac1;->c:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v2, Landroid/content/res/TypedArray;

    .line 48
    .line 49
    const/4 v10, -0x1

    .line 50
    invoke-virtual {v2, v1, v10}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    sget v4, Landroidx/appcompat/R$styleable;->AppCompatTextHelper_android_drawableLeft:I

    .line 55
    .line 56
    invoke-virtual {v2, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    const/4 v11, 0x0

    .line 61
    if-eqz v4, :cond_0

    .line 62
    .line 63
    sget v4, Landroidx/appcompat/R$styleable;->AppCompatTextHelper_android_drawableLeft:I

    .line 64
    .line 65
    invoke-virtual {v2, v4, v11}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    invoke-static {v7, v8, v4}, Ltb;->c(Landroid/content/Context;Lya;I)Lvo2;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    iput-object v4, v0, Ltb;->b:Lvo2;

    .line 74
    .line 75
    :cond_0
    sget v4, Landroidx/appcompat/R$styleable;->AppCompatTextHelper_android_drawableTop:I

    .line 76
    .line 77
    invoke-virtual {v2, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    if-eqz v4, :cond_1

    .line 82
    .line 83
    sget v4, Landroidx/appcompat/R$styleable;->AppCompatTextHelper_android_drawableTop:I

    .line 84
    .line 85
    invoke-virtual {v2, v4, v11}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    invoke-static {v7, v8, v4}, Ltb;->c(Landroid/content/Context;Lya;I)Lvo2;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    iput-object v4, v0, Ltb;->c:Lvo2;

    .line 94
    .line 95
    :cond_1
    sget v4, Landroidx/appcompat/R$styleable;->AppCompatTextHelper_android_drawableRight:I

    .line 96
    .line 97
    invoke-virtual {v2, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 98
    .line 99
    .line 100
    move-result v4

    .line 101
    if-eqz v4, :cond_2

    .line 102
    .line 103
    sget v4, Landroidx/appcompat/R$styleable;->AppCompatTextHelper_android_drawableRight:I

    .line 104
    .line 105
    invoke-virtual {v2, v4, v11}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    invoke-static {v7, v8, v4}, Ltb;->c(Landroid/content/Context;Lya;I)Lvo2;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    iput-object v4, v0, Ltb;->d:Lvo2;

    .line 114
    .line 115
    :cond_2
    sget v4, Landroidx/appcompat/R$styleable;->AppCompatTextHelper_android_drawableBottom:I

    .line 116
    .line 117
    invoke-virtual {v2, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    if-eqz v4, :cond_3

    .line 122
    .line 123
    sget v4, Landroidx/appcompat/R$styleable;->AppCompatTextHelper_android_drawableBottom:I

    .line 124
    .line 125
    invoke-virtual {v2, v4, v11}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 126
    .line 127
    .line 128
    move-result v4

    .line 129
    invoke-static {v7, v8, v4}, Ltb;->c(Landroid/content/Context;Lya;I)Lvo2;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    iput-object v4, v0, Ltb;->e:Lvo2;

    .line 134
    .line 135
    :cond_3
    sget v4, Landroidx/appcompat/R$styleable;->AppCompatTextHelper_android_drawableStart:I

    .line 136
    .line 137
    invoke-virtual {v2, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 138
    .line 139
    .line 140
    move-result v4

    .line 141
    if-eqz v4, :cond_4

    .line 142
    .line 143
    sget v4, Landroidx/appcompat/R$styleable;->AppCompatTextHelper_android_drawableStart:I

    .line 144
    .line 145
    invoke-virtual {v2, v4, v11}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 146
    .line 147
    .line 148
    move-result v4

    .line 149
    invoke-static {v7, v8, v4}, Ltb;->c(Landroid/content/Context;Lya;I)Lvo2;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    iput-object v4, v0, Ltb;->f:Lvo2;

    .line 154
    .line 155
    :cond_4
    sget v4, Landroidx/appcompat/R$styleable;->AppCompatTextHelper_android_drawableEnd:I

    .line 156
    .line 157
    invoke-virtual {v2, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 158
    .line 159
    .line 160
    move-result v4

    .line 161
    if-eqz v4, :cond_5

    .line 162
    .line 163
    sget v4, Landroidx/appcompat/R$styleable;->AppCompatTextHelper_android_drawableEnd:I

    .line 164
    .line 165
    invoke-virtual {v2, v4, v11}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 166
    .line 167
    .line 168
    move-result v2

    .line 169
    invoke-static {v7, v8, v2}, Ltb;->c(Landroid/content/Context;Lya;I)Lvo2;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    iput-object v2, v0, Ltb;->g:Lvo2;

    .line 174
    .line 175
    :cond_5
    invoke-virtual {v9}, Lac1;->J()V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v6}, Landroid/widget/TextView;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    instance-of v2, v2, Landroid/text/method/PasswordTransformationMethod;

    .line 183
    .line 184
    const/16 v4, 0x1a

    .line 185
    .line 186
    if-eq v1, v10, :cond_9

    .line 187
    .line 188
    sget-object v13, Landroidx/appcompat/R$styleable;->TextAppearance:[I

    .line 189
    .line 190
    new-instance v14, Lac1;

    .line 191
    .line 192
    invoke-virtual {v7, v1, v13}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    invoke-direct {v14, v7, v1}, Lac1;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    .line 197
    .line 198
    .line 199
    if-nez v2, :cond_6

    .line 200
    .line 201
    sget v13, Landroidx/appcompat/R$styleable;->TextAppearance_textAllCaps:I

    .line 202
    .line 203
    invoke-virtual {v1, v13}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 204
    .line 205
    .line 206
    move-result v13

    .line 207
    if-eqz v13, :cond_6

    .line 208
    .line 209
    sget v13, Landroidx/appcompat/R$styleable;->TextAppearance_textAllCaps:I

    .line 210
    .line 211
    invoke-virtual {v1, v13, v11}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 212
    .line 213
    .line 214
    move-result v13

    .line 215
    const/4 v15, 0x1

    .line 216
    goto :goto_0

    .line 217
    :cond_6
    move v13, v11

    .line 218
    move v15, v13

    .line 219
    :goto_0
    invoke-virtual {v0, v7, v14}, Ltb;->n(Landroid/content/Context;Lac1;)V

    .line 220
    .line 221
    .line 222
    sget v12, Landroidx/appcompat/R$styleable;->TextAppearance_textLocale:I

    .line 223
    .line 224
    invoke-virtual {v1, v12}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 225
    .line 226
    .line 227
    move-result v12

    .line 228
    if-eqz v12, :cond_7

    .line 229
    .line 230
    sget v12, Landroidx/appcompat/R$styleable;->TextAppearance_textLocale:I

    .line 231
    .line 232
    invoke-virtual {v1, v12}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v12

    .line 236
    goto :goto_1

    .line 237
    :cond_7
    const/4 v12, 0x0

    .line 238
    :goto_1
    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 239
    .line 240
    if-lt v9, v4, :cond_8

    .line 241
    .line 242
    sget v9, Landroidx/appcompat/R$styleable;->TextAppearance_fontVariationSettings:I

    .line 243
    .line 244
    invoke-virtual {v1, v9}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 245
    .line 246
    .line 247
    move-result v9

    .line 248
    if-eqz v9, :cond_8

    .line 249
    .line 250
    sget v9, Landroidx/appcompat/R$styleable;->TextAppearance_fontVariationSettings:I

    .line 251
    .line 252
    invoke-virtual {v1, v9}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v1

    .line 256
    goto :goto_2

    .line 257
    :cond_8
    const/4 v1, 0x0

    .line 258
    :goto_2
    invoke-virtual {v14}, Lac1;->J()V

    .line 259
    .line 260
    .line 261
    goto :goto_3

    .line 262
    :cond_9
    move v13, v11

    .line 263
    move v15, v13

    .line 264
    const/4 v1, 0x0

    .line 265
    const/4 v12, 0x0

    .line 266
    :goto_3
    sget-object v9, Landroidx/appcompat/R$styleable;->TextAppearance:[I

    .line 267
    .line 268
    new-instance v14, Lac1;

    .line 269
    .line 270
    invoke-virtual {v7, v3, v9, v5, v11}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 271
    .line 272
    .line 273
    move-result-object v9

    .line 274
    invoke-direct {v14, v7, v9}, Lac1;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    .line 275
    .line 276
    .line 277
    if-nez v2, :cond_a

    .line 278
    .line 279
    sget v10, Landroidx/appcompat/R$styleable;->TextAppearance_textAllCaps:I

    .line 280
    .line 281
    invoke-virtual {v9, v10}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 282
    .line 283
    .line 284
    move-result v10

    .line 285
    if-eqz v10, :cond_a

    .line 286
    .line 287
    sget v10, Landroidx/appcompat/R$styleable;->TextAppearance_textAllCaps:I

    .line 288
    .line 289
    invoke-virtual {v9, v10, v11}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 290
    .line 291
    .line 292
    move-result v13

    .line 293
    const/4 v15, 0x1

    .line 294
    :cond_a
    sget v10, Landroidx/appcompat/R$styleable;->TextAppearance_textLocale:I

    .line 295
    .line 296
    invoke-virtual {v9, v10}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 297
    .line 298
    .line 299
    move-result v10

    .line 300
    if-eqz v10, :cond_b

    .line 301
    .line 302
    sget v10, Landroidx/appcompat/R$styleable;->TextAppearance_textLocale:I

    .line 303
    .line 304
    invoke-virtual {v9, v10}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v12

    .line 308
    :cond_b
    sget v10, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 309
    .line 310
    if-lt v10, v4, :cond_c

    .line 311
    .line 312
    sget v4, Landroidx/appcompat/R$styleable;->TextAppearance_fontVariationSettings:I

    .line 313
    .line 314
    invoke-virtual {v9, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 315
    .line 316
    .line 317
    move-result v4

    .line 318
    if-eqz v4, :cond_c

    .line 319
    .line 320
    sget v1, Landroidx/appcompat/R$styleable;->TextAppearance_fontVariationSettings:I

    .line 321
    .line 322
    invoke-virtual {v9, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v1

    .line 326
    :cond_c
    const/16 v4, 0x1c

    .line 327
    .line 328
    if-lt v10, v4, :cond_d

    .line 329
    .line 330
    sget v4, Landroidx/appcompat/R$styleable;->TextAppearance_android_textSize:I

    .line 331
    .line 332
    invoke-virtual {v9, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 333
    .line 334
    .line 335
    move-result v4

    .line 336
    if-eqz v4, :cond_d

    .line 337
    .line 338
    sget v4, Landroidx/appcompat/R$styleable;->TextAppearance_android_textSize:I

    .line 339
    .line 340
    const/4 v10, -0x1

    .line 341
    invoke-virtual {v9, v4, v10}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 342
    .line 343
    .line 344
    move-result v4

    .line 345
    if-nez v4, :cond_d

    .line 346
    .line 347
    const/4 v4, 0x0

    .line 348
    invoke-virtual {v6, v11, v4}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 349
    .line 350
    .line 351
    :cond_d
    invoke-virtual {v0, v7, v14}, Ltb;->n(Landroid/content/Context;Lac1;)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v14}, Lac1;->J()V

    .line 355
    .line 356
    .line 357
    if-nez v2, :cond_e

    .line 358
    .line 359
    if-eqz v15, :cond_e

    .line 360
    .line 361
    invoke-virtual {v6, v13}, Landroid/widget/TextView;->setAllCaps(Z)V

    .line 362
    .line 363
    .line 364
    :cond_e
    iget-object v2, v0, Ltb;->l:Landroid/graphics/Typeface;

    .line 365
    .line 366
    if-eqz v2, :cond_10

    .line 367
    .line 368
    iget v4, v0, Ltb;->k:I

    .line 369
    .line 370
    const/4 v10, -0x1

    .line 371
    if-ne v4, v10, :cond_f

    .line 372
    .line 373
    iget v4, v0, Ltb;->j:I

    .line 374
    .line 375
    invoke-virtual {v6, v2, v4}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 376
    .line 377
    .line 378
    goto :goto_4

    .line 379
    :cond_f
    invoke-virtual {v6, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 380
    .line 381
    .line 382
    :cond_10
    :goto_4
    if-eqz v1, :cond_11

    .line 383
    .line 384
    invoke-static {v6, v1}, Lrb;->d(Landroid/widget/TextView;Ljava/lang/String;)Z

    .line 385
    .line 386
    .line 387
    :cond_11
    if-eqz v12, :cond_12

    .line 388
    .line 389
    invoke-static {v12}, Lqb;->a(Ljava/lang/String;)Landroid/os/LocaleList;

    .line 390
    .line 391
    .line 392
    move-result-object v1

    .line 393
    invoke-static {v6, v1}, Lqb;->b(Landroid/widget/TextView;Landroid/os/LocaleList;)V

    .line 394
    .line 395
    .line 396
    :cond_12
    iget-object v9, v0, Ltb;->i:Lbc;

    .line 397
    .line 398
    iget-object v10, v9, Lbc;->j:Landroid/content/Context;

    .line 399
    .line 400
    sget-object v0, Landroidx/appcompat/R$styleable;->AppCompatTextView:[I

    .line 401
    .line 402
    invoke-virtual {v10, v3, v0, v5, v11}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 403
    .line 404
    .line 405
    move-result-object v4

    .line 406
    iget-object v0, v9, Lbc;->i:Landroid/widget/TextView;

    .line 407
    .line 408
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 409
    .line 410
    .line 411
    move-result-object v1

    .line 412
    sget-object v2, Landroidx/appcompat/R$styleable;->AppCompatTextView:[I

    .line 413
    .line 414
    invoke-static/range {v0 .. v5}, Le33;->m(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V

    .line 415
    .line 416
    .line 417
    sget v0, Landroidx/appcompat/R$styleable;->AppCompatTextView_autoSizeTextType:I

    .line 418
    .line 419
    invoke-virtual {v4, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 420
    .line 421
    .line 422
    move-result v0

    .line 423
    if-eqz v0, :cond_13

    .line 424
    .line 425
    sget v0, Landroidx/appcompat/R$styleable;->AppCompatTextView_autoSizeTextType:I

    .line 426
    .line 427
    invoke-virtual {v4, v0, v11}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 428
    .line 429
    .line 430
    move-result v0

    .line 431
    iput v0, v9, Lbc;->a:I

    .line 432
    .line 433
    :cond_13
    sget v0, Landroidx/appcompat/R$styleable;->AppCompatTextView_autoSizeStepGranularity:I

    .line 434
    .line 435
    invoke-virtual {v4, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 436
    .line 437
    .line 438
    move-result v0

    .line 439
    const/high16 v1, -0x40800000    # -1.0f

    .line 440
    .line 441
    if-eqz v0, :cond_14

    .line 442
    .line 443
    sget v0, Landroidx/appcompat/R$styleable;->AppCompatTextView_autoSizeStepGranularity:I

    .line 444
    .line 445
    invoke-virtual {v4, v0, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 446
    .line 447
    .line 448
    move-result v0

    .line 449
    goto :goto_5

    .line 450
    :cond_14
    move v0, v1

    .line 451
    :goto_5
    sget v2, Landroidx/appcompat/R$styleable;->AppCompatTextView_autoSizeMinTextSize:I

    .line 452
    .line 453
    invoke-virtual {v4, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 454
    .line 455
    .line 456
    move-result v2

    .line 457
    if-eqz v2, :cond_15

    .line 458
    .line 459
    sget v2, Landroidx/appcompat/R$styleable;->AppCompatTextView_autoSizeMinTextSize:I

    .line 460
    .line 461
    invoke-virtual {v4, v2, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 462
    .line 463
    .line 464
    move-result v2

    .line 465
    goto :goto_6

    .line 466
    :cond_15
    move v2, v1

    .line 467
    :goto_6
    sget v5, Landroidx/appcompat/R$styleable;->AppCompatTextView_autoSizeMaxTextSize:I

    .line 468
    .line 469
    invoke-virtual {v4, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 470
    .line 471
    .line 472
    move-result v5

    .line 473
    if-eqz v5, :cond_16

    .line 474
    .line 475
    sget v5, Landroidx/appcompat/R$styleable;->AppCompatTextView_autoSizeMaxTextSize:I

    .line 476
    .line 477
    invoke-virtual {v4, v5, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 478
    .line 479
    .line 480
    move-result v5

    .line 481
    goto :goto_7

    .line 482
    :cond_16
    move v5, v1

    .line 483
    :goto_7
    sget v12, Landroidx/appcompat/R$styleable;->AppCompatTextView_autoSizePresetSizes:I

    .line 484
    .line 485
    invoke-virtual {v4, v12}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 486
    .line 487
    .line 488
    move-result v12

    .line 489
    if-eqz v12, :cond_19

    .line 490
    .line 491
    sget v12, Landroidx/appcompat/R$styleable;->AppCompatTextView_autoSizePresetSizes:I

    .line 492
    .line 493
    invoke-virtual {v4, v12, v11}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 494
    .line 495
    .line 496
    move-result v12

    .line 497
    if-lez v12, :cond_19

    .line 498
    .line 499
    invoke-virtual {v4}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    .line 500
    .line 501
    .line 502
    move-result-object v13

    .line 503
    invoke-virtual {v13, v12}, Landroid/content/res/Resources;->obtainTypedArray(I)Landroid/content/res/TypedArray;

    .line 504
    .line 505
    .line 506
    move-result-object v12

    .line 507
    invoke-virtual {v12}, Landroid/content/res/TypedArray;->length()I

    .line 508
    .line 509
    .line 510
    move-result v13

    .line 511
    new-array v14, v13, [I

    .line 512
    .line 513
    if-lez v13, :cond_18

    .line 514
    .line 515
    move v15, v11

    .line 516
    :goto_8
    if-ge v15, v13, :cond_17

    .line 517
    .line 518
    move/from16 p0, v1

    .line 519
    .line 520
    const/4 v1, -0x1

    .line 521
    invoke-virtual {v12, v15, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 522
    .line 523
    .line 524
    move-result v17

    .line 525
    aput v17, v14, v15

    .line 526
    .line 527
    add-int/lit8 v15, v15, 0x1

    .line 528
    .line 529
    move/from16 v1, p0

    .line 530
    .line 531
    goto :goto_8

    .line 532
    :cond_17
    move/from16 p0, v1

    .line 533
    .line 534
    invoke-static {v14}, Lbc;->b([I)[I

    .line 535
    .line 536
    .line 537
    move-result-object v1

    .line 538
    iput-object v1, v9, Lbc;->f:[I

    .line 539
    .line 540
    invoke-virtual {v9}, Lbc;->i()Z

    .line 541
    .line 542
    .line 543
    goto :goto_9

    .line 544
    :cond_18
    move/from16 p0, v1

    .line 545
    .line 546
    :goto_9
    invoke-virtual {v12}, Landroid/content/res/TypedArray;->recycle()V

    .line 547
    .line 548
    .line 549
    goto :goto_a

    .line 550
    :cond_19
    move/from16 p0, v1

    .line 551
    .line 552
    :goto_a
    invoke-virtual {v4}, Landroid/content/res/TypedArray;->recycle()V

    .line 553
    .line 554
    .line 555
    invoke-virtual {v9}, Lbc;->j()Z

    .line 556
    .line 557
    .line 558
    move-result v1

    .line 559
    const/4 v4, 0x2

    .line 560
    if-eqz v1, :cond_1e

    .line 561
    .line 562
    iget v1, v9, Lbc;->a:I

    .line 563
    .line 564
    const/4 v12, 0x1

    .line 565
    if-ne v1, v12, :cond_1f

    .line 566
    .line 567
    iget-boolean v1, v9, Lbc;->g:Z

    .line 568
    .line 569
    if-nez v1, :cond_1d

    .line 570
    .line 571
    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 572
    .line 573
    .line 574
    move-result-object v1

    .line 575
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 576
    .line 577
    .line 578
    move-result-object v1

    .line 579
    cmpl-float v10, v2, p0

    .line 580
    .line 581
    if-nez v10, :cond_1a

    .line 582
    .line 583
    const/high16 v2, 0x41400000    # 12.0f

    .line 584
    .line 585
    invoke-static {v4, v2, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 586
    .line 587
    .line 588
    move-result v2

    .line 589
    :cond_1a
    cmpl-float v10, v5, p0

    .line 590
    .line 591
    if-nez v10, :cond_1b

    .line 592
    .line 593
    const/high16 v5, 0x42e00000    # 112.0f

    .line 594
    .line 595
    invoke-static {v4, v5, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 596
    .line 597
    .line 598
    move-result v5

    .line 599
    :cond_1b
    cmpl-float v1, v0, p0

    .line 600
    .line 601
    if-nez v1, :cond_1c

    .line 602
    .line 603
    const/high16 v0, 0x3f800000    # 1.0f

    .line 604
    .line 605
    :cond_1c
    invoke-virtual {v9, v2, v5, v0}, Lbc;->k(FFF)V

    .line 606
    .line 607
    .line 608
    :cond_1d
    invoke-virtual {v9}, Lbc;->h()Z

    .line 609
    .line 610
    .line 611
    goto :goto_b

    .line 612
    :cond_1e
    iput v11, v9, Lbc;->a:I

    .line 613
    .line 614
    :cond_1f
    :goto_b
    sget-boolean v0, Lm53;->c:Z

    .line 615
    .line 616
    if-eqz v0, :cond_21

    .line 617
    .line 618
    iget v0, v9, Lbc;->a:I

    .line 619
    .line 620
    if-eqz v0, :cond_21

    .line 621
    .line 622
    iget-object v0, v9, Lbc;->f:[I

    .line 623
    .line 624
    array-length v1, v0

    .line 625
    if-lez v1, :cond_21

    .line 626
    .line 627
    invoke-static {v6}, Lrb;->a(Landroid/widget/TextView;)I

    .line 628
    .line 629
    .line 630
    move-result v1

    .line 631
    int-to-float v1, v1

    .line 632
    cmpl-float v1, v1, p0

    .line 633
    .line 634
    if-eqz v1, :cond_20

    .line 635
    .line 636
    iget v0, v9, Lbc;->d:F

    .line 637
    .line 638
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 639
    .line 640
    .line 641
    move-result v0

    .line 642
    iget v1, v9, Lbc;->e:F

    .line 643
    .line 644
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 645
    .line 646
    .line 647
    move-result v1

    .line 648
    iget v2, v9, Lbc;->c:F

    .line 649
    .line 650
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 651
    .line 652
    .line 653
    move-result v2

    .line 654
    invoke-static {v6, v0, v1, v2, v11}, Lrb;->b(Landroid/widget/TextView;IIII)V

    .line 655
    .line 656
    .line 657
    goto :goto_c

    .line 658
    :cond_20
    invoke-static {v6, v0, v11}, Lrb;->c(Landroid/widget/TextView;[II)V

    .line 659
    .line 660
    .line 661
    :cond_21
    :goto_c
    sget-object v0, Landroidx/appcompat/R$styleable;->AppCompatTextView:[I

    .line 662
    .line 663
    invoke-virtual {v7, v3, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 664
    .line 665
    .line 666
    move-result-object v0

    .line 667
    sget v1, Landroidx/appcompat/R$styleable;->AppCompatTextView_drawableLeftCompat:I

    .line 668
    .line 669
    const/4 v10, -0x1

    .line 670
    invoke-virtual {v0, v1, v10}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 671
    .line 672
    .line 673
    move-result v1

    .line 674
    if-eq v1, v10, :cond_22

    .line 675
    .line 676
    invoke-virtual {v8, v7, v1}, Lya;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 677
    .line 678
    .line 679
    move-result-object v1

    .line 680
    goto :goto_d

    .line 681
    :cond_22
    const/4 v1, 0x0

    .line 682
    :goto_d
    sget v2, Landroidx/appcompat/R$styleable;->AppCompatTextView_drawableTopCompat:I

    .line 683
    .line 684
    invoke-virtual {v0, v2, v10}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 685
    .line 686
    .line 687
    move-result v2

    .line 688
    if-eq v2, v10, :cond_23

    .line 689
    .line 690
    invoke-virtual {v8, v7, v2}, Lya;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 691
    .line 692
    .line 693
    move-result-object v2

    .line 694
    goto :goto_e

    .line 695
    :cond_23
    const/4 v2, 0x0

    .line 696
    :goto_e
    sget v3, Landroidx/appcompat/R$styleable;->AppCompatTextView_drawableRightCompat:I

    .line 697
    .line 698
    invoke-virtual {v0, v3, v10}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 699
    .line 700
    .line 701
    move-result v3

    .line 702
    if-eq v3, v10, :cond_24

    .line 703
    .line 704
    invoke-virtual {v8, v7, v3}, Lya;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 705
    .line 706
    .line 707
    move-result-object v3

    .line 708
    goto :goto_f

    .line 709
    :cond_24
    const/4 v3, 0x0

    .line 710
    :goto_f
    sget v5, Landroidx/appcompat/R$styleable;->AppCompatTextView_drawableBottomCompat:I

    .line 711
    .line 712
    invoke-virtual {v0, v5, v10}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 713
    .line 714
    .line 715
    move-result v5

    .line 716
    if-eq v5, v10, :cond_25

    .line 717
    .line 718
    invoke-virtual {v8, v7, v5}, Lya;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 719
    .line 720
    .line 721
    move-result-object v5

    .line 722
    goto :goto_10

    .line 723
    :cond_25
    const/4 v5, 0x0

    .line 724
    :goto_10
    sget v9, Landroidx/appcompat/R$styleable;->AppCompatTextView_drawableStartCompat:I

    .line 725
    .line 726
    invoke-virtual {v0, v9, v10}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 727
    .line 728
    .line 729
    move-result v9

    .line 730
    if-eq v9, v10, :cond_26

    .line 731
    .line 732
    invoke-virtual {v8, v7, v9}, Lya;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 733
    .line 734
    .line 735
    move-result-object v9

    .line 736
    goto :goto_11

    .line 737
    :cond_26
    const/4 v9, 0x0

    .line 738
    :goto_11
    sget v12, Landroidx/appcompat/R$styleable;->AppCompatTextView_drawableEndCompat:I

    .line 739
    .line 740
    invoke-virtual {v0, v12, v10}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 741
    .line 742
    .line 743
    move-result v12

    .line 744
    if-eq v12, v10, :cond_27

    .line 745
    .line 746
    invoke-virtual {v8, v7, v12}, Lya;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 747
    .line 748
    .line 749
    move-result-object v8

    .line 750
    goto :goto_12

    .line 751
    :cond_27
    const/4 v8, 0x0

    .line 752
    :goto_12
    const/4 v10, 0x3

    .line 753
    if-nez v9, :cond_32

    .line 754
    .line 755
    if-eqz v8, :cond_28

    .line 756
    .line 757
    goto :goto_1a

    .line 758
    :cond_28
    if-nez v1, :cond_29

    .line 759
    .line 760
    if-nez v2, :cond_29

    .line 761
    .line 762
    if-nez v3, :cond_29

    .line 763
    .line 764
    if-eqz v5, :cond_37

    .line 765
    .line 766
    :cond_29
    invoke-virtual {v6}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    .line 767
    .line 768
    .line 769
    move-result-object v8

    .line 770
    aget-object v9, v8, v11

    .line 771
    .line 772
    if-nez v9, :cond_2f

    .line 773
    .line 774
    aget-object v12, v8, v4

    .line 775
    .line 776
    if-eqz v12, :cond_2a

    .line 777
    .line 778
    goto :goto_17

    .line 779
    :cond_2a
    invoke-virtual {v6}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    .line 780
    .line 781
    .line 782
    move-result-object v8

    .line 783
    if-eqz v1, :cond_2b

    .line 784
    .line 785
    goto :goto_13

    .line 786
    :cond_2b
    aget-object v1, v8, v11

    .line 787
    .line 788
    :goto_13
    if-eqz v2, :cond_2c

    .line 789
    .line 790
    goto :goto_14

    .line 791
    :cond_2c
    const/16 v16, 0x1

    .line 792
    .line 793
    aget-object v2, v8, v16

    .line 794
    .line 795
    :goto_14
    if-eqz v3, :cond_2d

    .line 796
    .line 797
    goto :goto_15

    .line 798
    :cond_2d
    aget-object v3, v8, v4

    .line 799
    .line 800
    :goto_15
    if-eqz v5, :cond_2e

    .line 801
    .line 802
    goto :goto_16

    .line 803
    :cond_2e
    aget-object v5, v8, v10

    .line 804
    .line 805
    :goto_16
    invoke-virtual {v6, v1, v2, v3, v5}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 806
    .line 807
    .line 808
    goto :goto_1f

    .line 809
    :cond_2f
    :goto_17
    if-eqz v2, :cond_30

    .line 810
    .line 811
    goto :goto_18

    .line 812
    :cond_30
    const/16 v16, 0x1

    .line 813
    .line 814
    aget-object v2, v8, v16

    .line 815
    .line 816
    :goto_18
    if-eqz v5, :cond_31

    .line 817
    .line 818
    goto :goto_19

    .line 819
    :cond_31
    aget-object v5, v8, v10

    .line 820
    .line 821
    :goto_19
    aget-object v1, v8, v4

    .line 822
    .line 823
    invoke-virtual {v6, v9, v2, v1, v5}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 824
    .line 825
    .line 826
    goto :goto_1f

    .line 827
    :cond_32
    :goto_1a
    invoke-virtual {v6}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    .line 828
    .line 829
    .line 830
    move-result-object v1

    .line 831
    if-eqz v9, :cond_33

    .line 832
    .line 833
    goto :goto_1b

    .line 834
    :cond_33
    aget-object v9, v1, v11

    .line 835
    .line 836
    :goto_1b
    if-eqz v2, :cond_34

    .line 837
    .line 838
    goto :goto_1c

    .line 839
    :cond_34
    const/16 v16, 0x1

    .line 840
    .line 841
    aget-object v2, v1, v16

    .line 842
    .line 843
    :goto_1c
    if-eqz v8, :cond_35

    .line 844
    .line 845
    goto :goto_1d

    .line 846
    :cond_35
    aget-object v8, v1, v4

    .line 847
    .line 848
    :goto_1d
    if-eqz v5, :cond_36

    .line 849
    .line 850
    goto :goto_1e

    .line 851
    :cond_36
    aget-object v5, v1, v10

    .line 852
    .line 853
    :goto_1e
    invoke-virtual {v6, v9, v2, v8, v5}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 854
    .line 855
    .line 856
    :cond_37
    :goto_1f
    sget v1, Landroidx/appcompat/R$styleable;->AppCompatTextView_drawableTint:I

    .line 857
    .line 858
    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 859
    .line 860
    .line 861
    move-result v1

    .line 862
    if-eqz v1, :cond_39

    .line 863
    .line 864
    sget v1, Landroidx/appcompat/R$styleable;->AppCompatTextView_drawableTint:I

    .line 865
    .line 866
    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 867
    .line 868
    .line 869
    move-result v2

    .line 870
    if-eqz v2, :cond_38

    .line 871
    .line 872
    invoke-virtual {v0, v1, v11}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 873
    .line 874
    .line 875
    move-result v2

    .line 876
    if-eqz v2, :cond_38

    .line 877
    .line 878
    invoke-static {v7, v2}, Lv00;->getColorStateList(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 879
    .line 880
    .line 881
    move-result-object v2

    .line 882
    if-eqz v2, :cond_38

    .line 883
    .line 884
    goto :goto_20

    .line 885
    :cond_38
    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 886
    .line 887
    .line 888
    move-result-object v2

    .line 889
    :goto_20
    invoke-static {v6, v2}, Lkn2;->f(Landroid/widget/TextView;Landroid/content/res/ColorStateList;)V

    .line 890
    .line 891
    .line 892
    :cond_39
    sget v1, Landroidx/appcompat/R$styleable;->AppCompatTextView_drawableTintMode:I

    .line 893
    .line 894
    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 895
    .line 896
    .line 897
    move-result v1

    .line 898
    if-eqz v1, :cond_3a

    .line 899
    .line 900
    sget v1, Landroidx/appcompat/R$styleable;->AppCompatTextView_drawableTintMode:I

    .line 901
    .line 902
    const/4 v10, -0x1

    .line 903
    invoke-virtual {v0, v1, v10}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 904
    .line 905
    .line 906
    move-result v1

    .line 907
    const/4 v2, 0x0

    .line 908
    invoke-static {v1, v2}, Lw90;->c(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    .line 909
    .line 910
    .line 911
    move-result-object v1

    .line 912
    invoke-static {v6, v1}, Lkn2;->g(Landroid/widget/TextView;Landroid/graphics/PorterDuff$Mode;)V

    .line 913
    .line 914
    .line 915
    goto :goto_21

    .line 916
    :cond_3a
    const/4 v10, -0x1

    .line 917
    :goto_21
    sget v1, Landroidx/appcompat/R$styleable;->AppCompatTextView_firstBaselineToTopHeight:I

    .line 918
    .line 919
    invoke-virtual {v0, v1, v10}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 920
    .line 921
    .line 922
    move-result v1

    .line 923
    sget v2, Landroidx/appcompat/R$styleable;->AppCompatTextView_lastBaselineToBottomHeight:I

    .line 924
    .line 925
    invoke-virtual {v0, v2, v10}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 926
    .line 927
    .line 928
    move-result v2

    .line 929
    sget v3, Landroidx/appcompat/R$styleable;->AppCompatTextView_lineHeight:I

    .line 930
    .line 931
    invoke-virtual {v0, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 932
    .line 933
    .line 934
    move-result v3

    .line 935
    if-eqz v3, :cond_3c

    .line 936
    .line 937
    sget v3, Landroidx/appcompat/R$styleable;->AppCompatTextView_lineHeight:I

    .line 938
    .line 939
    invoke-virtual {v0, v3}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    .line 940
    .line 941
    .line 942
    move-result-object v3

    .line 943
    if-eqz v3, :cond_3b

    .line 944
    .line 945
    iget v4, v3, Landroid/util/TypedValue;->type:I

    .line 946
    .line 947
    const/4 v5, 0x5

    .line 948
    if-ne v4, v5, :cond_3b

    .line 949
    .line 950
    iget v3, v3, Landroid/util/TypedValue;->data:I

    .line 951
    .line 952
    and-int/lit8 v10, v3, 0xf

    .line 953
    .line 954
    invoke-static {v3}, Landroid/util/TypedValue;->complexToFloat(I)F

    .line 955
    .line 956
    .line 957
    move-result v3

    .line 958
    move v4, v10

    .line 959
    const/4 v10, -0x1

    .line 960
    goto :goto_23

    .line 961
    :cond_3b
    sget v3, Landroidx/appcompat/R$styleable;->AppCompatTextView_lineHeight:I

    .line 962
    .line 963
    const/4 v10, -0x1

    .line 964
    invoke-virtual {v0, v3, v10}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 965
    .line 966
    .line 967
    move-result v3

    .line 968
    int-to-float v3, v3

    .line 969
    :goto_22
    move v4, v10

    .line 970
    goto :goto_23

    .line 971
    :cond_3c
    const/4 v10, -0x1

    .line 972
    move/from16 v3, p0

    .line 973
    .line 974
    goto :goto_22

    .line 975
    :goto_23
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 976
    .line 977
    .line 978
    if-eq v1, v10, :cond_3d

    .line 979
    .line 980
    invoke-static {v6, v1}, Lhe3;->n(Landroid/widget/TextView;I)V

    .line 981
    .line 982
    .line 983
    :cond_3d
    if-eq v2, v10, :cond_3e

    .line 984
    .line 985
    invoke-static {v6, v2}, Lhe3;->o(Landroid/widget/TextView;I)V

    .line 986
    .line 987
    .line 988
    :cond_3e
    cmpl-float v0, v3, p0

    .line 989
    .line 990
    if-eqz v0, :cond_41

    .line 991
    .line 992
    if-ne v4, v10, :cond_3f

    .line 993
    .line 994
    float-to-int v0, v3

    .line 995
    invoke-static {v6, v0}, Lhe3;->q(Landroid/widget/TextView;I)V

    .line 996
    .line 997
    .line 998
    return-void

    .line 999
    :cond_3f
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1000
    .line 1001
    const/16 v1, 0x22

    .line 1002
    .line 1003
    if-lt v0, v1, :cond_40

    .line 1004
    .line 1005
    invoke-static {v6, v4, v3}, Lnn2;->a(Landroid/widget/TextView;IF)V

    .line 1006
    .line 1007
    .line 1008
    return-void

    .line 1009
    :cond_40
    invoke-virtual {v6}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v0

    .line 1013
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v0

    .line 1017
    invoke-static {v4, v3, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 1018
    .line 1019
    .line 1020
    move-result v0

    .line 1021
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 1022
    .line 1023
    .line 1024
    move-result v0

    .line 1025
    invoke-static {v6, v0}, Lhe3;->q(Landroid/widget/TextView;I)V

    .line 1026
    .line 1027
    .line 1028
    :cond_41
    return-void
.end method

.method public final g(Landroid/content/Context;I)V
    .locals 5

    .line 1
    sget-object v0, Landroidx/appcompat/R$styleable;->TextAppearance:[I

    .line 2
    .line 3
    new-instance v1, Lac1;

    .line 4
    .line 5
    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-direct {v1, p1, p2}, Lac1;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    .line 10
    .line 11
    .line 12
    sget v0, Landroidx/appcompat/R$styleable;->TextAppearance_textAllCaps:I

    .line 13
    .line 14
    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v2, 0x0

    .line 19
    iget-object v3, p0, Ltb;->a:Landroid/widget/TextView;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    sget v0, Landroidx/appcompat/R$styleable;->TextAppearance_textAllCaps:I

    .line 24
    .line 25
    invoke-virtual {p2, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setAllCaps(Z)V

    .line 30
    .line 31
    .line 32
    :cond_0
    sget v0, Landroidx/appcompat/R$styleable;->TextAppearance_android_textSize:I

    .line 33
    .line 34
    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    sget v0, Landroidx/appcompat/R$styleable;->TextAppearance_android_textSize:I

    .line 41
    .line 42
    const/4 v4, -0x1

    .line 43
    invoke-virtual {p2, v0, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_1

    .line 48
    .line 49
    const/4 v0, 0x0

    .line 50
    invoke-virtual {v3, v2, v0}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 51
    .line 52
    .line 53
    :cond_1
    invoke-virtual {p0, p1, v1}, Ltb;->n(Landroid/content/Context;Lac1;)V

    .line 54
    .line 55
    .line 56
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 57
    .line 58
    const/16 v0, 0x1a

    .line 59
    .line 60
    if-lt p1, v0, :cond_2

    .line 61
    .line 62
    sget p1, Landroidx/appcompat/R$styleable;->TextAppearance_fontVariationSettings:I

    .line 63
    .line 64
    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-eqz p1, :cond_2

    .line 69
    .line 70
    sget p1, Landroidx/appcompat/R$styleable;->TextAppearance_fontVariationSettings:I

    .line 71
    .line 72
    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    if-eqz p1, :cond_2

    .line 77
    .line 78
    invoke-static {v3, p1}, Lrb;->d(Landroid/widget/TextView;Ljava/lang/String;)Z

    .line 79
    .line 80
    .line 81
    :cond_2
    invoke-virtual {v1}, Lac1;->J()V

    .line 82
    .line 83
    .line 84
    iget-object p1, p0, Ltb;->l:Landroid/graphics/Typeface;

    .line 85
    .line 86
    if-eqz p1, :cond_3

    .line 87
    .line 88
    iget p0, p0, Ltb;->j:I

    .line 89
    .line 90
    invoke-virtual {v3, p1, p0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 91
    .line 92
    .line 93
    :cond_3
    return-void
.end method

.method public final i(IIII)V
    .locals 1

    .line 1
    iget-object p0, p0, Ltb;->i:Lbc;

    .line 2
    .line 3
    invoke-virtual {p0}, Lbc;->j()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lbc;->j:Landroid/content/Context;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    int-to-float p1, p1

    .line 20
    invoke-static {p4, p1, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    int-to-float p2, p2

    .line 25
    invoke-static {p4, p2, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    int-to-float p3, p3

    .line 30
    invoke-static {p4, p3, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 31
    .line 32
    .line 33
    move-result p3

    .line 34
    invoke-virtual {p0, p1, p2, p3}, Lbc;->k(FFF)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lbc;->h()Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_0

    .line 42
    .line 43
    invoke-virtual {p0}, Lbc;->a()V

    .line 44
    .line 45
    .line 46
    :cond_0
    return-void
.end method

.method public final j([II)V
    .locals 5

    .line 1
    iget-object p0, p0, Ltb;->i:Lbc;

    .line 2
    .line 3
    invoke-virtual {p0}, Lbc;->j()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_4

    .line 8
    .line 9
    array-length v0, p1

    .line 10
    const/4 v1, 0x0

    .line 11
    if-lez v0, :cond_3

    .line 12
    .line 13
    new-array v2, v0, [I

    .line 14
    .line 15
    if-nez p2, :cond_0

    .line 16
    .line 17
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    iget-object v3, p0, Lbc;->j:Landroid/content/Context;

    .line 23
    .line 24
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    :goto_0
    if-ge v1, v0, :cond_1

    .line 33
    .line 34
    aget v4, p1, v1

    .line 35
    .line 36
    int-to-float v4, v4

    .line 37
    invoke-static {p2, v4, v3}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    aput v4, v2, v1

    .line 46
    .line 47
    add-int/lit8 v1, v1, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    :goto_1
    invoke-static {v2}, Lbc;->b([I)[I

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    iput-object p2, p0, Lbc;->f:[I

    .line 55
    .line 56
    invoke-virtual {p0}, Lbc;->i()Z

    .line 57
    .line 58
    .line 59
    move-result p2

    .line 60
    if-eqz p2, :cond_2

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_2
    const-string p0, "None of the preset sizes is valid: "

    .line 64
    .line 65
    invoke-static {p1}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-static {p1, p0}, Ln4;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_3
    iput-boolean v1, p0, Lbc;->g:Z

    .line 74
    .line 75
    :goto_2
    invoke-virtual {p0}, Lbc;->h()Z

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    if-eqz p1, :cond_4

    .line 80
    .line 81
    invoke-virtual {p0}, Lbc;->a()V

    .line 82
    .line 83
    .line 84
    :cond_4
    return-void
.end method

.method public final k(I)V
    .locals 3

    .line 1
    iget-object p0, p0, Ltb;->i:Lbc;

    .line 2
    .line 3
    invoke-virtual {p0}, Lbc;->j()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    if-ne p1, v0, :cond_0

    .line 13
    .line 14
    iget-object p1, p0, Lbc;->j:Landroid/content/Context;

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const/high16 v0, 0x41400000    # 12.0f

    .line 25
    .line 26
    const/4 v1, 0x2

    .line 27
    invoke-static {v1, v0, p1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    const/high16 v2, 0x42e00000    # 112.0f

    .line 32
    .line 33
    invoke-static {v1, v2, p1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    const/high16 v1, 0x3f800000    # 1.0f

    .line 38
    .line 39
    invoke-virtual {p0, v0, p1, v1}, Lbc;->k(FFF)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Lbc;->h()Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-eqz p1, :cond_2

    .line 47
    .line 48
    invoke-virtual {p0}, Lbc;->a()V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_0
    const-string p0, "Unknown auto-size text type: "

    .line 53
    .line 54
    invoke-static {p1, p0}, Lfm0;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_1
    const/4 p1, 0x0

    .line 63
    iput p1, p0, Lbc;->a:I

    .line 64
    .line 65
    const/high16 v0, -0x40800000    # -1.0f

    .line 66
    .line 67
    iput v0, p0, Lbc;->d:F

    .line 68
    .line 69
    iput v0, p0, Lbc;->e:F

    .line 70
    .line 71
    iput v0, p0, Lbc;->c:F

    .line 72
    .line 73
    new-array v0, p1, [I

    .line 74
    .line 75
    iput-object v0, p0, Lbc;->f:[I

    .line 76
    .line 77
    iput-boolean p1, p0, Lbc;->b:Z

    .line 78
    .line 79
    :cond_2
    return-void
.end method

.method public final l(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ltb;->h:Lvo2;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lvo2;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Ltb;->h:Lvo2;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Ltb;->h:Lvo2;

    .line 13
    .line 14
    iput-object p1, v0, Lvo2;->a:Landroid/content/res/ColorStateList;

    .line 15
    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/4 p1, 0x0

    .line 21
    :goto_0
    iput-boolean p1, v0, Lvo2;->d:Z

    .line 22
    .line 23
    iput-object v0, p0, Ltb;->b:Lvo2;

    .line 24
    .line 25
    iput-object v0, p0, Ltb;->c:Lvo2;

    .line 26
    .line 27
    iput-object v0, p0, Ltb;->d:Lvo2;

    .line 28
    .line 29
    iput-object v0, p0, Ltb;->e:Lvo2;

    .line 30
    .line 31
    iput-object v0, p0, Ltb;->f:Lvo2;

    .line 32
    .line 33
    iput-object v0, p0, Ltb;->g:Lvo2;

    .line 34
    .line 35
    return-void
.end method

.method public final m(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ltb;->h:Lvo2;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lvo2;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Ltb;->h:Lvo2;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Ltb;->h:Lvo2;

    .line 13
    .line 14
    iput-object p1, v0, Lvo2;->b:Landroid/graphics/PorterDuff$Mode;

    .line 15
    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/4 p1, 0x0

    .line 21
    :goto_0
    iput-boolean p1, v0, Lvo2;->c:Z

    .line 22
    .line 23
    iput-object v0, p0, Ltb;->b:Lvo2;

    .line 24
    .line 25
    iput-object v0, p0, Ltb;->c:Lvo2;

    .line 26
    .line 27
    iput-object v0, p0, Ltb;->d:Lvo2;

    .line 28
    .line 29
    iput-object v0, p0, Ltb;->e:Lvo2;

    .line 30
    .line 31
    iput-object v0, p0, Ltb;->f:Lvo2;

    .line 32
    .line 33
    iput-object v0, p0, Ltb;->g:Lvo2;

    .line 34
    .line 35
    return-void
.end method

.method public final n(Landroid/content/Context;Lac1;)V
    .locals 11

    .line 1
    sget v0, Landroidx/appcompat/R$styleable;->TextAppearance_android_textStyle:I

    .line 2
    .line 3
    iget v1, p0, Ltb;->j:I

    .line 4
    .line 5
    iget-object v2, p2, Lac1;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Landroid/content/res/TypedArray;

    .line 8
    .line 9
    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iput v0, p0, Ltb;->j:I

    .line 14
    .line 15
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    const/4 v3, -0x1

    .line 19
    const/16 v4, 0x1c

    .line 20
    .line 21
    if-lt v0, v4, :cond_0

    .line 22
    .line 23
    sget v5, Landroidx/appcompat/R$styleable;->TextAppearance_android_textFontWeight:I

    .line 24
    .line 25
    invoke-virtual {v2, v5, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    iput v5, p0, Ltb;->k:I

    .line 30
    .line 31
    if-eq v5, v3, :cond_0

    .line 32
    .line 33
    iget v5, p0, Ltb;->j:I

    .line 34
    .line 35
    and-int/2addr v5, v1

    .line 36
    iput v5, p0, Ltb;->j:I

    .line 37
    .line 38
    :cond_0
    sget v5, Landroidx/appcompat/R$styleable;->TextAppearance_android_fontFamily:I

    .line 39
    .line 40
    invoke-virtual {v2, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    const/4 v6, 0x1

    .line 45
    const/4 v7, 0x0

    .line 46
    if-nez v5, :cond_5

    .line 47
    .line 48
    sget v5, Landroidx/appcompat/R$styleable;->TextAppearance_fontFamily:I

    .line 49
    .line 50
    invoke-virtual {v2, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    if-eqz v5, :cond_1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    sget p1, Landroidx/appcompat/R$styleable;->TextAppearance_android_typeface:I

    .line 58
    .line 59
    invoke-virtual {v2, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    if-eqz p1, :cond_e

    .line 64
    .line 65
    iput-boolean v7, p0, Ltb;->m:Z

    .line 66
    .line 67
    sget p1, Landroidx/appcompat/R$styleable;->TextAppearance_android_typeface:I

    .line 68
    .line 69
    invoke-virtual {v2, p1, v6}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-eq p1, v6, :cond_4

    .line 74
    .line 75
    if-eq p1, v1, :cond_3

    .line 76
    .line 77
    const/4 p2, 0x3

    .line 78
    if-eq p1, p2, :cond_2

    .line 79
    .line 80
    goto/16 :goto_6

    .line 81
    .line 82
    :cond_2
    sget-object p1, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    .line 83
    .line 84
    iput-object p1, p0, Ltb;->l:Landroid/graphics/Typeface;

    .line 85
    .line 86
    return-void

    .line 87
    :cond_3
    sget-object p1, Landroid/graphics/Typeface;->SERIF:Landroid/graphics/Typeface;

    .line 88
    .line 89
    iput-object p1, p0, Ltb;->l:Landroid/graphics/Typeface;

    .line 90
    .line 91
    return-void

    .line 92
    :cond_4
    sget-object p1, Landroid/graphics/Typeface;->SANS_SERIF:Landroid/graphics/Typeface;

    .line 93
    .line 94
    iput-object p1, p0, Ltb;->l:Landroid/graphics/Typeface;

    .line 95
    .line 96
    return-void

    .line 97
    :cond_5
    :goto_0
    const/4 v5, 0x0

    .line 98
    iput-object v5, p0, Ltb;->l:Landroid/graphics/Typeface;

    .line 99
    .line 100
    sget v5, Landroidx/appcompat/R$styleable;->TextAppearance_fontFamily:I

    .line 101
    .line 102
    invoke-virtual {v2, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    if-eqz v5, :cond_6

    .line 107
    .line 108
    sget v5, Landroidx/appcompat/R$styleable;->TextAppearance_fontFamily:I

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_6
    sget v5, Landroidx/appcompat/R$styleable;->TextAppearance_android_fontFamily:I

    .line 112
    .line 113
    :goto_1
    iget v8, p0, Ltb;->k:I

    .line 114
    .line 115
    iget v9, p0, Ltb;->j:I

    .line 116
    .line 117
    invoke-virtual {p1}, Landroid/content/Context;->isRestricted()Z

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    if-nez p1, :cond_b

    .line 122
    .line 123
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 124
    .line 125
    iget-object v10, p0, Ltb;->a:Landroid/widget/TextView;

    .line 126
    .line 127
    invoke-direct {p1, v10}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    new-instance v10, Lob;

    .line 131
    .line 132
    invoke-direct {v10, p0, v8, v9, p1}, Lob;-><init>(Ltb;IILjava/lang/ref/WeakReference;)V

    .line 133
    .line 134
    .line 135
    :try_start_0
    iget p1, p0, Ltb;->j:I

    .line 136
    .line 137
    invoke-virtual {p2, v5, p1, v10}, Lac1;->p(IILob;)Landroid/graphics/Typeface;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    if-eqz p1, :cond_9

    .line 142
    .line 143
    if-lt v0, v4, :cond_8

    .line 144
    .line 145
    iget p2, p0, Ltb;->k:I

    .line 146
    .line 147
    if-eq p2, v3, :cond_8

    .line 148
    .line 149
    invoke-static {p1, v7}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    iget p2, p0, Ltb;->k:I

    .line 154
    .line 155
    iget v0, p0, Ltb;->j:I

    .line 156
    .line 157
    and-int/2addr v0, v1

    .line 158
    if-eqz v0, :cond_7

    .line 159
    .line 160
    move v0, v6

    .line 161
    goto :goto_2

    .line 162
    :cond_7
    move v0, v7

    .line 163
    :goto_2
    invoke-static {p1, p2, v0}, Lsb;->a(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    iput-object p1, p0, Ltb;->l:Landroid/graphics/Typeface;

    .line 168
    .line 169
    goto :goto_3

    .line 170
    :cond_8
    iput-object p1, p0, Ltb;->l:Landroid/graphics/Typeface;

    .line 171
    .line 172
    :cond_9
    :goto_3
    iget-object p1, p0, Ltb;->l:Landroid/graphics/Typeface;

    .line 173
    .line 174
    if-nez p1, :cond_a

    .line 175
    .line 176
    move p1, v6

    .line 177
    goto :goto_4

    .line 178
    :cond_a
    move p1, v7

    .line 179
    :goto_4
    iput-boolean p1, p0, Ltb;->m:Z
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 180
    .line 181
    :catch_0
    :cond_b
    iget-object p1, p0, Ltb;->l:Landroid/graphics/Typeface;

    .line 182
    .line 183
    if-nez p1, :cond_e

    .line 184
    .line 185
    invoke-virtual {v2, v5}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    if-eqz p1, :cond_e

    .line 190
    .line 191
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 192
    .line 193
    if-lt p2, v4, :cond_d

    .line 194
    .line 195
    iget p2, p0, Ltb;->k:I

    .line 196
    .line 197
    if-eq p2, v3, :cond_d

    .line 198
    .line 199
    invoke-static {p1, v7}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    iget p2, p0, Ltb;->k:I

    .line 204
    .line 205
    iget v0, p0, Ltb;->j:I

    .line 206
    .line 207
    and-int/2addr v0, v1

    .line 208
    if-eqz v0, :cond_c

    .line 209
    .line 210
    goto :goto_5

    .line 211
    :cond_c
    move v6, v7

    .line 212
    :goto_5
    invoke-static {p1, p2, v6}, Lsb;->a(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    iput-object p1, p0, Ltb;->l:Landroid/graphics/Typeface;

    .line 217
    .line 218
    goto :goto_6

    .line 219
    :cond_d
    iget p2, p0, Ltb;->j:I

    .line 220
    .line 221
    invoke-static {p1, p2}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    iput-object p1, p0, Ltb;->l:Landroid/graphics/Typeface;

    .line 226
    .line 227
    :cond_e
    :goto_6
    return-void
.end method
