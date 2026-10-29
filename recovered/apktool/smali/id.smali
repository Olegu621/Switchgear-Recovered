.class public final Lid;
.super Lle2;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/util/Map;


# instance fields
.field public v:Lhd;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 52
    invoke-direct {p0}, Lle2;-><init>()V

    return-void
.end method

.method public constructor <init>(Lle2;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Lle2;-><init>()V

    .line 2
    .line 3
    .line 4
    iget v0, p1, Lle2;->c:I

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lle2;->b(I)V

    .line 7
    .line 8
    .line 9
    iget v1, p0, Lle2;->c:I

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    if-lez v0, :cond_1

    .line 15
    .line 16
    iget-object v1, p1, Lle2;->a:[I

    .line 17
    .line 18
    iget-object v3, p0, Lle2;->a:[I

    .line 19
    .line 20
    invoke-static {v1, v2, v3, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p1, Lle2;->b:[Ljava/lang/Object;

    .line 24
    .line 25
    iget-object v1, p0, Lle2;->b:[Ljava/lang/Object;

    .line 26
    .line 27
    shl-int/lit8 v3, v0, 0x1

    .line 28
    .line 29
    invoke-static {p1, v2, v1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 30
    .line 31
    .line 32
    iput v0, p0, Lle2;->c:I

    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    :goto_0
    if-ge v2, v0, :cond_1

    .line 36
    .line 37
    invoke-virtual {p1, v2}, Lle2;->h(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {p1, v2}, Lle2;->j(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {p0, v1, v3}, Lle2;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    add-int/lit8 v2, v2, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    return-void
.end method


# virtual methods
.method public final entrySet()Ljava/util/Set;
    .locals 2

    .line 1
    iget-object v0, p0, Lid;->v:Lhd;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lhd;

    .line 7
    .line 8
    invoke-direct {v0, p0, v1}, Lhd;-><init>(Ljava/lang/Object;I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lid;->v:Lhd;

    .line 12
    .line 13
    :cond_0
    iget-object p0, p0, Lid;->v:Lhd;

    .line 14
    .line 15
    iget-object v0, p0, Lkx0;->a:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lxb1;

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    new-instance v0, Lxb1;

    .line 22
    .line 23
    invoke-direct {v0, p0, v1}, Lxb1;-><init>(Lkx0;I)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lkx0;->a:Ljava/lang/Object;

    .line 27
    .line 28
    :cond_1
    iget-object p0, p0, Lkx0;->a:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p0, Lxb1;

    .line 31
    .line 32
    return-object p0
.end method

.method public final keySet()Ljava/util/Set;
    .locals 2

    .line 1
    iget-object v0, p0, Lid;->v:Lhd;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lhd;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, p0, v1}, Lhd;-><init>(Ljava/lang/Object;I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lid;->v:Lhd;

    .line 12
    .line 13
    :cond_0
    iget-object p0, p0, Lid;->v:Lhd;

    .line 14
    .line 15
    iget-object v0, p0, Lkx0;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lxb1;

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    new-instance v0, Lxb1;

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    invoke-direct {v0, p0, v1}, Lxb1;-><init>(Lkx0;I)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lkx0;->b:Ljava/lang/Object;

    .line 28
    .line 29
    :cond_1
    iget-object p0, p0, Lkx0;->b:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p0, Lxb1;

    .line 32
    .line 33
    return-object p0
.end method

.method public final putAll(Ljava/util/Map;)V
    .locals 2

    .line 1
    iget v0, p0, Lle2;->c:I

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/Map;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    add-int/2addr v1, v0

    .line 8
    invoke-virtual {p0, v1}, Lle2;->b(I)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Ljava/util/Map$Entry;

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {p0, v1, v0}, Lle2;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    return-void
.end method

.method public final values()Ljava/util/Collection;
    .locals 2

    .line 1
    iget-object v0, p0, Lid;->v:Lhd;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lhd;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, p0, v1}, Lhd;-><init>(Ljava/lang/Object;I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lid;->v:Lhd;

    .line 12
    .line 13
    :cond_0
    iget-object p0, p0, Lid;->v:Lhd;

    .line 14
    .line 15
    iget-object v0, p0, Lkx0;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lzb1;

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    new-instance v0, Lzb1;

    .line 22
    .line 23
    invoke-direct {v0, p0}, Lzb1;-><init>(Lkx0;)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lkx0;->c:Ljava/lang/Object;

    .line 27
    .line 28
    :cond_1
    iget-object p0, p0, Lkx0;->c:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p0, Lzb1;

    .line 31
    .line 32
    return-object p0
.end method
