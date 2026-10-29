.class public final Lfw2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:Lyv1;

.field public final d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lvv1;Lyv1;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p1, Lvv1;->d:Z

    .line 5
    .line 6
    iget-boolean v1, p1, Lvv1;->c:Z

    .line 7
    .line 8
    xor-int/lit8 v1, v1, 0x1

    .line 9
    .line 10
    iget-object p1, p1, Lvv1;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-boolean v0, p0, Lfw2;->a:Z

    .line 16
    .line 17
    iput-boolean v1, p0, Lfw2;->b:Z

    .line 18
    .line 19
    iput-object p2, p0, Lfw2;->c:Lyv1;

    .line 20
    .line 21
    iput-object p1, p0, Lfw2;->d:Ljava/lang/String;

    .line 22
    .line 23
    return-void
.end method
