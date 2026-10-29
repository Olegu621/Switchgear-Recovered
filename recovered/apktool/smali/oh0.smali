.class public final Loh0;
.super Ld10;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/io/FileInputStream;

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Lph0;

.field public e:I


# direct methods
.method public constructor <init>(Lph0;Ld10;)V
    .locals 0

    .line 1
    iput-object p1, p0, Loh0;->d:Lph0;

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
    iput-object p1, p0, Loh0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Loh0;->e:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Loh0;->e:I

    .line 9
    .line 10
    iget-object p1, p0, Loh0;->d:Lph0;

    .line 11
    .line 12
    invoke-static {p1, p0}, Lph0;->a(Lph0;Ld10;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method
