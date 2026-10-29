.class public final Llx0;
.super Ly90;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final W:Lca0;

.field public X:Lkx0;


# direct methods
.method public constructor <init>(Landroid/content/Context;Loi;Lca0;Lkx0;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ly90;-><init>(Landroid/content/Context;Loi;)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Llx0;->W:Lca0;

    .line 5
    .line 6
    iput-object p0, p3, Lca0;->b:Ly90;

    .line 7
    .line 8
    iput-object p4, p0, Llx0;->X:Lkx0;

    .line 9
    .line 10
    iput-object p0, p4, Lkx0;->a:Ljava/lang/Object;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;)V
    .locals 9

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Landroid/graphics/Rect;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_2

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_2

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->getClipBounds(Landroid/graphics/Rect;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Ly90;->b()F

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget-object v1, p0, Llx0;->W:Lca0;

    .line 37
    .line 38
    iget-object v2, v1, Lca0;->a:Loi;

    .line 39
    .line 40
    invoke-virtual {v2}, Loi;->a()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, p1, v0}, Lca0;->a(Landroid/graphics/Canvas;F)V

    .line 44
    .line 45
    .line 46
    iget-object v5, p0, Ly90;->w:Landroid/graphics/Paint;

    .line 47
    .line 48
    invoke-virtual {v1, p1, v5}, Lca0;->c(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V

    .line 49
    .line 50
    .line 51
    const/4 v0, 0x0

    .line 52
    :goto_0
    iget-object v1, p0, Llx0;->X:Lkx0;

    .line 53
    .line 54
    iget-object v2, v1, Lkx0;->c:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v2, [I

    .line 57
    .line 58
    array-length v3, v2

    .line 59
    if-ge v0, v3, :cond_1

    .line 60
    .line 61
    iget-object v1, v1, Lkx0;->b:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v1, [F

    .line 64
    .line 65
    mul-int/lit8 v3, v0, 0x2

    .line 66
    .line 67
    aget v6, v1, v3

    .line 68
    .line 69
    add-int/lit8 v3, v3, 0x1

    .line 70
    .line 71
    aget v7, v1, v3

    .line 72
    .line 73
    aget v8, v2, v0

    .line 74
    .line 75
    iget-object v3, p0, Llx0;->W:Lca0;

    .line 76
    .line 77
    move-object v4, p1

    .line 78
    invoke-virtual/range {v3 .. v8}, Lca0;->b(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFI)V

    .line 79
    .line 80
    .line 81
    add-int/lit8 v0, v0, 0x1

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_1
    move-object v4, p1

    .line 85
    invoke-virtual {v4}, Landroid/graphics/Canvas;->restore()V

    .line 86
    .line 87
    .line 88
    :cond_2
    :goto_1
    return-void
.end method

.method public final f(ZZZ)Z
    .locals 3

    .line 1
    invoke-super {p0, p1, p2, p3}, Ly90;->f(ZZZ)Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    invoke-virtual {p0}, Ly90;->isRunning()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Llx0;->X:Lkx0;

    .line 12
    .line 13
    invoke-virtual {v0}, Lkx0;->a()V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Ly90;->c:Lv8;

    .line 17
    .line 18
    iget-object v1, p0, Ly90;->a:Landroid/content/Context;

    .line 19
    .line 20
    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    const-string v0, "animator_duration_scale"

    .line 28
    .line 29
    const/high16 v2, 0x3f800000    # 1.0f

    .line 30
    .line 31
    invoke-static {v1, v0, v2}, Landroid/provider/Settings$Global;->getFloat(Landroid/content/ContentResolver;Ljava/lang/String;F)F

    .line 32
    .line 33
    .line 34
    if-eqz p1, :cond_2

    .line 35
    .line 36
    if-nez p3, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    iget-object p0, p0, Llx0;->X:Lkx0;

    .line 40
    .line 41
    invoke-virtual {p0}, Lkx0;->u()V

    .line 42
    .line 43
    .line 44
    :cond_2
    :goto_0
    return p2
.end method

.method public final getIntrinsicHeight()I
    .locals 0

    .line 1
    iget-object p0, p0, Llx0;->W:Lca0;

    .line 2
    .line 3
    invoke-virtual {p0}, Lca0;->d()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final getIntrinsicWidth()I
    .locals 0

    .line 1
    iget-object p0, p0, Llx0;->W:Lca0;

    .line 2
    .line 3
    invoke-virtual {p0}, Lca0;->e()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
