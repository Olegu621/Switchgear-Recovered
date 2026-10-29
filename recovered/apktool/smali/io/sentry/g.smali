.class public final Lio/sentry/g;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public a:I

.field public b:I

.field public c:Z

.field public final synthetic d:Lio/sentry/h;


# direct methods
.method public constructor <init>(Lio/sentry/h;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/sentry/g;->d:Lio/sentry/h;

    .line 5
    .line 6
    iget v0, p1, Lio/sentry/h;->b:I

    .line 7
    .line 8
    iput v0, p0, Lio/sentry/g;->a:I

    .line 9
    .line 10
    const/4 v0, -0x1

    .line 11
    iput v0, p0, Lio/sentry/g;->b:I

    .line 12
    .line 13
    iget-boolean p1, p1, Lio/sentry/h;->d:Z

    .line 14
    .line 15
    iput-boolean p1, p0, Lio/sentry/g;->c:Z

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lio/sentry/g;->c:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget v0, p0, Lio/sentry/g;->a:I

    .line 6
    .line 7
    iget-object p0, p0, Lio/sentry/g;->d:Lio/sentry/h;

    .line 8
    .line 9
    iget p0, p0, Lio/sentry/h;->c:I

    .line 10
    .line 11
    if-eq v0, p0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0

    .line 16
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 17
    return p0
.end method

.method public final next()Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lio/sentry/g;->hasNext()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lio/sentry/g;->c:Z

    .line 9
    .line 10
    iget v1, p0, Lio/sentry/g;->a:I

    .line 11
    .line 12
    iput v1, p0, Lio/sentry/g;->b:I

    .line 13
    .line 14
    add-int/lit8 v2, v1, 0x1

    .line 15
    .line 16
    iget-object v3, p0, Lio/sentry/g;->d:Lio/sentry/h;

    .line 17
    .line 18
    iget v4, v3, Lio/sentry/h;->e:I

    .line 19
    .line 20
    if-lt v2, v4, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v0, v2

    .line 24
    :goto_0
    iput v0, p0, Lio/sentry/g;->a:I

    .line 25
    .line 26
    iget-object p0, v3, Lio/sentry/h;->a:[Ljava/lang/Object;

    .line 27
    .line 28
    aget-object p0, p0, v1

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_1
    invoke-static {}, Ln4;->o()V

    .line 32
    .line 33
    .line 34
    const/4 p0, 0x0

    .line 35
    return-object p0
.end method

.method public final remove()V
    .locals 8

    .line 1
    iget-object v0, p0, Lio/sentry/g;->d:Lio/sentry/h;

    .line 2
    .line 3
    iget v1, v0, Lio/sentry/h;->e:I

    .line 4
    .line 5
    iget v2, p0, Lio/sentry/g;->b:I

    .line 6
    .line 7
    const/4 v3, -0x1

    .line 8
    if-eq v2, v3, :cond_7

    .line 9
    .line 10
    iget v4, v0, Lio/sentry/h;->b:I

    .line 11
    .line 12
    if-ne v2, v4, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Lio/sentry/h;->remove()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    iput v3, p0, Lio/sentry/g;->b:I

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    add-int/lit8 v5, v2, 0x1

    .line 21
    .line 22
    const/4 v6, 0x0

    .line 23
    if-ge v4, v2, :cond_1

    .line 24
    .line 25
    iget v4, v0, Lio/sentry/h;->c:I

    .line 26
    .line 27
    if-ge v5, v4, :cond_1

    .line 28
    .line 29
    iget-object v7, v0, Lio/sentry/h;->a:[Ljava/lang/Object;

    .line 30
    .line 31
    sub-int/2addr v4, v5

    .line 32
    invoke-static {v7, v5, v7, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 33
    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_1
    :goto_0
    iget v2, v0, Lio/sentry/h;->c:I

    .line 37
    .line 38
    if-eq v5, v2, :cond_4

    .line 39
    .line 40
    iget-object v2, v0, Lio/sentry/h;->a:[Ljava/lang/Object;

    .line 41
    .line 42
    if-lt v5, v1, :cond_2

    .line 43
    .line 44
    add-int/lit8 v5, v5, -0x1

    .line 45
    .line 46
    aget-object v4, v2, v6

    .line 47
    .line 48
    aput-object v4, v2, v5

    .line 49
    .line 50
    :goto_1
    move v5, v6

    .line 51
    goto :goto_0

    .line 52
    :cond_2
    add-int/lit8 v4, v5, -0x1

    .line 53
    .line 54
    if-gez v4, :cond_3

    .line 55
    .line 56
    add-int/lit8 v4, v1, -0x1

    .line 57
    .line 58
    :cond_3
    aget-object v7, v2, v5

    .line 59
    .line 60
    aput-object v7, v2, v4

    .line 61
    .line 62
    add-int/lit8 v5, v5, 0x1

    .line 63
    .line 64
    if-lt v5, v1, :cond_1

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_4
    :goto_2
    iput v3, p0, Lio/sentry/g;->b:I

    .line 68
    .line 69
    iget v2, v0, Lio/sentry/h;->c:I

    .line 70
    .line 71
    add-int/2addr v2, v3

    .line 72
    if-gez v2, :cond_5

    .line 73
    .line 74
    add-int/lit8 v2, v1, -0x1

    .line 75
    .line 76
    :cond_5
    iput v2, v0, Lio/sentry/h;->c:I

    .line 77
    .line 78
    iget-object v4, v0, Lio/sentry/h;->a:[Ljava/lang/Object;

    .line 79
    .line 80
    const/4 v5, 0x0

    .line 81
    aput-object v5, v4, v2

    .line 82
    .line 83
    iput-boolean v6, v0, Lio/sentry/h;->d:Z

    .line 84
    .line 85
    iget v0, p0, Lio/sentry/g;->a:I

    .line 86
    .line 87
    add-int/2addr v0, v3

    .line 88
    if-gez v0, :cond_6

    .line 89
    .line 90
    add-int/lit8 v0, v1, -0x1

    .line 91
    .line 92
    :cond_6
    iput v0, p0, Lio/sentry/g;->a:I

    .line 93
    .line 94
    return-void

    .line 95
    :cond_7
    invoke-static {}, Lf42;->t()V

    .line 96
    .line 97
    .line 98
    return-void
.end method
