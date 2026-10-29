.class public final Lg90;
.super Ld10;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public synthetic a:Ljava/lang/Object;

.field public final synthetic b:Lh90;

.field public c:I


# direct methods
.method public constructor <init>(Lh90;Lc10;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lg90;->b:Lh90;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Ld10;-><init>(Lc10;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iput-object p1, p0, Lg90;->a:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lg90;->c:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lg90;->c:I

    .line 9
    .line 10
    iget-object p1, p0, Lg90;->b:Lh90;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, p0}, Lh90;->emit(Ljava/lang/Object;Lc10;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
