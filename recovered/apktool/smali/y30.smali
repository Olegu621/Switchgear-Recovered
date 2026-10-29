.class public final Ly30;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final synthetic a:I

.field public b:I

.field public final c:Ljava/lang/Iterable;


# direct methods
.method public constructor <init>(Lj;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Ly30;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ly30;->c:Ljava/lang/Iterable;

    .line 8
    .line 9
    const/4 p1, -0x1

    .line 10
    iput p1, p0, Ly30;->b:I

    .line 11
    .line 12
    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/AbstractSet;I)V
    .locals 0

    .line 13
    iput p2, p0, Ly30;->a:I

    iput-object p1, p0, Ly30;->c:Ljava/lang/Iterable;

    const/4 p1, 0x0

    iput p1, p0, Ly30;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 4

    .line 1
    iget v0, p0, Ly30;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    iget-object v3, p0, Ly30;->c:Ljava/lang/Iterable;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget p0, p0, Ly30;->b:I

    .line 11
    .line 12
    check-cast v3, Lgk3;

    .line 13
    .line 14
    invoke-virtual {v3}, Lgk3;->b()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-virtual {v3}, Lgk3;->a()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    sub-int/2addr v0, v3

    .line 23
    if-ge p0, v0, :cond_0

    .line 24
    .line 25
    move v1, v2

    .line 26
    :cond_0
    return v1

    .line 27
    :pswitch_0
    iget p0, p0, Ly30;->b:I

    .line 28
    .line 29
    check-cast v3, Lgf2;

    .line 30
    .line 31
    iget-object v0, v3, Lgf2;->b:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Lcj3;

    .line 34
    .line 35
    iget v0, v0, Lcj3;->e:I

    .line 36
    .line 37
    if-ge p0, v0, :cond_1

    .line 38
    .line 39
    move v1, v2

    .line 40
    :cond_1
    return v1

    .line 41
    :pswitch_1
    check-cast v3, Lj;

    .line 42
    .line 43
    iget p0, p0, Ly30;->b:I

    .line 44
    .line 45
    invoke-virtual {v3}, Lj;->getCount()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    add-int/lit8 v0, v0, -0x1

    .line 50
    .line 51
    if-ge p0, v0, :cond_2

    .line 52
    .line 53
    move v1, v2

    .line 54
    :cond_2
    return v1

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final next()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Ly30;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Ly30;->c:Ljava/lang/Iterable;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget v0, p0, Ly30;->b:I

    .line 9
    .line 10
    check-cast v1, Lgk3;

    .line 11
    .line 12
    invoke-virtual {v1}, Lgk3;->b()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    invoke-virtual {v1}, Lgk3;->a()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    sub-int/2addr v2, v3

    .line 21
    if-ge v0, v2, :cond_0

    .line 22
    .line 23
    iget-object v2, v1, Lgk3;->b:Lik3;

    .line 24
    .line 25
    iget-object v2, v2, Lik3;->a:[Ljava/lang/Object;

    .line 26
    .line 27
    invoke-virtual {v1}, Lgk3;->a()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    add-int/2addr v1, v0

    .line 32
    add-int/lit8 v0, v0, 0x1

    .line 33
    .line 34
    aget-object v1, v2, v1

    .line 35
    .line 36
    iput v0, p0, Ly30;->b:I

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-static {}, Ln4;->o()V

    .line 40
    .line 41
    .line 42
    const/4 v1, 0x0

    .line 43
    :goto_0
    return-object v1

    .line 44
    :pswitch_0
    check-cast v1, Lgf2;

    .line 45
    .line 46
    iget-object v0, v1, Lgf2;->b:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v0, Lcj3;

    .line 49
    .line 50
    iget-object v1, v0, Lcj3;->d:[I

    .line 51
    .line 52
    iget v2, p0, Ly30;->b:I

    .line 53
    .line 54
    add-int/lit8 v3, v2, 0x1

    .line 55
    .line 56
    iput v3, p0, Ly30;->b:I

    .line 57
    .line 58
    aget p0, v1, v2

    .line 59
    .line 60
    and-int/lit8 p0, p0, 0x1f

    .line 61
    .line 62
    invoke-virtual {v0, p0}, Lcj3;->d(I)Lph3;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    return-object p0

    .line 67
    :pswitch_1
    invoke-virtual {p0}, Ly30;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-eqz v0, :cond_1

    .line 72
    .line 73
    check-cast v1, Lj;

    .line 74
    .line 75
    iget v0, p0, Ly30;->b:I

    .line 76
    .line 77
    add-int/lit8 v0, v0, 0x1

    .line 78
    .line 79
    iput v0, p0, Ly30;->b:I

    .line 80
    .line 81
    invoke-virtual {v1, v0}, Lj;->get(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    return-object p0

    .line 86
    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 87
    .line 88
    iget p0, p0, Ly30;->b:I

    .line 89
    .line 90
    const-string v1, "Cannot advance the iterator beyond "

    .line 91
    .line 92
    invoke-static {p0, v1}, Lfm0;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    invoke-direct {v0, p0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    throw v0

    .line 100
    nop

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final remove()V
    .locals 1

    .line 1
    iget p0, p0, Ly30;->a:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 9
    .line 10
    .line 11
    throw p0

    .line 12
    :pswitch_0
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 13
    .line 14
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 15
    .line 16
    .line 17
    throw p0

    .line 18
    :pswitch_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 19
    .line 20
    const-string v0, "Cannot remove elements from a DataBufferIterator"

    .line 21
    .line 22
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
