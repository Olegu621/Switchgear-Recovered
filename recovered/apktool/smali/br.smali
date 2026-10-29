.class public final Lbr;
.super Lkb1;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final e:Landroid/graphics/Typeface;

.field public final f:Lar;

.field public i:Z


# direct methods
.method public constructor <init>(Lar;Landroid/graphics/Typeface;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lbr;->e:Landroid/graphics/Typeface;

    .line 5
    .line 6
    iput-object p1, p0, Lbr;->f:Lar;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final M(I)V
    .locals 0

    .line 1
    iget-boolean p1, p0, Lbr;->i:Z

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lbr;->f:Lar;

    .line 6
    .line 7
    iget-object p0, p0, Lbr;->e:Landroid/graphics/Typeface;

    .line 8
    .line 9
    invoke-interface {p1, p0}, Lar;->r(Landroid/graphics/Typeface;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final N(Landroid/graphics/Typeface;Z)V
    .locals 0

    .line 1
    iget-boolean p2, p0, Lbr;->i:Z

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lbr;->f:Lar;

    .line 6
    .line 7
    invoke-interface {p0, p1}, Lar;->r(Landroid/graphics/Typeface;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method
