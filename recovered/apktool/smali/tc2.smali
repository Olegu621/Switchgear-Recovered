.class public final Ltc2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final m:La32;


# instance fields
.field public a:Lw11;

.field public b:Lw11;

.field public c:Lw11;

.field public d:Lw11;

.field public e:Lm10;

.field public f:Lm10;

.field public g:Lm10;

.field public h:Lm10;

.field public i:Ldc0;

.field public j:Ldc0;

.field public k:Ldc0;

.field public l:Ldc0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La32;

    .line 2
    .line 3
    const/high16 v1, 0x3f000000    # 0.5f

    .line 4
    .line 5
    invoke-direct {v0, v1}, La32;-><init>(F)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Ltc2;->m:La32;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lg52;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Ltc2;->a:Lw11;

    .line 10
    .line 11
    new-instance v0, Lg52;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Ltc2;->b:Lw11;

    .line 17
    .line 18
    new-instance v0, Lg52;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Ltc2;->c:Lw11;

    .line 24
    .line 25
    new-instance v0, Lg52;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Ltc2;->d:Lw11;

    .line 31
    .line 32
    new-instance v0, Le;

    .line 33
    .line 34
    const/4 v1, 0x0

    .line 35
    invoke-direct {v0, v1}, Le;-><init>(F)V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, Ltc2;->e:Lm10;

    .line 39
    .line 40
    new-instance v0, Le;

    .line 41
    .line 42
    invoke-direct {v0, v1}, Le;-><init>(F)V

    .line 43
    .line 44
    .line 45
    iput-object v0, p0, Ltc2;->f:Lm10;

    .line 46
    .line 47
    new-instance v0, Le;

    .line 48
    .line 49
    invoke-direct {v0, v1}, Le;-><init>(F)V

    .line 50
    .line 51
    .line 52
    iput-object v0, p0, Ltc2;->g:Lm10;

    .line 53
    .line 54
    new-instance v0, Le;

    .line 55
    .line 56
    invoke-direct {v0, v1}, Le;-><init>(F)V

    .line 57
    .line 58
    .line 59
    iput-object v0, p0, Ltc2;->h:Lm10;

    .line 60
    .line 61
    new-instance v0, Ldc0;

    .line 62
    .line 63
    const/4 v1, 0x0

    .line 64
    invoke-direct {v0, v1}, Ldc0;-><init>(I)V

    .line 65
    .line 66
    .line 67
    iput-object v0, p0, Ltc2;->i:Ldc0;

    .line 68
    .line 69
    new-instance v0, Ldc0;

    .line 70
    .line 71
    invoke-direct {v0, v1}, Ldc0;-><init>(I)V

    .line 72
    .line 73
    .line 74
    iput-object v0, p0, Ltc2;->j:Ldc0;

    .line 75
    .line 76
    new-instance v0, Ldc0;

    .line 77
    .line 78
    invoke-direct {v0, v1}, Ldc0;-><init>(I)V

    .line 79
    .line 80
    .line 81
    iput-object v0, p0, Ltc2;->k:Ldc0;

    .line 82
    .line 83
    new-instance v0, Ldc0;

    .line 84
    .line 85
    invoke-direct {v0, v1}, Ldc0;-><init>(I)V

    .line 86
    .line 87
    .line 88
    iput-object v0, p0, Ltc2;->l:Ldc0;

    .line 89
    .line 90
    return-void
.end method

