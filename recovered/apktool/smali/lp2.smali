.class public final synthetic Llp2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljp1;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:I

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(IIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Llp2;->a:I

    .line 5
    .line 6
    iput p2, p0, Llp2;->b:I

    .line 7
    .line 8
    iput p3, p0, Llp2;->c:I

    .line 9
    .line 10
    iput p4, p0, Llp2;->d:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final k(Landroid/view/View;Lm83;)Lm83;
    .locals 4

    .line 1
    const/16 v0, 0x81

    .line 2
    .line 3
    iget-object v1, p2, Lm83;->a:Lj83;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Lj83;->f(I)Lly0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget v1, v0, Lly0;->a:I

    .line 10
    .line 11
    iget v2, p0, Llp2;->a:I

    .line 12
    .line 13
    add-int/2addr v2, v1

    .line 14
    iget v1, v0, Lly0;->b:I

    .line 15
    .line 16
    iget v3, p0, Llp2;->b:I

    .line 17
    .line 18
    add-int/2addr v3, v1

    .line 19
    iget v0, v0, Lly0;->c:I

    .line 20
    .line 21
    iget v1, p0, Llp2;->c:I

    .line 22
    .line 23
    add-int/2addr v1, v0

    .line 24
    iget p0, p0, Llp2;->d:I

    .line 25
    .line 26
    invoke-virtual {p1, v2, v3, v1, p0}, Landroid/view/View;->setPadding(IIII)V

    .line 27
    .line 28
    .line 29
    return-object p2
.end method
