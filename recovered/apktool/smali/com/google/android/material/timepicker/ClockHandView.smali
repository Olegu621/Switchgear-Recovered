.class Lcom/google/android/material/timepicker/ClockHandView;
.super Landroid/view/View;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public U:I

.field public final a:Ljava/util/ArrayList;

.field public final b:I

.field public final c:F

.field public final d:Landroid/graphics/Paint;

.field public final e:Landroid/graphics/RectF;

.field public final f:I

.field public i:F

.field public v:Z

.field public w:D


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 105
    sget v0, Lcom/google/android/material/R$attr;->materialClockStyle:I

    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/material/timepicker/ClockHandView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

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
    iput-object v0, p0, Lcom/google/android/material/timepicker/ClockHandView;->a:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Landroid/graphics/Paint;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/google/android/material/timepicker/ClockHandView;->d:Landroid/graphics/Paint;

    .line 17
    .line 18
    new-instance v1, Landroid/graphics/RectF;

    .line 19
    .line 20
    invoke-direct {v1}, Landroid/graphics/RectF;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v1, p0, Lcom/google/android/material/timepicker/ClockHandView;->e:Landroid/graphics/RectF;

    .line 24
    .line 25
    sget-object v1, Lcom/google/android/material/R$styleable;->ClockHandView:[I

    .line 26
    .line 27
    sget v2, Lcom/google/android/material/R$style;->Widget_MaterialComponents_TimePicker_Clock:I

    .line 28
    .line 29
    invoke-virtual {p1, p2, v1, p3, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    sget p3, Lcom/google/android/material/R$styleable;->ClockHandView_materialCircleRadius:I

    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    invoke-virtual {p2, p3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 37
    .line 38
    .line 39
    move-result p3

    .line 40
    iput p3, p0, Lcom/google/android/material/timepicker/ClockHandView;->U:I

    .line 41
    .line 42
    sget p3, Lcom/google/android/material/R$styleable;->ClockHandView_selectorSize:I

    .line 43
    .line 44
    invoke-virtual {p2, p3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 45
    .line 46
    .line 47
    move-result p3

    .line 48
    iput p3, p0, Lcom/google/android/material/timepicker/ClockHandView;->b:I

    .line 49
    .line 50
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 51
    .line 52
    .line 53
    move-result-object p3

    .line 54
    sget v2, Lcom/google/android/material/R$dimen;->material_clock_hand_stroke_width:I

    .line 55
    .line 56
    invoke-virtual {p3, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    iput v2, p0, Lcom/google/android/material/timepicker/ClockHandView;->f:I

    .line 61
    .line 62
    sget v2, Lcom/google/android/material/R$dimen;->material_clock_hand_center_dot_radius:I

    .line 63
    .line 64
    invoke-virtual {p3, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 65
    .line 66
    .line 67
    move-result p3

    .line 68
    int-to-float p3, p3

    .line 69
    iput p3, p0, Lcom/google/android/material/timepicker/ClockHandView;->c:F

    .line 70
    .line 71
    sget p3, Lcom/google/android/material/R$styleable;->ClockHandView_clockHandColor:I

    .line 72
    .line 73
    invoke-virtual {p2, p3, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 74
    .line 75
    .line 76
    move-result p3

    .line 77
    const/4 v1, 0x1

    .line 78
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, p3}, Landroid/graphics/Paint;->setColor(I)V

    .line 82
    .line 83
    .line 84
    const/4 p3, 0x0

    .line 85
    invoke-virtual {p0, p3}, Lcom/google/android/material/timepicker/ClockHandView;->a(F)V

    .line 86
    .line 87
    .line 88
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    .line 93
    .line 94
    .line 95
    sget-object p1, Le33;->a:Ljava/util/WeakHashMap;

    .line 96
    .line 97
    const/4 p1, 0x2

    .line 98
    invoke-virtual {p0, p1}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 102
    .line 103
    .line 104
    return-void
.end method


# virtual methods
.method public final a(F)V
    .locals 5

    .line 1
    const/high16 v0, 0x43b40000    # 360.0f

    .line 2
    .line 3
    rem-float/2addr p1, v0

    .line 4
    iput p1, p0, Lcom/google/android/material/timepicker/ClockHandView;->i:F

    .line 5
    .line 6
    const/high16 v0, 0x42b40000    # 90.0f

    .line 7
    .line 8
    sub-float v0, p1, v0

    .line 9
    .line 10
    float-to-double v0, v0

    .line 11
    invoke-static {v0, v1}, Ljava/lang/Math;->toRadians(D)D

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    iput-wide v0, p0, Lcom/google/android/material/timepicker/ClockHandView;->w:D

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    div-int/lit8 v0, v0, 0x2

    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    div-int/lit8 v1, v1, 0x2

    .line 28
    .line 29
    int-to-float v1, v1

    .line 30
    iget v2, p0, Lcom/google/android/material/timepicker/ClockHandView;->U:I

    .line 31
    .line 32
    int-to-float v2, v2

    .line 33
    iget-wide v3, p0, Lcom/google/android/material/timepicker/ClockHandView;->w:D

    .line 34
    .line 35
    invoke-static {v3, v4}, Ljava/lang/Math;->cos(D)D

    .line 36
    .line 37
    .line 38
    move-result-wide v3

    .line 39
    double-to-float v3, v3

    .line 40
    mul-float/2addr v2, v3

    .line 41
    add-float/2addr v2, v1

    .line 42
    int-to-float v0, v0

    .line 43
    iget v1, p0, Lcom/google/android/material/timepicker/ClockHandView;->U:I

    .line 44
    .line 45
    int-to-float v1, v1

    .line 46
    iget-wide v3, p0, Lcom/google/android/material/timepicker/ClockHandView;->w:D

    .line 47
    .line 48
    invoke-static {v3, v4}, Ljava/lang/Math;->sin(D)D

    .line 49
    .line 50
    .line 51
    move-result-wide v3

    .line 52
    double-to-float v3, v3

    .line 53
    mul-float/2addr v1, v3

    .line 54
    add-float/2addr v1, v0

    .line 55
    iget v0, p0, Lcom/google/android/material/timepicker/ClockHandView;->b:I

    .line 56
    .line 57
    int-to-float v0, v0

    .line 58
    sub-float v3, v2, v0

    .line 59
    .line 60
    sub-float v4, v1, v0

    .line 61
    .line 62
    add-float/2addr v2, v0

    .line 63
    add-float/2addr v1, v0

    .line 64
    iget-object v0, p0, Lcom/google/android/material/timepicker/ClockHandView;->e:Landroid/graphics/RectF;

    .line 65
    .line 66
    invoke-virtual {v0, v3, v4, v2, v1}, Landroid/graphics/RectF;->set(FFFF)V

    .line 67
    .line 68
    .line 69
    iget-object v0, p0, Lcom/google/android/material/timepicker/ClockHandView;->a:Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-eqz v1, :cond_1

    .line 80
    .line 81
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    check-cast v1, Lzv;

    .line 86
    .line 87
    check-cast v1, Lcom/google/android/material/timepicker/ClockFaceView;

    .line 88
    .line 89
    iget v2, v1, Lcom/google/android/material/timepicker/ClockFaceView;->v0:F

    .line 90
    .line 91
    sub-float/2addr v2, p1

    .line 92
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    const v3, 0x3a83126f    # 0.001f

    .line 97
    .line 98
    .line 99
    cmpl-float v2, v2, v3

    .line 100
    .line 101
    if-lez v2, :cond_0

    .line 102
    .line 103
    iput p1, v1, Lcom/google/android/material/timepicker/ClockFaceView;->v0:F

    .line 104
    .line 105
    invoke-virtual {v1}, Lcom/google/android/material/timepicker/ClockFaceView;->k()V

    .line 106
    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 110
    .line 111
    .line 112
    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 12

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    div-int/lit8 v0, v0, 0x2

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    div-int/lit8 v1, v1, 0x2

    .line 15
    .line 16
    int-to-float v3, v1

    .line 17
    iget v2, p0, Lcom/google/android/material/timepicker/ClockHandView;->U:I

    .line 18
    .line 19
    int-to-float v2, v2

    .line 20
    iget-wide v4, p0, Lcom/google/android/material/timepicker/ClockHandView;->w:D

    .line 21
    .line 22
    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    .line 23
    .line 24
    .line 25
    move-result-wide v4

    .line 26
    double-to-float v4, v4

    .line 27
    mul-float/2addr v2, v4

    .line 28
    add-float/2addr v2, v3

    .line 29
    int-to-float v4, v0

    .line 30
    iget v5, p0, Lcom/google/android/material/timepicker/ClockHandView;->U:I

    .line 31
    .line 32
    int-to-float v5, v5

    .line 33
    iget-wide v6, p0, Lcom/google/android/material/timepicker/ClockHandView;->w:D

    .line 34
    .line 35
    invoke-static {v6, v7}, Ljava/lang/Math;->sin(D)D

    .line 36
    .line 37
    .line 38
    move-result-wide v6

    .line 39
    double-to-float v6, v6

    .line 40
    mul-float/2addr v5, v6

    .line 41
    add-float/2addr v5, v4

    .line 42
    const/4 v6, 0x0

    .line 43
    iget-object v7, p0, Lcom/google/android/material/timepicker/ClockHandView;->d:Landroid/graphics/Paint;

    .line 44
    .line 45
    invoke-virtual {v7, v6}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 46
    .line 47
    .line 48
    iget v6, p0, Lcom/google/android/material/timepicker/ClockHandView;->b:I

    .line 49
    .line 50
    int-to-float v8, v6

    .line 51
    invoke-virtual {p1, v2, v5, v8, v7}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 52
    .line 53
    .line 54
    iget-wide v8, p0, Lcom/google/android/material/timepicker/ClockHandView;->w:D

    .line 55
    .line 56
    invoke-static {v8, v9}, Ljava/lang/Math;->sin(D)D

    .line 57
    .line 58
    .line 59
    move-result-wide v8

    .line 60
    iget-wide v10, p0, Lcom/google/android/material/timepicker/ClockHandView;->w:D

    .line 61
    .line 62
    invoke-static {v10, v11}, Ljava/lang/Math;->cos(D)D

    .line 63
    .line 64
    .line 65
    move-result-wide v10

    .line 66
    iget v2, p0, Lcom/google/android/material/timepicker/ClockHandView;->U:I

    .line 67
    .line 68
    sub-int/2addr v2, v6

    .line 69
    int-to-float v2, v2

    .line 70
    float-to-double v5, v2

    .line 71
    mul-double/2addr v10, v5

    .line 72
    double-to-int v2, v10

    .line 73
    add-int/2addr v1, v2

    .line 74
    int-to-float v1, v1

    .line 75
    mul-double/2addr v5, v8

    .line 76
    double-to-int v2, v5

    .line 77
    add-int/2addr v0, v2

    .line 78
    int-to-float v6, v0

    .line 79
    iget v0, p0, Lcom/google/android/material/timepicker/ClockHandView;->f:I

    .line 80
    .line 81
    int-to-float v0, v0

    .line 82
    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 83
    .line 84
    .line 85
    move-object v2, p1

    .line 86
    move v5, v1

    .line 87
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 88
    .line 89
    .line 90
    iget p0, p0, Lcom/google/android/material/timepicker/ClockHandView;->c:F

    .line 91
    .line 92
    invoke-virtual {v2, v3, v4, p0, v7}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 93
    .line 94
    .line 95
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    .line 1
    invoke-super/range {p0 .. p5}, Landroid/view/View;->onLayout(ZIIII)V

    .line 2
    .line 3
    .line 4
    iget p1, p0, Lcom/google/android/material/timepicker/ClockHandView;->i:F

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lcom/google/android/material/timepicker/ClockHandView;->a(F)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 9

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    const/4 v2, 0x2

    .line 14
    const/4 v3, 0x1

    .line 15
    const/4 v4, 0x0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    if-eq v0, v3, :cond_0

    .line 19
    .line 20
    if-eq v0, v2, :cond_0

    .line 21
    .line 22
    move v0, v4

    .line 23
    move v5, v0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-boolean v0, p0, Lcom/google/android/material/timepicker/ClockHandView;->v:Z

    .line 26
    .line 27
    move v5, v4

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    iput-boolean v4, p0, Lcom/google/android/material/timepicker/ClockHandView;->v:Z

    .line 30
    .line 31
    move v5, v3

    .line 32
    move v0, v4

    .line 33
    :goto_0
    iget-boolean v6, p0, Lcom/google/android/material/timepicker/ClockHandView;->v:Z

    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 36
    .line 37
    .line 38
    move-result v7

    .line 39
    div-int/2addr v7, v2

    .line 40
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 41
    .line 42
    .line 43
    move-result v8

    .line 44
    div-int/2addr v8, v2

    .line 45
    int-to-float v2, v7

    .line 46
    sub-float/2addr v1, v2

    .line 47
    float-to-double v1, v1

    .line 48
    int-to-float v7, v8

    .line 49
    sub-float/2addr p1, v7

    .line 50
    float-to-double v7, p1

    .line 51
    invoke-static {v7, v8, v1, v2}, Ljava/lang/Math;->atan2(DD)D

    .line 52
    .line 53
    .line 54
    move-result-wide v1

    .line 55
    invoke-static {v1, v2}, Ljava/lang/Math;->toDegrees(D)D

    .line 56
    .line 57
    .line 58
    move-result-wide v1

    .line 59
    double-to-int p1, v1

    .line 60
    add-int/lit8 v1, p1, 0x5a

    .line 61
    .line 62
    if-gez v1, :cond_2

    .line 63
    .line 64
    add-int/lit16 v1, p1, 0x1c2

    .line 65
    .line 66
    :cond_2
    iget p1, p0, Lcom/google/android/material/timepicker/ClockHandView;->i:F

    .line 67
    .line 68
    int-to-float v1, v1

    .line 69
    cmpl-float p1, p1, v1

    .line 70
    .line 71
    if-eqz p1, :cond_3

    .line 72
    .line 73
    move p1, v3

    .line 74
    goto :goto_1

    .line 75
    :cond_3
    move p1, v4

    .line 76
    :goto_1
    if-eqz v5, :cond_4

    .line 77
    .line 78
    if-eqz p1, :cond_4

    .line 79
    .line 80
    :goto_2
    move v4, v3

    .line 81
    goto :goto_3

    .line 82
    :cond_4
    if-nez p1, :cond_5

    .line 83
    .line 84
    if-eqz v0, :cond_6

    .line 85
    .line 86
    :cond_5
    invoke-virtual {p0, v1}, Lcom/google/android/material/timepicker/ClockHandView;->a(F)V

    .line 87
    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_6
    :goto_3
    or-int p1, v6, v4

    .line 91
    .line 92
    iput-boolean p1, p0, Lcom/google/android/material/timepicker/ClockHandView;->v:Z

    .line 93
    .line 94
    return v3
.end method