.method public static a(Landroid/content/Context;IILm10;)Lsc2;
    .locals 6

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    new-instance v0, Landroid/view/ContextThemeWrapper;

    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    .line 6
    .line 7
    .line 8
    move p1, p2

    .line 9
    move-object p0, v0

    .line 10
    :cond_0
    sget-object p2, Lcom/google/android/material/R$styleable;->ShapeAppearance:[I

    .line 11
    .line 12
    invoke-virtual {p0, p1, p2}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    :try_start_0
    sget p1, Lcom/google/android/material/R$styleable;->ShapeAppearance_cornerFamily:I

    .line 17
    .line 18
    const/4 p2, 0x0

    .line 19
    invoke-virtual {p0, p1, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    sget p2, Lcom/google/android/material/R$styleable;->ShapeAppearance_cornerFamilyTopLeft:I

    .line 24
    .line 25
    invoke-virtual {p0, p2, p1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    sget v0, Lcom/google/android/material/R$styleable;->ShapeAppearance_cornerFamilyTopRight:I

    .line 30
    .line 31
    invoke-virtual {p0, v0, p1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    sget v1, Lcom/google/android/material/R$styleable;->ShapeAppearance_cornerFamilyBottomRight:I

    .line 36
    .line 37
    invoke-virtual {p0, v1, p1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    sget v2, Lcom/google/android/material/R$styleable;->ShapeAppearance_cornerFamilyBottomLeft:I

    .line 42
    .line 43
    invoke-virtual {p0, v2, p1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    sget v2, Lcom/google/android/material/R$styleable;->ShapeAppearance_cornerSize:I

    .line 48
    .line 49
    invoke-static {p0, v2, p3}, Ltc2;->d(Landroid/content/res/TypedArray;ILm10;)Lm10;

    .line 50
    .line 51
    .line 52
    move-result-object p3

    .line 53
    sget v2, Lcom/google/android/material/R$styleable;->ShapeAppearance_cornerSizeTopLeft:I

    .line 54
    .line 55
    invoke-static {p0, v2, p3}, Ltc2;->d(Landroid/content/res/TypedArray;ILm10;)Lm10;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    sget v3, Lcom/google/android/material/R$styleable;->ShapeAppearance_cornerSizeTopRight:I

    .line 60
    .line 61
    invoke-static {p0, v3, p3}, Ltc2;->d(Landroid/content/res/TypedArray;ILm10;)Lm10;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    sget v4, Lcom/google/android/material/R$styleable;->ShapeAppearance_cornerSizeBottomRight:I

    .line 66
    .line 67
    invoke-static {p0, v4, p3}, Ltc2;->d(Landroid/content/res/TypedArray;ILm10;)Lm10;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    sget v5, Lcom/google/android/material/R$styleable;->ShapeAppearance_cornerSizeBottomLeft:I

    .line 72
    .line 73
    invoke-static {p0, v5, p3}, Ltc2;->d(Landroid/content/res/TypedArray;ILm10;)Lm10;

    .line 74
    .line 75
    .line 76
    move-result-object p3

    .line 77
    new-instance v5, Lsc2;

    .line 78
    .line 79
    invoke-direct {v5}, Lsc2;-><init>()V

    .line 80
    .line 81
    .line 82
    invoke-static {p2}, Lhe3;->c(I)Lw11;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    iput-object p2, v5, Lsc2;->a:Lw11;

    .line 87
    .line 88
    iput-object v2, v5, Lsc2;->e:Lm10;

    .line 89
    .line 90
    invoke-static {v0}, Lhe3;->c(I)Lw11;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    iput-object p2, v5, Lsc2;->b:Lw11;

    .line 95
    .line 96
    iput-object v3, v5, Lsc2;->f:Lm10;

    .line 97
    .line 98
    invoke-static {v1}, Lhe3;->c(I)Lw11;

    .line 99
    .line 100
    .line 101
    move-result-object p2

    .line 102
    iput-object p2, v5, Lsc2;->c:Lw11;

    .line 103
    .line 104
    iput-object v4, v5, Lsc2;->g:Lm10;

    .line 105
    .line 106
    invoke-static {p1}, Lhe3;->c(I)Lw11;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    iput-object p1, v5, Lsc2;->d:Lw11;

    .line 111
    .line 112
    iput-object p3, v5, Lsc2;->h:Lm10;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 113
    .line 114
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    .line 115
    .line 116
    .line 117
    return-object v5

    .line 118
    :catchall_0
    move-exception p1

    .line 119
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    .line 120
    .line 121
    .line 122
    throw p1
.end method

.method public static b(Landroid/content/Context;Landroid/util/AttributeSet;II)Lsc2;
    .locals 2

    .line 1
    new-instance v0, Le;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Le;-><init>(F)V

    .line 5
    .line 6
    .line 7
    invoke-static {p0, p1, p2, p3, v0}, Ltc2;->c(Landroid/content/Context;Landroid/util/AttributeSet;IILm10;)Lsc2;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static c(Landroid/content/Context;Landroid/util/AttributeSet;IILm10;)Lsc2;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/material/R$styleable;->MaterialShape:[I

    .line 2
    .line 3
    invoke-virtual {p0, p1, v0, p2, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    sget p2, Lcom/google/android/material/R$styleable;->MaterialShape_shapeAppearance:I

    .line 8
    .line 9
    const/4 p3, 0x0

    .line 10
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    sget v0, Lcom/google/android/material/R$styleable;->MaterialShape_shapeAppearanceOverlay:I

    .line 15
    .line 16
    invoke-virtual {p1, v0, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 17
    .line 18
    .line 19
    move-result p3

    .line 20
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 21
    .line 22
    .line 23
    invoke-static {p0, p2, p3, p4}, Ltc2;->a(Landroid/content/Context;IILm10;)Lsc2;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method

.method public static d(Landroid/content/res/TypedArray;ILm10;)Lm10;
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget v0, p1, Landroid/util/TypedValue;->type:I

    .line 9
    .line 10
    const/4 v1, 0x5

    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    new-instance p2, Le;

    .line 14
    .line 15
    iget p1, p1, Landroid/util/TypedValue;->data:I

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-static {p1, p0}, Landroid/util/TypedValue;->complexToDimensionPixelSize(ILandroid/util/DisplayMetrics;)I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    int-to-float p0, p0

    .line 30
    invoke-direct {p2, p0}, Le;-><init>(F)V

    .line 31
    .line 32
    .line 33
    return-object p2

    .line 34
    :cond_1
    const/4 p0, 0x6

    .line 35
    if-ne v0, p0, :cond_2

    .line 36
    .line 37
    new-instance p0, La32;

    .line 38
    .line 39
    const/high16 p2, 0x3f800000    # 1.0f

    .line 40
    .line 41
    invoke-virtual {p1, p2, p2}, Landroid/util/TypedValue;->getFraction(FF)F

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    invoke-direct {p0, p1}, La32;-><init>(F)V

    .line 46
    .line 47
    .line 48
    return-object p0

    .line 49
    :cond_2
    :goto_0
    return-object p2
.end method


# virtual methods
.method public final e(Landroid/graphics/RectF;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Ltc2;->l:Ldc0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-class v1, Ldc0;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x1

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Ltc2;->j:Ldc0;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    iget-object v0, p0, Ltc2;->i:Ldc0;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    iget-object v0, p0, Ltc2;->k:Ldc0;

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_0

    .line 52
    .line 53
    move v0, v3

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    move v0, v2

    .line 56
    :goto_0
    iget-object v1, p0, Ltc2;->e:Lm10;

    .line 57
    .line 58
    invoke-interface {v1, p1}, Lm10;->a(Landroid/graphics/RectF;)F

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    iget-object v4, p0, Ltc2;->f:Lm10;

    .line 63
    .line 64
    invoke-interface {v4, p1}, Lm10;->a(Landroid/graphics/RectF;)F

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    cmpl-float v4, v4, v1

    .line 69
    .line 70
    if-nez v4, :cond_1

    .line 71
    .line 72
    iget-object v4, p0, Ltc2;->h:Lm10;

    .line 73
    .line 74
    invoke-interface {v4, p1}, Lm10;->a(Landroid/graphics/RectF;)F

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    cmpl-float v4, v4, v1

    .line 79
    .line 80
    if-nez v4, :cond_1

    .line 81
    .line 82
    iget-object v4, p0, Ltc2;->g:Lm10;

    .line 83
    .line 84
    invoke-interface {v4, p1}, Lm10;->a(Landroid/graphics/RectF;)F

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    cmpl-float p1, p1, v1

    .line 89
    .line 90
    if-nez p1, :cond_1

    .line 91
    .line 92
    move p1, v3

    .line 93
    goto :goto_1

    .line 94
    :cond_1
    move p1, v2

    .line 95
    :goto_1
    iget-object v1, p0, Ltc2;->b:Lw11;

    .line 96
    .line 97
    instance-of v1, v1, Lg52;

    .line 98
    .line 99
    if-eqz v1, :cond_2

    .line 100
    .line 101
    iget-object v1, p0, Ltc2;->a:Lw11;

    .line 102
    .line 103
    instance-of v1, v1, Lg52;

    .line 104
    .line 105
    if-eqz v1, :cond_2

    .line 106
    .line 107
    iget-object v1, p0, Ltc2;->c:Lw11;

    .line 108
    .line 109
    instance-of v1, v1, Lg52;

    .line 110
    .line 111
    if-eqz v1, :cond_2

    .line 112
    .line 113
    iget-object p0, p0, Ltc2;->d:Lw11;

    .line 114
    .line 115
    instance-of p0, p0, Lg52;

    .line 116
    .line 117
    if-eqz p0, :cond_2

    .line 118
    .line 119
    move p0, v3

    .line 120
    goto :goto_2

    .line 121
    :cond_2
    move p0, v2

    .line 122
    :goto_2
    if-eqz v0, :cond_3

    .line 123
    .line 124
    if-eqz p1, :cond_3

    .line 125
    .line 126
    if-eqz p0, :cond_3

    .line 127
    .line 128
    return v3

    .line 129
    :cond_3
    return v2
.end method

.method public final f()Lsc2;
    .locals 2

    .line 1
    new-instance v0, Lsc2;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Ltc2;->a:Lw11;

    .line 7
    .line 8
    iput-object v1, v0, Lsc2;->a:Lw11;

    .line 9
    .line 10
    iget-object v1, p0, Ltc2;->b:Lw11;

    .line 11
    .line 12
    iput-object v1, v0, Lsc2;->b:Lw11;

    .line 13
    .line 14
    iget-object v1, p0, Ltc2;->c:Lw11;

    .line 15
    .line 16
    iput-object v1, v0, Lsc2;->c:Lw11;

    .line 17
    .line 18
    iget-object v1, p0, Ltc2;->d:Lw11;

    .line 19
    .line 20
    iput-object v1, v0, Lsc2;->d:Lw11;

    .line 21
    .line 22
    iget-object v1, p0, Ltc2;->e:Lm10;

    .line 23
    .line 24
    iput-object v1, v0, Lsc2;->e:Lm10;

    .line 25
    .line 26
    iget-object v1, p0, Ltc2;->f:Lm10;

    .line 27
    .line 28
    iput-object v1, v0, Lsc2;->f:Lm10;

    .line 29
    .line 30
    iget-object v1, p0, Ltc2;->g:Lm10;

    .line 31
    .line 32
    iput-object v1, v0, Lsc2;->g:Lm10;

    .line 33
    .line 34
    iget-object v1, p0, Ltc2;->h:Lm10;

    .line 35
    .line 36
    iput-object v1, v0, Lsc2;->h:Lm10;

    .line 37
    .line 38
    iget-object v1, p0, Ltc2;->i:Ldc0;

    .line 39
    .line 40
    iput-object v1, v0, Lsc2;->i:Ldc0;

    .line 41
    .line 42
    iget-object v1, p0, Ltc2;->j:Ldc0;

    .line 43
    .line 44
    iput-object v1, v0, Lsc2;->j:Ldc0;

    .line 45
    .line 46
    iget-object v1, p0, Ltc2;->k:Ldc0;

    .line 47
    .line 48
    iput-object v1, v0, Lsc2;->k:Ldc0;

    .line 49
    .line 50
    iget-object p0, p0, Ltc2;->l:Ldc0;

    .line 51
    .line 52
    iput-object p0, v0, Lsc2;->l:Ldc0;

    .line 53
    .line 54
    return-object v0
.end method
