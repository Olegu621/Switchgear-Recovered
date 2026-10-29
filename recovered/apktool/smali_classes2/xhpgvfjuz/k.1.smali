.class public Lxhpgvfjuz/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxhpgvfjuz/G;


# instance fields
.field private a:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lxhpgvfjuz/k;->a:I

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    const-string v0, "NoCache"

    return-object v0
.end method

.method public a(I)Ljava/lang/String;
    .locals 1

    iget v0, p0, Lxhpgvfjuz/k;->a:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lxhpgvfjuz/k;->a:I

    invoke-static {p1}, Lxhpgvfjuz/N;->b(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public b()Ljava/util/Collection;
    .locals 1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lxhpgvfjuz/k;->a:I

    return v0
.end method
