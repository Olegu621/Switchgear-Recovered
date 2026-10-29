.class public final Lyn;
.super Lrk1;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public l:Le62;

.field public m:La91;

.field public final n:Lef;


# direct methods
.method public constructor <init>(Lef;)V
    .locals 1

    .line 1
    invoke-direct {p0}, La91;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Le62;

    .line 5
    .line 6
    invoke-direct {v0}, Le62;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lyn;->l:Le62;

    .line 10
    .line 11
    iput-object p1, p0, Lyn;->n:Lef;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lyn;->m:La91;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lyn;->n:Lef;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    invoke-virtual {v0}, La91;->d()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public final g()V
    .locals 2

    .line 1
    iget-object p0, p0, Lyn;->l:Le62;

    .line 2
    .line 3
    invoke-virtual {p0}, Le62;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    :goto_0
    move-object v0, p0

    .line 8
    check-cast v0, La62;

    .line 9
    .line 10
    invoke-virtual {v0}, La62;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0}, La62;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Ljava/util/Map$Entry;

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Leg1;

    .line 27
    .line 28
    invoke-virtual {v0}, Leg1;->a()V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    return-void
.end method

.method public final h()V
    .locals 2

    .line 1
    iget-object p0, p0, Lyn;->l:Le62;

    .line 2
    .line 3
    invoke-virtual {p0}, Le62;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    :goto_0
    move-object v0, p0

    .line 8
    check-cast v0, La62;

    .line 9
    .line 10
    invoke-virtual {v0}, La62;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0}, La62;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Ljava/util/Map$Entry;

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Leg1;

    .line 27
    .line 28
    iget-object v1, v0, Leg1;->a:La91;

    .line 29
    .line 30
    invoke-virtual {v1, v0}, La91;->i(Lfp1;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    return-void
.end method

.method public final l(Lrk1;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lyn;->l:Le62;

    .line 2
    .line 3
    iget-object v1, p0, Lyn;->m:La91;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Le62;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Leg1;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    iget-object v2, v1, Leg1;->a:La91;

    .line 16
    .line 17
    invoke-virtual {v2, v1}, La91;->i(Lfp1;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    iput-object p1, p0, Lyn;->m:La91;

    .line 21
    .line 22
    new-instance v1, Lx6;

    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    invoke-direct {v1, p0, v2}, Lx6;-><init>(Ljava/lang/Object;I)V

    .line 26
    .line 27
    .line 28
    if-eqz p1, :cond_7

    .line 29
    .line 30
    new-instance v3, Leg1;

    .line 31
    .line 32
    invoke-direct {v3, p1, v1}, Leg1;-><init>(La91;Lx6;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, p1}, Le62;->a(Ljava/lang/Object;)Lb62;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    if-eqz v4, :cond_1

    .line 40
    .line 41
    iget-object p1, v4, Lb62;->b:Ljava/lang/Object;

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    new-instance v4, Lb62;

    .line 45
    .line 46
    invoke-direct {v4, p1, v3}, Lb62;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    iget p1, v0, Le62;->d:I

    .line 50
    .line 51
    add-int/2addr p1, v2

    .line 52
    iput p1, v0, Le62;->d:I

    .line 53
    .line 54
    iget-object p1, v0, Le62;->b:Lb62;

    .line 55
    .line 56
    if-nez p1, :cond_2

    .line 57
    .line 58
    iput-object v4, v0, Le62;->a:Lb62;

    .line 59
    .line 60
    iput-object v4, v0, Le62;->b:Lb62;

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    iput-object v4, p1, Lb62;->c:Lb62;

    .line 64
    .line 65
    iput-object p1, v4, Lb62;->d:Lb62;

    .line 66
    .line 67
    iput-object v4, v0, Le62;->b:Lb62;

    .line 68
    .line 69
    :goto_0
    const/4 p1, 0x0

    .line 70
    :goto_1
    check-cast p1, Leg1;

    .line 71
    .line 72
    if-eqz p1, :cond_4

    .line 73
    .line 74
    iget-object v0, p1, Leg1;->b:Lx6;

    .line 75
    .line 76
    if-ne v0, v1, :cond_3

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_3
    const-string p0, "This source was already added with the different observer"

    .line 80
    .line 81
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :cond_4
    :goto_2
    if-eqz p1, :cond_5

    .line 86
    .line 87
    return-void

    .line 88
    :cond_5
    iget p0, p0, La91;->c:I

    .line 89
    .line 90
    if-lez p0, :cond_6

    .line 91
    .line 92
    invoke-virtual {v3}, Leg1;->a()V

    .line 93
    .line 94
    .line 95
    :cond_6
    return-void

    .line 96
    :cond_7
    const-string p0, "source cannot be null"

    .line 97
    .line 98
    invoke-static {p0}, Ln4;->s(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    return-void
.end method
