.class public final Ljj;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public a:I

.field public b:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Ljj;->a:I

    .line 5
    .line 6
    iput-object p2, p0, Ljj;->b:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a()Lkj;
    .locals 2

    .line 1
    new-instance v0, Lkj;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Ljj;->a:I

    .line 7
    .line 8
    iput v1, v0, Lkj;->a:I

    .line 9
    .line 10
    iget-object p0, p0, Ljj;->b:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p0, v0, Lkj;->b:Ljava/lang/String;

    .line 13
    .line 14
    return-object v0
.end method
