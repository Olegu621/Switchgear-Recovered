.class public final Lib1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public volatile a:I

.field public volatile b:I


# virtual methods
.method public final a()V
    .locals 8

    .line 1
    iget v0, p0, Lib1;->a:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iput v1, p0, Lib1;->b:I

    .line 7
    .line 8
    :cond_0
    iget v0, p0, Lib1;->a:I

    .line 9
    .line 10
    add-int/2addr v0, v1

    .line 11
    iput v0, p0, Lib1;->a:I

    .line 12
    .line 13
    iget v0, p0, Lib1;->a:I

    .line 14
    .line 15
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 16
    .line 17
    .line 18
    move-result-wide v2

    .line 19
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 20
    .line 21
    .line 22
    move-result-wide v4

    .line 23
    sub-long/2addr v4, v2

    .line 24
    const-wide/16 v6, 0x3a98

    .line 25
    .line 26
    cmp-long v4, v4, v6

    .line 27
    .line 28
    iget v5, p0, Lib1;->b:I

    .line 29
    .line 30
    if-gez v4, :cond_2

    .line 31
    .line 32
    if-ne v0, v5, :cond_1

    .line 33
    .line 34
    return-void

    .line 35
    :cond_2
    add-int/2addr v5, v1

    .line 36
    iput v5, p0, Lib1;->b:I

    .line 37
    .line 38
    new-instance p0, Llp;

    .line 39
    .line 40
    invoke-direct {p0}, Llp;-><init>()V

    .line 41
    .line 42
    .line 43
    throw p0
.end method
