.class public abstract Lw8;
.super Lc9;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# virtual methods
.method public buildClient(Landroid/content/Context;Landroid/os/Looper;Lwv;Ljava/lang/Object;Lrr0;Lsr0;)Ld9;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/os/Looper;",
            "Lwv;",
            "Ljava/lang/Object;",
            "Lrr0;",
            "Lsr0;",
            ")",
            "Ld9;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 9
    invoke-virtual/range {p0 .. p6}, Lw8;->buildClient(Landroid/content/Context;Landroid/os/Looper;Lwv;Ljava/lang/Object;Lxy;Lwp1;)Ld9;

    move-result-object p0

    return-object p0
.end method

.method public buildClient(Landroid/content/Context;Landroid/os/Looper;Lwv;Ljava/lang/Object;Lxy;Lwp1;)Ld9;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/os/Looper;",
            "Lwv;",
            "Ljava/lang/Object;",
            "Lxy;",
            "Lwp1;",
            ")",
            "Ld9;"
        }
    .end annotation

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string p1, "buildClient must be implemented"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method
