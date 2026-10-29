.class public final Lg52;
.super Lw11;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# virtual methods
.method public final l(Ldd2;FF)V
    .locals 7

    .line 1
    mul-float p0, p3, p2

    .line 2
    .line 3
    const/high16 v0, 0x43340000    # 180.0f

    .line 4
    .line 5
    const/high16 v1, 0x42b40000    # 90.0f

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {p1, v2, p0, v0, v1}, Ldd2;->e(FFFF)V

    .line 9
    .line 10
    .line 11
    const/high16 p0, 0x40000000    # 2.0f

    .line 12
    .line 13
    mul-float/2addr p3, p0

    .line 14
    mul-float v3, p3, p2

    .line 15
    .line 16
    const/high16 v5, 0x43340000    # 180.0f

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    const/high16 v6, 0x42b40000    # 90.0f

    .line 20
    .line 21
    move v4, v3

    .line 22
    move-object v0, p1

    .line 23
    invoke-virtual/range {v0 .. v6}, Ldd2;->a(FFFFFF)V

    .line 24
    .line 25
    .line 26
    return-void
.end method
