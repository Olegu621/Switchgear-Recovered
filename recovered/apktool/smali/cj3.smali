.class public final Lcj3;
.super Lhj3;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final b:Lkb1;

.field public final c:Lkb1;

.field public final d:[I

.field public final e:I


# direct methods
.method public constructor <init>(Lkb1;Lkb1;)V
    .locals 10

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcj3;->b:Lkb1;

    .line 5
    .line 6
    iput-object p2, p0, Lcj3;->c:Lkb1;

    .line 7
    .line 8
    invoke-virtual {p2}, Lkb1;->X()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    const/16 p2, 0x1c

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    const/4 v1, 0x1

    .line 16
    if-gt p1, p2, :cond_0

    .line 17
    .line 18
    move p2, v1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move p2, v0

    .line 21
    :goto_0
    if-eqz p2, :cond_6

    .line 22
    .line 23
    new-array p2, p1, [I

    .line 24
    .line 25
    iput-object p2, p0, Lcj3;->d:[I

    .line 26
    .line 27
    const-wide/16 v2, 0x0

    .line 28
    .line 29
    move v4, v0

    .line 30
    move v5, v4

    .line 31
    :goto_1
    if-ge v4, p1, :cond_5

    .line 32
    .line 33
    invoke-virtual {p0, v4}, Lcj3;->d(I)Lph3;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    iget-wide v7, v6, Lph3;->e:J

    .line 38
    .line 39
    or-long/2addr v7, v2

    .line 40
    cmp-long v2, v7, v2

    .line 41
    .line 42
    if-nez v2, :cond_4

    .line 43
    .line 44
    move v2, v0

    .line 45
    :goto_2
    const/4 v3, -0x1

    .line 46
    if-ge v2, v5, :cond_2

    .line 47
    .line 48
    aget v9, p2, v2

    .line 49
    .line 50
    and-int/lit8 v9, v9, 0x1f

    .line 51
    .line 52
    invoke-virtual {p0, v9}, Lcj3;->d(I)Lph3;

    .line 53
    .line 54
    .line 55
    move-result-object v9

    .line 56
    invoke-virtual {v6, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v9

    .line 60
    if-eqz v9, :cond_1

    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_2
    move v2, v3

    .line 67
    :goto_3
    if-eq v2, v3, :cond_4

    .line 68
    .line 69
    iget-boolean v3, v6, Lph3;->c:Z

    .line 70
    .line 71
    if-eqz v3, :cond_3

    .line 72
    .line 73
    aget v3, p2, v2

    .line 74
    .line 75
    add-int/lit8 v6, v4, 0x4

    .line 76
    .line 77
    shl-int v6, v1, v6

    .line 78
    .line 79
    or-int/2addr v3, v6

    .line 80
    goto :goto_4

    .line 81
    :cond_3
    move v3, v4

    .line 82
    :goto_4
    aput v3, p2, v2

    .line 83
    .line 84
    goto :goto_5

    .line 85
    :cond_4
    add-int/lit8 v2, v5, 0x1

    .line 86
    .line 87
    aput v4, p2, v5

    .line 88
    .line 89
    move v5, v2

    .line 90
    :goto_5
    add-int/lit8 v4, v4, 0x1

    .line 91
    .line 92
    move-wide v2, v7

    .line 93
    goto :goto_1

    .line 94
    :cond_5
    iput v5, p0, Lcj3;->e:I

    .line 95
    .line 96
    return-void

    .line 97
    :cond_6
    const-string p0, "metadata size too large"

    .line 98
    .line 99
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    const/4 p0, 0x0

    .line 103
    throw p0
.end method


# virtual methods
.method public final a(Lti3;Lii3;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget v1, p0, Lcj3;->e:I

    .line 3
    .line 4
    if-ge v0, v1, :cond_2

    .line 5
    .line 6
    iget-object v1, p0, Lcj3;->d:[I

    .line 7
    .line 8
    aget v1, v1, v0

    .line 9
    .line 10
    and-int/lit8 v2, v1, 0x1f

    .line 11
    .line 12
    invoke-virtual {p0, v2}, Lcj3;->d(I)Lph3;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    iget-boolean v3, v2, Lph3;->c:Z

    .line 17
    .line 18
    if-nez v3, :cond_1

    .line 19
    .line 20
    if-ltz v1, :cond_0

    .line 21
    .line 22
    iget-object v3, p0, Lcj3;->c:Lkb1;

    .line 23
    .line 24
    :goto_1
    invoke-virtual {v3, v1}, Lkb1;->Z(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    goto :goto_2

    .line 29
    :cond_0
    iget-object v3, p0, Lcj3;->b:Lkb1;

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :goto_2
    iget-object v3, v2, Lph3;->b:Ljava/lang/Class;

    .line 33
    .line 34
    invoke-virtual {v3, v1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {p1, v2, v1, p2}, Lti3;->a(Lph3;Ljava/lang/Object;Lii3;)V

    .line 39
    .line 40
    .line 41
    goto :goto_3

    .line 42
    :cond_1
    new-instance v3, Laj3;

    .line 43
    .line 44
    invoke-direct {v3, p0, v2, v1}, Laj3;-><init>(Lcj3;Lph3;I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, v2, v3, p2}, Lti3;->b(Lph3;Ljava/util/Iterator;Lii3;)V

    .line 48
    .line 49
    .line 50
    :goto_3
    add-int/lit8 v0, v0, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    return-void
.end method

.method public final b()I
    .locals 0

    .line 1
    iget p0, p0, Lcj3;->e:I

    .line 2
    .line 3
    return p0
.end method

.method public final c()Ljava/util/Set;
    .locals 2

    .line 1
    new-instance v0, Lgf2;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, p0, v1}, Lgf2;-><init>(Ljava/lang/Object;I)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public final d(I)Lph3;
    .locals 0

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    iget-object p0, p0, Lcj3;->c:Lkb1;

    .line 4
    .line 5
    :goto_0
    invoke-virtual {p0, p1}, Lkb1;->Y(I)Lph3;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    iget-object p0, p0, Lcj3;->b:Lkb1;

    .line 11
    .line 12
    goto :goto_0
.end method
