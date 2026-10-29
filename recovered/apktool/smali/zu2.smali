.class public final Lzu2;
.super Ld10;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public a:Lcom/usercentrics/sdk/ui/components/UCImageView;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Throwable;

.field public synthetic e:Ljava/lang/Object;

.field public final synthetic f:Lcom/usercentrics/sdk/ui/components/UCImageView;

.field public i:I


# direct methods
.method public constructor <init>(Lcom/usercentrics/sdk/ui/components/UCImageView;Ld10;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lzu2;->f:Lcom/usercentrics/sdk/ui/components/UCImageView;

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
    iput-object p1, p0, Lzu2;->e:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lzu2;->i:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lzu2;->i:I

    .line 9
    .line 10
    iget-object p1, p0, Lzu2;->f:Lcom/usercentrics/sdk/ui/components/UCImageView;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-static {p1, v0, p0}, Lcom/usercentrics/sdk/ui/components/UCImageView;->d(Lcom/usercentrics/sdk/ui/components/UCImageView;Ljava/lang/String;Ld10;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
