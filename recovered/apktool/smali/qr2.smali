.class public final Lqr2;
.super Ld10;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public a:Lv3;

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lv3;

.field public d:I


# direct methods
.method public constructor <init>(Lv3;Ld10;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lqr2;->c:Lv3;

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
    .locals 2

    .line 1
    iput-object p1, p0, Lqr2;->b:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lqr2;->d:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lqr2;->d:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    const/4 v0, 0x0

    .line 12
    iget-object v1, p0, Lqr2;->c:Lv3;

    .line 13
    .line 14
    invoke-virtual {v1, p1, v0, p0}, Lv3;->k(Ljava/lang/String;ZLd10;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method
