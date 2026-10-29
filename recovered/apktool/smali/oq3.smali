.class public final Loq3;
.super Ljava/util/AbstractList;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/util/RandomAccess;
.implements Lap3;


# instance fields
.field public final a:Lzo3;


# direct methods
.method public constructor <init>(Lzo3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Loq3;->a:Lzo3;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final bridge synthetic get(I)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Loq3;->a:Lzo3;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lzo3;->b(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    new-instance v0, Lyx2;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lyx2;-><init>(Loq3;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final listIterator(I)Ljava/util/ListIterator;
    .locals 1

    .line 1
    new-instance v0, Lxx2;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lxx2;-><init>(Loq3;I)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final size()I
    .locals 0

    .line 1
    iget-object p0, p0, Loq3;->a:Lzo3;

    .line 2
    .line 3
    iget-object p0, p0, Lzo3;->b:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final zzg(I)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Loq3;->a:Lzo3;

    .line 2
    .line 3
    iget-object p0, p0, Lzo3;->b:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final zzh()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Loq3;->a:Lzo3;

    .line 2
    .line 3
    iget-object p0, p0, Lzo3;->b:Ljava/util/List;

    .line 4
    .line 5
    invoke-static {p0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final zzi()Lap3;
    .locals 0

    .line 1
    return-object p0
.end method
