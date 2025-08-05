# Introduction
Deploy application on GCP - Google Kubernetes Engine using docker, kubernetes, helm, github actions

# Prerequisite
1. Create k8s cluster.
2. Create docker registry in GCP.
3. Create Workload Identity Pool and OIDC Provider.
4. Create Google Service Account and assign necessary permission to it like read write artifact registry and k8s cluster.
5. Impersonate Google-managed Service Account with Workload Identity Federation so that github actions workflow able to access services from GCP.

# Run workflow from github actions
1. Push changes into the repository.
2. Verify every stage is successful from github actions.
3. Access GKE either from gcloud or google cloud console and verify kubernetes pod created in "dev" namespace.
