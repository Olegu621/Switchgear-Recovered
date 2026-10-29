.class public final Lu40;
.super Ld10;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public a:Lb50;

.field public b:Log2;

.field public c:Z

.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:Lb50;

.field public f:I


# direct methods
.method public constructor <init>(Lb50;Lc10;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu40;->e:Lb50;

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
    iput-object p1, p0, Lu40;->d:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lu40;->f:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lu40;->f:I

    .line 9
    .line 10
    iget-object p1, p0, Lu40;->e:Lb50;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-static {p1, v0, p0}, Lb50;->e(Lb50;ZLc10;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
